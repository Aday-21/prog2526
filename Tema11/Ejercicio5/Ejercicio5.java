
package Ejercicio5;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ejercicio5 {
    public static void main(String[] args){
        // Creamos la ventana
        Frame ventana = new Frame();
        // La hacemos visible
        ventana.setVisible(true);
        // Darle tamaño
        ventana.setSize(800, 600);
       
        // Crear etiqueta label
        Label etiqueta = new Label("Texto de Prueba");
        // Añadimos a la ventana 
        ventana.add(etiqueta);
        
        // Creamos barra de menú 
        MenuBar barra = new MenuBar();
        //Añadir barra de menú a la ventana
        ventana.setMenuBar(barra);
        
        Menu menu3 = new Menu("Fichero");
        barra.add(menu3);

        // Creamos menú Estilo
        Menu menu1 = new Menu("Estilo");
        // Añadimos menu a la barra de menú
        barra.add(menu1);
        
        // Creamos menú Estilo
        Menu menu2 = new Menu("Color");
        // Añadimos menu a la barra de menú
        barra.add(menu2);
        
        // Creamos el menú item
        MenuItem negrita = new MenuItem("Negrita");
        MenuItem normal = new MenuItem("Normal");
        // Añadimos a la ventana
        menu1.add(negrita);
        menu1.add(normal);
        
        // Creamos el menú item
        MenuItem rojo = new MenuItem("Rojo");
        MenuItem azul = new MenuItem("Azul");
        MenuItem negro = new MenuItem("Negro");
        // Añadimos a la ventana
        menu2.add(rojo);
        menu2.add(azul);
        menu2.add(negro);
        
         // Evento Negrita
        negrita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setFont(new Font("Arial", Font.BOLD, 14));
            }
        });

        // Evento Normal
        normal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setFont(new Font("Arial", Font.PLAIN, 14));
            }
        });

        // Evento Rojo
        rojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setForeground(Color.RED);
            }
        });

        // Evento Azul
        azul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setForeground(Color.BLUE);
            }
        });

        // Evento Negro
        negro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setForeground(Color.BLACK);
            }
        });
    }
}
