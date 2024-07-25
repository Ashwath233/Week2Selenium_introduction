package ass_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_buttons {

	
	
	
	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//label[contains(text(),'Chrome')]")).click();
		driver.findElement(By.xpath("//label[text()= 'Bengaluru']")).click();
		Thread.sleep(4000);
		driver.quit();
	
	}
}

