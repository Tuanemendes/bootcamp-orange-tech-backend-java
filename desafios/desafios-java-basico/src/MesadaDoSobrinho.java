import java.util.Scanner;

public class MesadaDoSobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de meses:");
        int entrada = leitor.nextInt();
        int mesada = 50;
        int mesadaFinal = entrada * mesada;
        System.out.println("Voce tera " + mesadaFinal + " reais");

    }
}
