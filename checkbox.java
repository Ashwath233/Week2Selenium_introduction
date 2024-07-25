package ass_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text() = 'Basic']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text() = 'Ajax']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text() = 'Python']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class = 'ui-toggleswitch ui-widget']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@data-label = 'Cities']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[11]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]")).click();
		Thread.sleep(4000);
		driver.quit();		
		
		
		}

}
