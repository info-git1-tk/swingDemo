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
    public static CardLayout layout = new CardLayout();
    public static JFrame frame = new MainFrame("Informatik-Leistungskurs", layout);

    public void init() {
        app = this;
        Response.redirectToController(new MainController()::index);
    }

    public JFrame getFrame() {
        return frame;
    }

    public CardLayout getLayout() {
        return layout;
    }

}
