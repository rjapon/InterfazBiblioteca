/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.inferfazbiblioteca.Clases;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionesDeRaton implements ActionListener {

    private Frame ventanaActual;
    private Frame ventanaSiguiente;

    public AccionesDeRaton(Frame ventanaActual, Frame ventanaSiguiente) {
        this.ventanaActual = ventanaActual;
        this.ventanaSiguiente = ventanaSiguiente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ventanaActual.setVisible(false);
        ventanaSiguiente.setVisible(true);
    }
}