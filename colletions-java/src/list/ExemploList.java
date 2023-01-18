package list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        //List<Double> notas = new ArrayList<>(); //Generics - Diamond Operat
        // ArrayList<Double> notas = new ArrayList<>(); // não é muito utilizado
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,6d,0d,3.6));
/*        List<Double> notas = Arrays.asList(7d,8.5,9.3,5d,6d,0d,3.6); // lista limitado não se pode adicionar mais elementos
        notas.add(10d);
        System.out.println(notas);*/

/*        List<Double> notas = List.of(7d,8.5,9.3,5d,6d,0d,3.6); // lista é imutavel
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adcione as sete notas ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); // é passado o elemento e retorna sua posição

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); // passando a posição e logo em seguida o elementos que sera alterado
        System.out.println(notas);

        System.out.println("Substitua a nota5.0 pela nota 3.0 :");
        notas.set(notas.indexOf(5d),3.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota:notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: " );
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " +(soma/notas.size())); // size quantidade de elementos que tem dentro da lista

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); // pode se passar a posição ou o elemento
        System.out.println(notas);
        System.out.println("Remova a nota da posição 0 ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7)iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda lista ");
        notas.clear();
        System.out.println(notas);
        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());

        //Atividades Resolver utilizando os metodos da implementação LinkedList

        System.out.println("Crie uam lista chamada notas2," +
                "e colocar todos os elementos da list ArrayList nessa nova lista:  ");
        List<Double> notas2 = new LinkedList<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(6.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2.toString());


        System.out.println("Mostre a primeira nota da nova lista sem remove⁻lo: "+ notas2.get(0));
        System.out.println(notas2.toString());
        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.remove(0));
        System.out.println(notas2);


    }

}
