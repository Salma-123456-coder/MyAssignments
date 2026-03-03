package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Learnwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
	
		//Instantiate the Browser driver
		ChromeDriver driver= new ChromeDriver(opt);

		//Maximize the browser window.

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Thread.sleep(1000);
		//Clicking on Contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Clicking on Merge Contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//Clicking on Widget1
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		
		
		
		        //Switching to child window1:
		
				Set<String> childwindow1=driver.getWindowHandles();
				System.out.println(childwindow1);
				
				//Convert Set to List:
				
				List <String> Currentwindowactive1=new ArrayList<String>(childwindow1);
					
					
				driver.switchTo().window(Currentwindowactive1.get(1));
				Thread.sleep(1000);
				String Titlechild=driver.getTitle();
				
				System.out.println("Title of the Child window is "+Titlechild);
				Thread.sleep(1000);
				driver.findElement(By.linkText("12419")).click();
				//Switching to Parent window
				
				driver.switchTo().window(Currentwindowactive1.get(0));
                String Titleparent=driver.getTitle();
				
				System.out.println("Title of the parent window is "+Titleparent);
				
				//Clicking on Widget2
				driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
                 //Switching to child window2
				
				Set<String> childwindow2=driver.getWindowHandles();
				System.out.println(childwindow2);
				
				//Convert Set to List:
				
				List <String> Currentwindowactive2=new ArrayList<String>(childwindow2);
				driver.switchTo().window(Currentwindowactive2.get(1));
                 String Titlechild2=driver.getTitle();
				
				System.out.println("Title of the Child window is "+Titlechild2);
				Thread.sleep(1000);
				driver.findElement(By.linkText("FrenchCustomer")).click();
				
				//Switching to Parent window again
				driver.switchTo().window(Currentwindowactive1.get(0));
                String Titleparent2=driver.getTitle();
				
				System.out.println("Title of the parent window is "+Titleparent2);
				
				//Clicking Merge Button
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				
				//Switching to alert
				Alert alert = driver.switchTo().alert();
				alert.accept();
				
				//Get title of the Page
				String titleofthepage = driver.getTitle();
				System.out.println("The Title of the Page is" + titleofthepage);
				
				driver.close();

	}

}
