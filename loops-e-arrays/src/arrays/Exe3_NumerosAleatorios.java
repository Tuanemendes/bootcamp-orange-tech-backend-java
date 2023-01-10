package arrays;

import java.util.Random;

public class Exe3_NumerosAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();
        int[] numerosaleatorios = new int[20];
        for( int i = 0 ;  i < numerosaleatorios.length ; i++ ){
            int numero = random.nextInt(100);
            numerosaleatorios[i] = numero;
        }

        System.out.println("\nAntecessores Números Aleatórios:");
        for (int numero : numerosaleatorios) {
            System.out.print((numero -1) + " ");
        }

        System.out.println("\nNúmeros Aleatórios:");
        for (int numero : numerosaleatorios) {
            System.out.print(numero  + " ");
        }

        System.out.println("\nSucessores Números Aleatórios:");
        for (int numero : numerosaleatorios) {
            System.out.print((numero +1) + " ");
        }

    }
}
