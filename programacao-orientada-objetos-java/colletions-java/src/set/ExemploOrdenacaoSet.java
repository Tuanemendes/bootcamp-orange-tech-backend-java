package set;

import java.util.*;

/*Dados as seguintes informações sobre series ,
crie um conjunto e ordene este conjunto exibido
(nome-genero-tempo do episódio)

Serie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Serie 2 = Nome: dark, genero: drama, tempoEpisodio: 60
Serie 3 = Nome: that, genero: comédia, tempoEpisodio: 25



*/
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\t Ordem Aleatória \t--");
        Set<Serie>series = new HashSet<>(){{
            add(new Serie("got","Fantasia", 60));
            add(new Serie("dark","Drama", 60));
            add(new Serie("that","Comédia", 25));
        }};
        for (Serie serie:series) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\t Ordem Inserção \t--");
        Set<Serie>series1 = new LinkedHashSet<>(){{
            add(new Serie("got","Fantasia", 60));
            add(new Serie("dark","Drama", 60));
            add(new Serie("that","Comédia", 25));
        }};
        for (Serie serie:series1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println("--\t Ordem Natural (TempoEpisodio) \t--");
        Set<Serie> series2 = new TreeSet<>(series1);
        for (Serie serie:series2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\t Ordem Nome/Gênero/TempoEpisodio \t--");
        Set<Serie> series3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        series3.addAll(series);
        for (Serie serie:series3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\t Ordem gênero \t--");
        Set<Serie> series4 = new TreeSet<>(new ComparatorGenero());
        series4.addAll(series);
        for (Serie serie:series4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\t Ordem Tempo Episódio \t--");
        Set<Serie> series5 = new TreeSet<>(new ComparatorTempoEpisodio());
        series5.addAll(series);
        for (Serie serie:series5) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private  Integer  tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());
        if(tempoEpisodio != 0 ) return  tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());


    }
}
class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0 )return nome;
        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0 )return genero;
        return Integer.compare(serie1.getTempoEpisodio(),serie2.getTempoEpisodio());


    }
}
class ComparatorGenero implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {

        return serie1.getGenero().compareToIgnoreCase(serie2.getGenero());
    }
}
class ComparatorTempoEpisodio implements  Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        return Integer.compare(serie1.getTempoEpisodio(),serie2.getTempoEpisodio());
    }
}