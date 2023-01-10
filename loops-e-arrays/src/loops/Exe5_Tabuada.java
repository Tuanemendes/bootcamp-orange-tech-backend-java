package loops;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Exe5_Tabuada {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valorTabuada;
        int count = 1;
        int resultado = 0;
        System.out.println("Digite o valor o número da tabuada:");
        valorTabuada = scanner.nextInt();

/*         for(int i = 1 ; i <= 10 ; i++){
            int resultado  = valorTabuada * i;
            System.out.println(valorTabuada + " x " + i + " = " + resultado);
        } */
    
        do{  
            resultado = valorTabuada * count;
            System.out.println(valorTabuada + " x " + count + " = " + resultado); 
            count++;
        }while(count <= 10);

    }
}
