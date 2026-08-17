import java.sql.*;

public class JDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "rdp1971";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully!");

            String insertQuery = "INSERT INTO student VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(insertQuery);

            ps.setInt(1, 101);
            ps.setString(2, "Ganesh");
            ps.setInt(3, 21);

            ps.executeUpdate();

            System.out.println("Data inserted successfully!");

            String selectQuery = "SELECT * FROM student";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\nStudent Data:");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}