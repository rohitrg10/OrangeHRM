package Demo.Axis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Login {
	public static WebDriver driver;
	
	@Test
	public void log(){
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	System.out.println("OrangeHRM's Login Page Opened");
	
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.click();
	username.sendKeys("Admin");
	System.out.println("Username Added Successfully");
	
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.click();
	password.sendKeys("admin123");
	System.out.println("Password Added Successfully");
	
	WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	submit.click();
	System.out.println("Login Successfully");
	
	WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
	myInfo.click();
	System.out.println("Clicked on myinfo");
	
	}
}
