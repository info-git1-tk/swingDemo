package edu.inflk.swing.view.buch;

import com.formdev.flatlaf.FlatClientProperties;
import edu.inflk.swing.entity.Buch;
import edu.inflk.swing.view.DefaultPanel;
import edu.inflk.swing.view.FullPanel;
import edu.inflk.swing.view.GridPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class BuchIndexPanel extends DefaultPanel {

    public BuchIndexPanel() {
        init();
    }

    private final Vector<Buch> buchList = new Vector<>();

    private JList<Buch> buchJList;
    private JTextField isbnTextField = new JTextField();
    private JTextField titleTextField = new JTextField();
    private JTextField jahrTextField = new JTextField();

    public void init() {

        JButton addButton = new JButton("Buch hinzufügen");
        addButton.putClientProperty( FlatClientProperties.BUTTON_TYPE, FlatClientProperties.BUTTON_TYPE_SQUARE );
        addButton.addActionListener(e -> onAdd());

        constraints.setRow(1);
        add(new JLabel("ISBN"),constraints);
        add(new JLabel("Titel"),constraints);
        add(new JLabel("erschienen"),constraints);
        add(new JLabel(),constraints);

        isbnTextField.setPreferredSize(new Dimension(120,24));
        titleTextField.setPreferredSize(new Dimension(120,24));
        jahrTextField.setPreferredSize(new Dimension(40,24));

        constraints.setRow(2);
        add(isbnTextField,constraints);
        add(titleTextField,constraints);
        add(jahrTextField,constraints);
        constraints.setWeightX(2);
        add(Box.createHorizontalGlue(),constraints);
        constraints.setWeightX(0);
        add(addButton,constraints);

        constraints.setRow(3);
        constraints.gridwidth = 5;
        add(Box.createVerticalStrut(10),constraints);

        constraints.setRow(4);
        constraints.setWeightY(2);
        buchJList = new JList<>(buchList);
        buchJList.setVisibleRowCount(30);


        add(buchJList,constraints);


    }

    public void onAdd() {
        addBuch(new Buch(isbnTextField.getText(),titleTextField.getText(),Integer.decode(jahrTextField.getText())));
        System.out.println("Buch hinzugefügt");
        buchJList.updateUI();

    }

    public void addBuch(Buch buch) {
        buchList.add(buch);
    }

    public Buch getBuch(int index) {
        return buchList.get(index);
    }

    public Vector<Buch> getBuchList() {
        return buchList;
    }

}
