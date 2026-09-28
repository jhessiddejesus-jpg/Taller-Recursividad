import java.util.Scanner;

public class FuncAckerman {

    static long ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, (int) ackermann(m, n - 1));
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese el valor de m: ");
            int m = digite.nextInt();
            System.out.print("Ingrese el valor de n: ");
            int n = digite.nextInt();
            if (m < 0 || n < 0) {
                System.out.println("Los valores deben ser no negativos.");
            }else {
                System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
            }
        }
    }
}
