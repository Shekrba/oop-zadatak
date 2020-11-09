package model;

import java.util.concurrent.ThreadLocalRandom;

public class Pice extends Stavka{

    private double zapremina;

    private TipPica tipPica;

    public Pice() {
        super();
        this.cena = ThreadLocalRandom.current().nextInt(150, 501);
    }

    public Pice(String naziv, double zapremina, TipPica tipPica) {
        super(naziv);
        this.zapremina = zapremina;
        this.tipPica = tipPica;
        this.cena = ThreadLocalRandom.current().nextInt(150, 501);
    }

    public double getZapremina() {
        return zapremina;
    }

    public void setZapremina(double zapremina) {
        this.zapremina = zapremina;
    }

    public TipPica getTipPica() {
        return tipPica;
    }

    public void setTipPica(TipPica tipPica) {
        this.tipPica = tipPica;
    }
}
