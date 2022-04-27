package org.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQAPrintEven {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\java files\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
	
		
		WebElement clickstate = driver.findElement(By.xpath("//div[text()='Select State']"));
		clickstate.click();
		Thread.sleep(3000);
		WebElement clickncr=driver.findElement(By.xpath("//div[text()='NCR']"));
		clickncr.click();
		Thread.sleep(3000);
		List<WebElement> selectstate = driver.findElements(By.xpath("//div[text()='Select State']//li"));
		for (int i = 0; i < selectstate.size(); i++) {
			if(i%2!=0) {
			WebElement ele = selectstate.get(i);
			String eventstate = ele.getText();
			System.out.println(eventstate);
			}
		}
		
		List<WebElement> selectcity = driver.findElements(By.xpath("//div[text()='Select City']//li"));
		for (int i = 0; i < selectcity.size(); i++) {
			if(i%2!=0) {
			WebElement ele = selectcity.get(i);
			String evencity = ele.getText();
			System.out.println(evencity);
			}
		}
		
		



	}

}
