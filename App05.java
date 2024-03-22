// 5 - Crie um programa que peça do usr para adivinhar um número entre  1 a 100. Dê dicas como maior ou menor até acertar usando uma estrutura Do-While.

import java.util.Random;
import java.util.Scanner;

public class App05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int gerador = random.nextInt(100);
        int tentativa = 0;
        
        System.out.println("Adivinhe um número de 1 a 100!");

        do{
            System.out.println("Informe um número : ");
            int num1 = input.nextInt();
            tentativa ++;

            if (num1 < gerador) {
                System.out.println("Informe um número maior !");
            }else if (num1 > gerador){
                System.out.println("informe um número menor");
            }else{
                System.out.println(String.format("Parabéns você acertou !! em %d tentativas",tentativa));
                break;
            }
        }
        while(true);
    }
}
