package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ID_linktext_partiallinkText {

	public static void main(String[] args) throws Throwable {
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.id("email")).sendKeys("Test");
				driver.findElement(By.name("pass")).sendKeys("test2");
				WebElement login = driver.findElement(By.name("login"));
				Thread.sleep(5000);
				login.click();
				driver.quit();
	
	}

}
