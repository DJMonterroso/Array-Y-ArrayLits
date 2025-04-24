import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Ingresar valores en el array
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            procesarOpcion(opcion, numeros);
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Mostrar el array original");
        System.out.println("2. Calcular la suma de los elementos");
        System.out.println("3. Buscar el número máximo y mínimo");
        System.out.println("4. Invertir el array");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void procesarOpcion(int opcion, int[] numeros) {
        switch (opcion) {
            case 1:
                mostrarArray(numeros);
                break;
            case 2:
                calcularSuma(numeros);
                break;
            case 3:
                buscarMaxMin(numeros);
                break;
            case 4:
                invertirArray(numeros);
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    public static void mostrarArray(int[] numeros) {
        System.out.println("Array original: " + Arrays.toString(numeros));
    }

    public static void calcularSuma(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("Suma de los elementos: " + suma);
    }

    public static void buscarMaxMin(int[] numeros) {
        int max = numeros[0], min = numeros[0];
        for (int num : numeros) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
    }

    public static void invertirArray(int[] numeros) {
        System.out.print("Array invertido: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
