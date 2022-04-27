package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAvaScriptAdactin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement click = driver.findElement(By.id("login"));
		
		String scriptforSendTextemail="arguments[0].setAttribute('value','ayyappansg12gmail.com')";
		String scriptforClick="arguments[0].click()";
		String scriptforSendTextpass="arguments[0].setAttribute('value','94949494949')";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript(scriptforSendTextemail, email);
		js.executeScript(scriptforSendTextpass, password);
		js.executeScript(scriptforClick, click);

		
	}

}
