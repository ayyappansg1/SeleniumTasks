package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();


		WebElement search = driver.findElement(By.xpath("//*[@title='Search']"));
		search.sendKeys("greens velmurugan"+Keys.ENTER);
		
		WebElement firstlink = driver.findElement(By.xpath("//h3[contains(text(),'Technical')]"));
		firstlink.click();
		
		
		//driver.quit();
		
		
		
		
	}

}
