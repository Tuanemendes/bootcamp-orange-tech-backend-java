package loops;

import java.util.Scanner;


public class Exe6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial; 
        int multiplicacao = 1;


        System.out.println("Digite o fatorial:");
        fatorial = scanner.nextInt();

        for( int i = fatorial ; i >= 1  ;i--){
            multiplicacao *= i;
        }
        System.out.println("Decomposição:" + fatorial + "! = " + multiplicacao);
    }
}
