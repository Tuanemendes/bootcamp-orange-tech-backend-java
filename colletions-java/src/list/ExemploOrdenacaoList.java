package list;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Dados as segintes infromações sobre meus gatos ,
crie uam lista e orden esta lista exibindo:
        (nome-idade-cor);

Gato1 = nome: Jon, idade: 18, cor: preto
Gato2 = nome: Simba, idade: 4, cor: machado
Gato3 = nome: Jon, idade: 10, cor: branco
        */
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",4,"manchado"));
            add(new Gato("Jon",10,"branco"));
        }};



        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(gatos);

        System.out.println("--\tOrdem  Aleatória\t--");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem Natural (Nome)\t--");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem por Idade\t--");
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);
          /*
        outra froma de fazer a  comparação por meio de Colletions
        Collections.sort(gatos,new ComparatorIdade());
        System.out.println(gatos);*/

        System.out.println("--\tOrdem por Cor\t--");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("--\tOrdem Noem/Idade/Cor\t--");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }
}

class Gato implements Comparable<Gato> {

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class  ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        //comparação com inteiro
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
class  ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        //comparação com string
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0 ) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0 )return cor;

        return  Integer.compare(g1.getIdade(), g2.getIdade()) ;
    }
}
