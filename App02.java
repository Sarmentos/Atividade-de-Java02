// 3 - Escreva um programa que determine se um programa se um numero inserido pelo úsuario é par ou impar usando if-else.   
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um numero : ");
        int num1 = leitura.nextInt();
        if (num1 %2 == 0) {
            System.out.println(String.format("O número informado %d é PAR",num1));
        }
        else{
            System.out.println(String.format("O numero informado %d é IMPAR",num1));
        }
    }
}
