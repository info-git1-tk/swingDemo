package edu.inflk.swing.controller;

import edu.inflk.swing.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Controller implements ActionListener {

    protected JPanel panel;

    public Controller () {
        panel = new JPanel();
    }

    public void addLayoutComponent(Component c, String constraint){
        System.out.println(c);
        //Main.frame.add(c,constraint);
    }

    public void setLayout(String constraint){
        //Main.layout.show(Main.frame.getContentPane(), constraint);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
