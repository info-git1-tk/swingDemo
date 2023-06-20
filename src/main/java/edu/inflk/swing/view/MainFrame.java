package edu.inflk.swing.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkContrastIJTheme;
import com.github.weisj.darklaf.LafManager;
import com.github.weisj.darklaf.theme.DarculaTheme;
import edu.inflk.swing.controller.MainController;
import edu.inflk.swing.model.Resource;
import edu.inflk.swing.model.Response;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static CardLayout layout;
    public static JFrame frame;

    public MainFrame () {

        // Look and Feel Instanz erstellen
        LafManager.setTheme(new DarculaTheme());
        LafManager.install();
        //UIManager.setLookAndFeel( new FlatLightLaf());
        //FlatGrayIJTheme.setup();

        layout = new CardLayout();
        frame = this;
        setTitle("Informatik-Leistungskurs");
        setLayout(layout);
        init();
    }

    private void init () {
        setIconImage(new ImageIcon(Resource.getImage("favicon-32x32.png")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1280, 720));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        Response.redirectToController(new MainController()::index);
    }

    public JFrame getFrame() {
        return frame;
    }

    public CardLayout getLayout() {
        return layout;
    }

}
