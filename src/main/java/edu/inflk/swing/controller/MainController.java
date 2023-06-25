package edu.inflk.swing.controller;


import edu.inflk.swing.view.ButtonPanel;
import edu.inflk.swing.view.main.MainIndexPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController extends Controller {

    public MainController() {
        setTitle("Hauptmenü");
    }

    public void index(ActionEvent event) {

        MainIndexPanel main = new MainIndexPanel();
        GridBagConstraints gbc = main.constraints;

        JButton aButton = new JButton("A");
        JButton bButton = new JButton("B");
        JButton cButton = new JButton("C");

        JButton dButton = new JButton("D");
        JButton eButton = new JButton("E");
        JButton fButton = new JButton("F");

        JButton gButton = new JButton("G");
        JButton hButton = new JButton("H");

        // Referenz auf Methode einer Klasse MIT ActionEvent als Parameter (e):
        aButton.addActionListener(this::onClick);
        bButton.addActionListener(this::onClick);
        cButton.addActionListener(this::onClick);

        gButton.addActionListener(this::onClick);
        hButton.addActionListener(this::onClick);

        // Lambda-Notation als Kurzschreibweise OHNE Übergabe eines ActionEvents:
        dButton.addActionListener(e -> onClickedD());
        eButton.addActionListener(e -> onClickedE());

        // neue anonyme Klasse erstellen und im Button referenzieren (MIT ActionEvent als Parameter):
        fButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Es wurde actionPerformed() einer anonymen Klasse aufgerufen!");
            }
        });

        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 1;

        gbc.gridy = 0;
        gbc.weightx = 1;
        main.add(aButton,gbc);
        gbc.weightx = 2;
        main.add(bButton,gbc);
        gbc.weightx = .5;
        main.add(cButton,gbc);

        /*
            gbc.gridy = 1;
            gbc.gridwidth = 3;
            gbc.weighty = 1;
            main.add(Box.createGlue(),gbc);
         */


        // Gewichtung kann in weiteren Zeilen weggelassen werden, Angabe der Zeile reicht aus:
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.weighty = 1;
        main.add(dButton,gbc);
        main.add(eButton,gbc);
        main.add(fButton,gbc);

        // hButton in der dritten Zeile geht über zwei Spalten:
        gbc.gridy = 3;

        main.add(gButton,gbc);
        gbc.gridwidth = 2;
        main.add(hButton,gbc);


        // In der Mitte Hauptelement anfügen
        addCenter(main);

        // Unten Elemente anfügen
        addSouth(new ButtonPanel());

        // Aktuelles Layout im JFrame rendern.
        render();
    }

    private void onClick(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        System.out.printf("Es wurde auf %s gedrückt!%n",btn.getText());
    }

    private void onClickedD() {
        System.out.println("Es wurde die Methode onClickedD() aufgerufen!");
    }

    private void onClickedE() {
        System.out.println("Es wurde die Methode onClickedE() aufgerufen!");
    }

}
