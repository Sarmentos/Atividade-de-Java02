package Java03;

import java.util.Random;

// Matriz 3 por 4
public class App00 {

    static int [] [] criaMatriz(int N, int M){
        int [] [] matriz = new int[N] [M];
        Random gerador = new Random();
        for (int i = 0; i < matriz.length; i ++){
            for (int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = gerador.nextInt(100);
            }
        }
        return matriz;
    }
    static void imprimirMatriz(int[][]matriz){
        for (int i = 0 ; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j ++){
                System.out.println(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int [] [] matriz = criaMatriz(3, 4);
        imprimirMatriz(matriz);
    }
}
