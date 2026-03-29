package OOP;

/*----------Day-12----------*/
/*----------Task-12----------*/

public class Laptop {
    String brand;
    int price;

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Laptop obj1 = new Laptop("HP", 850);
        Laptop obj2 = new Laptop("MackBook", 1800);

        obj1.displayInfo();
        obj2.displayInfo();
    }
}
