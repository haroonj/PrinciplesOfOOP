# Principles Of Object-Oriented Programming

Designing and implementing software is an art, and part of the art is oop,
where you represent your design and logic in a fancy way.

OOP design making is just like art, it could be simple or complex but at the end it is so beautiful.

OOP have so many concepts and principles, but the four most important ones called :

## The Four Pillars of OOP

There are four major principles that any OOP design had to have. These are Abstraction, Encapsulation, Polymorphism and
Inheritance.

### Abstraction

It's the act of hiding and handling the unnecessary details from the user,
by selecting specific data and methods to be exposed without the need of knowing the underlying complexity or details.

Let's take the car as an example, you can use your car without the need of knowing exactly what is the internal
component,
or even how it's connected to each other and how it works.

````java
package Abstraction;

public interface Car {
    void turnOnCar();

    void turnOffCar();

    String getCarType();
}
````

And then implement this interface,

Fuel Car

````java
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
````

Electric Car

````java
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
````

Now let's test our program where we use the Car functions.

````java
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
````

The client only know and have access to what the Car interface provides, the internal details are hidden from him.

````
Fuel
turn on the fuel car
Electric
turn on the electric car
turn off the fuel car
turn off the electric car
````

### Encapsulation

It's the act of hiding and handling the unnecessary details from the user, By restricting the access by only needed
public methods like accessors and necessary methods.


