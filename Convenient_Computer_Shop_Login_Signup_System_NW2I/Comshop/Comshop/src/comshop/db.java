
package comshop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
       public static Connection conn () {
           
           try{
               String url = "jdbc:mysql://localhost:3377/computershop_system?zeroDateTimeBehavior=CONVERT_TO_NULL";
               String user = "root";
               String password = "";
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection(url,user,password);
                return conn;
           }
           catch(ClassNotFoundException | SQLException e){
               System.out.println(e);
           }
           return null;
       }
}
