import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteProduct {

    public static void delete() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        String sql =
                "DELETE FROM products WHERE product_id = ?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            int result = ps.executeUpdate();

            if (result > 0) {

                System.out.println(
                        "Product deleted successfully!"
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