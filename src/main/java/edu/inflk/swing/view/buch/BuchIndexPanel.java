package edu.inflk.swing.view.buch;

import com.formdev.flatlaf.FlatClientProperties;
import edu.inflk.swing.entity.Buch;
import edu.inflk.swing.view.DefaultPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * Erbt von DefaultPanel, das bereits mit GridBagLayout und GridBagConstraints vordefiniert ist.
 * Vorteil: Anordnung der Komponenten in Zeilen und Spalten möglich (Siehe HTML-Layout mit table).
 */
public class BuchIndexPanel extends DefaultPanel {

    public BuchIndexPanel() {
        init();
    }

    /**
     * Ähnlich wie ArrayList, jedoch mit JList besser kompatibel.
     */
    private final Vector<Buch> buchList = new Vector<>();

    /**
     * Swing-Komponente, um Elemente als Liste darzustellen.
     * JTable wäre eigentlich besser, ist aber für den Anfang zu kompliziert.
     */
    private JList<Buch> buchJList;

    // Eingabefelder:
    private final JTextField isbnTextField = new JTextField();
    private final JTextField titleTextField = new JTextField();
    private final JTextField jahrTextField = new JTextField();

    /**
     * Layout anlegen und dem Panel hinzufügen
     */
    public void init() {

        // Attribute der Komponenten festlegen setzen
        JButton addButton = new JButton("Buch hinzufügen");
        addButton.putClientProperty(FlatClientProperties.BUTTON_TYPE, FlatClientProperties.BUTTON_TYPE_SQUARE);
        addButton.addActionListener(e -> onAdd());
        // Dimensionen sollten besser vorher als Konstanten definiert werden.
        addButton.setPreferredSize(new Dimension(48, 24));
        isbnTextField.setPreferredSize(new Dimension(120, 24));
        titleTextField.setPreferredSize(new Dimension(120, 24));
        jahrTextField.setPreferredSize(new Dimension(40, 24));

        // Label-Zeile
        constraints.setRow(1);
        add(new JLabel("ISBN"), constraints);
        add(new JLabel("Titel"), constraints);
        add(new JLabel("erschienen"), constraints);
        add(new JLabel(), constraints);

        // TextField-Zeile
        constraints.setRow(2);
        add(isbnTextField, constraints);
        add(titleTextField, constraints);
        add(jahrTextField, constraints);
        add(addButton, constraints);
        constraints.setWeightX(2);
        add(Box.createHorizontalGlue(), constraints);

        // Leerzeile für etwas Abstand
        constraints.setRow(3);
        constraints.setWeightX(0);
        constraints.gridwidth = 5;
        add(Box.createVerticalStrut(10), constraints);

        // Zeile mit der Ergebnisliste
        constraints.setRow(4);
        constraints.setWeightY(2);
        buchJList = new JList<>(buchList);
        buchJList.setVisibleRowCount(30);
        add(buchJList, constraints);

    }

    /**
     * Wird ausgeführt, wenn der Button addButton() betätigt wird.
     */
    public void onAdd() {

        try {
            addBuch(new Buch(isbnTextField.getText(), titleTextField.getText(), Integer.decode(jahrTextField.getText())));
            System.out.println("Buch hinzugefügt");
            buchJList.updateUI();
        } catch (NumberFormatException formatException) {
            jahrTextField.setText(null);
            jahrTextField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Jahr darf nur Ziffern enthalten!");
        }

    }

    public void addBuch(Buch buch) {
        buchList.add(buch);
    }

    public Buch getBuch(int index) {
        return buchList.get(index);
    }

}
