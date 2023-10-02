package dev.senzalla.arrays_listas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex14 {
    public static void imprimaListaSemRepeticao() {
        List<Integer> array = ListaNumeros.solicitarLista();
        Set<Integer> targetSet = new HashSet<>(array);

        System.out.print(targetSet);
    }
}
