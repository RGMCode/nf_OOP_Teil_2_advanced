package RGMCode;

import java.util.Objects;

public class Tesla extends Vehicle{

    private int batterysize;

    public Tesla(int tireAmount, String brand, String model, int dateOfConstruction, int batterysize) {
        super(tireAmount, brand, model, dateOfConstruction);
        this.batterysize = batterysize;
    }

    @Override
    public void startEngine() {
//        super.startEngine();
        super.setEngineRunning(true);
        System.out.println("the tesla runs smoothly");
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "batterysize=" + batterysize +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tesla tesla = (Tesla) o;
        return batterysize == tesla.batterysize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batterysize);
    }
}
