package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung Mobiles");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Samsung Galaxy S23 FE 5G')])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for (String b:child) {
			driver.switchTo().window(b);
		}
		WebElement value1 = driver.findElement(By.xpath("(//span[contains(text(),'Samsung Galaxy S23 FE 5G')])[1]/../../../..//span[@class='a-price-whole']"));
		//WebElement value2 = driver.findElement(By.xpath("((//span[contains(text(),'Samsung Galaxy S23 FE 5G')])[1]/../../../..//span[text()='₹84,999'])[1]"));
		System.out.println(value1.getText());
		//System.out.println(value2.getText());
		
	driver.findElement(By.id("add-to-cart-button")).click();

	}

}
