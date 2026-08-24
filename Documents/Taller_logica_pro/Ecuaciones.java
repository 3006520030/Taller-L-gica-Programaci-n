import java.util.Scanner;

/**
 * Ecuaciones.java
 * Taller: Variables y Condicionales
 *
 * Menu con 3 opciones:
 *   1. Solucion ecuacion 1
 *   2. Solucion ecuacion 2
 *   3. Salir
 *
 * Se pide al usuario el tipo de ecuacion, luego los valores de x y z,
 * se evalua la expresion (dividida en partes pequenas, "divide  y  venceras")
 * y se imprime el resultado.
 *
 * Todas las divisiones pasan por dividir(), que valida que el denominador
 * no sea cero antes de calcular. Si algun denominador da cero, se avisa
 * con un mensaje claro en vez de imprimir Infinity o NaN.
 */
public class Ecuaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // El menu se repite hasta que el usuario elija la opcion 3 (Salir)
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Solucion ecuacion 1");
            System.out.println("2. Solucion ecuacion 2");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el valor de x: ");
                double x = sc.nextDouble();
                System.out.print("Ingrese el valor de z: ");
                double z = sc.nextDouble();

                try {
                    double resultado = resolverEcuacion1(x, z);
                    System.out.println("El resultado de la ecuacion 1 es: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("No se pudo calcular: " + e.getMessage());
                }

            } else if (opcion == 2) {
                System.out.print("Ingrese el valor de x: ");
                double x = sc.nextDouble();
                System.out.print("Ingrese el valor de z: ");
                double z = sc.nextDouble();

                try {
                    double resultado = resolverEcuacion2(x, z);
                    System.out.println("El resultado de la ecuacion 2 es: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("No se pudo calcular: " + e.getMessage());
                }

            } else if (opcion == 3) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion invalida. Intente de nuevo.");
            }

        } while (opcion != 3);

        sc.close();
    }

    /**
     * Divide num/den, pero antes valida que den no sea cero.
     * Si den es 0, lanza ArithmeticException con un mensaje que dice
     * a que parte de la ecuacion corresponde esa division, para que
     * el mensaje que ve el usuario sea util y no un simple "/ by zero".
     */
    private static double dividir(double num, double den, String descripcion) {
        if (den == 0) {
            throw new ArithmeticException("division por cero en " + descripcion
                    + " (con estos valores de x y z, el denominador da 0)");
        }
        return num / den;
    }

    /**
     * Ecuacion 1:
     *
     *            3x / (1+3x)
     * y = -------------------------------
     *      (3z^2 + 2) / (1/(1+z) + 3x^2 + 2z + 3)
     *
     * Se resuelve por partes:
     *   A = 3x / (1+3x)
     *   B = (3z^2+2) / (1/(1+z) + 3x^2 + 2z + 3)
     *   y = A / B
     */
    public static double resolverEcuacion1(double x, double z) {
        // --- Parte A: 3x / (1+3x) ---
        double numA = 3 * x;
        double denA = 1 + 3 * x;
        double A = dividir(numA, denA, "A = 3x/(1+3x)");

        // --- Parte B: (3z^2+2) / (1/(1+z) + 3x^2 + 2z + 3) ---
        double numB = 3 * Math.pow(z, 2) + 2;
        double denZ = 1 + z; // denominador interno 1/(1+z)
        double partB1 = dividir(1.0, denZ, "1/(1+z) dentro de B");
        double denB = partB1 + 3 * Math.pow(x, 2) + 2 * z + 3;
        double B = dividir(numB, denB, "B = (3z^2+2)/(1/(1+z)+3x^2+2z+3)");

        // --- Resultado final ---
        double y = dividir(A, B, "y = A/B");
        return y;
    }

    /**
     * Ecuacion 2 (version manuscrita - VERIFICAR CONTRA LA FOTO ORIGINAL):
     *
     *          x^2+3z+2                    2/(1+3x^3+3z+2)
     * y =  ------------------   +   -----------------------------------
     *       2 + 1/(1+2z)             1/(1+3x) + (3x+1)/(2z + 3/(1+5/z))
     *
     * Se resuelve por partes:
     *   term1 = (x^2+3z+2) / (2 + 1/(1+2z))
     *   term2 = [2/(1+3x^3+3z+2)] / [1/(1+3x) + (3x+1)/(2z + 3/(1+5/z))]
     *   y = term1 + term2
     */
    public static double resolverEcuacion2(double x, double z) {
        // --- term1: (x^2+3z+2) / (2 + 1/(1+2z)) ---
        double term1Num = Math.pow(x, 2) + 3 * z + 2;
        double den1z = 1 + 2 * z; // denominador interno 1/(1+2z)
        double part1 = dividir(1.0, den1z, "1/(1+2z) dentro de term1");
        double term1Den = 2 + part1;
        double term1 = dividir(term1Num, term1Den, "term1 = (x^2+3z+2)/(2+1/(1+2z))");

        // --- Numerador de term2: 2 / (1+3x^3+3z+2) ---
        double term2NumNum = 2;
        double term2NumDen = 1 + 3 * Math.pow(x, 3) + 3 * z + 2;
        double term2Num = dividir(term2NumNum, term2NumDen, "2/(1+3x^3+3z+2)");

        // --- Denominador de term2: 1/(1+3x) + (3x+1)/(2z + 3/(1+5/z)) ---
        double part5z = dividir(5.0, z, "5/z"); // z=0 rompe esta division directamente
        double subFraccionDen = 1 + part5z; // 1 + 5/z
        double part3sub = dividir(3.0, subFraccionDen, "3/(1+5/z)");
        double subFraccion = 2 * z + part3sub; // 2z + 3/(1+5/z)
        double segundaParteDen = dividir(3 * x + 1, subFraccion, "(3x+1)/(2z+3/(1+5/z))");
        double part1x = dividir(1.0, 1 + 3 * x, "1/(1+3x) dentro de term2Den");
        double term2Den = part1x + segundaParteDen;

        double term2 = dividir(term2Num, term2Den, "term2");

        // --- Resultado final ---
        double y = term1 + term2;
        return y;
    }
}