package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathLocators2 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://kuvera.in/login");
		
		Thread.sleep(3000);
		
		//x path contains
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test2");
		driver.findElement(By.xpath("//button[@id='login-btn']")).click();

	}

}
