package map;

import java.util.*;

/*
* Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265
* */
public class AtividadePopulacaoEstimada {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações:");
        Map<String,Integer> estadoPolulacao1 = new HashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        for (Map.Entry<String,Integer> estadoPopulacao : estadoPolulacao1.entrySet() ){
            System.out.println(estadoPopulacao.getKey() +  " - " + estadoPopulacao.getValue());
        }

        System.out.println("Substitua a população do estado do RN por 3.534.165: ");
        estadoPolulacao1.put("RN",3534165);
        System.out.println(estadoPolulacao1.toString());

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277: " + estadoPolulacao1.containsKey("PB"));
        if(!estadoPolulacao1.containsKey("PB")){
            estadoPolulacao1.put("PB",4039277);
        }
        System.out.println(estadoPolulacao1.toString());

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado:");
        Map<String,Integer> estadoPopulacao2 = new LinkedHashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println(estadoPopulacao2.toString());

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String,Integer> estadoPopulacao3 = new TreeMap<>(estadoPopulacao2);
        System.out.println(estadoPopulacao3.toString());

        System.out.println("Exiba o estado com o menor população e sua quantidade: ");
        Integer menorPopulacao = Collections.min(estadoPopulacao3.values());
        Set<Map.Entry<String,Integer>> entries = estadoPopulacao3.entrySet();
        String  estadoMenorPopulacao = "";

        for (Map.Entry<String,Integer> entry : entries){
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenorPopulacao = entry.getKey();

            }
        }
        System.out.println(estadoMenorPopulacao + " - " + menorPopulacao);

        System.out.println("Exiba o estado com a maior população e sua quantidade:  ");
        Integer maiorPopulacao = Collections.max(estadoPopulacao3.values());
        Set<Map.Entry<String,Integer>> entries1 = estadoPopulacao3.entrySet();
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String,Integer> entry : entries1){
            if (entry.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = entry.getKey();
            }
        }
        System.out.println(estadoMaiorPopulacao + " - " + maiorPopulacao);

        System.out.println("Exiba a soma da população desses estados");
        Iterator<Integer> iterator = estadoPopulacao3.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma/estadoPopulacao3.size()));

        System.out.println("Remova os estados com a população menor que 4.000.000 :");
        Iterator<Integer> iterator1 = estadoPopulacao3.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() < 4000000){
                iterator1.remove();
            }
        }
        System.out.println(estadoPopulacao3.toString());
        System.out.println("Apague o dicionário de estados: ");
        estadoPopulacao3.clear();
        System.out.println(estadoPopulacao3.toString());

        System.out.println("Confira se o dicionário está vazio: " + estadoPopulacao3.isEmpty());

    }
}
