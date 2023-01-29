package Interfaces;

public class CompanyEmployee implements Employee, Company{

    @Override
    public String getName() {
        return Employee.super.getName() + Company.super.getName();
    }
}
