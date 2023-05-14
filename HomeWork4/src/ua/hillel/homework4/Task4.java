package ua.hillel.homework4;

import java.util.Arrays;
import java.util.Random;

// 4 Написати програму, яка знаходить мінімальне і максимальне число в масиві.
public class Task4 {
    private static final int arraySize = 20;
    private static int[] array;

    // Returns minimal value in the array
    private static int getMinValue() {
        if (null == array) {
            generateArray();
        }

        int min = array[0];
        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }

        return min;
    }

    // Returns maximum value in the array
    private static int getMaxValue() {
        if (null == array) {
            generateArray();
        }

        int max = array[0];
        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }

        return max;
    }

    public static void generateArray() {
        array = new int[arraySize];
        Random random = new Random();

        // Generate the values
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(0, 99);
        }
    }

    public static void printMinMax() {
        System.out.println("Min: " + getMinValue() + "; Max: " + getMaxValue() + " in array: " + Arrays.toString(array));
    }
}
