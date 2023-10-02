package dev.senzalla.estruturas_controle;

public class Ex08 {
    public static void imprimaNumerosPrimos_1_100() {
        System.out.println("Números primos de 1 a 100:");

        for (int i = 2; i <= 100; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
