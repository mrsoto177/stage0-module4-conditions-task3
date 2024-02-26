package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
    	
    	if (month <= 3 || month == 12) {
    		System.out.println("Winter");	
    	}
    	
    	if(month >= 4 && month <= 6 ) {
			System.out.println("Spring");
		}
		
		if(month >= 7 && month <= 9 ) {
			System.out.println("Summer");
		}
		
		if(month >= 10 && month <= 11 ) {
			System.out.println("Fall");
		}
		
		if (month > 12) {
			System.out.println("wrong number!");
		}

    }
    
    public static void main(String[] args) {
    	Seasons seasons = new Seasons();
    	seasons.tellTheSeasonByMonthNumber(2);
    	seasons.tellTheSeasonByMonthNumber(5);
    	seasons.tellTheSeasonByMonthNumber(8);
    	seasons.tellTheSeasonByMonthNumber(10);
    	seasons.tellTheSeasonByMonthNumber(14);
    	
    }
}
