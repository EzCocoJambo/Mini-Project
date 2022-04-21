import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] letters = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

        String[] morseLetters = { " ", ".-", "-...", "-.-.", "-..", ".", "..-..", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
                "-..-", "-.--", "--..", ".----", "..---", "...--",
                "....-", ".....", "-....", "--...", "---..", "----.",
                "-----" };

        String textToChange;
        String newText = "";
        System.out.println("Enter text you want to change to Morse code");
        textToChange = input.nextLine();

        textToChange = textToChange.toLowerCase();

        for (int i = 0; i < textToChange.length(); i++) {
            for (short j = 0; j < letters.length; j++) {
                if (textToChange.charAt(i) == letters[j]) {
                    newText += morseLetters[j];
                    if (letters[j] != ' ')
                        newText += " ";
                    break;
                }
            }
        }

        System.out.println("Text in Morse Code: ");
        System.out.println(newText);

        String codeToChange;
        String decodedText = "";
        System.out.println("Enter Morse code you want to change to Text");
        codeToChange = input.nextLine();

        String[] codes = codeToChange.split(" ");
        for (int i = 0; i < codes.length; i++) {
            for (int j = 0; j < morseLetters.length; j++) {
                if (codes[i].equals(morseLetters[j])) {
                    decodedText += letters[j];
                    break;
                }
            }
            if (codes[i].equals("")) {
                decodedText += " ";
            }
        }
        System.out.println("Morse Code in Text: ");
        System.out.println(decodedText);
    }
}
