
package tabla;


import java.sql.*;



public class JDBCUtilities {
    
    
    /**
     * JDBCUtilities to a sample database
     */
    public static Connection getConnection()throws SQLException {
        Connection conn = null;
        
            // db parameters
            String url = "jdbc:sqlite:ProyectosConstruccion.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
  
           return conn;
    }
    
}