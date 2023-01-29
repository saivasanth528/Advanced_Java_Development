package Generics.wildCards;

import java.util.Arrays;
import java.util.List;



public class HRDemo {
    public static void main(String args[]) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Ram"), new Employee("sam"),
                new Employee("Tony"), new Employee("cap")
        );

        List<Salaried> salaried = Arrays.asList(
                new Salaried("Vision"), new Salaried("Wanda"),
                new Salaried("Hulk"), new Salaried("Hawkeye")
        );

        System.out.println(employeeList);
        HR.printEmployeeNames(employeeList);
//        HR.printEmployeeNames(salaried);
        System.out.println("Printing Salaried Employees");
        HR.printSalariedEmployees(salaried);
        System.out.println("Predicate Filtering");
        HR.printFilteredEmployee(employeeList,
                e -> e.toString().length() % 2 == 0);

        // PECS --> Producer Uses Extends, Consumer uses Super

    }




}
