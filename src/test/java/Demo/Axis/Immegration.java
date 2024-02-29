package Demo.Axis;

import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test
public class Immegration extends Login{
	
	
	@AfterMethod
	public void immegration() {
		
		WebDriver driver = Login.driver;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement username2 = driver.findElement(By.xpath(" (//a[normalize-space()='Immigration'])[1]"));
		username2.click();
		System.out.println("Clicked on Immegration");
		
		WebElement addbutton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		addbutton.click();
		System.out.println("Clicked on Add Button");

		WebElement radio1 = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
		radio1.click();
		System.out.println("Clicked on Radio Button ");

		WebElement number1 = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		number1.click();
		number1.sendKeys("123456");
		System.out.println("Number Added Successfully");
		
		WebElement issdate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		issdate.click();
		issdate.sendKeys("2023-01-01");
		System.out.println("Issue Date Selected");
		
		WebElement expdate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		expdate.click();
		expdate.sendKeys("2026-01-01");
		System.out.println("Expiry Date Selected");

		WebElement eligiblestatus = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
		eligiblestatus.click();
		eligiblestatus.sendKeys("YES");
		System.out.println("Eligible Status Added");
		
		WebElement revdate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]"));
		revdate.click();
		revdate.sendKeys("2023-08-03");
		System.out.println("Review Date Selected");
		
		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("MangoHRM would be better");
		System.out.println("Clicked on Comments Box ");
		
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		System.out.println("Data is Saved");
		
		
	}

}



