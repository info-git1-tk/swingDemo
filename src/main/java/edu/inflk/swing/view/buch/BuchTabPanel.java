package edu.inflk.swing.view.buch;

import edu.inflk.swing.view.FullPanel;

import javax.swing.*;
import java.awt.*;

public class BuchTabPanel extends FullPanel {

    BuchIndexPanel buchIndexPanel;

    public BuchTabPanel() {
        setup();
    }

    private void setup() {
        buchIndexPanel = new BuchIndexPanel();

        JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        tabs.addTab("Bestand", buchIndexPanel);
        constraints.setWeightY(2);
        constraints.setFill(GridBagConstraints.BOTH);
        add(tabs, constraints);

    }

}
