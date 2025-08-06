
public class sumno {
    public static void main(String[] args) {
        int num = 9685;
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits: " + sum);
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
