class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void giveRaise(double amount) {
        this.salary += amount;
        System.out.println(name + " now earns " + salary);
    }
}

public class OOPS_example {
    public static void main(String[] args) {
        Employee emp = new Employee("Amritesh", 50000);
        emp.giveRaise(5678);
    }
}
