public class App {
    public static void main(String[] args) throws Exception {
      
        System.out.println("Calculadora");
        Calculadora.somar(5, 3);
        Calculadora.subtrair(10, 6);
        Calculadora.dividir(20, 2);
        Calculadora.multiplicar(5, 4);

        System.out.println("Mensagem");
        Mensagem.enviarMensagem(8);
        Mensagem.enviarMensagem(15);
        Mensagem.enviarMensagem(19);

        System.out.println("Empréstimo");
        Emprestimo.calcular(1350.00, 2);
        Emprestimo.calcular(1350.00, 3);
        Emprestimo.calcular(1350.00, 4);
        


        
    }
}
