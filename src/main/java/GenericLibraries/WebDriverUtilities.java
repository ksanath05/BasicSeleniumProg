package GenericLibraries;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	
	// 1. Mouse Hovering
	
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions (driver);
		a.moveToElement(ele).perform();
	}
	
	// 2. Double clicking
	
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions (driver);
		a.doubleClick(ele).perform();
	}
	
	// 3. Right clicking
	
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions (driver);
		a.contextClick(ele).perform();
	}
	
	// 4. drag and drop
	
	public void dragAndDrop(WebDriver driver, WebElement ele, WebElement ele2) {
		Actions a = new Actions (driver);
		a.dragAndDrop(ele, ele2).perform();
	}
	
	// 5. handling alter pop up clicking on OK
	
	public void alter(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	// 6. handling alter pop up clicking on cancel
	
	public void alterCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	// 7. Child browser
	
	public void childBrowser(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String b:child) {
			driver.switchTo().window(b);
		}
	}
	
	// 8. Parent browser
	
	public void parentBrowser(WebDriver driver) {
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
	}
	
	// 9. implicit wait
	
	public void implicitwait(WebDriver driver, int num) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
	}
	
	// 10. Explicit wait
	
	public void explicitwait(WebDriver driver, Duration t, WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver, t);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	// 11. AlterPopUp
	
	public void AlterPopUp(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}