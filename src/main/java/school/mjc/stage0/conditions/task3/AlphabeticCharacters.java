package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'q' ||  character == 'w' ||  character == 'e' ||  character == 'r' ||  character == 't' ||  character == 'y' ||  character == 'u' || character == 'o' ||  character == 'b' ){
            System.out.println("Vowel");
        } else if (character == 'Q' || character == 'W' || character == 'E' || character == 'R' || character == 'T' || character == 'Y' || character == 'U' || character == 'O' || character == 'B') {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
