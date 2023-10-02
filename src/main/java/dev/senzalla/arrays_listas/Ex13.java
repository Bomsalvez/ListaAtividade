package dev.senzalla.arrays_listas;

import java.util.List;

public class Ex13 {
    public static void calculeMedia() {
        List<Integer> array = ListaNumeros.solicitarLista();
        float media = 0;
        for (int i : array) {
            media += i;
        }
        System.out.printf("A media dos numeros é %.2f", media / array.size());

    }
}
