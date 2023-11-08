package view;

import controller.BarController;
import java.util.Scanner;

public class BarView {
    private BarController controller;
    private Scanner scanner;

    public BarView(BarController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenuPrincipal() {
        int opcion;
        do {
            System.out.println("Bienvenido");
            System.out.println("1. Hacer un pedido");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarPedido();
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
            }
        } while (opcion != 2);
    }

    public void realizarPedido() {
        scanner.nextLine(); // Limpia el buffer de entrada
        System.out.print("Ingrese su pedido (ejemplo: cerveza, martini, etc.): ");
        String pedido = scanner.nextLine();

        // Enviar el pedido al controlador para su procesamiento
        controller.procesarPedido(pedido);
    }
}
