package morseCode;

import java.util.HashMap;

public class vocabulary {
    public static HashMap<Character, String> vocabEngMorse;
    public static HashMap<String, Character> vocabMorseEng;

    public static void initializeVocabulary() {
        vocabEngMorse = new HashMap<Character, String>();
        vocabEngMorse.put(' ', " ");
        vocabEngMorse.put('a', "*-");
        vocabEngMorse.put('b', "-***");
        vocabEngMorse.put('c', "-*-*");
        vocabEngMorse.put('d', "-**");
        vocabEngMorse.put('e', "*");
        vocabEngMorse.put('f', "**-*");
        vocabEngMorse.put('g', "--*");
        vocabEngMorse.put('h', "****");
        vocabEngMorse.put('i', "**");
        vocabEngMorse.put('j', "*---");
        vocabEngMorse.put('k', "-*-");
        vocabEngMorse.put('l', "*-**");
        vocabEngMorse.put('m', "--");
        vocabEngMorse.put('n', "-*");
        vocabEngMorse.put('o', "---");
        vocabEngMorse.put('p', "*--*");
        vocabEngMorse.put('q', "--*-");
        vocabEngMorse.put('r', "*-*");
        vocabEngMorse.put('s', "***");
        vocabEngMorse.put('t', "-");
        vocabEngMorse.put('u', "**-");
        vocabEngMorse.put('v', "***-");
        vocabEngMorse.put('w', "*--");
        vocabEngMorse.put('x', "-**-");
        vocabEngMorse.put('y', "-*--");
        vocabEngMorse.put('z', "--**");
        vocabEngMorse.put('0', "-----");
        vocabEngMorse.put('1', "*----");
        vocabEngMorse.put('2', "**---");
        vocabEngMorse.put('3', "***--");
        vocabEngMorse.put('4', "****-");
        vocabEngMorse.put('5', "*****");
        vocabEngMorse.put('6', "-****");
        vocabEngMorse.put('7', "--***");
        vocabEngMorse.put('8', "---**");
        vocabEngMorse.put('9', "----*");
        vocabEngMorse.put('å', "*--*-");
        vocabEngMorse.put('ä', "*-*-");
        vocabEngMorse.put('á', "*--*-");
        vocabEngMorse.put('é', "**-**");
        vocabEngMorse.put('ñ', "--*--");
        vocabEngMorse.put('ö', "---*");
        vocabEngMorse.put('ü', "**--");
        vocabEngMorse.put('.', "*-*-*-");
        vocabEngMorse.put(',', "--**--");
        vocabEngMorse.put('?', "**--**");

        // Reverse Hashmap
        vocabMorseEng = new HashMap<String, Character>();
        for (char c : vocabEngMorse.keySet()) {
            vocabMorseEng.put(vocabEngMorse.get(c), c);
        }

    }

}
