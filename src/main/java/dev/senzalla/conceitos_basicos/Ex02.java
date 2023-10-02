package dev.senzalla.conceitos_basicos;

import java.util.Scanner;

public class Ex02 {
    public static void somaDoisNumerosInteiros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        int valorX = scanner.nextInt();
        System.out.print("Insira um valor: ");
        int valorY = scanner.nextInt();
        int soma = valorX + valorY;
        System.out.printf("%d + %d = %d", valorX, valorY, soma);
    }
}
