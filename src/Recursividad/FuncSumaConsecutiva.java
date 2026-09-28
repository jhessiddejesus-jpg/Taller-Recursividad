import java.util.Scanner;

public class FuncSumaConsecutiva {
    
    static int suma(int n) {
        if (n == 0) return 0;
        return n + suma(n - 1);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese un numero entero: ");
            int n = digite.nextInt();
            System.out.println("Sumatoria = " + suma(n));
        }
    }
}
