package edu.inflk.swing.entity;

public class Buch {

    // Attribute
    private String isbn;
    private String titel;
    private int erscheinungsjahr;
    private boolean ausgeliehen;

    //Standardkonstruktor
    public Buch() {

    }

    // Überladen von Methoden (gleicher Methodenbezeichner, verschiedene Parameter).
    // Der zweite Konstruktor erwartet Parameter.
    public Buch(String isbn, String titel, int erscheinungsjahr) {
        this.isbn = isbn;
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        ausgeliehen = false;
    }

    public String toString() {
        return anzeigen();
    }

    //Anfrage, welche die Daten eines Buches als Zeichenkette zurückgibt.
    public String anzeigen() {
        String ausgabe = "";
        ausgabe = "Buchdaten: " + "ISBN " + this.isbn + ", Titel " + this.titel + ", Erscheinungsjahr " + this.erscheinungsjahr;
        return ausgabe;
    }


    /**
     * get- und set-Methoden
     */
    //Methodenkopf
    public void setTitel(String titel) {
        // Methodenkörper
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public boolean isAusgeliehen() {
        return ausgeliehen;
    }

    public void setAusgeliehen(boolean ausgeliehen) {
        this.ausgeliehen = ausgeliehen;
    }

}
