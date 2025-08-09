import java.util.Arrays; // Import the Arrays class for sorting

public class seclarge {

    public static void main(String[] args) {
        int a = 13;
        int b = 18;
        int c = 21;

        int[] numbers = {a, b, c};

        Arrays.sort(numbers);

        int secondLargest = numbers[1];

        System.out.println("The second largest number is: " + secondLargest);
    }
}