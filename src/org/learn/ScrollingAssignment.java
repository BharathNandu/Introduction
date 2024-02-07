package org.learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.table-display').scrollTop=5000");
		List <WebElement> rowes = driver.findElements(By.cssSelector(".table-display tbody tr"));
		System.out.println("No of rowes"+rowes.size());
		List <WebElement> rowes1 = driver.findElements(By.cssSelector(".table-display tbody td"));
		System.out.println("No of rowes"+rowes1.size());
		
		
		
	}

}
