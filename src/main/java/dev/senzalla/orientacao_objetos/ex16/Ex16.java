package dev.senzalla.orientacao_objetos.ex16;

import java.util.Scanner;

public class Ex16 {
    public static void mostraPessoa() {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Informe o nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("Informe a idade: ");
        pessoa.setIdade(Integer.parseInt(scanner.nextLine()));

        System.out.println(pessoa);
    }
}
