package test;

import org.junit.Assert;
import org.junit.Test;

import morseCode.vocabulary;

public class morseTest {
    @Test
    public void returnEnglishCharacter() {
        vocabulary.initializeVocabulary();
        char result = vocabulary.vocabMorseEng.get("*-");
        char expected = 'a';
        Assert.assertEquals(expected, result);
    }

    @Test
    public void returnMorseCharacter() {
        vocabulary.initializeVocabulary();
        String result = vocabulary.vocabEngMorse.get('q');
        String expected = "--*-";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void returnEnglishWord() {
        vocabulary.initializeVocabulary();
        String expected = "bubba";
        String result = morseCode.methods.translateMorseToEng("-*** **- -*** -*** *-");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void returnMorseWord() {
        vocabulary.initializeVocabulary();
        String expected = "-*** **- -*** -*** *-";
        String result = morseCode.methods.translateEngToMorse("bubba");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void returnMorseSentence() {
        vocabulary.initializeVocabulary();
        String expected = "-- -*--    -* *- -- *    ** ***    -*** **- -*** -*** *- *-*-*-";
        String result = morseCode.methods.translateEngToMorse("my name is bubba.");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void returnEnglishSentence() {
        vocabulary.initializeVocabulary();
        String expected = "my name is bubba.";
        String result = morseCode.methods
                .translateMorseToEng("-- -*--    -* *- -- *    ** ***    -*** **- -*** -*** *- *-*-*-");
        Assert.assertEquals(expected, result);
    }
}
