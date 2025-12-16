package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Validation All the necessary UI Elements are Present and Clickable (Textbox, Calculate Button, About, Terms and Condition and Privacy Link)
public class Class1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\GROWSKILL\\Jar file\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='number']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='/about']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/privacy']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/terms']")).click();
		driver.navigate().back();
		//Thread.sleep(1000);
	    driver.close();

	}

}
