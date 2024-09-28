import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingAndStats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Creating the array
        double[] numbers = new double[size];

        // Input elements into the array
        System.out.println("Enter " + size + " numeric values:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sorting the array
        Arrays.sort(numbers);

        // Calculating the sum and average
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / size;

        // Displaying results
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}