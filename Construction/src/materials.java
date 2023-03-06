import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class materials {
	Scanner sc=new Scanner(System.in);
	private Statement st;
	public materials() throws Exception {
		st=DBConnection.getStatement();
	}
	public void addCompanies(int id,String typ) throws Exception{
		  System.out.println("NAME OF THE BRICK COMPANY USED IN PROJECT:");
		  String bri=sc.next();
		  System.out.println("NAME OF THE CEMENT COMPANY USED IN PROJECT:");
		  String cem=sc.next();
		  System.out.println("NAME OF THE SAND COMPANY USED IN PROJECT:");
		  String san=sc.next();
		  System.out.println("NAME OF THE WOOD COMPANY USED IN PROJECT:");
		  String woo=sc.next();
		  System.out.println("NAME OF THE STEEL COMPANY USED IN PROJECT:");
		  String ste=sc.next();
		  System.out.println("NAME OF THE STEEL GIRDERS COMPANY USED IN PROJECT:");
		  String sg=sc.next();
		  System.out.println("NAME OF THE PVC COMPANY USED IN PROJECT:");
		  String pvc=sc.next();
		  System.out.println("NAME OF THE ABS COMPANY USED IN PROJECT:");
		  String abs=sc.next();
		  System.out.println("NAME OF THE CHROMED COPPER COMPANY USED IN PROJECT:");
		  String cc=sc.next();
		  System.out.println("NAME OF THE CHROMED BRASS COMPANY USED IN PROJECT:");
		  String cb=sc.next();
		  String Query="insert into material_companies values("+id+",'"+typ+"','"+bri+"','"+cem+"','"+san+"','"+woo+"','"+ste+"','"+sg+"','"+pvc+"','"+abs+"','"+cc+"','"+cb+"')";
		  int rows=st.executeUpdate(Query);
		  if(rows!=0) {
			  System.out.println("COMPANIES ADDED FOR RESPECTIVE PROJECTS");
		  }
	}
	public void display() throws Exception{
		String Query="select * from material_companies";
		System.out.println("PROJECTID||TYPE||BRICKS||CEMENT||SAND||WOOD||STEEL||STEEL GIRDERS||PVC||ABS||CHROMED COPPER||CHROMED BRASS");
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getString(3)+"||"+rs.getString(4)+"||"+rs.getString(5)+"||"+rs.getString(6)+"||"+rs.getString(7)+"||"+rs.getString(8)+"||"+rs.getString(9)+"||"+rs.getString(10)+"||"+rs.getString(11)+"||"+rs.getString(12));
		}
	}
	public void displayDetails(int id) throws Exception{
		String Query="select * from material_used where Projectid="+id+"";
		System.out.println("PROJECTID||TYPE||BRICKS||CEMENT||SAND||WOOD||STEEL||STEEL GIRDERS||PVC||ABS||CHROMED COPPER||CHROMED BRASS||BUDGET||STAGE||STATUS");
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getFloat(3)+"||"+rs.getFloat(4)+"||"+rs.getFloat(5)+"||"+rs.getFloat(6)+"||"+rs.getFloat(7)+"||"+rs.getFloat(8)+"||"+rs.getFloat(9)+"||"+rs.getFloat(10)+"||"+rs.getFloat(11)+"||"+rs.getFloat(12)+"||"+rs.getFloat(13)+"||"+rs.getString(14)+"||"+rs.getString(15));
			
		}
	}
	public void update(int id) throws Exception{
	
	}
	
		
}
