import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList1 {


    // Definición de la clase ArrayList
    ArrayList<String> nombres = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int opcion = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        switch(opcion){

            case 1:
                agregarProducto();
                break;




        }
    
    }

    public static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Agregar un producto");
        System.out.println("2. Mostrar lista de compras");
        System.out.println("3. Eliminar un producto");
        System.out.println("4. Buscar un producto");
        System.out.println("5. Ordenar alfabéticamente");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }


    public static void agregarProducto() {
        ArrayList<String> Productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un producto: ");
        String nombre = scanner.nextLine(); // Leer el nombre del producto
        Productos.add(nombre); // Agregar el producto a la lista

        System.out.println("Producto agregado: " + nombre);
        scanner.close();
    }
    

}


