package salmaweek3day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		
		//To Handle dropdowns
		
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments("guest");
				ChromeDriver driver = new ChromeDriver(opt);
				
						
						driver.manage().window().maximize();
						driver.get("http://leaftaps.com/opentaps/");
						driver.findElement(By.id("username")).sendKeys("demosalesmanager");
						driver.findElement(By.id("password")).sendKeys("crmsfa");
						driver.findElement(By.className("decorativeSubmit")).click();
						driver.findElement(By.className("crmsfa")).click();
						driver.findElement(By.linkText("Leads")).click();
						driver.findElement(By.linkText("Create Lead")).click();
						driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Salma");
						driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sultana");
						driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SeleniumTestleaftraining");
						
						WebElement dropDownElement=driver.findElement(By.id("createLeadForm_dataSourceId"));
								
						Select options=new Select(dropDownElement);
					
						options.selectByIndex(4);
						
						
						WebElement dropDownElement1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
						
						Select options1=new Select(dropDownElement1);
					
						options1.selectByVisibleText("Automobile");
						
						
						
						WebElement dropDownElement2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
						Select options2=new Select(dropDownElement2);
						
						options2.selectByValue("OWN_CCORP");
					
				
						driver.findElement(By.name("submitButton")).click();
						
						String actualTitle = driver.getTitle();
						System.out.println("Current Page Title is: " + actualTitle);
						

						if(actualTitle.contains("Lead")) {
						    System.out.println("Title is verified successfully");
						} else {
						    System.out.println("Title verification failed");
						}
						driver.close();
			}

		


	}


