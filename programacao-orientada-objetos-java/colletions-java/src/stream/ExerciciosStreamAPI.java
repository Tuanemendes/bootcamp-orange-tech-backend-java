package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {

    List<String> numeros =  Arrays.asList("1","0","2","1","6","7","9","8","5");
        System.out.println("Imprima todos os elementos dessa lista de string:");
    //    numeros.stream().forEach(System.out::println);
        numeros.forEach(System.out::println);


        System.out.println("Peque os 5 primeiros números e coloque dentro de um set :");
        //set não aceita numeros repetidos.
        numeros.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
/*        Set<String> collectSet = numeros.stream()
                .limit(5)
                .collect(Collectors.toSet());*/


        System.out.println("Transforme esta lista de string em uma lista de números inteiros.");
        numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                 .forEach(System.out::println);
        /*List<Integer> collectList =numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
                System.out.println(collectList.toString());*/

        System.out.println("Peque os números pares e maiores que 2 e coloque em um lista: ");

        List<Integer> listNumerosPares = numeros.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(listNumerosPares);

        System.out.println("mostre a média dos números: ");
        numeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");

        List<Integer> listaNumerosInteger = numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        listaNumerosInteger.removeIf(integer -> (integer % 2 != 0 ));
        System.out.println(listaNumerosInteger);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante: ");
        numeros.stream().skip(3).forEach(System.out::println);

        System.out.println("Total da lista com repetidos: " + numeros.size());
        System.out.println("Retirando os números repetidos da lista , quantos números ficam?");
        long numerosNaoRepetidos = numeros.stream()
                .distinct()
                .count();
        System.out.println(numerosNaoRepetidos);
        System.out.println("Mostre o menor valor da lista :");

        listaNumerosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);
        System.out.println("Mostre o maior valor da lista :");
        listaNumerosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        System.out.println("Peque apenas os números ímpares e some: ");

        int soma = listaNumerosInteger.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(soma);


        System.out.println("Mostre a lista na ordem númerica:  ");
        List<Integer> numerosOrdemNatural = listaNumerosInteger.stream()
                        .sorted(Comparator.naturalOrder())
                                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        //dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean,List<Integer>> coletarNumerosMultiplos3e5 = listaNumerosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 ==0|| i % 5 ==0 )));
        System.out.println(coletarNumerosMultiplos3e5);




    }
}
