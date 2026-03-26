package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.SupaCiuperci;
import ro.ase.cts.clase.SupaLegume;
import ro.ase.cts.enums.TipMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        if (tipMancare == TipSupa.LEGUME){
            return new SupaLegume(pret, gramaj);
        } else if (tipMancare == TipSupa.CIUPERCI){
            return new SupaCiuperci(pret, gramaj);
        }
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        return getFelMancare(tipMancare, pret, gramaj);
    }
}
