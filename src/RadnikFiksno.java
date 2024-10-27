public class RadnikFiksno extends Radnik{

    public RadnikFiksno(String ime, String prezime, long jmbg, long ziroRacun) {
        super(ime, prezime, jmbg, ziroRacun);
    }
    public void isplatiPlatu(int brDanauMjesecu) {
        float plata = brDanauMjesecu * satnica;
        System.out.println(ime + " " + prezime + " " + plata+" €");
    }
}

