public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}