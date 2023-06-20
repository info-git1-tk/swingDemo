package edu.inflk.swing.view;

import edu.inflk.swing.controller.MainController;
import edu.inflk.swing.model.Resource;
import edu.inflk.swing.model.Response;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame (String title, CardLayout layout) {
        this.setTitle(title);
        this.setLayout(layout);
        init();
    }

    private void init () {
        this.setIconImage(new ImageIcon(Resource.getImage("favicon-32x32.png")).getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1280, 720));
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        Response.redirectToController(new MainController()::index);
    }

}
