package OOP;

/*----------Task-14 Day-14-------*/
import java.util.Scanner;

public class EmployeeSystem {

    //parent class
    static class Employee {
        private String name;
        private double salary;
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getSalary() {
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    //child class
    static class Developer extends Employee {
        private String codingLanguage;

        public String getCodingLanguage() {
            return codingLanguage;
        }

        public void setCodingLanguage(String codingLanguage) {
            this.codingLanguage = codingLanguage;
        }

        void display() {
            System.out.println("\n----- Employee Details -----");
            System.out.println("Name: " + getName());
            System.out.println("Salary: " + getSalary());
            System.out.println("Coding Language: " + codingLanguage);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Developer dev = new Developer();

        //taking input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();      //clear buffer

        System.out.print("Enter Coding Language: ");
        String lang = sc.nextLine();

        //setting values
        dev.setName(name);
        dev.setSalary(salary);
        dev.setCodingLanguage(lang);

        //display
        dev.display();

        sc.close();
    }
}