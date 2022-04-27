package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.*;
public class FirefoxExercise {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "E:\\java files\\SelDay1\\Drivers\\geckodriver.exe");
		
		WebDriver sangar=new FirefoxDriver();
		
		sangar.get("https://www.greenstechnologys.com/");
		sangar.switchTo().newWindow(WindowType.TAB);
		sangar.get("https://www.facebook.com/");
		sangar.switchTo().newWindow(WindowType.TAB);
		sangar.get("https://www.amazon.in/");
		sangar.switchTo().newWindow(WindowType.TAB);
		sangar.get("https://greenstech.in/selenium-course-content.html");
		sangar.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void ChromeOptions() {
		// TODO Auto-generated method stub
		
	}

}
