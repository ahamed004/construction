import java.util.*;
public class Main {
	static String role="";
	static Scanner sc=new Scanner(System.in);
	static Main m=new Main();
	static Manager man=new Manager();
	static Supervisor sv=new Supervisor();
	static Employee emp=new Employee();
	public static void main(String[] args) throws Exception{
		LoginPage log=new LoginPage();
		System.out.println("-->ENTER 1 FOR LOGIN<--");
		System.out.println("-->ENTER 2 FOR REGISTRATION<--");
		int logOrReg=sc.nextInt();
		boolean fl=true;
		while(fl) {
			switch (logOrReg) {
			case 1:{
				while(role=="") {
					System.out.println("ENTER YOUR USERNAME:");
					String name=sc.next();		
					System.out.println("ENTER THE PASSWORD:");
					String pwd=sc.next();
					role=log.connect(name,pwd);
					if(role=="") {
						System.out.println("!!Invalid username or password!!");
					}
				}
				fl=false;
				break;
			}
			case 2:{
				System.out.println("ENTER YOUR ID: ");
				int id=sc.nextInt();
				System.out.println("ENTER YOUR ROLE: ");
				String newRole=sc.next();
				System.out.println("ENTER YOUR USERNAME: ");
				String uName=sc.next();
				System.out.println("ENTER YOUR PASSWORD:");
				String pwd=sc.next();
				System.out.println("ENTER YOUR NAME:");
				sc.nextLine();
				String name=sc.nextLine(); 
				log.newRegister(id,newRole,uName,pwd,name);
				logOrReg=1;
			}
			}
		}	
		m.homePage();
		sc.close();
	}
	public void homePage() throws Exception{
//		Manager man=new Manager();
//		Supervisor sv=new Supervisor();
//		Employee emp=new Employee();
		System.out.println("ENTER 1 FOR LIST OF TIED UP COMPANIES");
		System.out.println("ENTER 2 FOR LIST OF PROJECTS");
		System.out.println("ENTER 3 FOR LIST OF COMPANIES FROM WHICH MATERIALS HAVE BEEN BOUGHT");
		int construct =sc.nextInt();
		switch (construct){
		case 1:{
			switch(role) {
			case "manager":{
				System.out.println("ENTER A TO VIEW THE TABLE");
				System.out.println("ENTER B TO ADD COMPANY TO THE TABLE");
				System.out.println("ENTER C TO UPDATE PRICE DETAILS ABOUT THE COMPANY FROM THE TABLE");
				System.out.println("ENTER D TO DELETE A COMPANY FROM THE TABLE");
				System.out.println("ENTER E TO EXIT THE PAGE");
				char tied=sc.next().charAt(0);
				man.companyPage(tied);
				break;
			}
			case "supervisor":{
				System.out.println("ENTER A TO VIEW THE TABLE");
				System.out.println("ENTER B TO EXIT THE PAGE");
				char tied=sc.next().charAt(0);
				sv.companyPage(tied);
				break;
			}
			case "employee":{
				System.out.println("ENTER A TO VIEW THE TABLE");
				System.out.println("ENTER B TO EXIT THE PAGE");
				char tied=sc.next().charAt(0);
				emp.companyPage(tied);
				break;
			}
			}
			break;
		}
		case 2:{
			switch(role) {
			case "manager":{
				System.out.println("ENTER A TO VIEW THE TABLE");
				System.out.println("ENTER B TO ADD A PROJECT TO THE TABLE");
				System.out.println("ENTER C TO UPDATE THE STATUS OF THE PROJECT");
				System.out.println("ENTER D TO DELETE A PROJECT FROM THE TABLE");
				System.out.println("ENTER E TO EXIT THE PAGE");
				char pro=sc.next().charAt(0);
				man.projectPage(pro);
				break;
			}
			case "supervisor":{
				System.out.println("ENTER A TO VIEW THE TABLE");
				System.out.println("ENTER B TO UPDATE THE STATUS OF THE PROJECT");
				System.out.println("ENTER C TO EXIT THE PAGE");
				char pro=sc.next().charAt(0);
				sv.projectPage(pro);
				break;
			}
			case "employee":{
				System.out.println("ENTER A TO VIEW THE TABLE");
				System.out.println("ENTER B TO EXIT THE PAGE");
				char pro=sc.next().charAt(0);
				emp.projectPage(pro);
				break;
			}
			}
			break;
		}
		case 3:{
			switch(role) {
			case "manager":{
				System.out.println("ENTER A TO VIEW THE TABLE");
				System.out.println("ENTER B TO EXIT THE PAGE");
				char mat=sc.next().charAt(0);
				man.materialPage(mat);
				break;
			}
			case "supervisor":{
				System.out.println("ENTER A TO VIEW THE TABLE");
				System.out.println("ENTER B TO EXIT THE PAGE");
				char mat=sc.next().charAt(0);
				sv.materialPage(mat);
				break;
			}
			case "employee":{
				System.out.println("ENTER A TO VIEW THE TABLE");
				System.out.println("ENTER B TO EXIT THE PAGE");
				char mat=sc.next().charAt(0);
				emp.materialPage(mat);
				break;
			}
			}
			break;
		}
		default:{
			System.out.println("ENTERED NUMBER IS INVALID");
			m.goBack();
			break;
		}
		}
		sc.close();
		
	}
	public void stockPage() throws Exception{
		System.out.println("ENTER THE PROJECT ID TO KNOW MORE ABOUT THE PROJECT:");
		int id=sc.nextInt();
		switch(role) {
		case("manager"):{
			System.out.println("ENTER A TO VIEW THE TABLE");
			System.out.println("ENTER B TO EXIT THE PAGE");
			char ch=sc.next().charAt(0);
			man.details(id,ch);
			m.goBack();
			break;
		}
		}
	}
	public void goBack() throws Exception{
		System.out.println("-->ENTER ret TO RETURN TO HOME PAGE<--");
		int c=0;
		while(c==0) {
			String ret=sc.next();
			if(ret.equals("ret")) {
				m.homePage();
				c=1;
				break;
			}else {
				System.out.println("ENTERED WORD IS INVALID");
			}
		}
	}

}
 
//System.out.println("ENTER 3 FOR LIST OF MATERIALS IN STOCK");		