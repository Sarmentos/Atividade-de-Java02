package Java03.Java04;
/*Escreva um programa que verifica se um número inteiro é par ou ímpar. */
import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 10");
        int num = scanner.nextInt();
        String resultado;

        if (num % 2 == 0) {
            resultado = "PAR";
        } else {
            resultado = "IMPAR";
        }

        System.out.println(resultado);

        scanner.close();
    }
}
