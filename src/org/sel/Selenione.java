package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenione 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("prabhu");
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("prem");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
	}
}
