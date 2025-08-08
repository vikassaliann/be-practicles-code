class person{
    String name;
    int age;
    String location;
    String occupation;
    int phoneNumber;
    static int count=0;

    person() {
        count++;
    }
}
public class user {
    public static void main(String[] args) {
        person p1 = new person();
        p1.name = "Alice";
        p1.age = 30;
        p1.location = "New York";
        p1.occupation = "Engineer";
        p1.phoneNumber = 1234567890;

        System.out.println("User Details:");
        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        System.out.println("Location: " + p1.location);
        System.out.println("Occupation: " + p1.occupation);
        System.out.println("Phone Number: " + p1.phoneNumber);
        System.out.println("Total Users: " + person.count);
    }
    
}
