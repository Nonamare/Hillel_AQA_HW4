package ua.hillel.homework4;

/*
Написати програму, яка друкує таблицю значень sin(x),
де х - кожні 10 градусів від 0 до 360.(значення мають бути записані в масив за допомогою циклу)
 */
public class Task1 {
    private static final int step = 10;
    private static double[] sinArray;

    // Fills the sinArray array with values and prints the calculations results
    public static void calculateSin() {

        sinArray = new double[360 / step + 1];

        // Calculate the values
        for (int i = 0; i < sinArray.length; i++) {

            // Convert degrees to radians
            double radian = Math.PI * (i * step) / 180;

            // Calculate sin
            sinArray[i] = Math.sin(radian);

            // Print the result
            // System.out.println("Sin(" + i * step + ") = " + sinArray[i]);
        }
    }

    // This method uses foreach only in practice purpose
    // Of course, enriched information as used in calculateSin() is more preferable
    public static void printResults() {
        int i = 0;
        for (double element : sinArray) {
            System.out.println("Sin(" + i + ") = " + element);
            i += step;
        }
    }
}
