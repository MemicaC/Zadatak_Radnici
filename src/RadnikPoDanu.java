public class RadnikPoDanu extends Radnik{

    public RadnikPoDanu(String ime, String prezime, long jmbg, long ziroRacun) {
        super(ime, prezime, jmbg, ziroRacun);
    }
    public void isplatiPlatu(int brDana){
        float plata=brDana*8*satnica;
        System.out.println(ime+" "+prezime+" "+plata+" €");


    }
    }

