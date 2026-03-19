package ro.cts.ase.main;

import ro.cts.ase.clase.MijlocTransport;
import ro.cts.ase.factory.Depou;
import ro.cts.ase.factory.Tipuri;

public class Main {
    public static void main(String[] args){
        Depou depou = new Depou();
        MijlocTransport autobuz = depou.getMijlocTransport(Tipuri.AUTOBUZ, 4, "B100STB");
        MijlocTransport tramvai = depou.getMijlocTransport(Tipuri.TRAMVAI, 20, "B101STB");
        MijlocTransport trolebuz = depou.getMijlocTransport(Tipuri.TROLEBUZ, 4, "B102STB");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
        trolebuz.afiseazaDescriere();
    }
}
