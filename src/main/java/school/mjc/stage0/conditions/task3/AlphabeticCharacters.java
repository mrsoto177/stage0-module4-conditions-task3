package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
    	if ( character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ) {
    		System.out.println("Vowel");
    	} else {
    		System.out.println("Consonant");
    	}
    }
    
    public static void main(String[] args) {
    	AlphabeticCharacters determiner = new AlphabeticCharacters();
    	determiner.vowelDeterminer('r');
    	determiner.vowelDeterminer('a');
    }
}