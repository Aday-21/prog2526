  
package Ejemplos;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;

public class Ejemplo2 {
    public static void main(String[] args){
        
        // Crear Ventana 
        Frame ventana = new Frame();
        // Darle tamaño
        ventana.setSize(800, 600);
        ventana.setLayout(new FlowLayout());
        
        // Crear botón
        Button miBoton = new Button("Click aquí");
        // Añadir botón a la ventana
        ventana.add(miBoton);
        
        ActionListener escuchadorBoton = new Ejemplo2_2();
        miBoton.addActionListener(escuchadorBoton);
        
        // Poner ventana visible
        ventana.setVisible(true);
        
    }
}
