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
