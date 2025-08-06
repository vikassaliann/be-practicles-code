public class productofno {
    public static void main(String[] args) {
        int num = 1234;
        int product = productOfDigits(num);
        System.out.println("Product of digits: " + product);
    }

    public static int productOfDigits(int n) {
        int product = 1;
        while (n != 0) {
            product *= n % 10;
            n /= 10;
        }
    return product;
    
}

}
