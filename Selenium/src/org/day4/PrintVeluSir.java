package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintVeluSir {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement trainer = driver.findElement(By.xpath("//span[@title='Trainer']"));
		trainer.click();
		
		WebElement first = driver.findElement(By.xpath("//b[contains(text(),'Test')]"));
		String firsttitle = first.getText();
		System.out.println(firsttitle);
		
		WebElement about = driver.findElement(By.xpath("//p[contains(text(),'switch')]"));
		String aboutpart1 = about.getText();
		System.out.println(aboutpart1);
		WebElement about1 = driver.findElement(By.xpath("//p[contains(text(),'currently fo')]"));
		String aboutpart2 = about1.getText();
		System.out.println(aboutpart2);
		WebElement about2 = driver.findElement(By.xpath("//p[contains(text(),'conferences')]"));
		String aboutpart3 = about2.getText();
		System.out.println(aboutpart3);
		
		//driver.quit();
		
		
		
		
	}

}
