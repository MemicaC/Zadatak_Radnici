//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RadnikFiksno radnikFiksno = new RadnikFiksno("Pero", "Peric", 2311965478934L, 5620990000055687L, 1000);
        RadnikPoDanu radnikPoDanu = new RadnikPoDanu("Marko", "Maric", 2311965478935L, 5620990000055688L, 100);
        RadnikPoSatu radnikPoSatu = new RadnikPoSatu("Niko", "Nikic", 2311965478936L, 5620990000055689L, 50);
        radnikFiksno.isplatiPlatu();
        radnikPoDanu.isplatiPlatu();
        radnikPoSatu.isplatiPlatu();
        }

    }
