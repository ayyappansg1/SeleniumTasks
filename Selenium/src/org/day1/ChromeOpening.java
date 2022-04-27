package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.*;

public class ChromeOpening {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "E:\\java files\\SelDay1\\Drivers\\chromedriver.exe");
	
	WebDriver sangar=new ChromeDriver();
	sangar.get("https://www.greenstechnologys.com/");
	sangar.switchTo().newWindow(WindowType.TAB);
	sangar.get("https://www.gmail.com/");
	sangar.switchTo().newWindow(WindowType.TAB);
	sangar.get("https://www.flipkart.com/");
	sangar.switchTo().newWindow(WindowType.TAB);
	sangar.get("http://greenstech.in/selenium-course-content.html");
	sangar.quit();
	

	
	
	
	
	
	
	
	
	
	
	
}
}
