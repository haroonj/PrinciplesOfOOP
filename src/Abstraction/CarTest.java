package Abstraction;

public class CarTest {
    public static void main(String[] args) {
        Car fuelCar = new FuelCar();
        Car electricCar = new ElectricCar();

        System.out.println(fuelCar.getCarType());
        fuelCar.turnOnCar();

        System.out.println(electricCar.getCarType());
        electricCar.turnOnCar();

        fuelCar.turnOffCar();
        electricCar.turnOffCar();
    }
}
