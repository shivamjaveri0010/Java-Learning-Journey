package OOP;

/*----------Day-13---------*/
/*-----Exercise Encapsulation-----*/
public class Person {
    //making details private
    private String name;
    private int age;

    //adding getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public static void main(String[] args) {
        //creating object
        Person obj = new Person();

        //storing values
        obj.setName("Shivam");
        obj.setAge(26);

        //printing values
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
