package dev.senzalla.orientacao_objetos.ex20;

import java.util.Scanner;

public class Ex20 {
    public static void mostraCarro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao simulador de carro!");

        System.out.print("Digite a marca do carro: ");
        String marcaCarro = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modeloCarro = scanner.nextLine();

        Carro carro = new Carro(marcaCarro, modeloCarro);

        boolean continua = true;
        while (continua) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite a quantidade de aceleração (em km/h): ");
                    double aceleracao = scanner.nextDouble();
                    carro.acelerar(aceleracao);
                }
                case 2 -> {
                    System.out.print("Digite a quantidade de frenagem (em km/h): ");
                    double frenagem = scanner.nextDouble();
                    carro.frear(frenagem);
                }
                case 3 -> {
                    System.out.println("Obrigado por usar nosso simulador!");
                    continua = false;
                }
                default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}