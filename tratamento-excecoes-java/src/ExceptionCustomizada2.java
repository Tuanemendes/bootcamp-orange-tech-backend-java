import javax.swing.*;
import java.util.Arrays;

public class ExceptionCustomizada2 {

    public static void main(String[] args) {
        int[] numerador = {4,5,8,10};
        int[] denominador = {2,4,0,2,8};

        for (int i = 0; i < denominador.length;i++){
            try {
                if (numerador[i] % 2 != 0) throw new DivisaoNaoExataException(
                        "Divisão não exata!", numerador[i], denominador[i]);
                if(denominador[i] == 0 )throw  new ArithmeticException("Não é possivel divisão por zero");

                if(numerador.length < denominador.length)throw new ArrayIndexOutOfBoundsException("Posição inexistente");
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            }
            catch (DivisaoNaoExataException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
                e.printStackTrace();
            }



        }
        System.out.println("O programa continua...");
    }
}


