package map;
/*Dadas as seguintes informações sobre livros e seus autores, crie
um dicionario e ordene este dicionario:
exibindo (Nome Autor- Nome Livro );
* */
/*
* Autor  = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo. paginas: 256
* Autor  = Duhigg, Charles - Livro = nome: O Poder do Hábito. paginas: 408
* Autor  = Harari, Yuval Noah - Livro = nome: 21 Lições Para o Século 21 . paginas: 432
* */


import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {



        System.out.println("---\t Ordem Aleatória \t---");
        Map<String,Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen",new Livro("Uma Breve História do Tempo",256));
            put("Duhigg, Charles",new Livro("O Poder do Hábito",408));
            put("Harari, Yuval Noah",new Livro("21 Lições Para o Século 21",432));
        }};
        for (Map.Entry<String,Livro> livro :livros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("---\t Ordem Inserção \t---");
        Map<String,Livro> livros1 = new  LinkedHashMap<>(){{
            put("Hawking, Stephen",new Livro("Uma Breve História do Tempo",256));
            put("Duhigg, Charles",new Livro("O Poder do Hábito",408));
            put("Harari, Yuval Noah",new Livro("21 Lições Para o Século 21",432));
        }};
        for (Map.Entry<String,Livro> livro:livros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("---\t Ordem Alfabética autores \t---");
        Map<String,Livro> livro2 = new TreeMap<>(livros);
        for (Map.Entry<String,Livro> livro:livro2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("---\t Ordem Alfabética nomes dos livros \t---");
        Set<Map.Entry<String,Livro>> livros3 = new TreeSet<>(new ComparatorNome());
        livros3.addAll(livros.entrySet());
        for (Map.Entry<String,Livro> livro: livros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("---\t Ordem número de página\t--");
        Set<Map.Entry<String,Livro>> livro4 = new TreeSet<>(new ComparatorPagina());
        livro4.addAll(livros.entrySet());
        for (Map.Entry<String,Livro> livro: livro4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
        }



    }
}
class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{


    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class  ComparatorPagina implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getPaginas(),l2.getValue().getPaginas());
    }
}