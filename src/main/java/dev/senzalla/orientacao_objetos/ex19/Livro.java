package dev.senzalla.orientacao_objetos.ex19;

public class Livro {
    private final String titulo;
    private final String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
