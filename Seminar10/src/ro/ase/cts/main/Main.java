package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    static void main(String[] args) {
        MijlocDeTransport autobuz168 = new Autobuz(20, 168);
        MijlocDeTransport autobuz226 = new Autobuz(0, 226);
        Statie statieRomana = new Statie("Piata Romana", 10);
        Statie statieUniversitate = new Statie("Universitate", 17);

        autobuz168.opresteInStatie(statieRomana);
        autobuz226.opresteInStatie(statieUniversitate);

        System.out.println("==============================");

        MijlocDeTransport autoNoapte168 = new AutobuzNoapte(autobuz168);
        MijlocDeTransport autoNoapte226 = new AutobuzNoapte(autobuz226);

        autoNoapte168.opresteInStatie(statieRomana);
        autoNoapte226.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuz = new Autobuz(12, 6, TipCursa.CURSA_SPECIALA);

        System.out.println("===============================");
        MijlocDeTransport autoSpecial = new AutobuzCursaSpeciala(autobuz);
        MijlocDeTransport autoSpecial168 = new AutobuzCursaSpeciala(autobuz);
        autoSpecial.opresteInStatie(statieRomana);
        autoSpecial168.opresteInStatie(statieUniversitate);

    }
}
