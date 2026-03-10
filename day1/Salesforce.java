package week6.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Salesforce extends Preequisite{
	
	@Test

	public void Saleforce() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		
		
		  
        WebElement ScrollTo1 = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(ScrollTo1).perform();
		ScrollTo1.click();
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//div[@class='slds-form-element__control textarea-container slds-grow']/textarea[@id='input-680']")).sendKeys("Salesforce");
		
		 WebElement ScrollTo2 = driver.findElement(By.xpath("//button[@aria-label='Status']"));
			
			Actions act1=new Actions(driver);
			act1.scrollToElement(ScrollTo2).perform();
			driver.executeScript("arguments[0].click();", ScrollTo2);
			//ScrollTo2.click();
		//driver.findElement(By.xpath("//button[@aria-label='Status']")).click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		//Switch to Alert:
				//Alert Alert3=driver.switchTo().alert();
				
				//Alert3.dismiss();
				
				//Get the text displayed
				
				String Textdisplayed=driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
				
				System.out.println(Textdisplayed);
				
				

	}

}
