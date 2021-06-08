package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Test4_DynamicDropdDown {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Dynamic Drop Down 
		 */
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Browser Drivers\\Chrome_90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='VGA']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click(); //Few will not allow this format of writing xpath
		
		
		//Using Parent Child relationship we can write our Xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
	}

}
