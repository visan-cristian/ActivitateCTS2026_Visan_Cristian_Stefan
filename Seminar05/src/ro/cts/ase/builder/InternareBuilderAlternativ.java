package ro.cts.ase.builder;

public class InternareBuilderAlternativ implements InternareBuilderAbstractA{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;
    private String numePacient;

    public InternareBuilderAlternativ() {
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuci = false;
        this.halat = false;
    }

    public InternareBuilderAlternativ(String numePacient) {
        this.numePacient = numePacient;
    }

    public InternareBuilderAlternativ setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilderAlternativ setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public InternareBuilderAlternativ setPapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public InternareBuilderAlternativ setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }

    public InternareBuilderAlternativ setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    @Override
    public Internare build(String nume){
        Internare internare = new Internare(this.patRabatabil, this.micDejun, this.papuci, this.halat, nume);
        return internare;
    }
}
