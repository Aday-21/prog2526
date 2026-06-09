package Ejercicio3;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;

public class CardLayout {

    public static void main(String[] args) {
	Frame frame = new Frame("CardLayout");
		
	frame.setBackground(Color.LIGHT_GRAY);
	frame.setSize(280, 280);
	frame.setVisible(true);
		
	frame.setLayout(new CardLayout());
		
	Button boton1 = new Button("aday");
	Button boton2 = new Button("aday2");
	Button boton3 = new Button("aday3");
	Button boton4 = new Button("aday4");
		
	frame.add(boton1);
	frame.add(boton2);
	frame.add(boton3);
	frame.add(boton4);
    }

}