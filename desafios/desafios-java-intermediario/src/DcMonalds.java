import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        //String listaIngredientes[] = new String[3];

        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
        String listaIngredientes[] = ingredientes.split(";");
       /* for (int i = 0 ; i < listaIngredientes.length;i++){
            System.out.println(listaIngredientes[i]);
        }*/
        for(String ingrediente : listaIngredientes) System.out.println(ingrediente);
    }
}