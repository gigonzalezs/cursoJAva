package clase02;

public class Enteros {

    // Método para verificar si un número es positivo
    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    // Método para verificar si un número es negativo
    public static boolean esNegativo(int numero) {
        return numero < 0;
    }

    // Método para verificar si un número es cero
    public static boolean esCero(int numero) {
        return numero == 0;
    }

    // Métodos para realizar operaciones aritméticas
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static float division(int num1, int num2) {
        if (num2 != 0) {
            return (float) num1 / num2;
        } else {
            System.out.println("Error! División por cero no está definida");
            return 0;
        }
    }

    // Métodos para comparar dos números
    public static boolean esIgual(int num1, int num2) {
        return num1 == num2;
    }

    public static boolean esMayor(int num1, int num2) {
        return num1 > num2;
    }

    public static boolean esMenor(int num1, int num2) {
        return num1 < num2;
    }

    // Método para encontrar el módulo de un número
    public static int modulo(int num1, int num2) {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Error! División por cero no está definida");
            return 0;
        }
    }
}