package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipMancare;

public interface FabricaAbstracta {
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj);
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii);
}
