// 3 - Escreva um prgrama que receba um número inteiro positivo e calcule o seu fatorial usando uma estrutura while.

import java.util.Scanner;

public class App03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.println("Informe um número inteiro positivo");
        int num1 = input.nextInt();
        int nunfact = num1;

        while (num1 > 1) {
            nunfact = nunfact *(num1 - 1 );
            num1--;
            System.out.println(nunfact);
        }
    }    
}
