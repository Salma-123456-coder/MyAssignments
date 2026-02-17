package salmaweek3day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountdropdownhomeass1 {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("SalmaPractice4");	
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester4");
		
		WebElement dropdown1=driver.findElement(By.name("industryEnumId"));
		
		Select options=new Select(dropdown1);
		options.selectByIndex(3);
		
		
         WebElement dropdown2=driver.findElement(By.name("ownershipEnumId"));
		
		Select options1=new Select(dropdown2);
		options1.selectByVisibleText("S-Corporation");
		
        WebElement dropdown3=driver.findElement(By.id("dataSourceId"));
		
		Select options2=new Select(dropdown3);
		options2.selectByValue("LEAD_EMPLOYEE");
		
        WebElement dropdown4=driver.findElement(By.id("marketingCampaignId"));
		
		Select options3=new Select(dropdown4);
		options3.selectByIndex(6);
		
	    WebElement dropdown5=driver.findElement(By.id("generalStateProvinceGeoId"));
			
		Select options4=new Select(dropdown5);
		options4.selectByValue("TX");
		
		//To create Account
		driver.findElement(By.className("smallSubmit")).click();
		
		//To verify the account name:
		String Text = driver.findElement(By.xpath("//span[text()='Local Name']/preceding::span[2]")).getText();
		System.out.println("Account name is: " + Text);
		

		if(Text.contains("SalmaPractice4")) {
		    System.out.println("Account name is verified successfully");
		} else {
		    System.out.println("Account name failed");
		}
		driver.close();
		

	}

}
