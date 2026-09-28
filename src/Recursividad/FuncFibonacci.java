import java.util.Scanner;

public class FuncFibonacci {
    
     static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
 
    static void imprimirFibonacci(int i, int limite) {
        if (i > limite) return;
        System.out.print(fibonacci(i) + " ");
        imprimirFibonacci(i + 1, limite);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese el limite de la serie: ");
            int limite = digite.nextInt();
            System.out.print("Serie de Fibonacci: ");
            imprimirFibonacci(0, limite);
            System.out.println();
        }
    }
}
