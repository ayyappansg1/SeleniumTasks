package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableGuruDemotable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("/html/body/table"));
		System.out.println("Printing All Values");
		System.out.println(table.getText());
		System.out.println("--------------");
		System.out.println("Printing Even Rows ");
		
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < allrows.size(); i++) {
			WebElement element = allrows.get(i);
			if(i%2!=0) {
				System.out.println(element.getText());
			}
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
