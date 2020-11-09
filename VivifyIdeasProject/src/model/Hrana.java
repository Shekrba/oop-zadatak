package model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Hrana extends Stavka{

    private TipHrane tipHrane;

    public Hrana() {
        super();
        this.cena = ThreadLocalRandom.current().nextInt(300, 601);
    }

    public Hrana(String naziv, TipHrane tipHrane) {
        super(naziv);
        this.tipHrane = tipHrane;
        this.cena = ThreadLocalRandom.current().nextInt(300, 601);
    }

    public TipHrane getTipHrane() {
        return tipHrane;
    }

    public void setTipHrane(TipHrane tipHrane) {
        this.tipHrane = tipHrane;
    }
}
