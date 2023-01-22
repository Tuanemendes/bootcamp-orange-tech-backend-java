package map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        /*
        * Dada os modelos dos carros e seus respecctivos cnsumos na estrada, faça:
        * Modelo= gol - consumo = 14.4 km/l
        * Modelo= uno - consumo = 15.6 km/l
        * Modelo= mobi - consumo = 16.1 km/l
        * Modelo= hb20 - consumo = 14.5 km/l
        * Modelo= kwid - consumo = 15.6 km/l
        * */
        //Map carros = new HashMap(); //antes do java 5
        // Map<String,Double> carros = new HashMap<>();// Generics jdk5 -Diamont
        //HashMap<String,Double> carros = new HashMap<>();
        // Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String,Double> carros = new HashMap<>(){{
            put("Gol",14.4);
            put("Uno",15.6);
            put("Mobi",16.1);
            put("Hb20",14.5);
            put("Kwid",15.6);
        }};
        System.out.println(carros.toString()); // não é inserido na mesma ordem , e não pode ter chaves iguais.

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carros.put("Gol",15.2);
        System.out.println(carros);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carros.containsKey("tucson"));

        System.out.println(" Exiba o consumo do uno: " + carros.get("Uno"));

        //System.out.println("Exiba o terceiro modelo adcionado: "); //não é possivel pois não se tem um metodo
        System.out.println("Exiba os modelos: " );
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumo = carros.values();
        System.out.println(consumo);

        System.out.println("Exiba o modelo mais ecônomico e sua consumo : ");
        Double economico = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloEconomico = "";

        for (Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(economico)){
                modeloEconomico = entry.getKey();
            }
        }


        System.out.println(modeloEconomico + " - " + economico);

        System.out.println("Exiba o modelo menos ecônomico e sua consumo : ");

        Double consumoMenosEficiente =  Collections.min(carros.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carros.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo meno eficiente "+ modeloMenosEficiente + " - "
                        + consumoMenosEficiente);
            }
        }


        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionario de carros: "+ (soma/carros.size()));

        System.out.println("Os modelos com o consumo igual a 15,6km/l: "  + carros);
        //remove o elemento 15.6
        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println("Remova os modelos com o consumo igual a 15,6km/l: "  + carros);

        System.out.println("Exiba todos os carros na ordem em que foram informados: " );
        Map<String,Double> carros1 = new LinkedHashMap<>(){{
            put("Gol",14.4);
            put("Uno",15.6);
            put("Mobi",16.1);
            put("Hb20",14.5);
            put("Kwid",15.6);
        }};
        System.out.println(carros1.toString());
        //ordena em ordem alfabetica
        System.out.println("Exiba o dicionario ordenado pelo modelo:");
        Map<String,Double> carros2  = new TreeMap<>(carros1);
        System.out.println(carros2.toString());

        System.out.println("Apague o conjunto de carros: ");
        carros2.clear();
        System.out.println(carros2);

        System.out.println("Confira se  o dicionario está vazia: "+ carros2.isEmpty());

    }
}
