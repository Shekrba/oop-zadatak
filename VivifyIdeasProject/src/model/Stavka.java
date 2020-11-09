package model;

import java.util.Random;

public abstract class Stavka {

    protected String naziv;
    protected double cena;

    public Stavka() {

    }

    public Stavka(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
