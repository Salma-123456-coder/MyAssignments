package salmaweek3day4;

public class LoginPage extends BasePage{
	
	//Overriding method from BasePage
	
	public void performCommonTasks() {
	
		System.out.println("This is method from Login Page");
		
	}
	
	//Creating object to call methods from Basepage and Login Page
	
	public static void main(String[]args) {
		
		LoginPage obj=new LoginPage();
		
		obj.findElement();
		obj.clickElement();
		obj.enterText();
		obj.performCommonTasks();
		
	}
	

}
