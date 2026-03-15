package week6.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Salesforceusingxcel  extends Conditionsforsalesforce{

	@BeforeClass
	
	public void setData() {
		Filename="SalesforceLegalEntity";
	}
	

	@Test(dataProvider = "getValue")
	
	

	public void Saleforce2(String Legalname, String CName, String value) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		
		
		  
        WebElement ScrollTo3 = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(ScrollTo3).perform();
		ScrollTo3.click();
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by "+Legalname );
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(CName);
		//driver.findElement(By.xpath("//div[@class='slds-form-element__control textarea-container slds-grow']/textarea[@id='input-680']")).sendKeys("Salesforce");
		
		 WebElement ScrollTo4 = driver.findElement(By.xpath("//button[@aria-label='Status']"));
			
			Actions act1=new Actions(driver);
			act1.scrollToElement(ScrollTo4).perform();
			driver.executeScript("arguments[0].click();", ScrollTo4);
			//ScrollTo2.click();
		//driver.findElement(By.xpath("//button[@aria-label='Status']")).click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(300);
		
		//Switch to Alert:
				//Alert Alert3=driver.switchTo().alert();
				
				//Alert3.dismiss();
				
				//Get the text displayed
				
				String LegalEntityname=driver.findElement(By.xpath("//slot[@name='outputField']/lightning-formatted-text")).getText();
				
				System.out.println("The Legal Entity Name created is" +LegalEntityname);
				
				

	}




}





