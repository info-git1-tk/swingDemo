package edu.inflk.swing.controller;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.ui.FlatRoundBorder;
import edu.inflk.swing.view.BagConstraints;
import edu.inflk.swing.view.buch.BuchIndex;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BuchController extends Controller {

    public BuchController() {
        setTitle("Buchansicht");
    }

    public void index(ActionEvent event) {


        JButton startButton = new JButton("Hauptmenü");
        startButton.addActionListener(new MainController()::index);


        JPanel main = new JPanel();
        main.setLayout(new GridBagLayout());
        BagConstraints gbc = new BagConstraints();
        gbc.setFill(GridBagConstraints.HORIZONTAL);

        // Hier erzeugen wir unsere JPanels
        JPanel buchIndex = new BuchIndex();
        JPanel panelBlue = new JPanel();


        // Erzeugung eines JTabbedPane-Objektes
        JTabbedPane tabs = new JTabbedPane
                (JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT );

        // Hier werden die JPanels als Registerkarten hinzugefügt
        tabs.addTab("Bestand", buchIndex);
        tabs.addTab("ausgeliehen", panelBlue);

        main.add(tabs,gbc);

        // In der Mitte Hauptelement anfügen
        addCenter(main);

        // Unten Elemente anfügen
        addSouth(startButton);

        // Aktuelles Layout im JFrame rendern.
        render();

    }



}
