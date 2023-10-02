package dev.senzalla.arrays_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNumeros {
    public static List<Integer> solicitarLista() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma lista de numeros separados por virgula");
        List<Integer> array = new ArrayList<>();
        String lista = scanner.nextLine();
        List<String> strings = List.of(lista.split(","));
        strings.forEach(s -> array.add(Integer.parseInt(s.strip())));
        return array;
    }
}
