package ro.cts.ase.factory;

import ro.cts.ase.clase.Autobuz;
import ro.cts.ase.clase.MijlocTransport;
import ro.cts.ase.clase.Tramvai;
import ro.cts.ase.clase.Trolebuz;

public class Depou {
    public MijlocTransport getMijlocTransport(Tipuri tip, int numarRoti, String numarInmatriculare){
        if(tip == Tipuri.AUTOBUZ){
            return new Autobuz(numarRoti, numarInmatriculare);
        }
        if(tip == Tipuri.TRAMVAI){
            return new Tramvai(numarRoti, numarInmatriculare);
        }
        if(tip == Tipuri.TROLEBUZ){
            return new Trolebuz(numarRoti, numarInmatriculare);
        }
        return null;
    }
}
