package dev.senzalla.estruturas_controle;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex09 {
    public static void calculeVogaisNaString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase ou palavra:");
        String input = scanner.nextLine().toLowerCase();
        int contadorVogais = contarVogais(input);
        System.out.printf("A quantidade de vogais na frase/palavra é: %s", contadorVogais);
    }

    private static int contarVogais(String texto) {
        Pattern pattern = Pattern.compile("[AEIOUaeiou]");
        Matcher matcher = pattern.matcher(texto);
        int contador = 0;
        while (matcher.find()) {
            contador++;
        }
        return contador;
    }
}
