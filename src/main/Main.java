package main;

import controller.BarController;
import view.BarView;

public class Main {
    public static void main(String[] args) {

        BarController controller = new BarController();
        BarView view = new BarView(controller);

        view.mostrarMenuPrincipal();
    }
}
