/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.inferfazbiblioteca.Clases;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

/**
 *
 * @author Asus
 */
public class FinalPrestamo {

    public FinalPrestamo() {

        Frame paginaFinal = new Frame("Página Final");

        paginaFinal.setLayout(new BorderLayout());

        Panel panelFinal = new Panel();
        panelFinal.setLayout(new FlowLayout(FlowLayout.CENTER));

        Label mensaje = new Label("Préstamo Registrado");
        Button volver = new Button("Regresar al Inicio");

        panelFinal.add(mensaje);
        panelFinal.add(volver);

        paginaFinal.add(panelFinal, BorderLayout.CENTER);
        paginaFinal.setSize(500, 200);
        paginaFinal.setVisible(true);

    }

}
