package abstractclasses;

public class SalariedEmployee extends Employee {
    public static final double DEFAULT_SALARY = 120000;

    private double salary = DEFAULT_SALARY;

    public SalariedEmployee() {}

    public SalariedEmployee(String name) {
        this(name, DEFAULT_SALARY);
    }

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary / 12;
    }
}
