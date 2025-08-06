import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Scanner.nextInt();
        if(number < 40){
            System.out.println("f");

        } else if (number >=60 && number < 80) {
            System.out.println("b ");
        }
        else if (number >= 80 && number < 90) {
            System.out.println("a");
        } else if (number >= 90 && number <= 100) {
            System.out.println("A+");
        } else {
            System.out.println("Invalid input");
        }
    }
}