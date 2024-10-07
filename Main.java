package Colas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menuCola();
    }
    public static void menuCola() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de pedidos: ");
        int capacidad = scanner.nextInt();
        Cola cola = new Cola(capacidad);

        while (true) {
            System.out.println("\n1. Agregar pedido");
            System.out.println("2. Quitar pedido");
            System.out.println("3. Mostrar pedidos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su pedido para agregar a la lista: ");
                    String nombre = scanner.next();
                    try {
                        cola.encolar(nombre);
                        System.out.println(nombre + " ha sido agregado.");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        String elementoDesencolado = cola.desencolar();
                        System.out.println(elementoDesencolado + " ha sido eliminado de la lista.");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

