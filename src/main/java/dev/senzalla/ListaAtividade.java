package dev.senzalla;

import dev.senzalla.arrays_listas.*;
import dev.senzalla.conceitos_basicos.*;
import dev.senzalla.estruturas_controle.*;
import dev.senzalla.orientacao_objetos.ex16.Ex16;
import dev.senzalla.orientacao_objetos.ex16.Pessoa;
import dev.senzalla.orientacao_objetos.ex17.Ex17;
import dev.senzalla.orientacao_objetos.ex18.Ex18;
import dev.senzalla.orientacao_objetos.ex19.Ex19;
import dev.senzalla.orientacao_objetos.ex20.Ex20;

import java.util.List;
import java.util.Scanner;

public class ListaAtividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ListMenu> listMenus = List.of(ListMenu.values());
        int opcao = 0;
        while (opcao >= 0 && opcao < listMenus.size()) {
            System.out.println("##############################################");
            System.out.println("********* Escolha a Atidade a Testar *********");
            for (ListMenu listMenu : listMenus) {
                System.out.println(listMenu.getOpcao());
            }
            opcao = scanner.nextInt() - 1;
            if (opcao >= 0 && opcao < listMenus.size()) {
                System.out.printf("\n\nVocê escolheu a opção %s\n\n", listMenus.get(opcao).getOpcao());
            }
            new ListaAtividade().irAtividade(opcao);
            System.out.println("\n\n\n\n\n");
        }
        System.out.println("******************* Adeus ********************");
        System.out.println("##############################################");


    }

    private void irAtividade(int opcao) {
        switch (opcao) {
            case 0 -> Ex01.imprimaOlaMundo();
            case 1 -> Ex02.somaDoisNumerosInteiros();
            case 2 -> Ex03.verifiqueParImpar();
            case 3 -> Ex04.calculeAreaCirculo();
            case 4 -> Ex05.saudacao();
            case 5 -> Ex06.imprimaNumero_1_10();
            case 6 -> Ex07.calculeMedia();
            case 7 -> Ex08.imprimaNumerosPrimos_1_100();
            case 8 -> Ex09.calculeVogaisNaString();
            case 9 -> Ex10.sequenciaFibonacci();
            case 10-> Ex11.procurarValorMaximoArray();
            case 11-> Ex12.verifiqueArrayOrdemCrescente();
            case 12-> Ex13.calculeMedia();
            case 13-> Ex14.imprimaListaSemRepeticao();
            case 14-> Ex15.invertaArray();
            case 15-> Ex16.mostraPessoa();
            case 16-> Ex17.mostraCirculo();
            case 17-> Ex18.mostraContaBancaria();
            case 18-> Ex19.mostraLivro();
            case 19-> Ex20.mostraCarro();
        }
    }
}