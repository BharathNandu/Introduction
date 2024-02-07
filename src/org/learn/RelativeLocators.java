package org.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.IOException;

public class RelativeLocators {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Miscellenous abc = new Miscellenous();
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement emailEidtbox = driver.findElement(By.name("email"));
		WebElement emailname = driver.findElement(with(By.tagName("label")).above(emailEidtbox));
		System.out.println(emailname.getText());

		WebElement checkbox = driver.findElement(By.className("form-check-label"));
		WebElement checboxcheck = driver.findElement(with(By.tagName("input")).toLeftOf(checkbox));
		checboxcheck.click();
		//abc.getscreenshot(driver);
		
	}

}
