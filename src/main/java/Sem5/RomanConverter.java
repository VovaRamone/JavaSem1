package Sem5;

import java.util.*;

public class RomanConverter {
    private static final List<String> ROMAN_SYMBOLS = Arrays.asList("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
    private static final List<Integer> ARABIC_VALUES = Arrays.asList(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);

    public static int romanToArabic(String roman) {
        int result = 0;
        int index = 0;

        for (int i = 0; i < ROMAN_SYMBOLS.size(); i++) {
            while (roman.startsWith(ROMAN_SYMBOLS.get(i), index)) {
                result += ARABIC_VALUES.get(i);
                index += ROMAN_SYMBOLS.get(i).length();
            }
        }

        return result;
    }

    public static String arabicToRoman(int arabic) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ARABIC_VALUES.size(); i++) {
            while (arabic >= ARABIC_VALUES.get(i)) {
                result.append(ROMAN_SYMBOLS.get(i));
                arabic -= ARABIC_VALUES.get(i);
            }
        }

        return result.toString();
    }

    public static void test2() {
        String romanNumeral = "MMXXIII";
        int arabicNumber = romanToArabic(romanNumeral);
        System.out.println("Roman numeral: " + romanNumeral);
        System.out.println("Arabic number: " + arabicNumber);

        int number = 2023;
        String roman = arabicToRoman(number);
        System.out.println("Arabic number: " + number);
        System.out.println("Roman numeral: " + roman);
    }
}

