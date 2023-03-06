import java.sql.*;
import java.util.*;
class CompaniesTiedUp {
	 static Scanner sc=new Scanner(System.in);
	 private Statement st;
	 public CompaniesTiedUp() throws Exception{
		 st=DBConnection.getStatement();
	 }
	 public void display() throws Exception{
		 String Query="select * from tiedupcompanies";
		 ResultSet rs=st.executeQuery(Query);
		 System.out.println("COMPANY_ID||COMPANY_NAME||MATERIAL||PRICE ");
		 while(rs.next()) {
			 System.out.println(rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getString(3)+"||"+rs.getInt(4));
		 }
	 }
	 public void add() throws Exception{
		 System.out.println("ENTER THE COMPANY ID:");
		 int id=sc.nextInt();
		 System.out.println("ENTER THE COMPANY NAME:");
		 String comp=sc.next();
		 System.out.println("ENTER THE TYPE OF MATERIAL:");
		 String mat=sc.next();
		 System.out.println("ENTER THE PRICE PER UNIT:");
		 float pri=sc.nextFloat();
		 String Query="insert into tiedupcompanies values("+id+",'"+comp+"','"+mat+"','"+pri+"')";
		 int rows=st.executeUpdate(Query);
		 if(rows!=0) {
			 System.out.println("---COMPANY HAS BEEN SUCCESSFULLY ADDED---");
		 }
		 
	 }
	 public void update() throws Exception{
		 System.out.println("ENTER THE COMPANY NAME FOR WHICH PRICE TO BE UPDATED:");
		 String com=sc.next();
		 System.out.println("ENTER THE UPDATED PRICE:");
		 float pri=sc.nextFloat();
		 String Query="update tiedupcompanies set Price='"+pri+"' where Company_name='"+com+"'";
		 int rows=st.executeUpdate(Query);
		 if(rows!=0) {
			 System.out.println("---PRICE OF THE MATERIAL HAS BEEN UPDATED---");
		 }
	 }
	 public void delete() throws Exception{
		 System.out.println("//ENTER THE NAME OF THE COMPANY WHICH HAS TO BE DELETED\\");
		 String com=sc.next();
		 String Query="delete from tiedupcompanies where Company_name='"+com+"'";
		 int rows=st.executeUpdate(Query);
		 if(rows!=0) {
			 System.out.println("//COMPANY HAS BEEN DELETED\\");
		 }
	 }
	 
}
//	 private Connection con;
//con=DBConnection.getConnection();
//		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/construction","root","root");
//		 st=con.createStatement();