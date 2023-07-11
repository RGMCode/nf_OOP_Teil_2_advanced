package RGMCode;

import java.util.Objects;

public class Vehicle implements CanAccelerate, Break {

    private int tireAmount;
    private boolean isEngineRunning = false;
    private String brand;
    private String model;
    private int dateOfConstruction;

    public Vehicle(int tireAmount, String brand, String model, int dateOfConstruction) {
        this.tireAmount = tireAmount;
        this.brand = brand;
        this.model = model;
        this.dateOfConstruction = dateOfConstruction;
    }

    public void startEngine(){
        isEngineRunning = true;
        System.out.println("the engine starts");
    }

    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("The engine stops");
    }

    public int getTireAmount() {
        return tireAmount;
    }

    public boolean isEngineRunning() {
        return isEngineRunning;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getDateOfConstruction() {
        return dateOfConstruction;
    }

    public void setTireAmount(int tireAmount) {
        this.tireAmount = tireAmount;
    }

    public void setEngineRunning(boolean engineRunning) {
        isEngineRunning = engineRunning;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDateOfConstruction(int dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tireAmount=" + tireAmount +
                ", isEngineRunning=" + isEngineRunning +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", dateOfConstruction=" + dateOfConstruction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return tireAmount == vehicle.tireAmount && isEngineRunning == vehicle.isEngineRunning && dateOfConstruction == vehicle.dateOfConstruction && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tireAmount, isEngineRunning, brand, model, dateOfConstruction);
    }

    @Override
    public boolean accelerate() {
        System.out.println("Did you ever hear a Vehicle accelerate?");
        return false;
    }

    @Override
    public void decelerate() {
        System.out.println("The Vehicle stopped");
    }

    @Override
    public void stepOnTheBreak() {
        System.out.println("Emergency Break");
    }
}
