import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchProduct {

    public static void search() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        String sql =
                "SELECT * FROM products WHERE product_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("\n===== PRODUCT FOUND =====");

                System.out.println(
                        "ID: " +
                        rs.getInt("product_id")
                );

                System.out.println(
                        "Name: " +
                        rs.getString("product_name")
                );

                System.out.println(
                        "Category: " +
                        rs.getString("category")
                );

                System.out.println(
                        "Price: " +
                        rs.getDouble("price")
                );

                System.out.println(
                        "Quantity: " +
                        rs.getInt("quantity")
                );

                System.out.println(
                        "Supplier: " +
                        rs.getString("supplier")
                );

            } else {

                System.out.println("Product not found.");
            }

            con.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}