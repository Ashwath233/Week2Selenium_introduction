package assignment_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_assignmentWeek2 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ashwath");
		driver.findElement(By.name("lastname")).sendKeys("Narayanan");
		driver.findElement(By.name("reg_email__")).sendKeys("ashwath223@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Ashwath@995");
		
		// Dropdown
		WebElement day1 = driver.findElement(By.id("day"));
		Select day2 = new Select(day1);
		day2.selectByIndex(17);
		
		WebElement month1 = driver.findElement(By.id("month"));
		Select month2 = new Select(month1);
		month2.selectByVisibleText("Aug");
		
		WebElement year1 = driver.findElement(By.id("year"));
		Select year2 = new Select(year1);
		year2.selectByVisibleText("2024");
		driver.close();
	}
}
