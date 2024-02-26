package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
    	
    	double taxes;
    	
    	if (salary <= 10000 && salary > 0) {
    		taxes = 0.15;
    		double salaryAfterTaxes = salary - (taxes*salary);
    		System.out.println("Salary after Taxes = " + (salaryAfterTaxes));
    	}
    	
    	else if (salary <= 20000 && salary > 0) {
    		taxes = 0.18;
    		double salaryAfterTaxes = salary - (taxes*salary);
    		System.out.println("Salary after Taxes = " + (salaryAfterTaxes));
    	}
    	else if (salary > 20000 && salary > 0) {
    		taxes = 0.20;
    		double salaryAfterTaxes = salary - (taxes*salary);
    		System.out.println("Salary after Taxes = " + (salaryAfterTaxes));
    	}
    	
    	else if(salary <= 0) {
    		System.out.println("wrong input!");
    	}
    	
    	
    }
    
    public static void main(String[] args) {
    	SalaryCalculator calculator = new SalaryCalculator();
    	calculator.calculateSalary(8000);
    	calculator.calculateSalary(16000);
     	calculator.calculateSalary(21000);
    	calculator.calculateSalary(-6000);
    	
    }
}
