package alphabetizer;

public class Alphabetizer {
    
    /**
     * The main method that processes multiple strings from command line arguments and prints their alphabetized versions.
     * This method leverages the alphabetize method to process each string individually.
     *
     * Time Complexity: O(n * k), where n is the number of strings and k is the average length of the strings.
     * Space Complexity: O(k), where k is the length of the longest string.
     * 
     * @param args The command line arguments, each an input string to be alphabetized.
     */
    public static void main(String[] args) {

        // Check if any arguments were provided
        if (args.length == 0) {
            System.out.println("No input provided. Please provide one or more strings to alphabetize.");
            return; // Exit the program after displaying the message
        }
        for (String input : args) {
            System.out.println(alphabetize(input));
        }
    }

    /**
     * Alphabetizes the input string by sorting characters alphabetically while preserving their original case.
     * This method uses a bucket sort approach where each bucket corresponds to a letter of the alphabet.
     *
     * Time Complexity: O(n), where n is the length of the input string.
     * Space Complexity: O(n), assuming the output and buckets hold almost every character in the input in worst case scenarios.
     * 
     * @param input The string to be alphabetized.
     * @return The alphabetized string with original casing preserved and non-alphabetic characters omitted.
     */

    public static String alphabetize(String input) {

        if (input == null || input.trim().isEmpty()) {
            return "Please enter a valid string containing alphabetic characters.";
        }
    
       // Initialize buckets for each letter of the alphabet
        StringBuilder[] buckets = new StringBuilder[26];
        initializeBuckets(buckets);
        boolean containsAlphabetic = false;

        // Distribute characters into their corresponding buckets based on their lowercase equivalent
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {   // Only process alphabetic characters and filter out non-alphabetic characters
                containsAlphabetic = true;
                int index = Character.toLowerCase(c) - 'a';
                buckets[index].append(c);
            }
        }

        // If no alphabets found ,return
        if (!containsAlphabetic) {
            return "No alphabetic characters to sort.";
        }

        // Collect the characters from the buckets to build the sorted output
        StringBuilder output = new StringBuilder();
        for (StringBuilder bucket : buckets) {
            if (bucket != null) {
                output.append(bucket);
            }
        }

        return output.toString();
    }
    
     /**
     * Initializes an array of StringBuilder instances for use as buckets in the sorting process.
     * Each bucket corresponds to a specific letter of the alphabet.
     *
     * Time Complexity: O(1), as the operation has a fixed cost regardless of input size.
     * Space Complexity: O(1), as 26 StringBuilder objects are created, which is a constant.
     * 
     * @param buckets The array of StringBuilder instances to be initialized.
     */
   private static void initializeBuckets(StringBuilder[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new StringBuilder();
        }
    }
}
