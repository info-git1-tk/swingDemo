package edu.inflk.swing.controller;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.ui.FlatRoundBorder;
import edu.inflk.swing.view.BagConstraints;
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

        // Hier erzeugen wir unsere JPanels
        JPanel panelRot = new JPanel();
        JPanel panelBlue = new JPanel();
        JPanel panelGreen = new JPanel();
        JPanel panelYellow = new JPanel();
        JPanel panelPink = new JPanel();
        JPanel panelBlack = new JPanel();


        // Erzeugung eines JTabbedPane-Objektes
        JTabbedPane tabs = new JTabbedPane
                (JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT );

        // Hier werden die JPanels als Registerkarten hinzugefügt
        tabs.addTab("Ich bin rot", panelRot);
        tabs.addTab("Ich bin blau", panelBlue);
        tabs.addTab("Ich bin grün", panelGreen);
        tabs.addTab("Ich bin gelb", panelYellow);
        tabs.addTab("Ich bin pink", panelPink);
        tabs.addTab("Ich bin schwarz", panelBlack);

        main.add(tabs,gbc);

        // In der Mitte Hauptelement anfügen
        addCenter(main);

        // Unten Elemente anfügen
        addSouth(startButton);

        // Aktuelles Layout im JFrame rendern.
        render();

    }



}
