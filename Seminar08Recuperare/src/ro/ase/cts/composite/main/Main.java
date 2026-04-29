package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Departament;
import ro.ase.cts.composite.clase.Sectie;
import ro.ase.cts.composite.clase.Structura;

public class Main {
    static void main(String[] args){
        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie("Secretariat", 20);
        Structura sectieManagement = new Sectie("Management", 14);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura();

        ((Departament) depSpital).stergeStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieManagement);
        System.out.println("Dupa modificare:\n");
        depSpital.afiseazaDetaliiStructura(" ");

    }
}
