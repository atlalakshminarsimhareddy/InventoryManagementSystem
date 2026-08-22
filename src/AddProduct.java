import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddProduct {

    public static void add() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter supplier: ");
        String supplier = sc.nextLine();

        String sql =
                "INSERT INTO products " +
                "(product_name, category, price, quantity, supplier) " +
                "VALUES (?, ?, ?, ?, ?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, category);
            ps.setDouble(3, price);
            ps.setInt(4, quantity);
            ps.setString(5, supplier);

            ps.executeUpdate();

            System.out.println("Product added successfully!");

            con.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}