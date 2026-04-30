package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.ManagerLinie;

public class Main {
    static void main(String[] args) {
        Autobuz autobuz101 = new Autobuz("Mercedes", 1989, 50);
        Autobuz autobuz102 = new Autobuz("Lada", 1989, 55);
        Autobuz autobuz103 = new Autobuz("Lamborghini", 1989, 60);

        ManagerLinie managerLinie = new ManagerLinie();
        managerLinie.getLinie(101, "Romana", "Universitate").numarMaximPasageriPeLinie(autobuz101);
        managerLinie.getLinie(101, "Otopeni", "Altceva").descriereLinie(autobuz101);
    }
}
