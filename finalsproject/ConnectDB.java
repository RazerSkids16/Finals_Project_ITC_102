
package finalsproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectDB {
    
    private  static final String host = "jdbc:mysql://localhost: 3306/accounts";
    private static final String user = "root";
    private static final String password = "";
    private static final String database = "accounts";
    
    public static Connection connect(){
        try{
            return DriverManager.getConnection(host, user, password);
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public static Connection oldConnect(){
        try{
            Class.forName("com.sql.jdbc.Driver");
            return DriverManager.getConnection(host, user, password);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
