package dev.senzalla.estruturas_controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex07 {
    public static void calculeMedia() {
        try {
            Scanner scanner = new Scanner(System.in);
            List<Integer> integerList = new ArrayList<>();
            boolean continua = true;
            while (continua) {
                System.out.print("Insira um numero: ");
                integerList.add(Integer.parseInt(scanner.nextLine()));
                System.out.print("Deseja inserir mais um numero: (s/n) ");
                continua = !scanner.nextLine().equals("n");
            }

            float media = 0;
            for (int i : integerList) {
                media += i;
            }
            System.out.printf("A media dos numeros é %.2f", media / integerList.size());
        } catch (NumberFormatException e) {
            System.out.println("Algo deu errado, faça de novo");
            Ex07.calculeMedia();
        }
    }
}
