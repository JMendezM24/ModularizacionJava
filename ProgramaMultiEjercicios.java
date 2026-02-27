import java.util.Random;
import java.util.Scanner;

public class ProgramaMultiEjercicios {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    calculadora();
                    break;
                case 2:
                    validarContrasena();
                    break;
                case 3:
                    ejercicioPrimo();
                    break;
                case 4:
                    sumaPares();
                    break;
                case 5:
                    conversionTemperatura();
                    break;
                case 6:
                    contadorVocales();
                    break;
                case 7:
                    ejercicioFactorial();
                    break;
                case 8:
                    juegoAdivinanza();
                    break;
                case 9:
                    pruebaIntercambio();
                    break;
                case 10:
                    tablaMultiplicar();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }

    // ================= MENU =================
    public static void mostrarMenu() {
        System.out.println("\n===== MENU PRINCIPAL =====");
        System.out.println("1. Calculadora básica");
        System.out.println("2. Validación de contraseña");
        System.out.println("3. Número primo");
        System.out.println("4. Suma de números pares");
        System.out.println("5. Conversión de temperatura");
        System.out.println("6. Contador de vocales");
        System.out.println("7. Factorial");
        System.out.println("8. Juego de adivinanza");
        System.out.println("9. Intercambio de números");
        System.out.println("10. Tabla de multiplicar");
        System.out.println("0. Salir");
    }

    // ================= UTILIDADES =================
    public static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
            }
        }
    }

    public static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
            }
        }
    }

    // ================= 1. CALCULADORA =================
    public static void calculadora() {
        double a = leerDouble("Ingrese primer número: ");
        double b = leerDouble("Ingrese segundo número: ");

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int op = leerEntero("Elija operación: ");

        switch (op) {
            case 1:
                System.out.println("Resultado: " + sumar(a, b));
                break;
            case 2:
                System.out.println("Resultado: " + restar(a, b));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(a, b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("No se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + dividir(a, b));
                }
                break;
            default:
                System.out.println("Operación inválida.");
        }
    }

    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { return a / b; }

    // ================= 2. CONTRASEÑA =================
    public static void validarContrasena() {
        String pass;
        do {
            System.out.print("Ingrese la contraseña: ");
            pass = scanner.nextLine();
            if (!pass.equals("1234")) {
                System.out.println("Contraseña incorrecta.");
            }
        } while (!pass.equals("1234"));

        System.out.println("Acceso concedido.");
    }

    // ================= 3. PRIMO =================
    public static void ejercicioPrimo() {
        int num = leerEntero("Ingrese un número: ");
        if (esPrimo(num)) {
            System.out.println("Es número primo.");
        } else {
            System.out.println("No es primo.");
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ================= 4. SUMA PARES =================
    public static void sumaPares() {
        int suma = 0;
        int num;

        while (true) {
            num = leerEntero("Ingrese un número (0 para salir): ");
            if (num == 0) break;
            if (num % 2 == 0) {
                suma += num;
            }
        }

        System.out.println("Suma de pares: " + suma);
    }

    // ================= 5. TEMPERATURA =================
    public static void conversionTemperatura() {
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");

        int op = leerEntero("Elija opción: ");
        double temp = leerDouble("Ingrese temperatura: ");

        switch (op) {
            case 1:
                System.out.println("Resultado: " + celsiusAFahrenheit(temp));
                break;
            case 2:
                System.out.println("Resultado: " + fahrenheitACelsius(temp));
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitACelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // ================= 6. VOCALES =================
    public static void contadorVocales() {
        System.out.print("Ingrese una oración: ");
        String texto = scanner.nextLine();
        System.out.println("Cantidad de vocales: " + contarVocales(texto));
    }

    public static int contarVocales(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // ================= 7. FACTORIAL =================
    public static void ejercicioFactorial() {
        int n;
        do {
            n = leerEntero("Ingrese un número no negativo: ");
            if (n < 0) System.out.println("No puede ser negativo.");
        } while (n < 0);

        System.out.println("Factorial: " + factorial(n));
    }

    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // ================= 8. ADIVINANZA =================
    public static void juegoAdivinanza() {
        Random rand = new Random();
        int secreto = rand.nextInt(100) + 1;
        int intento;

        do {
            intento = leerEntero("Adivine el número (1-100): ");

            if (intento < secreto) {
                System.out.println("El número es mayor.");
            } else if (intento > secreto) {
                System.out.println("El número es menor.");
            }

        } while (intento != secreto);

        System.out.println("¡Correcto!");
    }

    // ================= 9. PASO POR REFERENCIA =================
    static class Numero {
        int valor;
        Numero(int v) { valor = v; }
    }

    public static void pruebaIntercambio() {
        Numero a = new Numero(leerEntero("Ingrese un número (A): "));
        Numero b = new Numero(leerEntero("Ingrese otro número (B): "));

        System.out.println("Antes -> A=" + a.valor + " B=" + b.valor);
        intercambiar(a, b);
        System.out.println("Después -> A=" + a.valor + " B=" + b.valor);
    }

    public static void intercambiar(Numero x, Numero y) {
        int temp = x.valor;
        x.valor = y.valor;
        y.valor = temp;
    }

    // ================= 10. TABLA =================
    public static void tablaMultiplicar() {
         int n = leerEntero("Ingrese un número: ");
         System.out.println("Tabla del número ingresado");
	 generarTabla(n);
    }

    public static void generarTabla(int n) {
        for (int i = 1; i <= 10; i++) {	
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}