import java.sql.*;
import java.util.Scanner;
public class Project {
		Scanner sc=new Scanner(System.in);
		private Statement st;
		Main main=new Main();
		private materials m=new materials();
		public Project() throws Exception{
			st=DBConnection.getStatement();
		}
		public void display() throws Exception{
			String Query="select * from projects";
			ResultSet rs=st.executeQuery(Query);
			System.out.println("PROJECT ID||PROJECT NAME||CLIENT NAME||AREA||TYPE||STATUS||BUDGET");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getString(3)+"||"+rs.getString(4)+"||"+rs.getString(5)+"||"+rs.getString(6)+"||"+rs.getFloat(7));
			}
			main.stockPage();
			
		}
		public void add() throws Exception{
			System.out.println("ENTER THE PROJECT ID:");
			int id=sc.nextInt();
			System.out.println("ENTER THE PROJECT NAME:");
			sc.nextLine();
			String proj=sc.nextLine();
			System.out.println("ENTER THE CLIENT NAME:");
			String cli=sc.nextLine();
			System.out.println("ENTER THE AREA:");
			String area=sc.nextLine();
			System.out.println("ENTER THE TYPE OF THE PROJECT:");
			String type=sc.next();
			String stat="new";
			float bud=0;
			String Query="insert into projects values("+id+",'"+proj+"','"+cli+"','"+area+"','"+type+"','"+stat+"','"+bud+"')";
			int row=st.executeUpdate(Query);
			if(row!=0) {
				System.out.println("NEW PROJECT HAS BEEN ADDED");
			}
		}
		public void update() throws Exception{
			System.out.println("ENTER THE PROJECT ID:");
			int id=sc.nextInt();
			System.out.println("ENTER THE TYPE OF THE PROJECT");
			String typ=sc.next();
			System.out.println("ENTER THE STATUS OF THE PROJECT WHICH IS NEED TO BE UPDATED");
			String stat=sc.next();
			if(stat.equals("onprogress")) {
				m.addCompanies(id,typ);
				
			}
			String Query="update projects set Status='"+stat+"' where ProjectId="+id+"";
			int row=st.executeUpdate(Query);
			if(row!=0) {
				System.out.println("STATUS OF THE PROJECT IS UPDATED");
			}
		}
		public void delete() throws Exception{
			System.out.println("ENTER THE ID OF THE PROJECT WHICH HAS TO BE DELETED:");
			int id=sc.nextInt();
			String Query="delete from projects where ProjectId="+id+"";
			int row=st.executeUpdate(Query);
			if(row!=0) {
				System.out.println("//REQUESTED PROJECT HAS BEEN DELETED\\");
			}
		}
}
