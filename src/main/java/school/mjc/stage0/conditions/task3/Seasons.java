package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
    	
    	if (month <= 3 || month == 12) {
    		System.out.print("Winter");	
    	}
    	
    	if(month >= 4 && month <= 6 ) {
			System.out.print("Spring");
		}
		
		if(month >= 7 && month <= 9 ) {
			System.out.print("Summer");
		}
		
		if(month >= 10 && month <= 11 ) {
			System.out.print("Fall");
		}
		
		if (month > 12) {
			System.out.print("wrong number!");
		}

    }
    
    public static void main(String[] args) {
    	Seasons seasons = new Seasons();
    	int monthNumber = 10;
    	seasons.tellTheSeasonByMonthNumber(monthNumber);
    }
}
