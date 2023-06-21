package edu.inflk.swing.view.buch;

import edu.inflk.swing.view.FullPanel;

import javax.swing.*;
import java.awt.*;

public class BuchContentPanel extends FullPanel {

    BuchIndexPanel buchIndexPanel;

    public BuchContentPanel() {
        setup();
    }

    private void setup() {
        buchIndexPanel = new BuchIndexPanel();

        JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.addTab("Bestand", buchIndexPanel);

        add(tabs, constraints);

        constraints.setWeightY(2);
        constraints.setRow(1);
        add(Box.createVerticalGlue(), constraints);
    }

}