import java.sql.*;

public class LoginPage {
	private Connection con;
	private Statement st;
	public LoginPage() throws Exception{
		con=DBConnection.getConnection();
		st=DBConnection.getStatement();
	}
	public String connect(String name,String pwd) throws Exception{
		String Query="select * from user";
		ResultSet rs=st.executeQuery(Query);
		String role="";
		while(rs.next()) {
			if(name.equals(rs.getString(1)) && pwd.equals(rs.getString(2))) {
				System.out.println("WELCOME "+rs.getString(5));
				role=rs.getString(3);
				break;
			}else {
				role="";
			}
		}
		return role;
		
	}
	public void newRegister(int id,String newRole,String uName,String pwd,String name) throws Exception{
		String Query="insert into user values('"+uName+"','"+pwd+"','"+newRole+"',"+id+",'"+name+"')";
		Statement st=con.createStatement();
		int rows=st.executeUpdate(Query);
		if(rows!=0) {
			System.out.println("---SUCCESSFULLY REGISTERED---");
		}
	}
}

//		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/construction","root","root");		
//		st=con.createStatement();