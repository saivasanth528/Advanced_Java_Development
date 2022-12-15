package Interfaces;

public interface Company {
    default String getName() {
        return "default:Company";
    }
}
