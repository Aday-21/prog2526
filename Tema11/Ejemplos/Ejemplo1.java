package Ejemplos;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejemplo1 {
    public static void main(String[] args){
        
        // Crear Ventana 
        Frame ventana = new Frame();
        // Hacerla visible
        ventana.setVisible(true);
        // Darle tamaño
        ventana.setSize(800, 600);
        // Crear barra de menú
        MenuBar barra = new MenuBar();
        //Añadir barra de menú a la ventana
        ventana.setMenuBar(barra);
        // Crear menú
        Menu menu = new Menu("Fichero");
        // Añadimos menu a la barra de menú
        barra.add(menu);
        // Creamos el menú item
        MenuItem abrir = new MenuItem("Abrir");
        MenuItem salir = new MenuItem("Salir");
        // Añadimos a la ventana
        menu.add(abrir);
        menu.add(salir);
        
    }
}
