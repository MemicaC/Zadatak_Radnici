//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        RadnikFiksno radnikFiksno = new RadnikFiksno("Pero", "Peric", 2311965478934L, 5620990000055687L);
        RadnikPoDanu radnikPoDanu = new RadnikPoDanu("Marko", "Maric", 2311965478935L, 5620990000055688L);
        RadnikPoSatu radnikPoSatu = new RadnikPoSatu("Niko", "Nikic", 2311965478936L, 5620990000055689L);

        radnikFiksno.isplatiPlatu(31);
        radnikPoDanu.isplatiPlatu(10);
        radnikPoSatu.isplatiPlatu(5);
        }



}

