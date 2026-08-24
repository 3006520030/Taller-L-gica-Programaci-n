/**
 * Variables.java
 * Taller: Variables y Condicionales 
 *
 * Punto 4: 20 declaraciones de variables de diferente tipo.
 * Punto 5: inicializadas con datos compatibles con cada tipo.
 * Punto 6: al menos 5 se reasignan con valores tomados de OTRAS variables,
 *          y el resto se reasigna con datos nuevos "quemados" (hardcoded).
 * Punto 8: se incluyen variables cuyos literales requieren 'f', 'L' y comillas simples ('').
 */
public class Variables {
    public static void main(String[] args) {

        // ===================== 1. DECLARACIÓN E INICIALIZACIÓN (20 variables) =====================

        byte edad = 24;                              // 1  - byte
        short anioNacimiento = 2002;                  // 2  - short
        int numeroEstudiantes = 35;                   // 3  - int
        long poblacionColombia = 52_000_000L;         // 4  - long -> requiere sufijo 'L'
        float precioLibro = 45990.5f;                 // 5  - float -> requiere sufijo 'f'
        double promedioNotas = 4.35;                  // 6  - double
        char inicialNombre = 'J';                     // 7  - char -> requiere comillas simples
        boolean estaMatriculado = true;                // 8  - boolean
        String nombre = "Juan";                        // 9  - String
        byte totalHermanos = 2;                        // 10 - byte
        short diaEntrega = 18;                         // 11 - short
        int codigoEstudiantil = 1023456;                // 12 - int
        long distanciaEstrellas = 9_460_730_472_000L;   // 13 - long -> requiere sufijo 'L'
        float pi = 3.1416f;                             // 14 - float -> requiere sufijo 'f'
        double saldoCuenta = 152300.75;                 // 15 - double
        char inicialApellido = 'P';                     // 16 - char -> requiere comillas simples
        boolean tareaCompleta = false;                   // 17 - boolean
        String universidad = "Universidad UPB";        // 18 - String
        char simboloOperacion = '+';                      // 19 - char -> requiere comillas simples
        float porcentajeAsistencia = 92.5f;               // 20 - float -> requiere sufijo 'f'

        // ===================== 2. VALORES ANTES DE REASIGNAR =====================
        System.out.println("=== Valores iniciales ===");
        imprimirValores(edad, anioNacimiento, numeroEstudiantes, poblacionColombia,
                precioLibro, promedioNotas, inicialNombre, estaMatriculado, nombre,
                totalHermanos, diaEntrega, codigoEstudiantil, distanciaEstrellas, pi,
                saldoCuenta, inicialApellido, tareaCompleta, universidad,
                simboloOperacion, porcentajeAsistencia);

        // ===================== 3. REASIGNACIÓN =====================

        // --- 3.1: al menos 5 variables reasignadas con valores tomados de OTRAS variables ---
        edad = totalHermanos;                 // edad ahora toma el valor de totalHermanos
        anioNacimiento = diaEntrega;          // anioNacimiento toma el valor de diaEntrega
        promedioNotas = porcentajeAsistencia; // promedioNotas toma el valor de porcentajeAsistencia
        inicialNombre = inicialApellido;      // inicialNombre toma el valor de inicialApellido
        nombre = universidad;                 // nombre toma el valor de universidad

        // --- 3.2: el resto se reasigna con datos nuevos "quemados" (hardcoded) ---
        numeroEstudiantes = 40;
        poblacionColombia = 53_000_000L;
        precioLibro = 39990.0f;
        estaMatriculado = false;
        totalHermanos = 1;
        diaEntrega = 25;
        codigoEstudiantil = 2045678;
        distanciaEstrellas = 40_208_000_000_000L;
        pi = 3.14159f;
        saldoCuenta = 98500.0;
        inicialApellido = 'G';
        tareaCompleta = true;
        universidad = "Universidad Nacional";
        simboloOperacion = '*';
        porcentajeAsistencia = 88.0f;

        // ===================== 4. VALORES DESPUÉS DE REASIGNAR =====================
        System.out.println("\n=== Valores despues de reasignar ===");
        imprimirValores(edad, anioNacimiento, numeroEstudiantes, poblacionColombia,
                precioLibro, promedioNotas, inicialNombre, estaMatriculado, nombre,
                totalHermanos, diaEntrega, codigoEstudiantil, distanciaEstrellas, pi,
                saldoCuenta, inicialApellido, tareaCompleta, universidad,
                simboloOperacion, porcentajeAsistencia);
    }

    // Método auxiliar solo para no repetir 20 System.out.println en el main
    private static void imprimirValores(byte edad, short anioNacimiento, int numeroEstudiantes,
            long poblacionColombia, float precioLibro, double promedioNotas, char inicialNombre,
            boolean estaMatriculado, String nombre, byte totalHermanos, short diaEntrega,
            int codigoEstudiantil, long distanciaEstrellas, float pi, double saldoCuenta,
            char inicialApellido, boolean tareaCompleta, String universidad,
            char simboloOperacion, float porcentajeAsistencia) {

        System.out.println("edad (byte): " + edad);
        System.out.println("anioNacimiento (short): " + anioNacimiento);
        System.out.println("numeroEstudiantes (int): " + numeroEstudiantes);
        System.out.println("poblacionColombia (long): " + poblacionColombia);
        System.out.println("precioLibro (float): " + precioLibro);
        System.out.println("promedioNotas (double): " + promedioNotas);
        System.out.println("inicialNombre (char): " + inicialNombre);
        System.out.println("estaMatriculado (boolean): " + estaMatriculado);
        System.out.println("nombre (String): " + nombre);
        System.out.println("totalHermanos (byte): " + totalHermanos);
        System.out.println("diaEntrega (short): " + diaEntrega);
        System.out.println("codigoEstudiantil (int): " + codigoEstudiantil);
        System.out.println("distanciaEstrellas (long): " + distanciaEstrellas);
        System.out.println("pi (float): " + pi);
        System.out.println("saldoCuenta (double): " + saldoCuenta);
        System.out.println("inicialApellido (char): " + inicialApellido);
        System.out.println("tareaCompleta (boolean): " + tareaCompleta);
        System.out.println("universidad (String): " + universidad);
        System.out.println("simboloOperacion (char): " + simboloOperacion);
        System.out.println("porcentajeAsistencia (float): " + porcentajeAsistencia);
    }
}
