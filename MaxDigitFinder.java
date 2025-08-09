
public class MaxDigitFinder {
    public static void main(String[] args) {
        int number = 987;

        int maxDigit = findMaxDigit(number);
        System.out.println("The maximum digit in " + number + " is: " + maxDigit);
    }

    public static int findMaxDigit(int num) {
        int max = 0;
        int tempNum = num;
        while (tempNum > 0) {
            int digit = tempNum % 10;
            if (digit > max) {
                max = digit;
            }

            tempNum /= 10;
        }

        return max;
    }
}
