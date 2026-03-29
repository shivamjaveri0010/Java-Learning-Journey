package OOP;

/*----------Day-11----------*/
/*-----Classes & Objects-----*/
/*----------Exercise----------*/

// public class Student {

//     String name;
//     int age;

//     void displayDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }

//     public static void main(String[] args) {
//         Student obj = new Student();

//         obj.name = "Shivam";
//         obj.age = 26;

//         obj.displayDetails();
//     }
// }

/*----------Day-12----------*/
/*----------Exercise----------*/
public class Student {
    String name;
    int age;

    //Default Constructor
    Student() {
        System.out.println("Default Constructor Called");
    }

    //parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method to print values
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        //creating object to call default constructor
        Student defaultConstructor = new Student();

        //calling parameterized constructor
        Student obj = new Student("Shivam", 26);

        //print values
        obj.displayDetails();
    }
}