package dev.senzalla.arrays_listas;

import java.util.Collections;
import java.util.List;

public class Ex15 {
    public static void invertaArray() {
        List<Integer> array = ListaNumeros.solicitarLista();
        Collections.reverse(array);
        System.out.println(array);
    }
}
