import java.util.Scanner;

public class FuncSumaSucesiva {

    static int multiplicar(int a, int b) {
        if (b == 0) return 0;
        if (b > 0) return a + multiplicar(a, b - 1);
        return -multiplicar(a, -b);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero: ");
            int a = digite.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            int b = digite.nextInt();
            System.out.println("Producto = " + multiplicar(a, b));
        }
    }
}
