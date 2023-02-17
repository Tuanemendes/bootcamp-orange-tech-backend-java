import java.util.Scanner;

public class Camarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = (tamanhoDaFila +1)/2;

        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.

        //System.out.println(pessoasNoCamarote+ " pessoas no camarote");
        pessoasNoCamarote = tamanhoDaFila / 2 + tamanhoDaFila % 2;
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
/*
        if(tamanhoDaFila % 2 == 0 ){
            pessoasNoCamarote = tamanhoDaFila /2;
           System.out.println(pessoasNoCamarote+ " pessoas no camarote");
        }else{
                pessoasNoCamarote = tamanhoDaFila/2;
               pessoasNoCamarote++;
               System.out.println(pessoasNoCamarote+ " pessoas no camarote");
        }
*/

    }
}