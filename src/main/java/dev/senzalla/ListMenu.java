package dev.senzalla;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ListMenu {
    OLA_MUNDO("1 - Olá, Mundo!"),
    SOMA_NUMEROS("2 - Soma de dois números"),
    PAR_IMPAR("3 - par ou ímpar"),
    AREA_CIRCULO("4 - calcule a área do círculo"),
    CUMPRIMENTE("5 - cumprimente"),
    IMPRIMA_1_10("6 - imprima os números de 1 a 10"),
    MEDIA_NUMEROS("7 - média de uma lista de números."),
    NUMEROS_PRIMOS("8 - Numeros primos"),
    VOGAIS_STRING("9 - vogais em uma string"),
    FIBONACCI("10 - Fibonacci"),
    MAXIMA_ARRAY("11 - valor máximo em um array"),
    ARRAY_CRESCENTE("12 - Verifique se array está ordenado de forma crescente."),
    MEDIA_LISTA_NUMEROS("13 - Escreva um programa que calcule a média dos valores em uma lista."),
    SEM_REPETICAO("14 - imprima os elementos sem repetição"),
    ARRAY_INVERTIDO("15 - inverta a ordem dos elementos"),
    PESSOA("16 - Pessoa"),
    CIRCULO("17 - Circulo"),
    CONTA_BANCARIA("18 - Conta Bancaria"),
    LIVRO("19 - Livro"),
    CARRO("20 - Carro")
;
    private final String opcao;
}
