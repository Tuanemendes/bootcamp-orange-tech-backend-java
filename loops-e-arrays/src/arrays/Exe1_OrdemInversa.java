package arrays;


public class Exe1_OrdemInversa {
    
    public static void main(String[] args) {
        
        int [] vetor = {5,6,32,18,4,1};
        int contador = 0;

        System.out.println("Vetor");
        while(contador < (vetor.length)){
            System.out.print( vetor[contador] + " ");
            contador++;
        }
        System.out.println(" \nVetor");

        for(int i = (vetor.length -1); i >= 0  ; i--){
            System.out.print( vetor[i] + " ");
        }
       
    
    }
}
