package model;

import java.util.ArrayList;

public class StavkaPorudzbine {

    private int kolicina;
    private Stavka stavka;
    private ArrayList<PrilogPorudzbine> prilozi = new ArrayList<>();

    public Stavka getStavka() {
        return stavka;
    }

    public void setStavka(Stavka stavka) {
        this.stavka = stavka;
    }

    public ArrayList<PrilogPorudzbine> getPrilozi() {
        return prilozi;
    }

    public void setPrilozi(ArrayList<PrilogPorudzbine> prilozi) {
        this.prilozi = prilozi;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
}
