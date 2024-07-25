package ass_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Edit_lead {

	
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		driver.findElement(By.xpath("//div[@for = 'crmsfa']")).click();
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Ashwath");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("Narayanan");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstNameLocal']")).sendKeys("Ashwath");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mechanical");
		driver.findElement(By.id("createLeadForm_description")).sendKeys(" I love Testleaf");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ashwath223@gmail.com");
		// DropDown
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select State1 = new Select(State);
		State1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("I love Testleaf");
		driver.findElement(By.className("smallSubmit")).click();
		// To Get title of the Page 
		String Pagetitle  = driver.getTitle();
		System.out.println("The Title Of the Page is " + Pagetitle);
		driver.close();
		
	}
}
