package set;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {
//   Data uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6

//      Set notas = new HashSet(); // antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>();//Generics(jdk 5 ) - Diamont Operator (jdk7)
/*      Set<Double> notas = Set.of(7d,8.5d,9.3,5d,7d,0d,3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie um conjunto e adcione as notas ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,6d,0d,3.6));

        System.out.println(notas.toString());

//        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //não é buscar peloa indice
        System.out.println("Confira se a nota 5 está no conjunto"+ notas.contains(5d));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0 :" );
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que  exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7 ) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double>notas1 = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas1);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas2 = new TreeSet<>(notas1);
        System.out.println(notas2);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println("Confira se o conjunto esta vazio : " + notas.isEmpty());

    }
}