package Java03;

public class App01 {
    // Doar se salario > 5000
    public static void main(String[] args) {
        double salario = 6000;
        // (condição) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter !";
        
        System.out.println(resultado);
    }
}
