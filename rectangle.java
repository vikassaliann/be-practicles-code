public class rectangle {
    public static void main(String[] args){
        int length = 8;
        int width = 4;
        double area = calculateArea(length, width);
       
        System.out.println("Area of the rectangle: " + area);
    }

    public static double calculateArea(int length, int width) {
        return length * width;
    }

}
