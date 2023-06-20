package edu.inflk.swing.controller;

import com.formdev.flatlaf.FlatLaf;
import edu.inflk.swing.model.Route;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainController extends Controller {

    public MainController() {
        setTitle("Hauptansicht");
    }

    public void index(ActionEvent event) {

        JButton startButton = new JButton("Buch");
        startButton.addActionListener(new BuchController()::index);

        // Oben Elemente anfügen
        //addNorth(new JLabel());

        // In der Mitte Hauptelement anfügen
        JPanel main = new JPanel();
        main.setBackground(Color.DARK_GRAY);

        addCenter(main);

        // Unten Elemente anfügen
        addSouth(startButton);
        addSouth(new JButton("Klick"));
        addSouth(createHGlue());
        addSouth(new JButton("Klick"));

        // Aktuelles Layout im JFrame rendern.
        render();
    }

}
