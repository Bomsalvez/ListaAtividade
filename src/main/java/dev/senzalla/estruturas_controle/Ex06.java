package dev.senzalla.estruturas_controle;

import java.util.concurrent.TimeUnit;

public class Ex06 {
    public static void imprimaNumero_1_10() {
        System.out.println("Conte comigo!");
        for (int i = 1; i <= 10; i++) {
            try {
                final long dormir = 1;
                TimeUnit.SECONDS.sleep(dormir);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}