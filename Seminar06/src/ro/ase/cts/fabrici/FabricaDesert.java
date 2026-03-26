package ro.ase.cts.fabrici;

import ro.ase.cts.clase.Clatite;
import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return getFelMancare(tipMancare, pret, gramaj, 500);
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        if (tipMancare == TipDesert.CLATITE){
            return new Clatite(pret, gramaj, calorii);
        } else if (tipMancare == TipDesert.PAPANASI){
            return new Papanasi(pret, gramaj, calorii);
        }
        return null;
    }
}
