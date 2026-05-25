/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.inferfazbiblioteca.Clases;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class RegistrarLibro extends Frame {

    private Button btnLibro;

    public RegistrarLibro() {
        setTitle("Registrar Libro");
        setSize(700, 500);
        setLayout(new BorderLayout());

        Label tituloLibro = new Label("Registrar Libro", Label.CENTER);

        Panel panelLibro = new Panel(new GridLayout(6, 1, 5, 5));

        TextField ingresarAutor = new TextField(20);
        TextField ingresarTitulo = new TextField(20);
        TextField ingresarEditorial = new TextField(20);
        TextField ingresarISBN = new TextField(20);

        Checkbox disponible = new Checkbox("Disponible");
        Checkbox noDisponible = new Checkbox("No disponible");

        btnLibro = new Button("Registrar");

        Panel panelAutor = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelAutor.add(new Label("Autor:"));
        panelAutor.add(ingresarAutor);

        Panel panelTitulo = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelTitulo.add(new Label("Titulo:"));
        panelTitulo.add(ingresarTitulo);

        Panel panelEditorial = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelEditorial.add(new Label("Editorial:"));
        panelEditorial.add(ingresarEditorial);

        Panel panelISBN = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelISBN.add(new Label("ISBN:"));
        panelISBN.add(ingresarISBN);

        Panel panelDisponible = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelDisponible.add(disponible);
        panelDisponible.add(noDisponible);

        Panel panelBotonLibro = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelBotonLibro.add(btnLibro);

        panelLibro.add(panelAutor);
        panelLibro.add(panelTitulo);
        panelLibro.add(panelEditorial);
        panelLibro.add(panelISBN);
        panelLibro.add(panelDisponible);
        panelLibro.add(panelBotonLibro);

        add(tituloLibro, BorderLayout.NORTH);
        add(panelLibro, BorderLayout.CENTER);
    }

    public Button getBtnLibro() {
        return btnLibro;
    }
}