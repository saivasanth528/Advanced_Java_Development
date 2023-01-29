package Generics.wildCards;



public class Salaried extends Employee {
    private static final double DEFAULT_SALARY = 10000;
    private double salary = DEFAULT_SALARY;
    public Salaried(String name) {
        this(name, DEFAULT_SALARY);
    }

    public Salaried(String name, double salary) {
        super(name);
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Salaried{" +
                "salary=" + salary +
                '}';
    }
}
