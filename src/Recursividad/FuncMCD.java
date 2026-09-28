import java.util.Scanner;
 
public class FuncMCD {
 
    static int mcd(int m, int n) {
        if (n == 0) return m;
        return mcd(n, m % n);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero (M): ");
            int m = digite.nextInt();
            System.out.print("Ingrese el segundo numero (N): ");
            int n = digite.nextInt();
            if (m >= n) {
                System.out.println("MCD = " + mcd(m, n));
            } else {
                System.out.println("MCD = " + mcd(n, m));
            }
        }
    }
}