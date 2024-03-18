import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/marulanda", "root", "fresas12");

            Statement statement = connection.createStatement();

            ResultSet resultadoSet = statement.executeQuery("SELECT * FROM usuarios");

            while (resultadoSet.next()) {
                System.out.println(resultadoSet.getString("nombreUsuario"));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}