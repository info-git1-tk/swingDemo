package edu.inflk.swing.view.buch;

import edu.inflk.swing.entity.Buch;
import edu.inflk.swing.view.DefaultPanel;

import javax.swing.*;
import java.util.ArrayList;

public class BuchIndex extends DefaultPanel {

    public BuchIndex() {
        init();
    }

    private final ArrayList<Buch> buchList = new ArrayList<>();

    public void addBuch(Buch buch) {
        buchList.add(buch);
    }

    public Buch getBuch(int index) {
        return buchList.get(index);
    }

    public ArrayList<Buch> getBuchList() {
        return buchList;
    }

    public void init() {

        constraints.setRow(1);
        add(new JLabel("ISBN"),constraints);
        add(new JLabel("Titel"),constraints);
        add(new JLabel("erschienen"),constraints);
        add(new JLabel("ausgeliehen"),constraints);

        // TODO: Über Zählschleife alle in der ArrayList enthaltenen Bücher ausgeben.
        constraints.setRow(2);
        add(new JTextField(),constraints);
        add(new JTextField(),constraints);
        add(new JTextField(),constraints);
        add(new JTextField(),constraints);


    }

}
