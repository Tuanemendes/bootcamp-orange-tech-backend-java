package arrays;

import java.util.Scanner;

public class Exe2_Nota {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10 ");
        int nota = scanner.nextInt();
        
        while(nota < 0 || nota > 10){
            
            System.out.println("Valor inválido! Digite novamente:");
            nota = scanner.nextInt();
       
        }

    }
}
