package week6.day2;



	
		import java.time.Duration;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



		public class Saleforcedynamic extends Prerequisite{
			
			
			@DataProvider(name = "getValues")
			public String[][] fetchData() {
				// |Legalname|CName|
				// |Salma|Testleaf|
				// |Sultana|Testleaf|

				String[][] data = new String[2][2];
				data[0][0] = "Sindhu";
				data[0][1] = "TestLeaf";
				

				data[1][0] = "Bairavi";
				data[1][1] = "TestLeaf";
				
				return data;
			}

			@Test(dataProvider = "getValues")
			
			

			public void Saleforce1(String Legalname, String CName) throws InterruptedException {
				
				
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


