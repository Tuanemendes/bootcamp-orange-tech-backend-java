import java.util.Scanner;

public class PontosNaCarteira {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int velocidade = leitor.nextInt();
            int multas = leitor.nextInt();

            if(velocidade>80){
                multas ++;
            }
            System.out.printf( multas >= 2 ? multas + " multas. Levou pontos na carteira"
                    :multas + " multas. Nao levou pontos na carteira") ;

        }

}
