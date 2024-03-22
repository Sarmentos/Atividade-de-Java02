// 1 - Faça um programa que solicite ao usuario um numero e verifique se ele é positivo, negativo ou zero usando uma estrutura if-else.

import java.util.Scanner;

public class App00 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe um numero : ");
        int n1 = input.nextInt();
        if (n1 < 0) {
            System.out.println(String.format("O valor %d é nagativo",n1));
        }
        else if (n1 > 0) {
            System.out.println(String.format("O numero %d é positivo", n1));
        }
        else{
            System.out.println(String.format("O numero informado %d é igual a  zero",n1));
        }
    }
}
