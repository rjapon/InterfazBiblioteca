/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.inferfazbiblioteca.Clases;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class RegistrarPrestamo extends Frame {

    private Button registrarPrestamo;

    public RegistrarPrestamo() {
        setTitle("Registrar Prestamo");
        setSize(700, 500);
        setLayout(new BorderLayout());

        Label tituloPrestamo = new Label("Registrar Prestamo", Label.CENTER);

        Panel panelPrestamo = new Panel(new GridLayout(7, 1, 5, 5));

        TextField ingresarCodigoPrestamo = new TextField(20);
        TextField ingresarFechaPrestamo = new TextField(20);
        TextField ingresarEstadoPrestamo = new TextField("PRESTADO", 20);
        TextField ingresarLibroPrestamo = new TextField(20);
        TextField ingresarUsuarioPrestamo = new TextField(20);
        TextField ingresarBibliotecarioPrestamo = new TextField(20);

        registrarPrestamo = new Button("Registrar");

        Panel panelCodigoPrestamo = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelCodigoPrestamo.add(new Label("Codigo:"));
        panelCodigoPrestamo.add(ingresarCodigoPrestamo);

        Panel panelFechaPrestamo = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelFechaPrestamo.add(new Label("Fecha Prestamo:"));
        panelFechaPrestamo.add(ingresarFechaPrestamo);

        Panel panelEstadoPrestamo = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelEstadoPrestamo.add(new Label("Estado:"));
        panelEstadoPrestamo.add(ingresarEstadoPrestamo);

        Panel panelLibroPrestamo = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelLibroPrestamo.add(new Label("Libro:"));
        panelLibroPrestamo.add(ingresarLibroPrestamo);

        Panel panelUsuarioPrestamo = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelUsuarioPrestamo.add(new Label("Usuario:"));
        panelUsuarioPrestamo.add(ingresarUsuarioPrestamo);

        Panel panelBibliotecarioPrestamo = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelBibliotecarioPrestamo.add(new Label("Bibliotecario:"));
        panelBibliotecarioPrestamo.add(ingresarBibliotecarioPrestamo);

        Panel panelBotonPrestamo = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelBotonPrestamo.add(registrarPrestamo);

        panelPrestamo.add(panelCodigoPrestamo);
        panelPrestamo.add(panelFechaPrestamo);
        panelPrestamo.add(panelEstadoPrestamo);
        panelPrestamo.add(panelLibroPrestamo);
        panelPrestamo.add(panelUsuarioPrestamo);
        panelPrestamo.add(panelBibliotecarioPrestamo);
        panelPrestamo.add(panelBotonPrestamo);

        add(tituloPrestamo, BorderLayout.NORTH);
        add(panelPrestamo, BorderLayout.CENTER);
    }

    public Button getRegistrarPrestamo() {
        return registrarPrestamo;
    }
}