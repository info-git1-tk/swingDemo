package edu.inflk.swing;

import edu.inflk.swing.controller.MainController;
import edu.inflk.swing.model.Response;
import edu.inflk.swing.view.MainFrame;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.init();
    }

    public static Main app;
    private JFrame frame;
    private CardLayout layout;

    public void init() {
        app = this;
        this.frame = new MainFrame("Informatik-Leistungskurs", new CardLayout());
        Response.redirectToController(new MainController()::index);
    }

    public JFrame getFrame() {
        return frame;
    }

    public CardLayout getLayout() {
        return layout;
    }

}
