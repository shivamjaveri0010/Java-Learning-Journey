package OOP;

/*----------Day-11----------*/
/*-----Classes & Objects-----*/
/*----------Task-11----------*/

public class Mobile {

    String brand;
    double price;
    
    void displayInfo() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Mobile obj = new Mobile();

        obj.brand = "Apple iPhone 17";
        obj.price = 1500;

        obj.displayInfo();
    }
}
