
public class Supervisor {
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
				System.out.println("<YOUR REQUEST IS VALIDATED>");
				System.exit(0);
				break;
			}
			default:{
				System.out.print("ENTERED CHARACTER IS NOT IN CORRECT FORMAT");
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
			pr.update();
			m.goBack();
			break;
		}
		case 'C':{
			System.out.println("<YOUR REQUEST IS VALIDATED>");
			System.exit(0);
			break;
		}
		default:{
			System.out.println("ENTERED CHARACTER IS NOT IN CORRECT FORMAT");
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
		case 'B':{
			mate.update(id);
			m.goBack();
			break;
		}
		case'C':{
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

//		System.out.println("ENTER A TO VIEW THE TABLE");
//		System.out.println("ENTER B TO EXIT THE PAGE");
//		char tied=sc.next().charAt(0);