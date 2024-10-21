public class Radnik {
protected String ime;
protected String prezime;
protected long jmbg;
protected long ziroRacun;
protected float plata;

    public Radnik(String ime, String prezime, long jmbg, long ziroRacun, float plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;
        this.plata = plata;
    }
    public void isplatiPlatu(){
        System.out.println(ime+" "+prezime+" "+plata);

    }

    @Override
    public String toString() {
        return "Radnik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg=" + jmbg +
                ", ziroRacun=" + ziroRacun +
                ", plata=" + plata +
                '}';
    }
}

