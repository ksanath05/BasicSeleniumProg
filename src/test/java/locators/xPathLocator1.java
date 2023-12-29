package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPathLocator1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.online.citibank.co.in/");
		Thread.sleep(5000);
		//xpath by attribute
		
		driver.findElement(By.xpath("//img[@title='LOGIN NOW']")).click();

	}

}
