import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateStock {

    public static void update() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter new quantity: ");
        int quantity = sc.nextInt();

        String sql =
                "UPDATE products " +
                "SET quantity = ? " +
                "WHERE product_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, quantity);
            ps.setInt(2, id);

            int result = ps.executeUpdate();

            if (result > 0) {

                System.out.println(
                        "Stock updated successfully!"
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