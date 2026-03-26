package ro.ase.cts.Prototype.main;

import ro.ase.cts.Prototype.clase.Rezervare;
import ro.ase.cts.Prototype.clase.RezervareAbstracta;

public class Main {
    static void main(String[] args){
        RezervareAbstracta rez1 = new Rezervare("Gica", 20, 20, "0788888888");
        RezervareAbstracta rez2 = rez1.clone();

        ((Rezervare)rez2).setOraRezervare(10);
        ((Rezervare)rez2).setZiuaRezervarii(10);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
