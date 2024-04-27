public class TesteFormaGeometrica {

    public static void main(String[] args) {
        // Criando objetos Circulo e Quadrado
        Circulo circulo = new Circulo(5.0);
        Quadrado quadrado = new Quadrado(10.0);

        // Calculando área e perímetro
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());
    }
}
