package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGreens1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		driver.manage().window().maximize();
		
		WebElement adayar = driver.findElement(By.xpath("//strong[contains(text(),'Padmanabha')]"));
		String adayarAddress = adayar.getText();
		System.out.println(adayarAddress);
		System.out.println("------------------------");
		WebElement thuraipakkam = driver.findElement(By.xpath("//strong[contains(text(),'Kanchee')]"));
		String thuraipakkamAddress = thuraipakkam.getText();
		System.out.println(thuraipakkamAddress);
		WebElement thuraipakkam1 = driver.findElement(By.xpath(" //strong[contains(text(),'Landmark')]"));
		String thuraipakkam1Address = thuraipakkam1.getText();
		System.out.println(thuraipakkam1Address);
		WebElement thuraipakkam2 = driver.findElement(By.xpath(" //strong[contains(text(),'Landmark')]"));
		String thuraipakkam2Address = thuraipakkam2.getText();
		System.out.println(thuraipakkam2Address);
		System.out.println("------------------------");
		WebElement tambaram = driver.findElement(By.xpath("//strong[contains(text(),'Appa')]"));
		String tambaramAddress = tambaram.getText();
		System.out.println(tambaramAddress);
		System.out.println("------------------------");
		WebElement navalur = driver.findElement(By.xpath(" //strong[contains(text(),'Rajiv')]"));
		String navalurAddress = navalur.getText();
		System.out.println(navalurAddress);
		System.out.println("------------------------");
		WebElement porur = driver.findElement(By.xpath(" //strong[contains(text(),'149')]"));
		String porurAddress = porur.getText();
		System.out.println(porurAddress);
		System.out.println("------------------------");
		WebElement perumbakkam = driver.findElement(By.xpath(" //strong[contains(text(),'Plot No. 19')]"));
		String perumbakkamAddress = perumbakkam.getText();
		System.out.println(perumbakkamAddress);
		System.out.println("------------------------");

		
		
		
		
	}

}
