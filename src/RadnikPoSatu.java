public class RadnikPoSatu extends Radnik {
    public RadnikPoSatu(String ime, String prezime, long jmbg, long ziroRacun) {
        super(ime, prezime, jmbg, ziroRacun);
    }

    public void isplatiPlatu(int brSati) {
        float plata = brSati * satnica;
        System.out.println(ime + " " + prezime + " " + plata +" €");
    }
}
