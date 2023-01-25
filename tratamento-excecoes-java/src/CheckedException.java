import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args)  {
        String nomeDoArquivo = "arrquivo.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo!");
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado! Entre em contato com o suporte!");
            e.printStackTrace();
        }finally {
            System.out.println("Chegou no finally");
        }
        System.out.println("Apenas da exception ou não , o progrma continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        File file = new File(nomeDoArquivo);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getName()));
        String line = bufferedReader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        }while(line != null);
        bufferedWriter.flush();
        bufferedReader.close();
    }


}
