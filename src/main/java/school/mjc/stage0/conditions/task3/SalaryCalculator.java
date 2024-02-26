package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
    	if (salary < 0) {
    		System.out.println("wrong input!");
    	}
    	double taxes;
    	if (salary <= 10000) {
    		taxes = 0.15;
    		double salaryAfterTaxes = salary - (taxes*salary);
    		System.out.println("Salary after Taxes = " + (salaryAfterTaxes));
    	}
    	
    	if (salary <= 20000) {
    		taxes = 0.18;
    		double salaryAfterTaxes = salary - (taxes*salary);
    		System.out.println("Salary after Taxes = " + (salaryAfterTaxes));
    	}
    	if (salary > 20000) {
    		taxes = 0.20;
    		double salaryAfterTaxes = salary - (taxes*salary);
    		System.out.println("Salary after Taxes = " + (salaryAfterTaxes));
    	}
    	
    	
    	
    }
    
    public static void main(String[] args) {
    	SalaryCalculator calculator = new SalaryCalculator();
    	int salary = -100000;
    	calculator.calculateSalary(salary);
    }
}
