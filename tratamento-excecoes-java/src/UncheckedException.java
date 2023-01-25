import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args) {

        boolean continuaLoop = true;
        do {
            String numerador = JOptionPane.showInputDialog("Numerador: ");
            String denominador = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(numerador),Integer.parseInt(denominador));
                System.out.println("Resultado: " + resultado);
                continuaLoop = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Informe um número inteiro! " + e.getMessage());
                e.printStackTrace();
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Inmpossivel divisão por 0 !  " );

            }
            finally {
                System.out.println("Chegou no finally!");
            }

        }while (continuaLoop);


        System.out.println("O código continua ...");
    }
    public static int dividir(int numerador, int denominador){
        return numerador/denominador;
    }
}
