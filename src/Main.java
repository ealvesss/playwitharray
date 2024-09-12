import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a) Reading input from standard input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type anything: ");
        String input = scanner.nextLine();

        // b) Breaking the string into an array
        char[] array = input.toCharArray();

        // c) Printing the original array in the format { el1, el2, el3 }
        System.out.print("Original Array: ");
        printArray(array);

        // d) Sorting the array and printing it
        Arrays.sort(array);
        System.out.print("Sorted Array  : ");
        printArray(array);

        // e) Printing the array as a single string
        System.out.print("Final String  : ");
        System.out.println(new String(array));

        scanner.close();
    }

    private static void printArray(char[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}
