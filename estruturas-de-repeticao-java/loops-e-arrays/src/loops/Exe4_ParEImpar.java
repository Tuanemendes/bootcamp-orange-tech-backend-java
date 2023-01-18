package loops;

import java.util.Scanner;

public class Exe4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros; 
        int numero;
        int quantidadeImpar = 0;
        int quantidadePar = 0; 
        int count = 0; 
        System.out.println("Digite a quantidade de número:");
        quantidadeNumeros = scanner.nextInt();

        do {
           System.out.println("Numero:" );
           numero = scanner.nextInt(); 
           count++;
           if(numero %2 == 0 ){
            quantidadePar++;
           }else{
            quantidadeImpar++;
           }

        } while (count < quantidadeNumeros);

        System.out.println("Quantidade Par: " +quantidadePar);
        System.out.println("Quantidade Impar : " +quantidadeImpar);
    }
}
