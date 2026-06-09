package Ejercicio1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {

    public static void main(String[] args) {

        // CREAMOS LA VENTANA PRINCIPAL
        Frame frame = new Frame("Hola mundo!");

        // CONFIGURAMOS EL COLOR DE FONDO
        frame.setBackground(Color.LIGHT_GRAY);

        // DESACTIVAMOS EL LAYOUT AUTOMÁTICO
        frame.setLayout(null);

        // ESTABLECEMOS EL TAMAÑO DE LA VENTANA
        frame.setSize(300, 300);

        // HACEMOS VISIBLE LA VENTANA
        frame.setVisible(true);

        // CREAMOS EL BOTÓN SALIR
        Button salir = new Button("Salir");

        // AÑADIMOS LA ACCIÓN DEL BOTÓN SALIR
        salir.addActionListener(new ActionListener() {

            // CIERRA LA VENTANA AL PULSAR EL BOTÓN
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Frame) salir.getParent()).dispose();
            }
        });

        // CREAMOS EL BOTÓN LIMPIAR
        Button limpiar = new Button("Limpiar");

        // AÑADIMOS LA ACCIÓN DEL BOTÓN LIMPIAR
        limpiar.addActionListener(new ActionListener() {

            // CIERRA LA VENTANA AL PULSAR EL BOTÓN
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Frame) limpiar.getParent()).dispose();
            }
        });

        // CREAMOS EL CAMPO DE TEXTO
        TextField escribir = new TextField("Escribe algo...");

        // AÑADIMOS LA ACCIÓN DEL CAMPO DE TEXTO
        escribir.addActionListener(new ActionListener() {

            // CIERRA LA VENTANA AL PULSAR ENTER EN EL CAMPO DE TEXTO
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Frame) escribir.getParent()).dispose();
            }
        });

        // ESTABLECEMOS LA POSICIÓN Y TAMAÑO DEL BOTÓN SALIR
        salir.setBounds(30, 50, 70, 30);

        // ESTABLECEMOS LA POSICIÓN Y TAMAÑO DEL BOTÓN LIMPIAR
        limpiar.setBounds(100, 50, 70, 30);

        // ESTABLECEMOS LA POSICIÓN Y TAMAÑO DEL CAMPO DE TEXTO
        escribir.setBounds(30, 90, 140, 30);

        // AÑADIMOS EL BOTÓN SALIR A LA VENTANA
        frame.add(salir);

        // AÑADIMOS EL BOTÓN LIMPIAR A LA VENTANA
        frame.add(limpiar);

        // AÑADIMOS EL CAMPO DE TEXTO A LA VENTANA
        frame.add(escribir);
    }
}