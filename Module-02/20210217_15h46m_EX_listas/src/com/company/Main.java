package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /*
            Lista é uma estrutura de dados:
                Homogênea (dados do mesmo tipo)  (como vetores)
                Ordenada (elementos acessados por meio de posições)  (como vetores)
                Inicia vazia, e seus elementos são alocados sob demanda  (oposto de vetores)
                Cada elemento ocupa um "nó" (ou nodo) da lista

            Tipo (interface): List
            Classes que implementam: ArrayList, LinkedList, etc.
            Vantagens: (resolve as fraquezas dos vetores)
                Tamanho variável
                Facilidade para se realizar inserções e deleções
            Desvantagens:
                Acesso sequencial aos elementos *

         */

        // Criando lista de números inteiros

        List<Integer> listaInts; // O argumento das listas <> não aceita tipos primitivos;
                                 //   somente as correspondentes wrapper classes
                                 // <> é o que se chama generics, e serve para parametrizar um
                                 //   tipo por outro.
                                 // Ps. nesta declaração, não instanciei; na seguinte, instanciarei.

        List<String> listaStrings = new ArrayList<>();  // ArrayList é uma classe popular por ser
                                                        //   otimizada com as melhores características
                                                        //   de vetores e listas

        listaStrings.add("Marcio");
        listaStrings.add("Marco");
        listaStrings.add("Luc");
        listaStrings.add("Rosi");
        listaStrings.add("Rachel");


        for (String x : listaStrings) {
            System.out.println(x);
        }

        System.out.println("------------");

        listaStrings.add(1, "Claude"); // Inserindo elemento na segunda posição

        for (String x : listaStrings) {
            System.out.println(x);
        }

        System.out.println("------------");

        listaStrings.remove("Marco");   // Remoção por conteúdo
        listaStrings.remove(0);      // Remoção por índice

        listaStrings.removeIf(x -> x.charAt(0) == 'R'); // Entre (), uma função lambda do tipo predicado

        for (String x : listaStrings) {
            System.out.println(x);
        }

        System.out.println("------------");

        System.out.println("Index of Luc " + listaStrings.indexOf("Luc"));
        System.out.println("Index of Marcio " + listaStrings.indexOf("Marcio"));

        System.out.println("------------");

        listaStrings.add("Rosi");
        listaStrings.add("Rachel");

        List<String> result = listaStrings.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
        // O comando acima filtra elementos de uma lista via função lambda. Tenho que converter para
        //   stream, mas como o stream não é compatível com lista, tenho que usar o .collect() junto.

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("------------");

        System.out.println("Lista atual:");
        for (String x : listaStrings) {
            System.out.println(x);
        }

        String name = listaStrings.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
        // O comando acima filtra minha lista a procura de elementos que começam com R e
        //   me retorna o primeiro elemento que começa com R e o atribui à variável name.

        System.out.println("Primeiro elemento começado com R: " + name);

        name = listaStrings.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

        System.out.println("Primeiro elemento começado com J: " + name);

    }
}
