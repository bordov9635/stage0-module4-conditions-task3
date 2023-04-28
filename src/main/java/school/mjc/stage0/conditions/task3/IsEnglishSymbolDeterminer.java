package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (symbol == 'q' || symbol == 'Q' || symbol == 'w' || symbol == 'W' || symbol == 'e' || symbol == 'E' || symbol == 'r' || symbol == 'R' || symbol == 't' || symbol == 'T' || symbol == 'y' || symbol == 'Y' || symbol == 'u' || symbol == 'U'){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
