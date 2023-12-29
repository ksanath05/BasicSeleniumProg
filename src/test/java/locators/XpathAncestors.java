package locators;

import org.openqa.selenium.WebDriver;

public class XpathAncestors {

	public static void main(String[] args) {
		public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/s?k=lenovo+laptops&crid=DDEUSHYCHC14&sprefix=lenov%2Caps%2C144&ref=nb_sb_ss_ts-doa-p_2_5");

			//span[contains(text(),'Lenovo IdeaPad 3 11th Gen Intel Core i3 15.6')]/../../../../../..
	}

}
