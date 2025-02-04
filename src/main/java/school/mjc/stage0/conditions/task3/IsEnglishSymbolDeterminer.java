package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
    	if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')) {
            System.out.println("English");
        } else if ((symbol != 'a' && symbol != 'z') || (symbol != 'A' && symbol != 'Z')) {
            System.out.println("Non English");
        } 
    }
    
    public static void main(String[] args) {
    	IsEnglishSymbolDeterminer symbol = new IsEnglishSymbolDeterminer();
    	symbol.isEnglishSymbol('{');
    	symbol.isEnglishSymbol('e');
    	symbol.isEnglishSymbol('2');
    }
}
