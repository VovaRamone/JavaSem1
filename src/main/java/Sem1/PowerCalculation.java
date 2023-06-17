package Sem1;

public class PowerCalculation {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        // Recursive approach
        int resultRecursive = powerRecursive(a, b);
        System.out.println(a + " raised to the power " + b + " (recursive): " + resultRecursive);

        // Iterative approach
        int resultIterative = powerIterative(a, b);
        System.out.println(a + " raised to the power " + b + " (iterative): " + resultIterative);
    }

    // Recursive power calculation
    private static int powerRecursive(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            int temp = powerRecursive(a, b / 2);
            return temp * temp;
        } else {
            return a * powerRecursive(a, b - 1);
        }
    }

    // Iterative power calculation
    private static int powerIterative(int a, int b) {
        int result = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                result *= a;
            }
            a *= a;
            b /= 2;
        }
        return result;
    }
}

