package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
    	if (month == 1 ) {
    		System.out.println("January");
    	} else if (month == 2 ) { 
    		System.out.println("Februry");
    		} else if (month == 3 ) { 
        		System.out.println("March");
        		} else if (month == 4 ) { 
            		System.out.println("April");
            		} else if (month == 5 ) { 
                		System.out.println("May");
            		} else if (month == 6 ) { 
                		System.out.println("June");
            		} else if (month == 7 ) { 
                		System.out.println("July");
            		} else if (month == 8 ) { 
                		System.out.println("August");
            		} else if (month == 9 ) { 
                		System.out.println("September");
            		} else if (month == 10 ) { 
                		System.out.println("October");
            		} else if (month == 11 ) { 
                		System.out.println("November");
            		} else if (month == 12 ) { 
                		System.out.println("December");
            		} else {
            			System.out.println("wrong number!");
            		}
    }
    
    public static void main(String[] args) {
    	DaysInMonthPrinter dayMonth = new DaysInMonthPrinter();
    	dayMonth.amountOfDays(1);
    	dayMonth.amountOfDays(2);
    	dayMonth.amountOfDays(3);
    	dayMonth.amountOfDays(4);
    	dayMonth.amountOfDays(5);
    	dayMonth.amountOfDays(6);
    	dayMonth.amountOfDays(7);
    	dayMonth.amountOfDays(8);
    	dayMonth.amountOfDays(9);
    	dayMonth.amountOfDays(10);
    	dayMonth.amountOfDays(11);
    	dayMonth.amountOfDays(12);
    	dayMonth.amountOfDays(13);
    }
}
