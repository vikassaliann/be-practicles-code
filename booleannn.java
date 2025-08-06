public class booleannn{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int c = 15;
        boolean isgreater = a > b;
        boolean isless = a < b;
        boolean isequal = a == b;
        boolean isnotgreater = a <= b;
        boolean isnotless = a >= b;
        boolean isnotequal = a != b;

        System.out.println("Is a greater than b? "+isgreater);
        System.out.println("Is a less than b? "+isless);
        System.out.println("Is a equal to b? "+isequal); 
        System.out.println("Is a not greater than b? "+isnotgreater);
        System.out.println("Is a not less than b? "+isnotless);
        System.out.println("Is a not equal to b? "+isnotequal);
        
        if(a>b && a>c){
            System.out.println("a is the greatest number");
        } else if(b>a && b>c) {
            System.out.println("b is the greatest number");
        } else {
            System.out.println("c is the greatest number");

        }
    }
}