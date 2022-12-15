package Generics.wildCards;

import java.util.List;
import java.util.function.Predicate;

public class HR {

    public static void printEmployeeNames(List<Employee> employees) {
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

    }

    /*
        Here ? is a wild card employee, it doesn't care about the type as long as it is
        the child of Employee class.
        But the side effect is we can't modify the employee list here because it don't know
        which one to add.
     */
    public static void printSalariedEmployees(List<? extends Employee> employees) {
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public static void printFilteredEmployee(List<? extends Employee> employees,
            Predicate<? super Employee> predicate) {
        for(Employee e: employees) {
            if (predicate.test(e)) {
                System.out.println(e.getName());
            }
        }
    }


}
