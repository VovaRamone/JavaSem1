package Sem2;

public class StringCompressor {
    public static void main(String[] args) {
        String input = "aaaaaaaaaaaaaaaaaabbbcdd";
        String compressed = compressString(input);
        System.out.println(compressed);
    }

    public static String compressString(String input) {
        if (input.isEmpty()) {
            return input;
        }

        StringBuilder sb = new StringBuilder();
        char sbl = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);

            if (nextChar == sbl) {
                count++;
            } else {
                sb.append(sbl);
                sb.append(count);
                sbl = nextChar;
                count = 1;
            }
        }

        // Append the last character and its count
        sb.append(sbl);
        sb.append(count);

        return sb.toString();
    }
}

