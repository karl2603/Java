import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Company";
        String user = "root";
        String password = "Burlbed58#";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");

            PreparedStatement stmt = con.prepareStatement("Select * from employee1");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                System.out.println("emp_id: "+rs.getInt("emp_id")+", Name: "+rs.getString("emp_name"));
            }
            PreparedStatement ps = con.prepareStatement("insert into members values(101, 'Rupa')");
            ps.setInt(1, 101);
            ps.setString(2, "Rupa");
            int rows = ps.executeUpdate();
            System.out.println(rows + "record inserted");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}