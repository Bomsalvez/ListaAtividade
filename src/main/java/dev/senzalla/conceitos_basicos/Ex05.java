package dev.senzalla.conceitos_basicos;

import java.util.Scanner;

public class Ex05 {
    public static void saudacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Com quem eu falo: ");
        String nome = scanner.nextLine();
        System.out.printf("Ola %s, de um sorriso se essa aplicação ficou boa!", nome);
    }
}
