package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
    	
    	if ( first % second  == 0) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
    
    public static void main(String[] args) {
    	AliquotNumbers aliquot = new AliquotNumbers();
    	int first = 40;
    	int second = 20;
    	aliquot.isFirstAliquot(first, second);
    	aliquot.isFirstAliquot(23, 32);
    }
}
