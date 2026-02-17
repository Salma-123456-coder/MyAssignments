package salmaweek3day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// To do Facebook registration
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Salma");
		driver.findElement(By.name("reg_email__")).sendKeys("Testsalma@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Sultana12$$$");
		
		WebElement dropdown6=driver.findElement(By.id("day"));
		
		Select options5=new Select(dropdown6);
		options5.selectByValue("12");
		
		
       WebElement dropdown7=driver.findElement(By.id("month"));
		
		Select options6=new Select(dropdown7);
		options6.selectByValue("10");
	
	
	   WebElement dropdown8=driver.findElement(By.id("year"));
	
	    Select options7=new Select(dropdown8);
	    options7.selectByValue("1989");
	
	    driver.findElement(By.xpath("//input[@name='reg_email__']/preceding::input[4]")).click();
	    
	    Thread.sleep(3000);
	    driver.close();
	    

}
}
