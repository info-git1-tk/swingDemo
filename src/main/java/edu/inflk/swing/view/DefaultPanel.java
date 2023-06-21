package edu.inflk.swing.view;

import javax.swing.*;
import java.awt.*;

public abstract class DefaultPanel extends JPanel {

    protected BagConstraints constraints = new BagConstraints();

    public DefaultPanel() {
        setLayout(new GridBagLayout());
        constraints.setFill(GridBagConstraints.HORIZONTAL);
        constraints.setInsets(new Insets(0,0,0,0));
        constraints.setWeightY(0);
        constraints.gridwidth = 4;
        add(Box.createVerticalStrut(10),constraints);
        constraints.gridwidth = 1;
    }

}
