import java.util.Scanner;

public class FuncSumatoria {

    static double sumatoria(int n) {
        if (n == 1) return 1.0;
        return 1.0 / n + sumatoria(n - 1);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese un valor entero n: ");
            int n = digite.nextInt();
            if (n <= 0) {
                System.out.println("El valor debe ser mayor a 0.");
            } else {
                System.out.println("Sumatoria = " + sumatoria(n));
            }
        }
    }
}
