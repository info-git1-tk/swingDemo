package edu.inflk.swing.controller;

import com.formdev.flatlaf.FlatLaf;
import edu.inflk.swing.model.Route;
import edu.inflk.swing.view.BagConstraints;
import edu.inflk.swing.view.ButtonPanel;
import edu.inflk.swing.view.main.MainIndexPanel;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainController extends Controller {

    public MainController() {
        setTitle("Hauptmenü");
    }

    public void index(ActionEvent event) {

        MainIndexPanel main = new MainIndexPanel();

        // In der Mitte Hauptelement anfügen
        addCenter(main);

        // Unten Elemente anfügen
        addSouth(new ButtonPanel());

        // Aktuelles Layout im JFrame rendern.
        render();
    }

}
