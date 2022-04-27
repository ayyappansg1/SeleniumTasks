package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableGuru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//center//following::table"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		System.out.println(table.getText());
		System.out.println("------------");
		for (int i = 0; i < allrows.size(); i++) {
			WebElement row = allrows.get(i);
			System.out.println(row.getText());
			
		}
		driver.quit();
	}

}
