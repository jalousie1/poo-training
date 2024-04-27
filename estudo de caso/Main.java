import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Reclamacao> reclamacoes = new ArrayList<>();
    private static final ArrayList<Conserto> consertos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option!= 5) {
            System.out.println("Menu de opções:");
            System.out.println("1) Registrar reclamação");
            System.out.println("2) Excluir reclamação");
            System.out.println("3) Consultar reclamação");
            System.out.println("4) Registrar conserto");
            System.out.println("5) Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    registrarReclamacao(scanner);
                    break;
                case 2:
                    excluirReclamacao(scanner);
                    break;
                case 3:
                    consultarReclamacao(scanner);
                    break;
                case 4:
                    registrarConserto(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    private static void registrarReclamacao(Scanner scanner) {
        System.out.print("Endereço: ");
        scanner.nextLine();
        String endereco = scanner.nextLine();
        System.out.print("Tamanho do buraco (0 a 10): ");
        int tamanhoBuraco = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        System.out.print("Localização (rua ou calçada): ");
        String localizacao = scanner.nextLine();
        System.out.print("Data e hora da reclamação (formato dd/MM/yyyy hh:mm): ");
        String dataHoraReclamacao = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        Date dataReclamacao;
        try {
            dataReclamacao = sdf.parse(dataHoraReclamacao);
        } catch (ParseException e) {
            System.out.println("Erro ao parsear data e hora da reclamação!");
            return;
        }

        Reclamacao reclamacao = new Reclamacao(reclamacoes.size() + 1, endereco, tamanhoBuraco, localizacao, dataReclamacao, "Registrada");
        reclamacoes.add(reclamacao);

        System.out.println("Reclamação registrada com sucesso!");
    }

    private static void excluirReclamacao(Scanner scanner) {
        System.out.print("ID da reclamação: ");
        int id = scanner.nextInt();

        for (int i = 0; i < reclamacoes.size(); i++) {
            if (reclamacoes.get(i).getId() == id) {
                reclamacoes.remove(i);
                System.out.println("Reclamação excluída com sucesso!");
                return;
            }
        }

        System.out.println("Reclamação não encontrada!");
    }

    private static void consultarReclamacao(Scanner scanner) {
        System.out.print("ID da reclamação: ");
        int id = scanner.nextInt();

        for (Reclamacao reclamacao : reclamacoes) {
            if (reclamacao.getId() == id) {
                System.out.println(reclamacao);
                return;
            }
        }

        System.out.println("Reclamação não encontrada!");
    }

    private static void registrarConserto(Scanner scanner) {
        System.out.print("ID da reclamação: ");
        int idReclamacao = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        System.out.print("Data e hora do conserto (formato dd/MM/yyyy hh:mm): ");
        String dataHoraConserto = scanner.nextLine();
        System.out.print("Valor do conserto: ");
        double valorConserto = scanner.nextDouble();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        Date dataConserto;
        try {
            dataConserto = sdf.parse(dataHoraConserto);
        } catch (ParseException e) {
            System.out.println("Erro ao parsear data e hora do conserto!");
            return;
        }

        for (Reclamacao reclamacao : reclamacoes) {
            if (reclamacao.getId() == idReclamacao) {
                Conserto conserto = new Conserto(idReclamacao, dataConserto, valorConserto);
                consertos.add(conserto);
                reclamacao.setSituacao("Consertada");
                System.out.println("Conserto registrado com sucesso!");
                return;
            }
        }

        System.out.println("Reclamação não encontrada!");
    }
}