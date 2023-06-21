package edu.inflk.swing.controller;

import com.formdev.flatlaf.FlatLaf;
import edu.inflk.swing.model.Route;
import edu.inflk.swing.view.BagConstraints;
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

        JPanel main = new JPanel();
        main.setLayout(new GridBagLayout());
        BagConstraints gbc = new BagConstraints();
        gbc.setFill(GridBagConstraints.HORIZONTAL);

        // In der Mitte Hauptelement anfügen
        addCenter(main);

        // Unten Elemente anfügen
        addSouth(startButton);

        // Aktuelles Layout im JFrame rendern.
        render();
    }

}
