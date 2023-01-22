package map;

import java.util.*;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Tuane, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class AtividadeContato {

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer,Contato> agenda = new HashMap<>(){{
           put(1,new Contato("Tuane",2222));
           put(4,new Contato("Cami",5555));
           put(3,new Contato("Jon",1111));
        }};
        for(Map.Entry<Integer,Contato> entry: agenda.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer,Contato> agenda1 = new LinkedHashMap<>(){{
            put(5,new Contato("Tuane",2222));
            put(4,new Contato("Cami",5555));
            put(3,new Contato("Jon",1111));
        }};
        for (Map.Entry<Integer,Contato> entry : agenda1.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer,Contato> agenda2 = new TreeMap<>(agenda1);
        System.out.println(agenda2);
        for (Map.Entry<Integer,Contato> entry : agenda2.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
        Set<Map.Entry<Integer,Contato>> agenda3 = new TreeSet<>(new ComparatorOrdemNumero());
        agenda3.addAll(agenda2.entrySet());
        for (Map.Entry<Integer,Contato> entry: agenda3){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " : " + entry.getValue().getNome());

        }


        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer,Contato>> agenda4 = new TreeSet<>(new ComparatorOrdemContato());
        agenda4.addAll(agenda2.entrySet());
        for(Map.Entry<Integer,Contato> entry : agenda4) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }


    }
}

class ComparatorOrdemNumero implements Comparator<Map.Entry<Integer,Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return Integer.compare(c1.getValue().getNumero(),c2.getValue().getNumero());
    }
}

class ComparatorOrdemContato implements Comparator<Map.Entry<Integer,Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return c1.getValue().getNome().compareToIgnoreCase(c2.getValue().getNome());
    }
}