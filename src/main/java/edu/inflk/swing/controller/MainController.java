package edu.inflk.swing.controller;


import edu.inflk.swing.view.ButtonPanel;
import edu.inflk.swing.view.main.MainIndexPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainController extends Controller {

    public MainController() {
        setTitle("Hauptmenü");
    }

    public void index(ActionEvent event) {

        MainIndexPanel main = new MainIndexPanel();
        JLabel infoLabel = new JLabel("Diese Anwendung zeigt, wie Swing-Komponenten ohne Designer gesetzt werden können.");
        main.add(infoLabel);

        // In der Mitte Hauptelement anfügen
        addCenter(main);

        // Unten Elemente anfügen
        addSouth(new ButtonPanel());

        // Aktuelles Layout im JFrame rendern.
        render();
    }

}
