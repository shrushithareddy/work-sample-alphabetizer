package alphabetizer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlphabetizerTest {

    @Test
    void testAlphabetizeVirginiaTech() {
        String input = "VirginiaTech";
        String expected = "aceghiiinrTV";
        String actual = Alphabetizer.alphabetize(input);
        assertEquals(expected, actual);
    }

    @Test
    void testAlphabetizeBlindMice() {
        String input = "3 Blind Mice";
        String expected = "BcdeiilMn";
        String actual = Alphabetizer.alphabetize(input);
        assertEquals(expected, actual);
    }

    @Test
    void testAlphabetizeMixedCase() {
        String input = "heHehHH";
        String expected = "eehHhHH";
        String actual = Alphabetizer.alphabetize(input);
        assertEquals(expected, actual);
    }

    @Test
    void testAlphabetizeWithNonAlphabetic() {
        String input = "123 ABC abc 456";
        String expected = "AaBbCc";
        String actual = Alphabetizer.alphabetize(input);
        assertEquals(expected, actual);
    }

    @Test
    void testAlphabetizeWithSpecialChars() {
        String input = "Hello!!! World???";
        String expected = "deHllloorW";
        String actual = Alphabetizer.alphabetize(input);
        assertEquals(expected, actual);
    }

    @Test
    void testAlphabetizeEmptyString() {
        String input = "";
        String expected = "Please enter a valid string containing alphabetic characters.";
        String actual = Alphabetizer.alphabetize(input);
        assertEquals(expected, actual);
    }

    @Test
    void testAlphabetizeAllNonAlphabetic() {
        String input = "1234567890";
        String expected = "No alphabetic characters to sort.";
        String actual = Alphabetizer.alphabetize(input);
        assertEquals(expected, actual);
    }

    @Test
    void testAlphabetizeCaseSensitivity() {
        String input = "aAbBcC";
        String expected = "aAbBcC";
        String actual = Alphabetizer.alphabetize(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testAlphabetizeNumbersIncluded() {
        String input = "a1b2c3";
        String expected = "abc";
        String actual = Alphabetizer.alphabetize(input); 
        assertEquals(expected, actual);
    }
}
