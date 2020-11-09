package model;

import exception.PorudzbinaException;

import java.util.ArrayList;

public class Porudzbina {
    private ArrayList<StavkaPorudzbine> stavkePorudzbine = new ArrayList<>();
    private Sto sto;
    private boolean naplacena = false;
    private double ukupnaCena;

    public Porudzbina(){
    }

    public Sto getSto() {
        return sto;
    }

    public void setSto(Sto sto) {
        this.sto = sto;
    }

    public boolean isNaplacena() {
        return naplacena;
    }

    public void setNaplacena(boolean naplacena) {
        this.naplacena = naplacena;
    }

    public ArrayList<StavkaPorudzbine> getStavkePorudzbine() {
        return stavkePorudzbine;
    }

    public void setStavkePorudzbine(ArrayList<StavkaPorudzbine> stavkePorudzbine) {
        this.stavkePorudzbine = stavkePorudzbine;
    }

    public double getUkupnaCena() {
        return ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }

    public void naplata() {

        System.out.println("-------------------------------------------");
        System.out.println("> RACUN: <");

        ukupnaCena = 0;
        int i = 1;
        for (StavkaPorudzbine sp:stavkePorudzbine) {

            System.out.println(i+". " + sp.getStavka().getNaziv()+"...................."+sp.getStavka().getCena()+" din");

            ukupnaCena += sp.getStavka().getCena();

            if(sp.getStavka() instanceof Hrana){

                if(sp.getPrilozi().size() > 0){
                    System.out.println("\t Prilozi:");

                    double cenaSaPrilozima = sp.getStavka().getCena();

                    for (PrilogPorudzbine pp:sp.getPrilozi()) {

                        System.out.println("\t - "+pp.getPrilog().getNaziv()+".........."+pp.getPrilog().getCena()+" din");

                        ukupnaCena += pp.getPrilog().getCena();
                        cenaSaPrilozima += pp.getPrilog().getCena();
                    }


                    System.out.println("\t - UKUPNA CENA HRANE SA PRILOZIMA: "+cenaSaPrilozima+" din");
                }
            }

            i++;
        }

        this.naplacena = true;

        System.out.println("UKUPNA CENA: "+ukupnaCena+" din");
        System.out.println("-------------------------------------------");

    }
}
