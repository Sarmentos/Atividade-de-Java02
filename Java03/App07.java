package Java03;

public class App07 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 até 100000
        for (int i = 1; i <= 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}