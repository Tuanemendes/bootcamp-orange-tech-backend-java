import java.util.Scanner;

public class DownloadDePacotes {

/*    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoPacote = leitor.nextInt();
        String porcentagem = "";

        for(int i = 0; i < tamanhoPacote; i++) {
            porcentagem += "/";
        }
        System.out.println(porcentagem);
    }*/
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
         for(int i = 0; i < tamanho; i++){
             System.out.print("/");
         }


    }

}
