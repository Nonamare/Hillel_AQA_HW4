package ua.hillel.homework4;

import java.util.Arrays;
import java.util.Random;

/*
2 Написати програму, яка в масиві з випадкових цілих чисел замінює всі парні числа на 0
 і виводить отриманий масив на екран. Для генерації випадкових чисел можна користуватись Random.
 */
public class Task2 {
    private static final int arraySize = 20;
    private static int[] array;

    // Generates array
    public static void generateArray() {
        array = new int[arraySize];
        Random random = new Random();

        // Generate the values
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(0, 99);
        }
    }

    /* Replaces even values with 0
    Important: I didn't get the task. Does it requires
     - replace even numbers
      or
     - replace numbers like 11, 22, 33, 44, 55
    */
    public static void processArray() {
        for (int i = 0; i < arraySize; i++) {
            // Replace even numbers
            if (array[i] % 2 == 0) {
                array[i] = 0;
            } else
                // Replace "doubled" numbers like 11, 22, 33... 99
                if (array[i] % 11 == 0) {
                    array[i] = 0;
                }
        }

    }

    // Prints the values in the array
    public static void printValues(String prefix) {
        System.out.println(prefix + Arrays.toString(array));
    }
}
