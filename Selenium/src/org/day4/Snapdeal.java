package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();


		WebElement search = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		search.sendKeys("i phone"+Keys.ENTER);
		
		WebElement first = driver.findElement(By.xpath("(//p[contains(text(),'Apple Silicon')])[1]"));
		first.click();
		
		//driver.quit();
		
		
		
		
	}

}
