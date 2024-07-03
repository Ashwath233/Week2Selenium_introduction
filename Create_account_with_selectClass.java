package assignment_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_account_with_selectClass {

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
		
		// DropDown
		WebElement industry1 = driver.findElement(By.name("industryEnumId"));
		Select industry2 = new Select(industry1);
		industry2.selectByIndex(3);
		
		WebElement ownership1 = driver.findElement(By.name("ownershipEnumId"));
		Select ownership2 = new Select(ownership1);
		ownership2.selectByVisibleText("S-Corporation");
		
		WebElement Source1 = driver.findElement(By.name("dataSourceId"));
		Select Source2 = new Select(Source1);
		Source2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement Market1 = driver.findElement(By.name("marketingCampaignId"));
		Select Market2 = new Select(Market1);
		Market2.selectByIndex(6);
		
		WebElement State1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select State2 = new Select(State1);
		State2.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		driver.close();
		
		
}
}