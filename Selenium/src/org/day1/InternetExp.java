package org.day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.ie.*;

public class InternetExp {
public static void main(String[] args) {
	
	System.setProperty("webdriver.ie.driver","E:\\java files\\SelDay1\\Drivers\\IEDriverServer.exe");
	
	WebDriver sangar=new InternetExplorerDriver();
	
	sangar.get("https://www.greenstechnologys.com/");
	sangar.switchTo().newWindow(WindowType.TAB);
	sangar.get("https://demo.automationtesting.in/Register.html");
	sangar.switchTo().newWindow(WindowType.TAB);
	sangar.get("https://www.greenstechnologys.com/");
	sangar.switchTo().newWindow(WindowType.TAB);
	sangar.get("https://greenstech.in/selenium-course-content.html");
	
	
	
}
}
