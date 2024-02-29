package Demo.Axis;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Attachments extends Login {

	@AfterMethod
	public void addAttachments() {

		WebDriver driver = Login.driver;
		WebElement imme = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
		imme.click();
		System.out.println("Clicked on Immegration");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement ele = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		ele.click();
		System.out.println("Clicked on Add Attachments Button");

		
		WebElement file = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		file.sendKeys("C:\\Users\\rohit\\Downloads\\QA Axis Bank\\New Text Document.txt");
		 
		WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
		comments.click();
		comments.sendKeys("Text File Uploaded");
		System.out.println("Clicked on Comments Box ");
		 
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		System.out.println("Attachment is Saved");
		 
		
		 

	}
}
