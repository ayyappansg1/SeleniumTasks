package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensPair {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();


		WebElement python = driver.findElement(By.xpath("(//span[text()='Python'])[2]"));
		String firstpara = python.getText();
		System.out.println(firstpara);
		
		
		WebElement second = driver.findElement(By.xpath("//p[contains(text(),'leading')]"));
		String secondpara = second.getText();
		System.out.println(secondpara);
		
		WebElement omr2 = driver.findElement(By.xpath("//font[contains(text(),'We at')]"));
		String omraddress3 = omr2.getText();
		System.out.println(omraddress3);
		
		WebElement third = driver.findElement(By.xpath("//p[contains(text(),'We und')]"));
		String thirdadd = third.getText();
		System.out.println(thirdadd);
		
		WebElement fourth = driver.findElement(By.xpath("//p[contains(text(),'improvem')]"));
		String fourthadd = fourth.getText();
		System.out.println(fourthadd);
	
		
		//driver.quit();
		
		
		
		
	}

}
