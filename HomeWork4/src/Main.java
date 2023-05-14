import ua.hillel.homework4.Task1;
import ua.hillel.homework4.Task2;
import ua.hillel.homework4.Task3;
import ua.hillel.homework4.Task4;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Task 1
        Task1.calculateSin();
        Task1.printResults();

        // Task 2
        Task2.generateArray();
        Task2.printValues("Before processing: ");
        Task2.processArray();
        Task2.printValues("After processing: ");

        // Task 3
        Task3.checkPalindrome();

        // Task 4
        Task4.printMinMax();
    }
}