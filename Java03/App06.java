package Java03;

public class App06 {
    public static void main(String[] args) {
        // Exemplos de while, do while, for
        int cout = 0;
        while (cout < 10) {
            System.out.println(cout);
            cout = cout + 1;
        }
        cout = 0;
        do {
            System.out.println("Dentro do-while" + cout);
            cout++;
        } while (cout < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}