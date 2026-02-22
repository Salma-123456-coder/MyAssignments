package salmaweek3day3;

public class LoginTestData extends TestData{
	
	
	public void enterUsername()
	{
		
	}

	public void enterPassword() {
		
	}

	
	public static void main(String[]args) {
		
		LoginTestData calling=new LoginTestData();
		calling.enterCredentials();
		calling.enterUsername();
		calling.enterPassword();
		calling.navigateToHomePage();
		
	}
	
}
