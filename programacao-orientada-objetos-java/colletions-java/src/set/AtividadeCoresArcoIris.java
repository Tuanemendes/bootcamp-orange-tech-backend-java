package set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
vermelha, laranja, amarela, verde, azul, anil e violeta
 */
public class AtividadeCoresArcoIris {
    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("Vermelha");
        arcoIris.add("Laranja");
        arcoIris.add("Amarela");
        arcoIris.add("Verde");
        arcoIris.add("Azul");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");
        System.out.println(arcoIris);

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String arcoIris1 : arcoIris ){
            System.out.println(arcoIris1);
        }
        System.out.println("A quantidade de cores que o arco-íris tem : " + arcoIris.size() + " Cores");

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> arcoIris1 = new TreeSet<>(arcoIris);
        for (String cor :arcoIris1) {
            System.out.println(cor);
        }

        System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> arcoIris2 = new LinkedHashSet<>(Arrays.asList(
                "Vermelha","Laranja","Verde","Azul","Anil","Violeta"
        ));
        System.out.println(arcoIris2);
        List<String> arcoIrislist = new ArrayList<>(arcoIris2);
        Collections.reverse(arcoIrislist);
        System.out.println(arcoIrislist);

        System.out.println("Exiba todas as cores que começam com a letra ”V”: ");
        for (String arcoIrisCor :arcoIris) {
            if(arcoIrisCor.startsWith("V")) System.out.println(arcoIrisCor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator = arcoIris.iterator();
        while (iterator.hasNext()){
             if(iterator.next().startsWith("V")) iterator.remove();
        }
        System.out.println(arcoIris);

        System.out.println("Limpe o conjunto:");
        arcoIris.clear();
        System.out.println(arcoIris);
        System.out.println("Confira se o conjunto está vazio: " + arcoIris.isEmpty());


    }
}
