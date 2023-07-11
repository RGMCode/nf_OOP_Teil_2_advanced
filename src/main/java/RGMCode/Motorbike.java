package RGMCode;

import java.util.Objects;

public class Motorbike extends Vehicle{
    boolean wearHelmet;

    boolean isWeatherGood;

    public Motorbike(int tireAmount, String brand, String model, int dateOfConstruction, boolean wearHelmet, boolean isWeatherGood) {
        super(tireAmount, brand, model, dateOfConstruction);
        this.wearHelmet = wearHelmet;
        this.isWeatherGood = isWeatherGood;
    }



    @Override
    public String toString() {
        return "Motorbike{" +
                "wearHelmet=" + wearHelmet +
                ", isWeatherGood=" + isWeatherGood +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorbike motorbike = (Motorbike) o;
        return wearHelmet == motorbike.wearHelmet && isWeatherGood == motorbike.isWeatherGood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wearHelmet, isWeatherGood);
    }

    @Override
    public boolean accelerate() {
        System.out.println("tatttttattatttaaaattttttta");
        return true;
    }

    @Override
    public void decelerate() {
        System.out.println("tttttatatatatatatatat Vehicle stopped");
    }

    @Override
    public void stepOnTheBreak() {
        System.out.println("qqqqqquiiiiiiiiitsch Emergancy break");
    }
}
