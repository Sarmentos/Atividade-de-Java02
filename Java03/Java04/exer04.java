package Java03.Java04;
/*Escreva um programa que solicita a 
idade do usuário e verifica se ele é maior de idade ou não. */
import java.util.Scanner;

public class exer04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade : ");
        int idade = scanner.nextInt();
        String resposta;

        if (idade >= 18) {
            resposta = "Maior de idade";
        }else{
            resposta = "Menor de idade";
        }

        System.out.println("Esse infrator é : "+resposta);
        scanner.close();
    }
}
