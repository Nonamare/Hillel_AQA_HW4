package ua.hillel.homework4;

import java.util.Scanner;

/*
 Написати програму, яка перевіряє чи є рядок паліндромом
 використовувати масив символів - char string[].
 Для конвертації рядка, використовувати метод toCharArray()
 */
public class Task3 {

    private static char[] revertArray(char[] array) {
        char[] result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }

        return result;
    }

    // Implements verification if the argument is palindrome
    // Verifies char-by-char, e.g. Hannah is ok, but "Hann - ah" is not
    private static boolean isPalindromeChar(String string) {
        char[] originalString = string.toLowerCase().toCharArray();
        char[] revertedString = revertArray(originalString);

        for (int i = 0; i < originalString.length; i++) {
            if (originalString[i] != revertedString[i])
                return false;
        }

        return true;

    }

    // Implements verification if the argument is palindrome
    // Verifies letters only, e.g. Hannah is ok, and "Hann - ah" is ok
    // This method is more human-oriented and ignores punctuation/spaces, etc.
    // See examples here: https://uk.wikipedia.org/wiki/%D0%9F%D0%B0%D0%BB%D1%96%D0%BD%D0%B4%D1%80%D0%BE%D0%BC
    // E.g. А баба на волі — цілована баба.
    private static boolean isPalindromeCharAdvanced(String string) {

        char[] originalString = string.toLowerCase().toCharArray();
        String lettersDigitsOnly = "";
        for (int i = 0; i < string.length(); i++) {
            if (Character.isAlphabetic(originalString[i]))
                lettersDigitsOnly = lettersDigitsOnly + originalString[i];
        }

        char[] lettersDigitsOnlyChar = lettersDigitsOnly.toCharArray();
        char[] revertedString = revertArray(lettersDigitsOnlyChar);

        for (int i = 0; i < lettersDigitsOnlyChar.length; i++) {
            if (lettersDigitsOnlyChar[i] != revertedString[i])
                return false;
        }

        return true;

    }

    // Implements verification if the argument is palindrome
    // Despite on the task to use char[] uses strings instead
    private static boolean isPalindromeString(String string) {
        String original, reverse = "";
        original = string.toLowerCase();
        for (int i = original.length() - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        return (original.equals(reverse)) ? true : false;
    }

    public static void checkPalindrome() {
        System.out.print("Please enter a phrase: ");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        String resultChar = (isPalindromeChar(phrase)) ? "is" : "is NOT";
        String resultString = (isPalindromeString(phrase)) ? "is" : "is NOT";
        String resultSmart = (isPalindromeCharAdvanced(phrase)) ? "is" : "is NOT";

        System.out.println("Char[]: Phrase >" + phrase + "< " + resultChar + " palindrome");
        System.out.println("String: Phrase >" + phrase + "< " + resultString + " palindrome");
        System.out.println("Char[] Advanced: Phrase >" + phrase + "< " + resultSmart + " palindrome");
    }
}
