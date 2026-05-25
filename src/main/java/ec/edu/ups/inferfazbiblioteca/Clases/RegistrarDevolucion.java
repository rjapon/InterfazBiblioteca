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

public class RegistrarDevolucion extends Frame {

    private Button registrarDevolucion;

    public RegistrarDevolucion() {
        setTitle("Registrar Devolucion");
        setSize(700, 500);
        setLayout(new BorderLayout());

        Label tituloDevolucion = new Label("Registrar Devolucion", Label.CENTER);

        Panel panelDevolucion = new Panel(new GridLayout(7, 1, 5, 5));

        TextField ingresarCodigoDevolucion = new TextField(20);
        TextField ingresarFechaDevolucion = new TextField(20);
        TextField ingresarEstadoDevolucion = new TextField("DEVUELTO", 20);
        TextField ingresarLibroDevolucion = new TextField(20);
        TextField ingresarUsuarioDevolucion = new TextField(20);
        TextField ingresarBibliotecarioDevolucion = new TextField(20);

        Panel panelCodigoDevolucion = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelCodigoDevolucion.add(new Label("Codigo:"));
        panelCodigoDevolucion.add(ingresarCodigoDevolucion);

        Panel panelFechaDevolucion = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelFechaDevolucion.add(new Label("Fecha Devolucion:"));
        panelFechaDevolucion.add(ingresarFechaDevolucion);

        Panel panelEstadoDevolucion = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelEstadoDevolucion.add(new Label("Estado:"));
        panelEstadoDevolucion.add(ingresarEstadoDevolucion);

        Panel panelLibroDevolucion = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelLibroDevolucion.add(new Label("Libro:"));
        panelLibroDevolucion.add(ingresarLibroDevolucion);

        Panel panelUsuarioDevolucion = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelUsuarioDevolucion.add(new Label("Usuario:"));
        panelUsuarioDevolucion.add(ingresarUsuarioDevolucion);

        Panel panelBibliotecarioDevolucion = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelBibliotecarioDevolucion.add(new Label("Bibliotecario:"));
        panelBibliotecarioDevolucion.add(ingresarBibliotecarioDevolucion);

        registrarDevolucion = new Button("Registrar");

        Panel panelBotonDevolucion = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelBotonDevolucion.add(registrarDevolucion);

        panelDevolucion.add(panelCodigoDevolucion);
        panelDevolucion.add(panelFechaDevolucion);
        panelDevolucion.add(panelEstadoDevolucion);
        panelDevolucion.add(panelLibroDevolucion);
        panelDevolucion.add(panelUsuarioDevolucion);
        panelDevolucion.add(panelBibliotecarioDevolucion);
        panelDevolucion.add(panelBotonDevolucion);

        add(tituloDevolucion, BorderLayout.NORTH);
        add(panelDevolucion, BorderLayout.CENTER);
    }

    public Button getRegistrarDevolucion() {
        return registrarDevolucion;
    }
}
