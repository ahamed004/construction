
public class Manager  {
	Main m=new Main();
	public void companyPage(char tied) throws Exception{
		CompaniesTiedUp ct=new CompaniesTiedUp();
		switch(tied) {
			case 'A':{
				ct.display();
				m.goBack();
				break;			
			}
			case 'B':{
				ct.add();
				m.goBack();
				break;
			}
			case 'C':{
				ct.update();
				m.goBack();
			}
			case 'D':{
				ct.delete();
				m.goBack();
				break;
			}
			case 'E':{
				System.out.println("<YOUR REQUEST IS VALIDATED>");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("!!ENTERED CHARACTER IS INVALID!!;");
				m.goBack();
				break;
			}
			
		}
	}
	public void projectPage(char pro) throws Exception{
		Project pr=new Project();
		switch(pro) {
		case 'A':{
			pr.display();
			m.goBack();
			break;
		}
		case 'B':{
			pr.add();
			m.goBack();
			break;
		}
		case 'C':{
			pr.update();
			m.goBack();
			break;
		}
		case 'D':{
			pr.delete();
			m.goBack();
			break;
		}
		case'E':{
			System.out.println("<YOUR REQUEST IS VALIDATED>");
			System.exit(0);
			break;
		}
		default:{
			System.out.println("!!ENTERED CHARACTER IS INVALID!!");
		}
		}
	}
	public void materialPage(char mat) throws Exception{
		materials mate=new materials();
		switch(mat) {
		case'A':{
			mate.display();
			m.goBack();
			break;
		}
		case'B':{
			System.out.println("<YOUR REQUEST HAS BEEN VALIDATED>");
			System.exit(0);
			break;
		}
		default:{
			System.out.println("!!ENTERED CHARACTER IS INVALID!!");
			break;
		}
		}
	}
	public void details(int id,char ch) throws Exception{
		materials mate=new materials();
		switch(ch) {
		case 'A':{
			mate.displayDetails(id);
			m.goBack();
			break;
		}
		case'B':{
			System.out.println("<YOUR REQUEST HAS BEEN VALIDATED>");
			System.exit(0);
			break;
		}
		}
	}
		
}
		



//	public void goBack() throws Exception{
//		System.out.println("-->ENTER ret TO RETURN TO HOME PAGE<--");
//		int c=0;
//		while(c==0) {
//			String ret=sc.next();
//			if(ret.equals("ret")) {
//				m.homePage();
//				c=1;
//				break;
//			}else {
//				System.out.println("ENTERED WORD IS INVALID");
//			}
//		}
//	}
//		Project pro=new Project();
//		Manager man=new Manager();
//		System.out.println("ENTER A TO VIEW THE TABLE");
//		System.out.println("ENTER B TO ADD COMPANY TO THE TABLE");
//		System.out.println("ENTER C TO UPDATE PRICE DETAILS ABOUT THE COMPANY FROM THE TABLE");
//		System.out.println("ENTER D TO DELETE A COMPANY FROM THE TABLE");
//		System.out.println("ENTER E TO EXIT THE PAGE");
//		char tied=sc.next().charAt(0);
