package edu.inflk.swing.view;

import javax.swing.*;
import java.awt.*;

public abstract class FullPanel extends JPanel {

    public BagConstraints constraints = new BagConstraints();

    public FullPanel() {
        setLayout(new GridBagLayout());
        constraints.setFill(GridBagConstraints.HORIZONTAL);
        constraints.setInsets(new Insets(0,0,0,0));
        constraints.setWeightY(1);
    }

}
