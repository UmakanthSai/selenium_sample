package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Test5_Autosuggestion_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Browser Drivers\\Chrome_90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[@class='text-label'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement loop : options) {
			if(loop.getText().equalsIgnoreCase("Navi Mumbai")) {
				loop.click();
				break;
			}
		}
		//driver.close();
	}

}
