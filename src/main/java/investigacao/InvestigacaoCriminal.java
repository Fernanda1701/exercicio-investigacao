/* Resolução de exercício.
 Por: Fernanda Nascimento
 Contato <fernanda.n1701@hotmail.com>

- Exercício Digital Innovation One:

Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificada como "Inocente".
*/

package investigacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvestigacaoCriminal {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda as perguntas com sim ou não: ");

        System.out.println("Telefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta);

        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta);

        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta);

        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta);

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta);

        System.out.println(respostas);

        int count = 0;
        for (String resp : respostas) {
            if (resp.contains("sim")) { count++;}
        }

        switch(count) {
            case 2:
                System.out.println("SUSPEITA"); break;
            case 3|4:
                System.out.println("CÚMPLICE"); break;
            case 5:
                System.out.println("ASSASSINO"); break;
            default:
                System.out.println("INOCENTE"); break;
        }
    }
}