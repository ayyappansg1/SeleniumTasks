package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAvaScriptGreensPorur {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();

		WebElement porur=driver.findElement(By.xpath("(//font[@size='-1'])[15]"));
		Thread.sleep(3000);
		String scriptforscrollup="arguments[0].scrollIntoView(true)";

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript(scriptforscrollup,porur);
		Object executeScript = js.executeScript("document.getElementByXpath('(//font[@size='-1'])[15]').innerText");
		String s=(String) executeScript;
		System.out.println(s);

	}

}
