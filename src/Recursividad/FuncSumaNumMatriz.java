import java.util.Scanner;

public class FuncSumaNumMatriz {
    
       static int sumaFila(int[][] matriz, int fila, int col) {
        if (col == matriz[fila].length) return 0;
        return matriz[fila][col] + sumaFila(matriz, fila, col + 1);
    }
 
    static int sumaMatriz(int[][] matriz, int fila) {
        if (fila == matriz.length) return 0;
        return sumaFila(matriz, fila, 0) + sumaMatriz(matriz, fila + 1);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese el numero de filas (m): ");
            int m = digite.nextInt();
            System.out.print("Ingrese el numero de columnas (n): ");
            int n = digite.nextInt();
            int[][] matriz = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                    matriz[i][j] = digite.nextInt();
                }
            }
            System.out.println("Suma de la matriz = " + sumaMatriz(matriz, 0));
        }
    }
}
