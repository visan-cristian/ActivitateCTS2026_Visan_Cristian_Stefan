package ro.cts.ase.main;

import ro.cts.ase.builder.Internare;
import ro.cts.ase.builder.InternareBuilder;
import ro.cts.ase.builder.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args){
        Internare internare = new Internare(true, false, true, true, "Mihai Popescu");
        Internare internare2 = new Internare (false, false, false, false, "Ana Maria");
        InternareBuilder builder = new InternareBuilder("Ana Pop");
        Internare internare3 = builder.build();
        Internare internare4 = builder.setNume("Andrei Matei").setPat(true).setPapuci(true).setHalat(true).build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ("Popescu Ion");
        builderAlternativ.setMicDejun(true);
        Internare internare101 = builderAlternativ.build("Georgescu Ion");
        Internare internare102 = builderAlternativ.build("Petre Maria");
        Internare internare103 = builderAlternativ.build("Nicolae");

        internare101.setNumePacient("Popescu Ionel");
        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());
    }
}
