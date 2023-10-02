package dev.senzalla.orientacao_objetos.ex17;

import java.util.Scanner;

public class Ex17 {
    public static void mostraCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Calcular separadamente");
        System.out.println("2 - Calcular de uma so vez");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            new Ex17().calculoSeparado(scanner);
        } else {
            new Ex17().calculoJunto(scanner);
        }
    }

    private void calculoJunto(Scanner scanner) {
        System.out.print("Informe o raio: ");
        double raio = scanner.nextDouble();
        Circulo circulo = new Circulo(raio);
        circulo.imprimaCalculos();
    }

    private void calculoSeparado(Scanner scanner) {
        Circulo circulo = new Circulo();
        double raio;

        System.out.println("\n pra calcular a area informe o raio");
        raio = scanner.nextDouble();
        double area = circulo.calcularArea(raio);
        System.out.printf("A area do circulo de raio %.2f e de %.2f \n", raio, area);

        System.out.println("\n pra calcular a circunferencia informe o raio");
        raio = scanner.nextDouble();
        double circunferencia = circulo.calcularCircunferencia(raio);
        System.out.printf("A circunferencia do circulo de raio %.2f e de %.2f \n", raio, circunferencia);
    }
}
