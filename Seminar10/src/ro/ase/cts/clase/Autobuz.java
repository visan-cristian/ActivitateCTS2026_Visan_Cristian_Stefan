package ro.ase.cts.clase;

public class Autobuz implements MijlocDeTransport{
    private int nrPasageri;
    private int nrLinie;
    private TipCursa tipCursa;

    public int getNrPasageri() {
        return nrPasageri;
    }

    public Autobuz(int nrPasageri, int nrLinie, TipCursa tipCursa) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }

    public Autobuz(int nrPasageri, int nrLinie) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = TipCursa.CURSA_NORMALA;
    }

    public TipCursa getTipCursa() {
        return tipCursa;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.println("Autobuzul de la linia " + nrLinie + " a oprit in statia " + statie.getNumeStatie());
    }
}
