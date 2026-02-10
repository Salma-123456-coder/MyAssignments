package salmaweek2.day2;



public class Browser {
	
	//create two new methods outside the main method
	
	//method LaunchBrowser with return
	
	public String launchBrowser(String Chrome){
		System.out.println("Browser launched successfully");
		return Chrome;
	}
	
	//method LaunchBrowser without return
		
	public void loadUrl() {
		System.out.println("Application launched successfully");
		
	}
	
	public static void main(String[] args) {
		// Create Object to call the two methods and return browser name-Chrome by declaring local variable
		
		
	
		Browser object=new Browser();
		String launchBrowser=object.launchBrowser("Chrome");
		System.out.println(launchBrowser);
		
		object.loadUrl();
		

		
	}

}
