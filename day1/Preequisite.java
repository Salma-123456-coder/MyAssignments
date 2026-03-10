package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Preequisite {
	
	ChromeOptions options;
	ChromeDriver driver;
		
		
		
		@Parameters({"url","username","password"})
		
		@BeforeMethod

	public void pre(String url, String Uname, String Pword) {
			options = new ChromeOptions();
			options.addArguments("--user-data-dir=C:\\SeleniumSF");
			options.addArguments("--disable-notifications");
		
			//Instantiate the Browser driver
			driver= new ChromeDriver(options);

			//Maximize the browser window.

			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			
			driver.findElement(By.id("username")).sendKeys(Uname);
			driver.findElement(By.id("password")).sendKeys(Pword);
			driver.findElement(By.id("Login")).click();

	}
		
		@AfterMethod
		
		public void post() {
		
		driver.close();
	}
		

}
