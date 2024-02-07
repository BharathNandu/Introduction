package org.learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("bharath");
		driver.findElement(By.name("inputPassword")).sendKeys("Test@1234");
		driver.findElement(By.className("submit")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("Bharath");
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("bharath.nandu9@gmail.com");
		driver.findElement(By.xpath("//*[@placeholder='Phone Number']")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String infotext = driver.findElement(By.className("infoMsg")).getText();
		System.out.println(infotext);
		driver.findElement(By.xpath("//form/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Bharath");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		
		
		
		
		//driver.close();
		
		
		
	}

}
