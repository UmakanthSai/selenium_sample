package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Test1 {

	//Facebook Login
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Browser Drivers\\Chrome_90\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:\\facebook.com");
		driver.findElement(By.id("email")).sendKeys("Umakanth Sai");
		driver.findElement(By.name("pass")).sendKeys("Forgoten");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.close();
	}

}
