package salmaweek3day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// Advanced X Path
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
	
		//Instantiate the Browser driver
		ChromeDriver driver= new ChromeDriver(opt);

		//Maximize the browser window.

		driver.manage().window().maximize();
		

		//Load the url
		driver.get("http://leaftaps.com/opentaps/");

		
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		
		//Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
				  
		//Click on the CRM/SFA link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
				  
		//Click on the Leads tab.
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
				  
		//Click on the Create Lead link from shortcuts.
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']/following::input[2]")).sendKeys("SalmaLead2");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']/following::input[3]")).sendKeys("SultanaLead2");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']/following::input[3]")).sendKeys("AjLead2");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/preceding::input[2]")).sendKeys("TestLeafAutomationFeb2");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/following::input[7]")).sendKeys("Testing2");
		driver.findElement(By.xpath("//input[@id='createLeadForm_sicCode']/following::input[7]")).sendKeys("ssultana1289@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']/preceding::textarea")).sendKeys("AutomationPractice2");
		
		
		WebElement dropDownElement1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select options1=new Select(dropDownElement1);
	
		options1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("To automate the Testleaf app");
		driver.findElement(By.name("submitButton")).click();
		
		String Text=driver.getTitle();
		System.out.println("Title of the Resulting Page is : "+ Text);
		driver.close();
	}

}
