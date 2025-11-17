public class Laptop {
    String brand;
    double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 50000);
        Laptop l2 = new Laptop("HP", 60000);
        l1.displayDetails();
        l2.displayDetails();
    }
}
