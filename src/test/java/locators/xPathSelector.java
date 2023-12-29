package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPathSelector {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test1");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abscd");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		

	}

}
