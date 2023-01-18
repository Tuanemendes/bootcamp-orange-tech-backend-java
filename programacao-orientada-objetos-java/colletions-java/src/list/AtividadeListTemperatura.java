package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).*/
public class AtividadeListTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        int contador = 0;
        while(contador <= 5){
            System.out.println("Digite a média de temperatura dos 6 primeiros meses ");
            Double temperatura = scanner.nextDouble();
            temperaturas.add(temperatura);
            contador++;
        }
        System.out.println("Todas as temperaturas:");
        for (Double temperatura:temperaturas) {
            System.out.println(temperatura + "");
        }

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        Double media = soma/temperaturas.size();
        System.out.println("A média das temperaturas nos ultimos 6 meses:" + media);

        Iterator<Double> iterator1 = temperaturas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < media)iterator1.remove();
        }
        System.out.println("Temperaturas que foram acima da média: " + temperaturas);

        System.out.println("Meses da temperatura acima da média");
        Iterator<Double> iterator2 = temperaturas.iterator();
        contador = 0;
        while(iterator2.hasNext()){
            Double temperatura = iterator2.next();

            if(temperatura > media){
                switch (contador){
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temperatura);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temperatura);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temperatura);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temperatura);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temperatura);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temperatura);
                        break;
                    default:
                        System.out.println("Não tem temperatura acima da média.");
                }
            }
            contador++;
        }

    }

}
