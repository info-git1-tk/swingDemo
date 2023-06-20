package edu.inflk.swing.controller;


import edu.inflk.swing.model.Route;
import edu.inflk.swing.view.BagConstraints;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static edu.inflk.swing.view.MainFrame.*;

public abstract class Controller extends JPanel implements ActionListener {

    protected BagConstraints constraints = new BagConstraints();

    public Controller() {
        setLayout(new GridBagLayout());
    }

    public void render() {
        frame.add(this, Route.Anonymous.toString());
        layout.show(frame.getContentPane(), Route.Anonymous.toString());
    }

    public void setTitle(String title) {
        addNorth(new JLabel(title), GridBagConstraints.CENTER);
    }

    public void addLayoutComponent(Component c, Route constraint) {
        frame.add(c, constraint.toString());
    }

    public void setLayout(Route constraint) {
        layout.show(frame.getContentPane(), constraint.toString());
    }

    public Controller addNorth(Component component) {
        constraints.setRow(0);
        constraints.setWeightY(0);
        constraints.setFill(GridBagConstraints.HORIZONTAL);
        constraints.setAnchor(GridBagConstraints.NORTH);
        add(component, constraints);
        return this;
    }

    public Controller addNorth(Component component, int fill) {
        constraints.setRow(0);
        constraints.setWeightY(0);
        constraints.setFill(fill);
        constraints.setAnchor(GridBagConstraints.NORTH);
        add(component, constraints);
        return this;
    }

    public Controller addNorth(Component component, Insets insets) {
        constraints.setInsets(insets);
        constraints.setRow(0);
        constraints.setWeightY(0);
        constraints.setFill(GridBagConstraints.HORIZONTAL);
        constraints.setAnchor(GridBagConstraints.NORTH);
        add(component, constraints);
        return this;
    }

    public Controller addSouth(Component component) {
        constraints.setRow(2);
        constraints.setWeightY(0);
        constraints.setFill(GridBagConstraints.HORIZONTAL);
        constraints.setAnchor(GridBagConstraints.SOUTH);
        add(component, constraints);
        return this;
    }

    public Controller addSouth(Component component, int fill) {
        constraints.setRow(2);
        constraints.setWeightY(0);
        constraints.setFill(fill);
        constraints.setAnchor(GridBagConstraints.SOUTH);
        add(component, constraints);
        return this;
    }

    public Controller addSouth(Component component, Insets insets) {

        constraints.setInsets(insets);
        constraints.setRow(2);
        constraints.setWeightY(0);
        constraints.setFill(GridBagConstraints.HORIZONTAL);
        constraints.setAnchor(GridBagConstraints.SOUTH);
        add(component, constraints);
        return this;
    }

    public Controller addSouth(Component component, int fill, Insets insets) {

        constraints.setInsets(insets);
        constraints.setRow(2);
        constraints.setWeightY(0);
        constraints.setFill(fill);
        constraints.setAnchor(GridBagConstraints.SOUTH);
        add(component, constraints);
        return this;
    }

    public Controller addCenter(Component component) {

        constraints.setRow(1);
        constraints.setWeightY(1);
        constraints.setFill(GridBagConstraints.BOTH);
        constraints.setAnchor(GridBagConstraints.NORTH);
        add(component, constraints);
        return this;
    }

    public Controller addComponent(Component component) {

        this.add(component, this.constraints);
        return this;
    }

    public Component createHGlue() {
        return Box.createHorizontalGlue();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
