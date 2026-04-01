package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.InputStream;

public class DatabaseConnection {

    private static Connection connection;

    private DatabaseConnection() {
        // prevent instantiation
    }

    public static Connection getConnection() {

        if (connection == null) {
            try {
                Properties properties = new Properties();

                InputStream input = DatabaseConnection.class
                        .getClassLoader()
                        .getResourceAsStream("resources/application.properties");

                if (input == null) {
                    throw new RuntimeException("application.properties not found");
                }

                properties.load(input);

                String url = properties.getProperty("db.url");
                String username = properties.getProperty("db.username");
                String password = properties.getProperty("db.password");

                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Database connection successful");

            } catch (Exception e) {
                System.out.println("Database connection failed");
                e.printStackTrace();
            }
        }

        return connection;
    }
}
