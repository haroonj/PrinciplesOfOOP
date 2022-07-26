package Abstraction;

public class ElectricCar implements Car {
    private String carType = "Electric";

    @Override
    public void turnOnCar() {
        System.out.println("turn on the electric car");
    }

    @Override
    public void turnOffCar() {
        System.out.println("turn off the electric car");
    }

    @Override
    public String getCarType() {
        return carType;
    }
}