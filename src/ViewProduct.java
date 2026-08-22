import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewProduct {

    public static void view() {

        String sql = "SELECT * FROM products";

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n===== PRODUCT LIST =====");

            while (rs.next()) {

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

                System.out.println("-------------------------");
            }

            con.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}