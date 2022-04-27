package org.day8;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		
		
		
		WebElement dummy = driver.findElement(By.id("DUMMY1"));
		dummy.click();
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("(//input[@name='AuthenticationFG.USER_PRINCIPAL'])"));
		email.sendKeys("ayyapppang");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
		pass.sendKeys("asdsadn");
		
		WebElement loginclick = driver.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']"));
		loginclick.click();
	
		
		
		
		
	}

}
