import java.util.Scanner;

public class LoginhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidadeDinheiro = leitor.nextInt();
        int doces = quantidadeDinheiro * 2;
        System.out.println("O cliente obteve " + doces + " doces");
    }
}
