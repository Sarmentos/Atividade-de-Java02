package Java03.Java04;

import java.util.Scanner;

/*Escreva um programa que solicita a nota de um aluno e verifica se ele foi
 aprovado (nota maior ou igual a 6) ou reprovado (nota menor que 6). */
public class exer06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do aluno : ");
        double nota = scanner.nextDouble();
        String resultado;

        if (nota >= 6) {
            resultado = " !:)!APROVADO!:)!  ";
        } else {
            resultado = " :( REPROVADO ): ";
        }
        System.out.println("Você está : "+resultado);
        scanner.close();
    }
}
