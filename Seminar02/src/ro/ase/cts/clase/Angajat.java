package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int VALOARE_FINANTARE_ANGAJAT=10;

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat() {
		super();
		
	}

	public void afiseazaFinantare(){
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+VALOARE_FINANTARE_ANGAJAT+" Euro/zi in proiect.");
	}

	public static void setValoareFinantareAngajat(int valoareFinantareAngajat) {
		VALOARE_FINANTARE_ANGAJAT = valoareFinantareAngajat;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Angajat{");
		sb.append("ocupatie='").append(ocupatie).append('\'');
		sb.append(", salariu=").append(salariu);
		sb.append('}');
		return sb.toString();
	}
}
