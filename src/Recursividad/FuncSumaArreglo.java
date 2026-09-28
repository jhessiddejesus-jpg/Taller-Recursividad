import java.util.Scanner;

public class FuncSumaArreglo {

    static int sumaArreglo(int[] arreglo, int i) {
        if (i == arreglo.length) return 0;
        return arreglo[i] + sumaArreglo(arreglo, i + 1);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de valores (n): ");
            int n = digite.nextInt();
            int[] arreglo = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el 2valor [" + i + "]: ");
                arreglo[i] = digite.nextInt();
            }
            System.out.println("Suma del arreglo = " + sumaArreglo(arreglo, 0));
        }
    }
}
