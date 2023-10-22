package main;

import controller.BarController;
import view.BarView;

public class Main {
    public static void main(String[] args) {
        // Inicializar el controlador y la vista
        BarController controller = new BarController();
        BarView view = new BarView(controller);

        // Mostrar la interfaz de usuario
        view.mostrarMenuPrincipal();
    }
}
