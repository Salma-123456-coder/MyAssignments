package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindow {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
	
		//Instantiate the Browser driver
		ChromeDriver driver= new ChromeDriver(opt);

		//Maximize the browser window.

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Load the url
		driver.get("https://www.irctc.co.in/");
		
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
        //Alert Alert2=driver.switchTo().alert();
		
		//Alert2.accept();
		
		//Thread.sleep(1000);
		
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
		
		//Switching to child window
		
		Set<String> childwindow=driver.getWindowHandles();
		
		//Convert Set to List:
		
		List <String> Currentwindowactive=new ArrayList<String>(childwindow);
			
			
		driver.switchTo().window(Currentwindowactive.get(1));	
		
		String Titlechild=driver.getTitle();
		
		System.out.println("Title of the Child window is "+Titlechild);
		
		driver.switchTo().window(Currentwindowactive.get(0));
		
        String TitleParent=driver.getTitle();
		
		System.out.println("Title of the Parent window is "+ TitleParent);
		
		
	}

}
