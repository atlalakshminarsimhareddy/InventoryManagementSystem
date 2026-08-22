public class Product {

    int id;
    String name;
    String category;
    double price;
    int quantity;
    String supplier;

    // Constructor for new product
    Product(String name, String category, double price,
            int quantity, String supplier) {

        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    // Constructor for product retrieved from database
    Product(int id, String name, String category, double price,
            int quantity, String supplier) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.supplier = supplier;
    }
}