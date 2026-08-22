import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n=================================");
            System.out.println("   INVENTORY MANAGEMENT SYSTEM");
            System.out.println("=================================");

            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Update Stock");
            System.out.println("7. Low Stock Products");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    AddProduct.add();

                    break;

                case 2:

                    ViewProduct.view();

                    break;

                case 3:

                    SearchProduct.search();

                    break;

                case 4:

                    UpdateProduct.update();

                    break;

                case 5:

                    DeleteProduct.delete();

                    break;

                case 6:

                    UpdateStock.update();

                    break;

                case 7:

                    LowStockProduct.show();

                    break;

                case 8:

                    System.out.println(
                            "Thank you for using the system!"
                    );

                    sc.close();

                    return;

                default:

                    System.out.println(
                            "Invalid choice!"
                    );
            }
        }
    }
}