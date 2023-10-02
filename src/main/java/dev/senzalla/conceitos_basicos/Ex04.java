package dev.senzalla.conceitos_basicos;

import java.util.Scanner;

public class Ex04 {
    public static void calculeAreaCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o raio do circulo: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * (raio * raio);
        System.out.printf("A area do circulo de raio %.2f é %.2f", raio, area);
    }
}
