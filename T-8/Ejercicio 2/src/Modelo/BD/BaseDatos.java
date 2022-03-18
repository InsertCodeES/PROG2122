package Modelo.BD;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDatos {

    public BaseDatos() throws Exception {
        String url = "jdbc:mysql://localhost:3307/damian";
        String user = "root";
        String passwd = "usbw";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,user,passwd);

        if (connection.equals(null)) {
            throw new Exception("Error: No se pudo conectar a la BBDD");
        }
    }


}
