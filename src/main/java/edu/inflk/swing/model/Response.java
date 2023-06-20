package edu.inflk.swing.model;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Response {

    public static void redirectToController(ActionListener listener) {
        JButton redirectButton = new JButton();
        redirectButton.addActionListener(listener);
        redirectButton.doClick();
    }

}
