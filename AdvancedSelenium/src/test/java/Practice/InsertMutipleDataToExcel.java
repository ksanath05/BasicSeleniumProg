package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertMutipleDataToExcel {

	public static void main(String[] args) throws Throwable, Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fes = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		 Workbook book = WorkbookFactory.create(fes);
		 
		 Sheet sheet = book.getSheet("Sheet1");
		 
		 driver.get("https://www.amazon.in");
		 
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count = allLinks.size();
		
		System.out.println(count);
		
		for (int i=0; i<count; i++) {
			
			 Row row = sheet.createRow(i);
			 Cell cell = row.createCell(0);
			 cell.setCellValue(allLinks.get(i).getAttribute("href"));
		}

		 FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
		 
		 book.write(fos);
		 book.close();
		
	}

}
