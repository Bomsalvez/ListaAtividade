package dev.senzalla.conceitos_basicos;

import java.util.Scanner;

public class Ex03 {
    public static void verifiqueParImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        int valor = scanner.nextInt();
        String parImpar = valor % 2 == 0 ? "par" : "impar";
        System.out.printf("O número %d é %s", valor, parImpar);
    }
}
