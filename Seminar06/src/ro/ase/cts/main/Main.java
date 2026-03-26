package ro.ase.cts.main;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaSupa;

public class Main {
    static void main(String[] args){
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI, 15.5f, 300.0f);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME, 20.0f, 350.0f);

        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 20.0f, 350.0f, 500);
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 35.5f, 200.0f, 300);

        supaCiuperci.afisare();
        supaLegume.afisare();

        clatite.afisare();
        papanasi.afisare();
    }
}
