package exception;

public class PorudzbinaException extends Exception {

    public PorudzbinaException(){
        super("Nije moguće izdati novu porudžbinu jer prethodna nije plaćena.");
    }

}
