package org.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GuruAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement dummy = driver.findElement(By.xpath("(//button[@id='details-button'])"));
		dummy.click();
		WebElement dumm1 = driver.findElement(By.xpath("(//a[@id='proceed-link'])"));
		dumm1.click();
		Thread.sleep(3000);
		WebElement countrybox = driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(countrybox);
		List<WebElement> options = select.getOptions();
		System.out.println("Countries in the options");
		for (int i = 0; i < options.size(); i++) {
			WebElement ele = options.get(i);
			String countries = ele.getAttribute("value");
			System.out.println(countries);
			}
		}
	}


