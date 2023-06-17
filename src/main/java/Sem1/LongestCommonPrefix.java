public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"robot", "robust", "robbery",};

        String longestCommonPrefix = findLongestCommonPrefix(words);

        System.out.println("Longest common prefix: " + longestCommonPrefix);
    }

    private static String findLongestCommonPrefix(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        String prefix = words[0];  // Initialize prefix with the first word

        for (int i = 1; i < words.length; i++) {
            while (!words[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);  // Remove last character from prefix
                if (prefix.isEmpty()) {
                    return "";  // No common prefix found
                }
            }
        }

        return prefix;
    }
}

