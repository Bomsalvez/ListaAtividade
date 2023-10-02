package dev.senzalla.estruturas_controle;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex10 {
    public static void sequenciaFibonacci() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        imprimirFibonacci(n);

    }

    private static void imprimirFibonacci(int n) {
        BigDecimal primeiroTermo = BigDecimal.valueOf(0);
        BigDecimal segundoTermo = BigDecimal.valueOf(1);

        for (int i = 0; i < n; i++) {
            System.out.print(primeiroTermo + " ");

            BigDecimal proximoTermo = primeiroTermo.add(segundoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
