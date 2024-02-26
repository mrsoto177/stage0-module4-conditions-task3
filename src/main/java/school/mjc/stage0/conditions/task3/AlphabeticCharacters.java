package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
    	if ( character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ) {
    		System.out.println("Vowel");
    	} else if ((character >= 'a' && character <= 'z')) {
    		
    		System.out.println("Consonant");
    	}
    	else {
    		System.out.println("It is not a number");
    	}
    }
    
    public static void main(String[] args) {
    	AlphabeticCharacters determiner = new AlphabeticCharacters();
    	determiner.vowelDeterminer('t');
    	determiner.vowelDeterminer('a');
    	determiner.vowelDeterminer('2');
    }
}