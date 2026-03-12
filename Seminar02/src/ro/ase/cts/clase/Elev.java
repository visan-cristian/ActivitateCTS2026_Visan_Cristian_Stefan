package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int VALOARE_FINANTARE_ELEV=30;

	public void setClasa(int i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}


	public Elev() {
		super();
	}

	public void afiseazaFinantare(){
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+VALOARE_FINANTARE_ELEV+" Euro/zi in proiect.");
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public static void setValoareFinantareElev(int valoareFinantareElev) {
		VALOARE_FINANTARE_ELEV = valoareFinantareElev;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Elev{");
		sb.append("clasa=").append(clasa);
		sb.append(", tutore='").append(tutore).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
