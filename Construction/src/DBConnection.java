import java.sql.*;
public class DBConnection {
		 static Connection con=null;
		 static Statement st;
		 private DBConnection() throws Exception{
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/construction","root","root");
			 st=con.createStatement();
		 }
		 public static Connection getConnection() throws Exception{
			 if(con==null) {
				 new DBConnection();
			 }
			 return con;
		 }
		 public static Statement getStatement() throws Exception{
			 return st;
		 }
}
