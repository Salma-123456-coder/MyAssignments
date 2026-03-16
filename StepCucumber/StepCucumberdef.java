package StepCucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepCucumberdef {
	
	ChromeDriver driver;

	@Given(": launch the browser")
	public void launch_the_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\SeleniumSF");
	    driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    
	}
	@Given(": load the url")
	public void load_the_url() {
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When(": enter the Username")
	public void enter_the_username() {
		driver.findElement(By.id("username")).sendKeys("ssultana1289.a80cd509b818@agentforce.com");
	}
	@When(": enter the Password")
	public void enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("Sultana12$");
	}
	@When(": Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}
	@Then(": it will navigate to the Home page")
	public void it_will_navigate_to_the_home_page() {
	    String titleSalesforce = driver.getTitle();
	    System.out.println(titleSalesforce);
	}
	@When(": Click on the toggle menu")
	public void click_on_the_toggle_menu() {

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
	     
	}
	@When(": Click View All")
	public void click_view_all() {
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	}
	@When(": Click Sales from App Launcher")
	public void click_sales_from_app_launcher() {
		
		
		WebElement ScrollTo1 = driver.findElement(By.xpath("//p[text()='Sales']"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(ScrollTo1).perform();
		driver.executeScript("arguments[0].click();", ScrollTo1);
	    
	}
	@When(": Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement accounts = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Accounts']"))
		);
		driver.executeScript("arguments[0].click();", accounts);

		
	}
	@When(": Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	@When(": Enter {string} as account name")
	public void enter_as_account_name(String string) throws InterruptedException {
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Priyanka Sultana");
	}
	@When(": Select Ownership as Public")
	public void select_ownership_as_public() {
		WebElement ScrollTo2 = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		driver.executeScript("arguments[0].click();", ScrollTo2);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}
	@When(": Click save")
	public void click_save() throws InterruptedException {
		
		WebElement ScrollTo3 = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		driver.executeScript("arguments[0].click();", ScrollTo3);
		
	}
	@Then(": verify Account name")
	public void verify_account_name() {
		//driver.findElement(By.xpath("//a[text()='Details']")).click();
		
		//Get the Account name displayed
		
		String Accountname=driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		
		System.out.println("The Account Name created is" +Accountname);
	}

}
