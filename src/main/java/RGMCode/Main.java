package RGMCode;

public class Main {
    public static void main(String[] args) {

        Tesla marvinsTesla = new Tesla(4,"Tesla", "S",2023, 20000);

        System.out.println(marvinsTesla.toString());
        marvinsTesla.startEngine();
        marvinsTesla.stopEngine();

        Motorbike sarasMotorbike = new Motorbike(2,"Kawasaki", "Ninja", 2023,true,true);
        sarasMotorbike.startEngine();
        sarasMotorbike.stopEngine();

    }
}