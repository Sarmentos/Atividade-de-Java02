package Java03.Java04;

import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um mês de 1 a 12 : ");
        int mes = sc.nextInt();
        String estacao;
        switch (mes) {
            case 3:
            case 4:
            case 5:
                estacao = "Outono";
                break;
            case 6:
            case 7:
            case 8:
                estacao = "Inverno";
                break;
            case 9:
            case 10:
            case 11:
                estacao = "Primavera";
                break;
            case 12:
            case 1:
            case 2:
                estacao = "Verão";
                break;

            default:
               estacao ="Estação invalida";
                break;
        }
        System.out.println("A estação que estamos é : "+ estacao);
        sc.close();
    }
}
