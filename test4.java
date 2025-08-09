import java.util.Scanner;

public class test4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        System.out.print("Even numbers between 1 and " + N + ": ");
        for (int i = 2; i <= N; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); 

        scanner.close();
    }
}