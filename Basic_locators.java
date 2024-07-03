package assignment_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("ashwath narayanan");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		driver.findElement(By.id("officeSiteName")).sendKeys("Leaftaps");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
