package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DecathlonShopping {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
	
		//Instantiate the Browser driver
		ChromeDriver driver= new ChromeDriver(opt);

		//Maximize the browser window.

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the url
		driver.get("https://www.decathlon.in/");

		//Click the search box
		driver.findElement(By.xpath("//span[contains(@class,'index-module_type__E-SaG')][1]")).click();
		Thread.sleep(300);
		
		//Enter the search Input for Shoes:
		 driver.findElement(By.xpath("//input[contains(@placeholder,'Search For 60+ Sports and 6000+ Products')]")).sendKeys("Shoes",Keys.ENTER);
		
		 
		 //Choose the filters:
		driver.findElement(By.xpath("//span[contains(text(),'Running')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Men')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Most Relevant')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Highest Discount')]")).click();
		
		//Click the first available product
		driver.findElement(By.xpath("//button[@aria-label='addToCart']")).click();
		
		//Select size
		driver.findElement(By.xpath("//div[contains(text(),'8.5')]")).click();
		
		//Click Add to cart Button:
		driver.findElement(By.xpath("//button[@type='button']//following::span[contains(text(),'ADD TO CART')]")).click();
		
		Thread.sleep(5000);
		
		//Click the Cart icon:
		driver.findElement(By.xpath("//a[@aria-label='cart']")).click();
		
		
		//To Verify Item added to cart or not:
		String Quantity=driver.findElement(By.xpath("//span[@data-test-id='qty-display']")).getText();
		System.out.println(Quantity);
		
		
		int Quantity1=Integer.parseInt(Quantity);
		
			
		if (Quantity1>0) {
			System.out.println("Item successfully added to Cart");
			
		}
			else {
				
				System.out.println("Item Not added to Cart");
			}
			
		
		//Close the browser:
		
		driver.close();
		
		
	}}


