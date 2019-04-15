
package project;
import java.sql.*;

public class Connect {
    Connection conn;
    public Connect(){
             try{  
               Class.forName("com.mysql.jdbc.Driver");  
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence","root","sai.1919");  
               Statement stmt=conn.createStatement();  
               ResultSet rs; 
               
             }
             catch(Exception e){ 
                System.out.println(e);
                }  
}  
    }
    
