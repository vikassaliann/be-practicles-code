import java.util.Scanner;

public class sumofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1; i<=num;i++){
            sum+=i;
            
        }
        System.out.println("Sum of numbers from 1 to "+ num +" is:" + sum);

    }
    
}
