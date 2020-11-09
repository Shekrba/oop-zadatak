package model;

import exception.PorudzbinaException;

import java.util.ArrayList;

public class Sto {
    private int redniBroj;
    private ArrayList<Porudzbina> porudzbine = new ArrayList<>();

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    public ArrayList<Porudzbina> getPorudzbine() {
        return porudzbine;
    }

    public void setPorudzbine(ArrayList<Porudzbina> porudzbine) {
        this.porudzbine = porudzbine;
    }

    public Porudzbina napraviPorudzbinu(){
        try {
            for (Porudzbina p:porudzbine) {
                if(p.isNaplacena()==false){
                    throw new PorudzbinaException();
                }
            }

            Porudzbina porudzbina = new Porudzbina();
            porudzbina.setSto(this);
            porudzbine.add(porudzbina);

            return porudzbina;
        }
        catch (PorudzbinaException e) {
            e.printStackTrace();
            return null;
        }
    }
}
