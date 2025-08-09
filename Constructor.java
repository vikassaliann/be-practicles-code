class Student{
    String name;
    String rollNo;
    int age;
    }
private String name;
private String rollNo;
private int age;
    
    void displayInfo() {
        String name = this.name;
        System.out.println("Name: " + name);
        String rollNo;
        System.out.println("Roll Number: " + rollNo);
        String age;
        System.out.println("Age: " + age);
    }
    public class Constructor {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John Doe";
        student.rollNo = "12345";
        student.age = 20;
        student.displayInfo();
    }
}
