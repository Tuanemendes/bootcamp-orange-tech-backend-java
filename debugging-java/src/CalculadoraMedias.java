import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        String[] alunos ={"Tuane","Andre","Davison","Guilherme"};
        Scanner scanner = new Scanner(System.in);
        double media = calculaMediaTurma(alunos,scanner);
    }
    public static double calculaMediaTurma(String[] alunos,Scanner scanner){
        double soma = 0;
        for(String aluno: alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;

        }
        return soma/ alunos.length;
    }
}
