package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".*/
public class AtividadeListCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Responda da 5 perguntas com s para sim e n não");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int contador = 0;
        Iterator<String> iterator = respostas.iterator();
        while(iterator.hasNext()){
            String resp = iterator.next();
            if(resp.contains("s")) contador++;
        }
        switch(contador) {
            case 2:
                System.out.println("SUSPEITA");
                break;
            case 3:
            case 4:
                System.out.println("CÚMPLICE");
                break;
            case 5:
                System.out.println("ASSASSINO");
                break;
            default:
                System.out.println("INOCENTE");
                break;
        }

    }
}
