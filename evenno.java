import java.util.Scanner;
public class evenno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(int i=2; i<=num; i+=2){
            System.out.println(i);
        }
    }
}
