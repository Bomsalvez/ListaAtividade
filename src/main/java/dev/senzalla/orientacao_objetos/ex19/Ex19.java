package dev.senzalla.orientacao_objetos.ex19;

import java.util.Scanner;

public class Ex19 {
    public static void mostraLivro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de informações de livros!");

        System.out.print("Digite o título do livro: ");
        String tituloLivro = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autorLivro = scanner.nextLine();

        Livro livro = new Livro(tituloLivro, autorLivro);

        System.out.println("\nInformações do livro:");
        livro.exibirInformacoes();
    }
}
