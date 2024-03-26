package Java03.Java04;
/*Escreva um programa que solicita três comprimentos de 
segmentos e verifica se esses segmentos podem formar um triângulo 
e, se sim, qual tipo de triângulo é: equilátero, isósceles ou escaleno. */
import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade : ");
        double lado1 = scanner.nextDouble();
        System.out.println("Lado 1 : ");
        double lado2 = scanner.nextDouble();
        System.out.println("Lado 2 : ");
        double lado3 = scanner.nextDouble();
        System.out.println("Lado 3 : ");

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("É um triangulo equilátero");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("É um triangulo isósceles");
        } else {
            System.out.println("É um  triangulo escaleno");
        }

        scanner.close();

    }
}
