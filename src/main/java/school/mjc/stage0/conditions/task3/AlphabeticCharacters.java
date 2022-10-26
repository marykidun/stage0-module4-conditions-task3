package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public static void vowelDeterminer(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' )
            System.out.println("Vowel");
        else if (!(character >= 'a' && character <= 'z'))
            System.out.println("wrong alphabet!");
        else
            System.out.println("Consonant");
    }
    public static void main(String[] args) {
        vowelDeterminer('a');
    }
}
