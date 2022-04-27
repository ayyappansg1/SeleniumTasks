package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAdayar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();


		WebElement title = driver.findElement(By.xpath("(//h6[contains(text(),'Greens Technology')])[1]"));
		String titleprint = title.getText();
		System.out.println(titleprint);
		
		WebElement door = driver.findElement(By.xpath("//span[contains(text(),'No:11,')]"));
		String doornu = door.getText();
		System.out.println(doornu);
		
		WebElement adayar = driver.findElement(By.xpath("//span[contains(text(),'First')]"));
		String adayaraddress = adayar.getText();
		System.out.println(adayaraddress);
		
		WebElement adayar1 = driver.findElement(By.xpath("//span[contains(text(),'pad')]"));
		String adayaraddress2 = adayar1.getText();
		System.out.println(adayaraddress2);
		WebElement about1 = driver.findElement(By.xpath("//span[contains(text(),'Chennai-600 020')]"));
		String aboutpart2 = about1.getText();
		System.out.println(aboutpart2);
		
		
		//driver.quit();
		
		
		
		
	}

}
