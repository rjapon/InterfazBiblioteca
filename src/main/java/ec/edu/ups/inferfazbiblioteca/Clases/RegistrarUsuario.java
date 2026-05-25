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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class RegistrarUsuario implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Frame ventanaUsuario = new Frame("Registrar Usuario");
        ventanaUsuario.setSize(700, 500);
        ventanaUsuario.setLayout(new BorderLayout());

        Label tituloUsuario = new Label("Registrar Usuario", Label.CENTER);

        Panel panelUsuario = new Panel(new GridLayout(6, 1));

        TextField ingresarCedula = new TextField(20);
        TextField ingresarNombre = new TextField(20);
        TextField ingresarCorreo = new TextField(20);
        TextField ingresarTelefono = new TextField(20);

        Label cedula = new Label("Cedula");
        Label nombre = new Label("Nombre");
        Label correo = new Label("Correo");
        Label telefono = new Label("Telefono");

        Panel panelCedula = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelCedula.add(cedula);
        panelCedula.add(ingresarCedula);

        Panel panelNombre = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelNombre.add(nombre);
        panelNombre.add(ingresarNombre);

        Panel panelCorreo = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelCorreo.add(correo);
        panelCorreo.add(ingresarCorreo);

        Panel panelTelefono = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelTelefono.add(telefono);
        panelTelefono.add(ingresarTelefono);

        Button registrar = new Button("Registrar");

        Panel panelRegistrar = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelRegistrar.add(registrar);

        panelUsuario.add(panelCedula);
        panelUsuario.add(panelNombre);
        panelUsuario.add(panelCorreo);
        panelUsuario.add(panelTelefono);
        panelUsuario.add(panelRegistrar);

        ventanaUsuario.add(tituloUsuario, BorderLayout.NORTH);
        ventanaUsuario.add(panelUsuario, BorderLayout.CENTER);

        RegistrarLibro ventanaLibro = new RegistrarLibro();
        registrar.addActionListener(new AccionesDeRaton(ventanaUsuario, ventanaLibro));

        ventanaUsuario.setVisible(true);

    }

}
