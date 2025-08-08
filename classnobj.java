class student {
    long rollno;
    String name;
    String branch;
    char section;
}

public class classnobj {

    public static void main(String[] args) {

        student s1 = new student();
        s1.rollno = 101;
        s1.name = "John";
        s1.branch = "Computer Science";
        s1.section = 'A';

        System.out.println("Student Details:");
        System.out.println("Roll No: " + s1.rollno);
        System.out.println("Name: " + s1.name);
        System.out.println("Branch: " + s1.branch);
        System.out.println("Section: " + s1.section);   
    }
}
