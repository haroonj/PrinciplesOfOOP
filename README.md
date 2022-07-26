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

### The Difference between Abstraction and Encapsulation

| ABSTRACTION                                                                                   | ENCAPSULATION                                                                                                                          |
|:----------------------------------------------------------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------|
| Abstraction is the process or method of gaining the information.                              | While encapsulation is the process or method to contain the information.                                                               |
| In abstraction, problems are solved at the design or interface level.                         | While in encapsulation, problems are solved at the implementation level.                                                               |
| Abstraction is the method of hiding the unwanted information.                                 | Whereas encapsulation is a method to hide the data in a single entity or unit along with a method to protect information from outside. |
| We can implement abstraction using abstract class and interfaces.                             | Whereas encapsulation can be implemented using by access modifier i.e. private, protected and public.                                  |
| In abstraction, implementation complexities are hidden using abstract classes and interfaces. | While in encapsulation, the data is hidden using methods of getters and setters.                                                       |

### Inheritance

It's a mechanism in which one object acquires all the properties and behaviors of a parent object.

The idea behind it that you can create new classes that are built upon existing classes, while having the ability to add
new methods and fields to the parent and child classes.

Terms we use with inheritance

* Super Class / Parent Class / Base Class : It's the class where other classes(Sub classes) inherit fields and methods
  from.
* SubClass / child Class : Subclass is a class which inherits the other class. It is also called a derived class,
  extended class.

Let's see an example,

User class act like the Super class, where the following two classes will inherit his field "name" and method

```java
package Inheritance;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

Admin and Client classes considered as a SubClasses

```java
package Inheritance;

public class Admin extends User {
    public String adminMethod() {
        return "doing some admin things";
    }
}
```

```java
package Inheritance;

public class Client extends User {
    public String clientMethod() {
        return "doing some client things";
    }
}
```

After inheriting the User class, both the Admin and Client classes will have the User fields, and in the same time they
can have their own fields and methods as shown in the example below.

```java
package Inheritance;

public class AdminClientTest {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Client client = new Client();

        admin.setName("Haroun");
        client.setName("Ahmad");

        System.out.println("this admin own method " + admin.adminMethod());
        System.out.println("this client own method " + client.clientMethod());

        System.out.println("this is the admin name " + admin.getName());
        System.out.println("this is the client name " + client.getName());
    }
}
```

And the output will be

```
this admin own method doing some admin things
this client own method doing some client things
this is the admin name Haroun
this is the client name Ahmad
```

### Polymorphism

is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly
and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

There are two types of polymorphism: compile-time polymorphism and runtime polymorphism. We can perform
polymorphism in java by method overloading and method overriding.

#### Runtime Polymorphism

Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at
runtime rather than compile-time.

In this process, an overridden method is called through the reference variable of a superclass. The determination of the
method to be called is based on the object being referred to by the reference variable.

For an example, we have the animal class "also it could be an abstract class or an interface" as a base class.

```java
package Polymorphism.RuntimePolymorphism;

public class Animal {
    public void makeSound() {
        System.out.println("Animal Sound");
    }
}
```

And we have the Cat and Dog subclasses, and as we saw the animal class have the "makeSound" method which we will be
overriding it int the following classes.

Here is the Cat class with his own "makeSound" method.

```java
package Polymorphism.RuntimePolymorphism;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
```

And the same for the Dog class.

```java
package Polymorphism.RuntimePolymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
```

let's test our design

```java
package Polymorphism.RuntimePolymorphism;

public class AnimalsTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Dog();
        animal.makeSound();
    }
}
```

The reference we have is of type animal, but by using the power of polymorphism when changing the refers to object since
we have overridden the methode we have a different output at each stage.

```
Animal Sound
Meow
Woof
```

#### Compile Time Polymorphism

Compile-time polymorphism is also known as static polymorphism or early binding. Compile-time polymorphism is a
polymorphism that is resolved during the compilation process. Overloading of methods is called through the reference
variable of a class. Compile-time polymorphism is achieved by method overloading and operator overloading.

It's kinda strait forward, and here is an example

```java
package Polymorphism.CompileTimePolymorphism;

public class EatingStatus {
    public void eat(String person) {
        System.out.println(person + " is eating");
    }

    public void eat(String person1, String person2) {
        System.out.println(person1 + " and " + person2 + " are eating");
    }
}
```

with a test class and it's output

```java
package Polymorphism.CompileTimePolymorphism;

public class EatingStatusTest {
    public static void main(String[] args) {
        EatingStatus eatingStatus = new EatingStatus();

        //with one person
        eatingStatus.eat("Haroun");

        //with two people
        eatingStatus.eat("Haroun", "Omar");
    }
}
```

```
Haroun is eating
Haroun and Omar are eating
```

## Terms used in Object-Oriented design

There are some other terms used when designing and evaluating OOP design and implementation.

### Coupling

refers to the knowledge or information or dependency of another class. It arises when classes are aware of
each other. If a class has the details' information of another class, there is strong coupling. In Java, we use
private, protected, and public modifiers to display the visibility level of a class, method, and field. You can use
interfaces for the weaker coupling because there is no concrete implementation.

### Cohesion

refers to the level of a component which performs a single well-defined task. A single well-defined task is done by a
highly cohesive method. The weakly cohesive method will split the task into separate parts. The java.io package is a
highly cohesive package because it has I/O related classes and interface. However, the java.util package is a weakly
cohesive package because it has unrelated classes and interfaces.

### Association

represents the relationship between the objects. Here, one object can be associated with one object or
many objects. There can be four types of association between the objects:

- One to One
- One to Many
- Many to One
- Many to Many

Let's understand the relationship with real-time examples. For example, One country can have one prime minister (one to
one), and a prime minister can have many ministers (one to many). Also, many MP's can have one prime minister (many to
one), and many ministers can have many departments (many to many).

Association can be unidirectional or bidirectional.

### Aggregation

Aggregation is a way to achieve Association. Aggregation represents the relationship where one object contains other
objects as a part of its state. It represents the weak relationship between objects. It is also termed as a has-a
relationship in Java. Like, inheritance represents the is-a relationship. It is another way to reuse objects.

### Composition

The composition is also a way to achieve Association. The composition represents the relationship where one object
contains other objects as a part of its state. There is a strong relationship between the containing object and the
dependent object. It is the state where containing objects do not have an independent existence. If you delete the
parent object, all the child objects will be deleted automatically.