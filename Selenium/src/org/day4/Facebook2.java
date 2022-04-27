package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();


		WebElement username = driver.findElement(By.xpath("//*[@id='email']"));
		username.sendKeys("ayya@gmail.coim");
		String usernameentered = username.getAttribute("value");
		System.out.println(usernameentered);
		
		WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
		password.sendKeys("8903276015");
		String passwordprint = password.getAttribute("value");
		System.out.println(passwordprint);
		
		
		//driver.quit();
		
		
		
		
	}

}
