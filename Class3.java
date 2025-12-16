package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementText;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Class3 {
//	Data Driven testing (4 to 10) find out the factorial and verify the result
	
	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("C:\\Users\\Admin\\Downloads\\GROWSKILL\\project\\TestSenario.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet2");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\GROWSKILL\\Jar file\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(s.getCell(1, 1).getContents());
		driver.manage().window().maximize();
		Thread.sleep(1000); 
		
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).sendKeys(s.getCell(0, 10).getContents());
		driver.findElement(By.xpath(s.getCell(1, 4).getContents())).click();
		Thread.sleep(1000); 
		driver.navigate().refresh();
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).sendKeys(s.getCell(0, 11).getContents());
		driver.findElement(By.xpath(s.getCell(1, 4).getContents())).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).sendKeys(s.getCell(0, 12).getContents());
		driver.findElement(By.xpath(s.getCell(1, 4).getContents())).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).sendKeys(s.getCell(0, 13).getContents());
		driver.findElement(By.xpath(s.getCell(1, 4).getContents())).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).sendKeys(s.getCell(0, 14).getContents());
		driver.findElement(By.xpath(s.getCell(1, 4).getContents())).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).sendKeys(s.getCell(0, 15).getContents());
		driver.findElement(By.xpath(s.getCell(1, 4).getContents())).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).sendKeys(s.getCell(0, 16).getContents());
		driver.findElement(By.xpath(s.getCell(1, 4).getContents())).click();
		
		
		
	
		driver.close();
}
}