package org.learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Bharath");
		driver.findElement(By.name("email")).sendKeys("bharath.nandu9@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Bharath");
		driver.findElement(By.id("exampleCheck1")).click();
		Select dropdwon = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		dropdwon.selectByVisibleText("Male");
		Thread.sleep(2000);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.id("bday")).sendKeys("20-10-1994");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit'")).click();
		
		
		
		
	}

}
