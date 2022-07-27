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

