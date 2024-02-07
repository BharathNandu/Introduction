package org.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//
		//to load the url
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		// to refresh the url
		driver.get(driver.getCurrentUrl());
		//
		driver.navigate().to(driver.getCurrentUrl());
		
		
		driver.findElement(By.className("k1zIA")).sendKeys(Keys.F5);
		
	}

}
