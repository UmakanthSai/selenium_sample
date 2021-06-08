package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Test2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Browser Drivers\\Chrome_90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Pass");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		}

}
