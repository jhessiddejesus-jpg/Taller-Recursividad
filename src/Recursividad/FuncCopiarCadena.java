import java.util.Scanner;

public class FuncCopiarCadena {

    static void copiarCadena(char[] origen, char[] destino, int i) {
        if (i == origen.length) return;
        destino[i] = origen[i];
        copiarCadena(origen, destino, i + 1);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese una cadena: ");
            String cadena = digite.nextLine();
            char[] origen = cadena.toCharArray();
            char[] destino = new char[origen.length];
            copiarCadena(origen, destino, 0);
            System.out.println("Cadena copiada: " + new String(destino));
        }
    }
}
