package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class4 {
//Click on the About link and verify the total number of link is Greater than 5 and print the link name (Use Webdriver Wait/ Assertion)
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\GROWSKILL\\Jar file\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/about");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		
		List<WebElement> lc = driver.findElements(By.tagName("a"));
		int i;
		for (i = 5; i < lc.size(); i++) {
			if(lc.size()>=5) {
				System.out.println(lc.get(i).getText() + "-" + lc.get(i).getAttribute("href"));
			}
			

	}

}}
