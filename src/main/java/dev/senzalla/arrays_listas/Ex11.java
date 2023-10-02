package dev.senzalla.arrays_listas;

import java.util.List;

public class Ex11 {
    public static void procurarValorMaximoArray() {
        List<Integer> array = ListaNumeros.solicitarLista();
        int maximo = encontrarMaximo(array);
        System.out.printf("O valor máximo no array é: %d", maximo);
    }

    private static int encontrarMaximo(List<Integer> array) {
        int maximo = 0;
        for (int i : array) {
            if (i > maximo) {
                maximo = i;
            }
        }
        return maximo;
    }
}
