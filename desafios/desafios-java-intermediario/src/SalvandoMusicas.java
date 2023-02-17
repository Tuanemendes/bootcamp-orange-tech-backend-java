import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeDoArquivo = leitor.next();

        /*if(arquivoDoPc.contains(".mp3")){
            System.out.println("Salvar");
        }else {
            System.out.println("Deletar");
        }*/
       /* String resultado = (arquivoDoPc.contains(".mp3")) ? "Salvar" : "Deletar";
        System.out.println(resultado);*/
        boolean arquivoEhMp3 = nomeDoArquivo.contains(".mp3");
        String resultado = arquivoEhMp3 ? "Salvar" : "Deletar";
        System.out.println(resultado);

    }
}