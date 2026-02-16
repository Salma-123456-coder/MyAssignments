package salmaseleniumweek2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountTestleaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To create Account
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Salma");	
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("2");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		 System.out.println(driver.getTitle());
	
		
		driver.close();
		

	}

}
