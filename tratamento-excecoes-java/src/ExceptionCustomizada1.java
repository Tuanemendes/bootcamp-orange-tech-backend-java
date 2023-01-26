import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada1 {

    public static void main(String[] args)  {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo: ");
        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("Apenas da exception ou não , o progrma continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo)  {
        try {
            BufferedReader bufferedReader = lerArquivo(nomeDoArquivo);
            String line = bufferedReader.readLine();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            do{
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }while(line != null);
            bufferedWriter.flush();
            bufferedReader.close();
        }catch (ImpossivelAberturaDeArquivoException e){
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            e.printStackTrace();
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado! Entre em contato com o suporte!");
            e.printStackTrace();
        }

    }
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try{
            return new BufferedReader(new FileReader(nomeDoArquivo));
        }catch (FileNotFoundException e){
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());

        }

    }

}

class ImpossivelAberturaDeArquivoException extends Exception{

    private String nomeDoArquivo;

    private String diretorio;

    public ImpossivelAberturaDeArquivoException( String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado! " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}