package julyPlaywrigt;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Class5 {

	public static void main(String[] args) throws Exception {
		 Playwright playwright = Playwright.create();
		 Browser browser =	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 Page page =browser.newPage();
		 
		 page.navigate("https://qainterview.pythonanywhere.com/");
		 Thread.sleep(1000);
		 
		 page.pause();

	}

}
