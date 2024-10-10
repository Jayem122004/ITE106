import java.util.Scanner; 
public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your text (or type 'exit' to quit): ");
            String text = scanner.nextLine();
            
            if (text.equalsIgnoreCase("exit")) {
                break;
            }

            countWords(text);
            countSentences(text);
            toUpperCase(text);
            findLongestWord(text);
            calculateWordFrequency(text);
        }

        scanner.close();
    }

    public static void countWords(String text) {
        String[] words = text.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }

    public static void countSentences(String text) {
        String[] sentences = text.split("[.!?]");
        System.out.println("Number of sentences: " + sentences.length);
    }

    public static void toUpperCase(String text) {
        System.out.println("Text in uppercase: " + text.toUpperCase());
    }

    public static void findLongestWord(String text) {
        String[] words = text.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
    }

    public static void calculateWordFrequency(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        String[] uniqueWords = new String[words.length];
        int[] wordCounts = new int[words.length];
        int uniqueCount = 0;

        for (String word : words) {
            boolean found = false;
            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueWords[i].equals(word)) {
                    wordCounts[i]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[uniqueCount] = word;
                wordCounts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        System.out.println("Word Frequency:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueWords[i] + ": " + wordCounts[i]);
        }
    }
}
