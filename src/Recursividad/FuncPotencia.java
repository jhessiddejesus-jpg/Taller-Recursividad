import java.util.Scanner;

public class FuncPotencia {

    static double potencia(double base, int exponente) {
        if (exponente == 0) return 1;
        if (exponente > 0) return base * potencia(base, exponente - 1);
        return 1 / potencia(base, -exponente);
    }
 
    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese la base: ");
            double base = digite.nextDouble();
            System.out.print("Ingrese el exponente: ");
            int exponente = digite.nextInt();
            System.out.println("Potencia = " + potencia(base, exponente));
        }
    }
    
}
