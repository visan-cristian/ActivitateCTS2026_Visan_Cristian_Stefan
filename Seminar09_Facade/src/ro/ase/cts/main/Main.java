package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.ReceptieSpital;
import ro.ase.cts.clase.Salon;

public class Main {
    static void main(String[] args){
        Pacient pacient = new Pacient("Gigel", 5);
        Medic medic1 = new Medic();
        Salon salon1 = new Salon();

        if (medic1.areTrimitere(pacient)){
            int patLiber = salon1.getPatLiber();
            if (patLiber != -1){
                System.out.println("Pacientul " + pacient.getNume() + " va fi internat in patul " + patLiber);
                salon1.ocupaPat(patLiber);
            }
        }
    }

    Pacient pacient1 = new Pacient("Mihai", 5);
    Pacient pacient2 = new Pacient("George", 2);
    Pacient pacient3 = new Pacient("George", 2);

    ReceptieSpital receptieSpital1 = new ReceptieSpital(medic1.salon1);
    receptieSpital1.interneazaPacient(pacient1);
    receptieSpital1.interneazaPacient(pacient2);
    receptieSpital1.interneazaPacient(pacient3);

}
