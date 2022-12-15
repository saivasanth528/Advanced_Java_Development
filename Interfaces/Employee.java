package Interfaces;

public interface Employee {
    default String getName() {
        return "default:Employee";
    }
}
