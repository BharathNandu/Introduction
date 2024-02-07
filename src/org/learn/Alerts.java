package org.learn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		System.out.println(alert.getClass());
		alert.accept();
		driver.findElement(By.id("confirmbtn")).click();
		Alert alert1 = driver.switchTo().alert();
		
		System.out.println(alert.getText());

		alert1.accept();

		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert2.dismiss();

	}

}
