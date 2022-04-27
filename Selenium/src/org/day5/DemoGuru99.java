package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru99 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement pickbank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dropbank = driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(pickbank, dropbank).perform();
		
		WebElement picksales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dropsales = driver.findElement(By.xpath("//ol[@id='loan']"));
		actions.dragAndDrop(picksales, dropsales).perform();
		
		WebElement pickamount1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));		
		WebElement dropamount1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		actions.dragAndDrop(pickamount1, dropamount1).perform();
		
		WebElement pickamount2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dropamount2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		actions.dragAndDrop(pickamount2, dropamount2).perform();
		
		WebElement printing = driver.findElement(By.xpath("(//a[@class='button button-green'])[1]"));
		String printed = printing.getText();
		System.out.println(printed);
	}

}
