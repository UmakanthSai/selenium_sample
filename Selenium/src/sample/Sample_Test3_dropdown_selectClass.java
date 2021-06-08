package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample_Test3_dropdown_selectClass {

	/*
	 Requirement: Spice Jet page
	 1. select currency static drop down as USD and change it back to INR
	 2. select passenger drop down and set adult 3, child 2
	 
	 */
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Browser Drivers\\Chrome_90\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		// using webelemet class we passed static dropdown to an object
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//using select class we can do multiple functions but we need to pass the webelemnt object to select class
		Select currency_dropdown = new Select(currency);
		System.out.println("Default currency: "+currency_dropdown.getFirstSelectedOption().getText());
		
		currency_dropdown.selectByValue("USD");
		System.out.println("Updated currency: "+currency_dropdown.getFirstSelectedOption().getText());
		currency_dropdown.selectByValue("INR");
		System.out.println("Updated currency: "+currency_dropdown.getFirstSelectedOption().getText());

		//Selecting Passengers
		driver.findElement(By.id("divpaxinfo")).click();
		//Selecting Adult static dropdown
		WebElement  passengers_Adult =driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select passengers_dropdown_Adult = new Select(passengers_Adult);
		passengers_dropdown_Adult.selectByValue("3");
		System.out.println("Adults: "+passengers_dropdown_Adult.getFirstSelectedOption().getText());
		
		WebElement  passengers_Child =driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select passengers_dropdown_Child = new Select(passengers_Child);
		passengers_dropdown_Child.selectByValue("2");
		System.out.println("Childs: "+passengers_dropdown_Child.getFirstSelectedOption().getText());
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		
		driver.close();
		

}}
