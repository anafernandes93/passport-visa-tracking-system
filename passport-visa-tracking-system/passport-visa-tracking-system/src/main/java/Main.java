import util.DatabaseConnection;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        System.out.println("Passport Visa Tracking System starting...");

        Connection connection = DatabaseConnection.getConnection();

        if (connection != null) {
            System.out.println("Application connected to database successfully");
        }
    }
}