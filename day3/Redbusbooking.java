package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbusbooking {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
	
		//Instantiate the Browser driver
		ChromeDriver driver= new ChromeDriver(opt);

		//Maximize the browser window.

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		//Load the url
		driver.get("https://www.redbus.in//");

		//Enter the source input as Chennai
		driver.findElement(By.id("srcinput")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Koyambedu')]")).click();

		//Enter the destinationinput as Salem
		driver.findElement(By.id("destinput")).sendKeys("Salem");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Salem')]")).click();

		Thread.sleep(3000);
		//Click on the Date picker.
		driver.findElement(By.xpath("//div[contains(@aria-label,'Select Date of Journey')]")).click();
		driver.findElement(By.xpath("//div[contains(@data-datetype,'AVAILABLE')]")).click();
		
		//Click on the search buses
		driver.findElement(By.xpath("//button[contains(@aria-label,'Search buses')]")).click();
		
		//To display the searched results of Buses
		
		String total=driver.findElement(By.xpath("//div[contains(@class,'busesFoundText')]")).getText();
		
		System.out.println("Total no of buses displayed in the search is "+total);
		
		//Choosing the filters
		
		driver.findElement(By.xpath("//div[contains(text(),'AC')][1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'High Rated Buses')]")).click();
		
		//Capturing Busprices
		
		List<WebElement> elements = driver.findElements(By.xpath("//p[contains(@class,'finalFare')][1]"));
		
		List<Integer> Pricedisplayed= new ArrayList<Integer>();
		
		for (int i = 0; i < elements.size(); i++) {
			System.out.println("The value of i is " +i);
			String Price=elements.get(i).getText();
			
			System.out.println("List of Bus Prices are as follows " + Price);
			String P1 = Price.replaceAll("[^0-9]", "");
			int P2 = Integer.parseInt(P1);
			 Pricedisplayed.add(P2); 
			
			 System.out.println("List of Bus Prices after adding in the list are as follows " + Pricedisplayed);
			
			
			
		}
		
		 //To sort the List and get the lowest bus price
		
		Collections.sort(Pricedisplayed);
		System.out.println("The lowest Bus price is "+ Pricedisplayed.get(0));
		
		System.out.println("The Title of the Page is "+ driver.getTitle());
		
		driver.close();
		
				
	}

}
