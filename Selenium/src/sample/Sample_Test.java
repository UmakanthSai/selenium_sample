package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Browser Drivers\\Chrome_90\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); //gets the current URL in the browser
		driver.get("https://www.toolsqa.com/rest-assured-tutoriala");
		Thread.sleep(1000);
		driver.getTitle();
		driver.navigate().back();
		driver.close();
	}

}
