package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonRegister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(signin).perform();
		Thread.sleep(3000);
		
		
		WebElement signup = driver.findElement(By.xpath("(//a[@class='nav-a'])[1]"));
		signup.click();
		
		WebElement firstname = driver.findElement(By.id("ap_customer_name"));
		firstname.sendKeys("ayyappan");
		
		WebElement mobile = driver.findElement(By.id("ap_email"));
		mobile.sendKeys("8989898989");
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("8989898465");
		
		WebElement passcheck = driver.findElement(By.id("ap_password_check"));
		passcheck.sendKeys("89898988989");
		WebElement click=driver.findElement(By.id("continue"));
		click.click();
	}

}
