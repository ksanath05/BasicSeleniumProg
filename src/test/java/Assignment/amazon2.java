package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		// searching for mobiles and clicking on the first result
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		// switching to child browser
		
		Set<String> child = driver.getWindowHandles();
		for (String c: child) {
			driver.switchTo().window(c);
		}
		
		// for printing discounted and MRP through Xpath Traversing
		
		WebElement value1 = driver.findElement(By.xpath("//span[text()=' Inclusive of all taxes']/../..//span[@class='a-price-whole']"));
		System.out.println(value1.getText());
		WebElement value2 = driver.findElement(By.xpath("(//span[text()=' Inclusive of all taxes']/../..//span[@aria-hidden='true'])[2]"));
		System.out.println(value2.getText());
		
		// add to cart
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
	}

}
