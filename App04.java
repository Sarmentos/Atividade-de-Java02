// Faça um programa que peça ao seu usuário para digitar um mês (1 a 12)  e mostre a estação do ano correspondente usando uma etsrutura Switch-Casa.

import java.util.Scanner;

public class App04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um mês do ano de 1 a 12 :");
        int mes = input.nextInt();

        switch (mes) {
            case 3:
            case 4:
            case 5:
              System.out.println(String.format("A estação do mês %d é o Outono",mes));
                break;
            case 6:
            case 7:
            case 8:
              System.out.println(String.format("A estação do mês %d é o Inverno",mes));
                break;
            case 9:
            case 10:
            case 11:
              System.out.println(String.format("A estação do mês %d é o Primavera",mes));
              break;
            case 12:
            case 1:
            case 2:
              System.out.println(String.format("A estação do mês %d é o Verão",mes));
              break;
        }
    }
}
