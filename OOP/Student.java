package OOP;

/*----------Day-11----------*/
/*-----Classes & Objects-----*/
/*----------Exercise----------*/

public class Student {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student obj = new Student();

        obj.name = "Shivam";
        obj.age = 26;

        obj.displayDetails();
    }
}