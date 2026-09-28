import java.util.Scanner;

public class FuncFactorial {

    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese un numero entero: ");
            int n = digite.nextInt();
            if (n < 0) {
                System.out.println("El factorial no esta definido para numeros negativos.");
            } else {
                System.out.println("Factorial de " + n + " = " + factorial(n));
            }
        }
    }
}
