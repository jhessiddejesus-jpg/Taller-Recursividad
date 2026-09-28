import java.util.Scanner;
 
public class FuncSumaDigitos {
 
   static int sumaDigitos(int n) {
        if (n == 0) return 0;
        return n % 10 + sumaDigitos(n / 10);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese un numero entero: ");
            int n = digite.nextInt();
            System.out.println("Suma de digitos = " + sumaDigitos(n));
        }
    }
}