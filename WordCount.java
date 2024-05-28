import java.util.HashMap;

public class wordCount {
    public static void main(String[] args) {
        // Input sentence
        String sentence = "This is a sentence with words. It has words that repeat. Repeat words should be counted.";

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Iterate over each word and update the word count in the HashMap
        for (String word : words) {
            // Remove punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Check if the word is not empty
            if (!word.isEmpty()) {
                // Update the word count in the HashMap
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        // Print the word count for each word
        System.out.println("Word count for each word:");
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(word + ": " + count);
        }
    }
}
