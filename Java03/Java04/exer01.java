package Java03.Java04;
/* Fazer um programa para ler um valor inteiro de 1 a 7 representando um
dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
Escrever na tela o dia da semana correspondente. */

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;
        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quart-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }
        System.out.println("Dia da semana : "+dia);
        sc.close();
    }
}
