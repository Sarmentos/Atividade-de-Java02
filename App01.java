// 2 - Crie um programa que peça dop usuario para digitar um dia se semana (1 a 7) e mostre se é dia útil ou final de semana usando  a estrutura Switch-Case

import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Informe o dia da semana");
      int dia = entrada.nextInt();
      switch (dia) {
        case 1:
            System.out.println("Domingo: Fim de semana");
            break;
        case 2:
            System.out.println("Segunda-feira: Dia útil");
            break;
        case 3:
            System.out.println("Terça-feira: Dia útil");
            break;
        case 4:
            System.out.println("Quarta-feira: Dia útil");
            break;
        case 5:
            System.out.println("Quinta-feira: Dia útil");
            break;
        case 6:
            System.out.println("Sexta-feira: Dia útil");
            break;
        case 7:
            System.out.println("Sabado: Fim de semana");
            break;
        default:
        System.out.println("Número inválido.... informe o número de 1 a 7.");
      }
    }
}

