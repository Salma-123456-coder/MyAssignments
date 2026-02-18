package salmaweek3day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadusingadvXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
	
		//Instantiate the Browser driver
		ChromeDriver driver= new ChromeDriver(opt);

		//Maximize the browser window.

		driver.manage().window().maximize();
		

		//Load the url
		driver.get("http://leaftaps.com/opentaps/");

		//Enter the username as ‘demosalesmanager’
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		//Enter the password as 'crmsfa'
		driver.findElement(By.id("password")).sendKeys("crmsfa");

	
		//Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		  
		  //Click on the CRM/SFA link
		  driver.findElement(By.partialLinkText("CRM/SFA")).click();
		  
		  //Click on the Leads tab.
		  driver.findElement(By.xpath("//a[text()='Leads']")).click();
		  
		  //Click on the Create Lead link from shortcuts.
		  driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		  
		  //driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/td")).sendKeys("SalmaXpath");
		  driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']/preceding::input[1]")).sendKeys("SalmaXpath");
		  
		  //driver.findElement(By.xpath("//td[@id='ext-gen609']/input")).sendKeys("SultanaXpath");
		  driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']/preceding::input[2]")).sendKeys("SultanaXpath");
		  //driver.findElement(By.xpath("//td[@id='ext-gen590']/input")).sendKeys("TestLeafAutomationTraing");
		  
		  driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/preceding::input[2]")).sendKeys("TestLeafAutomationTraining");
		  
		 // driver.findElement(By.xpath("//td[@id='ext-gen596']/input")).sendKeys("Miss");
		  
		  driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']/preceding::input[1]")).sendKeys("Miss");
		  Thread.sleep(3000);
		  
		  driver.close();
		  

	}

}
