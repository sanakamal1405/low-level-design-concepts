package oops.SOLID.openClosePrinciple.before.employees;

public class Intern extends Employee, TaxCalculator {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
        INCOME_TAX_PERCENTAGE = 15;
        
    }
    
    @Override
    public double calculate(Employee employee) {
        
        if((employee.getMonthlyIncome() * 12) < 300000)
            return 0.0d;
        else{
        return 
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;}

    }
    
    
}
