package dev.senzalla.orientacao_objetos.ex18;

import java.util.Scanner;

public class Ex18 {
    public static void mostraContaBancaria() {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Bem-vindo à sua conta bancária!");
        boolean continua = true;
        while (continua) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Verificar Saldo");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor para depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                }
                case 2 -> {
                    System.out.print("Digite o valor para sacar: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                }
                case 3 -> System.out.printf("Saldo atual: R$ %.2f \n", conta.verificarSaldo());
                case 4 -> {
                    System.out.println("Obrigado por usar nossa aplicação!");
                    continua = false;
                }
                default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
