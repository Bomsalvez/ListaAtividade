package dev.senzalla.arrays_listas;

import java.util.List;

public class Ex12 {
    public static void verifiqueArrayOrdemCrescente() {
        List<Integer> array = ListaNumeros.solicitarLista();
        String ordenado = verificarOrdenacaoCrescente(array);
        System.out.printf("A lista %s está ordenado de forma crescente", ordenado);
    }

    private static String verificarOrdenacaoCrescente(List<Integer> array) {
        if (array.size() <= 1) {
            return "";
        }
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > array.get(i + 1)) {
                return "não";
            }
        }
        return "";
    }
}
