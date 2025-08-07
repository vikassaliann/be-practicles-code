import java.util.Scanner;

public class sumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to sum its digits: ");
        int num = scanner.nextInt();

        int result = sumUntilSingleDigit(num);
        System.out.println("Final single digit sum: " + result);
    }

    public static int sumUntilSingleDigit(int n) {
        while (n >= 10) {
            n = sumOfDigits(n);
        }
        return n;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}