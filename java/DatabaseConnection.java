

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "URL de conexão ao banco de dados";
    private static final String USER = "Seu USER";
    private static final String PASSWORD = "Sua Senha";

public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(URL, USER, PASSWORD);

}
}
