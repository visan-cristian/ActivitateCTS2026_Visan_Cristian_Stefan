package ro.cts.ase.clase;

public class Trolebuz extends MijlocTransport{
    public Trolebuz(int numarRoti, String numarInmatriculare){
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere(){
        StringBuilder sb = new StringBuilder();
        sb.append("Trolebuzul are: Numar roti: ").append(super.numarRoti);
        sb.append("Numar inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(sb.toString());
    }
}
