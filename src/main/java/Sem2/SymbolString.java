package Sem2;

public class SymbolString {
    public static void main(String[] args) {
        int N = 15;
        char c1 = 'A';
        char c2 = 'B';

        String result = generateString(N, c1, c2);
        System.out.println(result);
    }

    public static String generateString(int N, char c1, char c2) {
        StringBuilder sb = new StringBuilder(N);

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }

        return sb.toString();
    }
}
