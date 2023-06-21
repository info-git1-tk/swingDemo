package edu.inflk.swing.view.buch;

import com.formdev.flatlaf.FlatClientProperties;
import edu.inflk.swing.entity.Buch;
import edu.inflk.swing.view.DefaultPanel;

import javax.swing.*;
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

        JButton addButton = new JButton("hinzufügen");
        addButton.putClientProperty( FlatClientProperties.OUTLINE, FlatClientProperties.OUTLINE_WARNING );
        addButton.addActionListener(e -> onAdd());

        constraints.setRow(1);
        add(new JLabel("ISBN"),constraints);
        add(new JLabel("Titel"),constraints);
        add(new JLabel("erschienen"),constraints);
        add(new JLabel(),constraints);

        // TODO: Über Zählschleife alle in der ArrayList enthaltenen Bücher ausgeben.
        constraints.setRow(2);
        add(isbnTextField,constraints);
        add(titleTextField,constraints);
        add(jahrTextField,constraints);
        add(addButton,constraints);

        constraints.setRow(3);
        constraints.gridwidth = 4;
        add(Box.createVerticalStrut(10),constraints);

        constraints.setRow(4);
        constraints.setWeightY(2);
        buchJList = new JList<>(buchList);
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
