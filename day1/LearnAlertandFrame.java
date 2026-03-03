package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlertandFrame {

	public static void main(String[] args) {
		
		

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
	
		//Instantiate the Browser driver
		ChromeDriver driver= new ChromeDriver(opt);

		//Maximize the browser window.

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Load the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//Switch to IFrame
		driver.switchTo().frame("iframeResult");
		
		//Locate the button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Switch to Alert:
		Alert Alert1=driver.switchTo().alert();
		
		Alert1.dismiss();
		
		//Get the text displayed
		
		String Textdisplayed=driver.findElement(By.id("demo")).getText();
		
		System.out.println(Textdisplayed);
		
		String Text1="You pressed OK!";
		
		if (Text1.equals(Textdisplayed)) {
			
			System.out.println("User clicked OK Button");
		}
			
			else {
				
				System.out.println("User clicked Cancel Button");
			}
			
		}
		
		

	}


