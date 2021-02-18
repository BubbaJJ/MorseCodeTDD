package morseCode;

import java.util.StringJoiner;

public class methods {

    public static String translateEngToMorse(String word) {
        String result = "";
        try {
            // convert to charArray for easier iteration.
            char[] charArray = word.toCharArray();
            StringJoiner sj = new StringJoiner("");

            for (char c : charArray) {
                // if c is a space, add 3 spaces to separate words in morse.
                if (c == ' ') {
                    sj.add("   ");
                }
                // if invalid character is found, abort conversion and return error message.
                else if (vocabulary.vocabEngMorse.get(c) == null) {
                    result = "Invalid characters found.";
                    return result;
                } else {
                    sj.add(vocabulary.vocabEngMorse.get(c) + " ");
                }
            }
            // convert StringJoiner to a string.
            String tempResult = sj.toString();
            // remove space added in last iteration.
            result = tempResult.substring(0, tempResult.length() - 1);
        } catch (Exception e) {
            result = e.getMessage();
        }
        return result;
    }

    public static String translateMorseToEng(String word) {
        String result = "";
        try {
            String[] stringArray = word.split(" ", 0);
            StringBuffer sb = new StringBuffer();
            for (String s : stringArray) {
                // if s is empty and previous character was a space, move to next character.
                if (s.isEmpty() && sb.charAt(sb.length() - 1) == ' ') {
                    continue;
                }
                // if s is empty, insert space to separate words.
                else if (s.isEmpty()) {
                    sb.append(' ');
                }
                // if invalid character is found, abort conversion and return error message.
                else if (vocabulary.vocabMorseEng.get(s) == null) {
                    result = "Invalid characters found.";
                    return result;
                } else {
                    sb.append(vocabulary.vocabMorseEng.get(s));
                }
            }
            // convert StringBuffer to a string.
            result = sb.toString();
        } catch (Exception e) {
            System.out.println(e);
            result = e.getMessage();
        }
        return result;
    }

    // Clears VSCode terminal
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
