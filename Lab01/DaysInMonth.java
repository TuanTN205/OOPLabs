import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        int year = 0;
        
        while (true) {
            System.out.print("Enter month (1-12): ");
            month = scanner.nextInt();
            System.out.print("Enter year: ");
            year = scanner.nextInt();

            if (isValidInput(month, year)) {
                int days = getDaysInMonth(month, year);
                System.out.println("Number of days in month " + month + " of year " + year + " is: " + days);
                break;
            } else {
                System.out.println("Invalid month/year. Please try again.");
            }
        }

        scanner.close();
    }

    private static boolean isValidInput(int month, int year) {
        return month >= 1 && month <= 12 && year > 0;
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}