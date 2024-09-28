import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingAndStats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        double[] numbers = new double[size];

        System.out.println("Enter " + size + " numeric values:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }

        Arrays.sort(numbers);

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / size;

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}