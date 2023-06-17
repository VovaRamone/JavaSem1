package Sem1;

public class ReverseWordOrder {
    public static void main(String[] args) {
        String phrase = "Welcome to the Java course";

        String reversedPhrase = reverseWordOrder(phrase);

        System.out.println("Reversed phrase: " + reversedPhrase);
    }

    private static String reverseWordOrder(String phrase) {
        String[] words = phrase.split(" ");

        StringBuilder reversedPhrase = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedPhrase.append(words[i]);
            if (i > 0) {
                reversedPhrase.append(" ");
            }
        }

        return reversedPhrase.toString();
    }
}

