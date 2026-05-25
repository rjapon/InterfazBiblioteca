
package ec.edu.ups.inferfazbiblioteca.Clases;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Principal extends Frame {

    private Button registrar;
    private Button devolver;

    public Principal() {

        setTitle("Pagina Principal");
        setSize(700, 400);

        Panel panelGeneral = new Panel();
        Panel panelCentro = new Panel();
        Panel panelNorte = new Panel();
        Panel panelSur = new Panel();
        Panel panelEste = new Panel();
        Panel panelOeste = new Panel();
        Panel panelBotones = new Panel();

        BorderLayout posiciones = new BorderLayout();
        GridLayout info = new GridLayout(2, 3);

        registrar = new Button("Registrar Prestamo");
        devolver = new Button("Devolver Libro");

        Label titulo = new Label("Biblioteca", Label.CENTER);

        panelGeneral.setLayout(posiciones);
        panelCentro.setLayout(new GridLayout(3, 1));
        panelSur.setLayout(info);

        Panel celda1 = new Panel(new GridLayout(1, 1));
        celda1.add(new Label("Los Tres Chanchitos", Label.CENTER));
        celda1.setBackground(new Color(211, 211, 211));

        Panel celda2 = new Panel(new GridLayout(1, 1));
        celda2.add(new Label("Caperucita Roja", Label.CENTER));
        celda2.setBackground(new Color(211, 211, 211));

        Panel celda3 = new Panel(new GridLayout(1, 1));
        celda3.add(new Label("El Principito", Label.CENTER));
        celda3.setBackground(new Color(211, 211, 211));

        Panel celda4 = new Panel(new GridLayout(1, 1));
        celda4.add(new Label("El Hobbit", Label.CENTER));
        celda4.setBackground(new Color(211, 211, 211));

        Panel celda5 = new Panel(new GridLayout(1, 1));
        celda5.add(new Label("¿A que sabe la luna?", Label.CENTER));
        celda5.setBackground(new Color(211, 211, 211));

        Panel celda6 = new Panel(new GridLayout(1, 1));
        celda6.add(new Label("El monstruo de colores", Label.CENTER));
        celda6.setBackground(new Color(211, 211, 211));

        panelSur.add(celda1);
        panelSur.add(celda2);
        panelSur.add(celda3);
        panelSur.add(celda4);
        panelSur.add(celda5);
        panelSur.add(celda6);

        panelBotones.add(registrar);
        panelBotones.add(devolver);

        panelGeneral.add(panelNorte, BorderLayout.NORTH);
        panelGeneral.add(panelCentro, BorderLayout.CENTER);
        panelGeneral.add(panelEste, BorderLayout.EAST);
        panelGeneral.add(panelOeste, BorderLayout.WEST);
        panelGeneral.add(panelSur, BorderLayout.SOUTH);

        titulo.setForeground(Color.WHITE);

        panelGeneral.setBackground(new Color(206, 219, 230));
        panelNorte.setBackground(new Color(27, 106, 198));
        panelEste.setBackground(new Color(27, 106, 198));
        panelOeste.setBackground(new Color(27, 106, 198));

        panelNorte.add(titulo);

        panelCentro.add(new Label(""));
        panelCentro.add(panelBotones);
        panelCentro.add(new Label(""));

        add(panelGeneral);
    }

    public Button getRegistrar() {
        return registrar;
    }

    public Button getDevolver() {
        return devolver;
    }
}
