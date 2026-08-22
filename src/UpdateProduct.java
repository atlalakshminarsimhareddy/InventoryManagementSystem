import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateProduct {

    public static void update() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter new product name: ");
        String name = sc.nextLine();

        System.out.print("Enter new category: ");
        String category = sc.nextLine();

        System.out.print("Enter new price: ");
        double price = sc.nextDouble();

        System.out.print("Enter new quantity: ");
        int quantity = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter new supplier: ");
        String supplier = sc.nextLine();

        String sql =
                "UPDATE products SET " +
                "product_name = ?, " +
                "category = ?, " +
                "price = ?, " +
                "quantity = ?, " +
                "supplier = ? " +
                "WHERE product_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, category);
            ps.setDouble(3, price);
            ps.setInt(4, quantity);
            ps.setString(5, supplier);
            ps.setInt(6, id);

            int result = ps.executeUpdate();

            if (result > 0) {

                System.out.println(
                        "Product updated successfully!"
                );

            } else {

                System.out.println(
                        "Product not found."
                );
            }

            con.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}