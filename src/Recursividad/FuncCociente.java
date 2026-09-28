import java.util.Scanner;

public class FuncCociente {

    static int abs(int n) {
        return (n < 0) ? -n : n;
    }

    static int cociente(int dividendo, int divisor) {
        if (dividendo < divisor) return 0;
        return 1 + cociente(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        try (Scanner digite = new Scanner(System.in)) {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = digite.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = digite.nextInt();
            
            if (divisor == 0) {
                System.out.println("No se puede dividir por 0.");
            } else {
                System.out.println("Cociente = " + cociente(abs(dividendo), abs(divisor)));
            }
        }
    }
    
}
