package oops.SOLID.openClosePrinciple.before.employees;

public class PartTimeEmployee extends Employee, TaxCalculator implements IEducation {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
        INCOME_TAX_PERCENTAGE = 20;
        PROFESSIONAL_TAX_PERCENTAGE = 3;
        EDUCATION_TAX_PERCENTAGE=1;
    }
    
    @Override
    public double calculate(Employee employee) {
        return 
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 + (employee.getMonthlyIncome() * EDUCATION_TAX_PERCENTAGE) / 100
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;

    }
