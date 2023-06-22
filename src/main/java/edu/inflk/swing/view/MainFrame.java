package edu.inflk.swing.view;


import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.*;

import edu.inflk.swing.controller.MainController;
import edu.inflk.swing.model.Resource;
import edu.inflk.swing.model.Response;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static CardLayout layout;
    public static JFrame frame;

    public MainFrame () {

        try {
            UIManager.setLookAndFeel( new FlatLightLaf());
            FlatNordIJTheme.setup();
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        layout = new CardLayout();
        frame = this;
        init();

    }

    private void init () {
        setTitle("Informatik-Leistungskurs");
        setLayout(layout);
        setIconImage(new ImageIcon(Resource.getImage("favicon-32x32.png")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1280, 720));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Startseite aufrufen
        Response.redirectToController(new MainController()::index);
    }

    public JFrame getFrame() {
        return frame;
    }

    public CardLayout getLayout() {
        return layout;
    }

}
