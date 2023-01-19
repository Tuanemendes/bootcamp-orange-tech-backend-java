package set;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class AtividadeLinguagemProgramacao {

    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagemFavoritas = new HashSet<>(){{
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("JavaScript", 1995, "VSCode"));
            add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        }};
        System.out.println(linguagemFavoritas);

        System.out.println("Ordem de inserção: ");
        Set<LinguagemFavorita>linguagemFavoritas1 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("JavaScript", 1995, "VSCode"));
            add(new LinguagemFavorita("C/C++", 1980, "DevC++"));
        }};
        for (LinguagemFavorita linguagemFavorita:linguagemFavoritas1) {
            System.out.println(linguagemFavorita);
        }
        System.out.println("Ordem natural(nome)");
        Set<LinguagemFavorita> linguagemFavoritas2 = new TreeSet<>(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita:linguagemFavoritas2) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("Ordem IDE");
        Set<LinguagemFavorita> linguagemFavoritas3 = new TreeSet<>(new ComaparatorIde());
        linguagemFavoritas3.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita:linguagemFavoritas3) {
            System.out.println(linguagemFavorita);
        }
        System.out.println("Ano de criação e nome");
        Set<LinguagemFavorita> linguagemFavoritas4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagemFavoritas4.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita:linguagemFavoritas4) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("Ordem Nome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagemFavoritas5 = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        linguagemFavoritas5.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita: linguagemFavoritas5) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("Ao final, exiba as linguagens no console, um abaixo da outra: ");

        for (LinguagemFavorita linguagemFavorita:linguagemFavoritas5) {
            System.out.println(linguagemFavorita.getNome() + " - " +
                    + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }


    }

}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.getNome().compareToIgnoreCase(linguagemFavorita.getNome());
    }

}
class ComaparatorIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}
class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(anoCriacao != 0)return anoCriacao;
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAnoCriacaoIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if( nome != 0 )return nome;
        int anoCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(anoCriacao != 0 ) return anoCriacao;
        return  l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}