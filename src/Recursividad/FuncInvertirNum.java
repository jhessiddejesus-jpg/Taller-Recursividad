import java.util.Scanner;

public class FuncInvertirNum {

    static int invertir(int n, int acumulado) {
        if (n == 0) return acumulado;
        return invertir(n / 10, acumulado * 10 + n % 10);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese un numero entero: ");
            int n = digite.nextInt();
            System.out.println("Numero invertido: " + invertir(n, 0));
        }
    }
}
