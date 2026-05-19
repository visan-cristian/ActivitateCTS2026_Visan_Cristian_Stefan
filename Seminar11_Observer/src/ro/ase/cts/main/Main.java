package ro.ase.cts.main;

import ro.ase.cts.clase.ISpital;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PacientAbonat;
import ro.ase.cts.clase.Spital;

public class Main {
    static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Ionel", 30);
        Pacient pacient2 = new PacientAbonat("Ionelas", 40);
        Pacient pacient3 = new PacientAbonat("Popescu", 20);

        ISpital spital = new Spital("Bagdasar");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital)spital).notificaEpidemie();
        ((Spital)spital).notificaVirus();

    }
}
