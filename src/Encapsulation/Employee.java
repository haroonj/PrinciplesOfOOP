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
