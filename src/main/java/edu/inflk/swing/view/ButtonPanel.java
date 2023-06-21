package edu.inflk.swing.view;

import edu.inflk.swing.controller.BuchController;
import edu.inflk.swing.controller.MainController;

import javax.swing.*;

public class ButtonPanel extends FullPanel {

    public ButtonPanel() {
        JButton startButton = new JButton("Hauptmenü");
        startButton.addActionListener(new MainController()::index);

        JButton libraryButton = new JButton("Bibliothek");
        libraryButton.addActionListener(new BuchController()::index);

        add(startButton,constraints);
        add(libraryButton,constraints);
    }

}
