package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Verify the Placeholder in Textbox is = 'Enter an integer'
//Verify the Title of the page contains = 'Factorial' 
//Verify the URL contains = 'https'
public class Class2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\GROWSKILL\\Jar file\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
	/*	boolean isDisplayed = driver.findElement(By.xpath("//input[@name=\"number\"]")).isDisplayed();
		System.out.println(isDisplayed);           */
		
		String att = driver.findElement( By.id("number")).getAttribute("placeholder");
		System.out.println("Yes it is verified as "+att);
		
		
		String apptitle = driver.getTitle();
		if (apptitle.contains("Factorial")) {
			System.out.println("Factorial page verify contains Factorial");
		}else {
			System.out.println("Factorial page not verify");
		}
	
		String appURL =  driver.getCurrentUrl();
		// System.out.println("Application URL is "+ appURL);
		if (appURL.contains("https")) {
			System.out.println("URL contains https");
		}else {
			System.out.println("URL not contains https");
		}
		
	
		driver.close();
	}

}
