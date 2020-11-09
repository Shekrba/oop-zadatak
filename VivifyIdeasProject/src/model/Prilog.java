package model;

import java.util.concurrent.ThreadLocalRandom;

public class Prilog {

    private String naziv;
    private double cena;

    public Prilog() {
        this.cena = ThreadLocalRandom.current().nextInt(20, 101);
    }

    public Prilog(String naziv) {
        this.naziv = naziv;
        this.cena = ThreadLocalRandom.current().nextInt(20, 101);
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
