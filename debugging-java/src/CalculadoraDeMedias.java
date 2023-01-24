import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        String[] alunos ={"Tuane","Andre","Davison","Guilherme"};
        Scanner scanner = new Scanner(System.in);
        double media = calculaMediaTurma(alunos,scanner);

        System.out.printf("Média da turma: %.1f" , media);
    }
    public static double calculaMediaTurma(String[] alunos,Scanner scanner){
        double soma = 0;
        try {
            for(String aluno: alunos){
                System.out.printf("Nota do aluno %s: ", aluno);
                double nota = scanner.nextDouble();
                soma += nota;

            }
        }catch (Exception e){
            System.out.println("Caractere inválido!");
        }

        return soma/ alunos.length;
    }
}
