public class Circle {
    public static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        double area = myCircle.calculateArea();
        System.out.println("The area of the circle with radius 5 is: " + area);
    }
}