package Polymorphism.CompileTimePolymorphism;

public class EatingStatus {
    public void eat(String person) {
        System.out.println(person + " is eating");
    }

    public void eat(String person1, String person2) {
        System.out.println(person1 + " and " + person2 + " are eating");
    }
}
