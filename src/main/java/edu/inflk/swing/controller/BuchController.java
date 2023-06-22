package edu.inflk.swing.controller;


import edu.inflk.swing.view.ButtonPanel;
import edu.inflk.swing.view.buch.BuchTabPanel;

import java.awt.event.ActionEvent;

/**
 * Controller sind Schnittstellen zwischen View (z. B. JPanels) und Model (z. B. Datenbanken).
 */
public class BuchController extends Controller {

    public BuchController() {
        setTitle("Bibliothek");
    }

    public void index(ActionEvent event) {

        // In der Mitte Hauptelement anfügen
        addCenter(new BuchTabPanel());

        // Unten Knopfleiste anfügen
        addSouth(new ButtonPanel());

        // Aktuelles Layout im JFrame rendern.
        render();
    }


}
