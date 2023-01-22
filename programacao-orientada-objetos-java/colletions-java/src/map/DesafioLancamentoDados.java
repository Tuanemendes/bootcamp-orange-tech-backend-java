package map;

import java.util.*;

/*
* Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.
* */
public class DesafioLancamentoDados {

    public static void main(String[] args) {
        Integer lancamentoDados = 100;

        List<Integer> valores = new ArrayList<>();
        Random gerarValores = new Random();

        for (int i = 0 ; i < lancamentoDados;i++ ){
            int numero = gerarValores.nextInt(10) +1;
            valores.add(numero);
        }
        System.out.println(valores);

        Map<Integer,Integer> lancamentos = new HashMap<>();

        for(Integer resultado :valores){
            if(lancamentos.containsKey(resultado)){
                lancamentos.put(resultado,(lancamentos.get(resultado) +1 ));
            }else lancamentos.put(resultado,1);

        }
        System.out.println(lancamentos);

        System.out.println("Jogando");
        for(int i= 0 ; i < 3 ; i++){
            try {
                Thread.sleep(3000);
                System.out.println(".");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("\n Valor"  +  " Quantidade de vezes");

        for(Map.Entry<Integer,Integer> entry:  lancamentos.entrySet()){
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }

    }

}
