package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement first = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		first.sendKeys("Ayyappan");
		WebElement last=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		last.sendKeys("Gunasekaran");
		WebElement address=driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("Mannargudi");
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("ayyappa@gmail.comn");
		WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("8903276015");
		WebElement gender=driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		WebElement click1=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		click1.click();
		WebElement click2=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		click2.click();
		WebElement click3=driver.findElement(By.xpath("//input[@id='checkbox3']"));
		click3.click();
		WebElement pass=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys("8903276015");
		WebElement conf=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		conf.sendKeys("8903276015");
		
		
		
		
		
		
		
		
		
	}

}
