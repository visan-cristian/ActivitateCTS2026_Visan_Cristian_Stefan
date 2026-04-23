package ro.ase.cts.main;

import ro.ase.cts.clase.adapter.Adapter;
import ro.ase.cts.clase.spital.Medicament;

public class Main {
    public static void procurareMedicament(ro.ase.cts.clase.farmacie.Medicament medFarmacie){
        medFarmacie.cumparaMedicament();
    }

    static void main(String[] args){
        Medicament med = new Medicament("Paracetamol", 25.0f);
        ro.ase.cts.clase.farmacie.Medicament nospa = new ro.ase.cts.clase.farmacie.Medicament("NoSpa");

        med.achizitioneazaMedicament();
        nospa.cumparaMedicament();

        procurareMedicament(nospa);
        //procurareMedicament(med);

        Adapter adapterMed = new Adapter(med);
        procurareMedicament(adapterMed);
    }
}
