import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LowStockProduct {

    public static void show() {

        String sql =
                "SELECT * FROM products WHERE quantity < 5";

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println(
                    "\n===== LOW STOCK PRODUCTS ====="
            );

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.println(
                        "ID: " +
                        rs.getInt("product_id")
                );

                System.out.println(
                        "Name: " +
                        rs.getString("product_name")
                );

                System.out.println(
                        "Quantity: " +
                        rs.getInt("quantity")
                );

                System.out.println("-------------------------");
            }

            if (!found) {

                System.out.println(
                        "No low-stock products."
                );
            }

            con.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}