package ro.ase.cts.clase;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private  int numarCamereOcupate;
    private static Hotel instance = null;

    private Hotel(String numeHotel, int numarCamere, int numarCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numarCamereOcupate;
    }

    public static synchronized Hotel getInstance(String numeHotel, int numarCamere, int numarCamereOcupate){
        if(instance == null){
            instance = new Hotel(numeHotel, numarCamere, numarCamereOcupate);
        }
        return instance;
    }

    public void rezervaCamera(){
        if(this.numarCamereOcupate < this.numarCamere){
            System.out.println("Rezervarea a fost realizata.");
            numarCamereOcupate++;
        }
        else{
            System.out.println("Nu mai exista camere disponibile.");
        }
    }

    public void afiseazaDetaliiHotel(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.numeHotel).append(this.numarCamere).append(numarCamereOcupate);
        System.out.println();
    }
}
