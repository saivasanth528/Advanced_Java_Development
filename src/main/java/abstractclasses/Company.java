package abstractclasses;

public class Company {
    public static void main(String[] args) {
        HR hr = new HR();
        hr.hire(new SalariedEmployee("Alex"));
        hr.hire(new HourlyEmployee("Barney"));
        hr.hire(new SalariedEmployee("Ram", 400000));
        hr.hire(new HourlyEmployee("Krishna", 500));
//        hr.printEverybody();
        hr.payEverybody();
    }
}