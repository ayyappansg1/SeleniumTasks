package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopcluse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		driver.manage().window().maximize();


		WebElement search = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		search.sendKeys("mobiles"+Keys.ENTER);
		WebElement mobiles = driver.findElement(By.xpath("//h2[contains(text(),'Keypad')]"));
		mobiles.click();
		
		
		//driver.quit();
		
		
		
		
	}

}
