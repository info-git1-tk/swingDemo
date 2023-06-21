package edu.inflk.swing.controller;


import edu.inflk.swing.view.ButtonPanel;
import edu.inflk.swing.view.buch.BuchContentPanel;

import java.awt.event.ActionEvent;

public class BuchController extends Controller {

    public BuchController() {
        setTitle("Bibliothek");
    }

    public void index(ActionEvent event) {

        // In der Mitte Hauptelement anfügen
        BuchContentPanel main = new BuchContentPanel();
        addCenter(main);

        // Unten Knopfleiste anfügen
        addSouth(new ButtonPanel());

        // Aktuelles Layout im JFrame rendern.
        render();
    }



}
