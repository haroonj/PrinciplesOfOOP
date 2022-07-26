package Abstraction;

public class FuelCar implements Car {
    private String carType = "Fuel";

    @Override
    public void turnOnCar() {
        System.out.println("turn on the fuel car");
    }

    @Override
    public void turnOffCar() {
        System.out.println("turn off the fuel car");
    }

    @Override
    public String getCarType() {
        return carType;
    }
}