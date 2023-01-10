package arrays;

import java.util.Scanner;

public class Exe2_Consoantes {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] consoantes = new String[6] ;

        int quantidadeConsoantes = 0; 
        int contador = 0; 
        
        do {
            System.out.println("Letra: ");
            String letra = scanner.next();
            if(!(letra.equalsIgnoreCase("a")||
            letra.equalsIgnoreCase("e")||
            letra.equalsIgnoreCase("i")||
            letra.equalsIgnoreCase("o")||
            letra.equalsIgnoreCase("u"))){
                consoantes[contador] = letra;
                quantidadeConsoantes ++;
            }
            contador ++;
            
        } while (contador < consoantes.length);
        System.out.println("Consantes:" );
        for (String consoante: consoantes) {
            if(consoante != null){
                System.out.print( consoante + " " );
            } 
        }
        System.out.println("\nQuantidade de Consoantes:" + quantidadeConsoantes);
        
    }
}
