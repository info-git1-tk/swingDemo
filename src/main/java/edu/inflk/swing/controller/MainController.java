package edu.inflk.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainController extends Controller {

    public void index(ActionEvent event) {



        JButton startButton = new JButton("Startknopf");
        startButton.addActionListener(new BuchController()::index);

        this.panel.add(startButton);

        addLayoutComponent(this.panel, "main");
        setLayout("main");
    }

}
