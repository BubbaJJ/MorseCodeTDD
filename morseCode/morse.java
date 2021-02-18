package morseCode;

import java.util.Scanner;

public class morse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // boolean for running program multiple times.
        boolean active = true;
        // boolean for controlling chosen language.
        boolean validChoice = false;
        // Initiating vocabulary
        vocabulary.initializeVocabulary();

        while (active) {
            System.out.println("Do you want to enter English or Morse code?");
            String answer = sc.nextLine();

            validChoice = (answer.equalsIgnoreCase("English") || answer.equalsIgnoreCase("Morse")) ? true : false;

            if (validChoice) {
                System.out.println("Enter word:");
                // set entire string to lowercase for easier conversion.
                String wordToDecode = sc.nextLine().toLowerCase();

                if (answer.equalsIgnoreCase("English")) {
                    System.out.println(methods.translateEngToMorse(wordToDecode));
                } else {
                    System.out.println(methods.translateMorseToEng(wordToDecode));
                }
            }

            System.out.println("Run it again? (Y/N)");
            String choice = sc.nextLine();
            active = choice.equalsIgnoreCase("Y") ? true : false;
        }
        // method to clear console in VSCode.
        methods.clearConsole();
        sc.close();
    }
}