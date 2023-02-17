import java.util.Arrays;
import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();

        // TODO: Crie a condição necessária para remover as barras da String e apresentar de forma mais amigável
        String array[] = frase.split("/");
        System.out.println("Imovel: " + array[0] +" R$" + array[1] + " " + array[2] );
    }
}
