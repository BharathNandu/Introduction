package org.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selintroduction {
	
	public static void main(String args[])
	{
		//Invoke the browser
		//create a object of the chrome driver // chrome methods
		// Firefox has Firefox methods // firefox methods
		// edge has edge methods // edge browser
		// Webdriver is the interface.
		//WebDriver + chrome methods
		// so we need to restrict the browser to only methods.
		
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
