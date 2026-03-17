package ro.cts.ase.main;

import ro.cts.ase.clase.MijlocTransport;
import ro.cts.ase.factory.Depou;
import ro.cts.ase.factory.Tipuri;

public class Main {
    public static void main(String[] args){
        Depou depou = new Depou();
        MijlocTransport autobuz = depou.getMijlocTransport(Tipuri.AUTOBUZ, 6, "B 49 ABC");
        MijlocTransport tramvai = depou.getMijlocTransport(Tipuri.TRAMVAI, 20, "B 49 ABC");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
    }
}
