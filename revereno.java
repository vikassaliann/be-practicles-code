public class revereno {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = reverseNumber(num);
        System.out.println("Reversed Number: " + reversed);
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
            int b = reversed;
        }
        return reversed;
    }
    
}
