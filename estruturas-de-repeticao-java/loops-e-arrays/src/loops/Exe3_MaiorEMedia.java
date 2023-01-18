package loops;

import java.util.Scanner;

public class Exe3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0; 
        int count = 0;
        do {
            System.out.println("Digite um número:");
            numero = scanner.nextInt();
            count++ ;

            soma += numero;
            if(numero > maior){
                maior = numero;
            }

        } while (count < 5);
        System.out.println( "Maior número : " + maior);
        System.out.println( "Média do número : " + (soma/5));
    }
}
