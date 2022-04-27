package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintOmr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();


		WebElement title = driver.findElement(By.xpath("(//h6[contains(text(),'Greens Technology')])[2]"));
		String titleprint = title.getText();
		System.out.println(titleprint);
		
		WebElement door = driver.findElement(By.xpath("//span[contains(text(),'Plot No.19,')]"));
		String doornu = door.getText();
		System.out.println(doornu);
		
		WebElement omr = driver.findElement(By.xpath("//span[contains(text(),'Balamu')]"));
		String omraddress = omr.getText();
		System.out.println(omraddress);
		
		WebElement omr1 = driver.findElement(By.xpath("//span[contains(text(),'OMR Road')]"));
		String omraddress2 = omr1.getText();
		System.out.println(omraddress2);
		WebElement omr2 = driver.findElement(By.xpath("//span[contains(text(),'Okkiam')]"));
		String omraddress3 = omr2.getText();
		System.out.println(omraddress3);
		
		WebElement omr3 = driver.findElement(By.xpath("//span[contains(text(),'Jain')]"));
		String omraddress4 = omr3.getText();
		System.out.println(omraddress4);
		
		
		
		//driver.quit();
		
		
		
		
	}

}
