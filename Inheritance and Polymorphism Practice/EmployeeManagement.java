import java.util.ArrayList;
import java.util.List;

abstract class Employee {

    private int id;
    private String name;
    protected double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public void displayDetails() {
        System.out.println("---------------------------");
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Salary  : " + salary);
        System.out.println("Bonus   : " + calculateBonus());
    }
}

class Developer extends Employee {

    public Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Tester extends Employee {

    public Tester(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.08;
    }
}

class Manager extends Employee {

    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Developer(101, "John", 50000));
        employees.add(new Tester(102, "David", 40000));
        employees.add(new Manager(103, "Sarah", 80000));

        double totalBonus = 0;

        for (Employee emp : employees) {

            emp.displayDetails();

            totalBonus += emp.calculateBonus();
        }

        System.out.println("---------------------------");
        System.out.println("Total Bonus Paid = " + totalBonus);
    }
}
