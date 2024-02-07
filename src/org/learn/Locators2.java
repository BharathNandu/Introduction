package org.learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Bharath";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualtext =driver.findElement(By.tagName("p")).getText();
		System.out.println(actualtext);
		Assert.assertEquals(actualtext,"You are successfully logged in.");
		String loggedinname = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(loggedinname, "Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
		
		
		
		
		
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String infotext = driver.findElement(By.className("infoMsg")).getText();
		String[]  passwordarray=infotext.split("'");
		System.out.println(passwordarray[0]);
		System.out.println(passwordarray[1]);
		System.out.println(passwordarray[2]);
		String password = passwordarray[1].split("'")[0];
		return password;
		
		
		// o th index 
		// 
		
	}

}
