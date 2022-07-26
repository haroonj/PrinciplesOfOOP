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

```java
package Abstraction;

public interface Car {
    void turnOnCar();

    void turnOffCar();

    String getCarType();
}
```

And then implement this interface,

Fuel Car

```java
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
```

Electric Car

```java
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
```

Now let's test our program where we use the Car functions.

```java
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
```

The client only know and have access to what the Car interface provides, the internal details are hidden from him.

```
Fuel
turn on the fuel car
Electric
turn on the electric car
turn off the fuel car
turn off the electric car
```

### Encapsulation

It's a method of making a complex system easier to handle for end users. The user need not worry about internal details
and complexities of the system.
By restricting the access by only needed public methods like accessors and necessary methods.

It provides you control over the data, like giving constraints over sitting the data or even make the data read-only.
Making the class like a capsule; packaged, more secured and easy to test.

A simple example of Encapsulation.
Let's say we have an employee, that have salary and position.

```java
package Encapsulation;

public class Employee {
    private double salary;
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        if (salary >= 2400) {
            this.salary = salary;
        } else {
            System.out.println("the minimum salary is 2400");
        }
    }

    public double getSalary() {
        return salary;
    }
}
```

We can access the position field only using the accessors, and we put some logic on the salary setter acting like a
role, and we could make it throw an exception or set a default value.

```java
package Encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setPosition("Junior Java Developer");
        System.out.println(employee.getPosition());

        //it won't set it, because it's less than the minimum salary
        employee.setSalary(1500);

        employee.setSalary(10000);
        System.out.println(employee.getSalary());
    }
}
```

Console output will be

```
Junior Java Developer
the minimum salary is 2400
10000.0
```

## The Difference between Abstraction and Encapsulation

| ABSTRACTION                                                                                   | ENCAPSULATION                                                                                                                          |
|:----------------------------------------------------------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------|
| Abstraction is the process or method of gaining the information.                              | While encapsulation is the process or method to contain the information.                                                               |
| In abstraction, problems are solved at the design or interface level.                         | While in encapsulation, problems are solved at the implementation level.                                                               |
| Abstraction is the method of hiding the unwanted information.                                 | Whereas encapsulation is a method to hide the data in a single entity or unit along with a method to protect information from outside. |
| We can implement abstraction using abstract class and interfaces.                             | Whereas encapsulation can be implemented using by access modifier i.e. private, protected and public.                                  |
| In abstraction, implementation complexities are hidden using abstract classes and interfaces. | While in encapsulation, the data is hidden using methods of getters and setters.                                                       |
