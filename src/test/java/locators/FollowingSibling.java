package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FollowingSibling {

	public static void main(String[] args) {
	
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.amazon.in/");
				
				WebDriverWait wait = new WebDriverWait(driver, 10);
				
				WebElement driver1 = driver1.findElement(By.xpath("//a[text()='Sell']/following-sibling::a[6]")).click();
	}

}
