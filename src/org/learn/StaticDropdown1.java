package org.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		String firstslection =dropdown.getFirstSelectedOption().getText();
		System.out.println(firstslection);
		dropdown.selectByIndex(1);
		String firstslection1 =dropdown.getFirstSelectedOption().getText();
		System.out.println(firstslection1);
		dropdown.selectByVisibleText("Option3");
		String firstslection2 =dropdown.getFirstSelectedOption().getText();
		System.out.println(firstslection2);
		dropdown.selectByValue("option2");
		String firstslection3 =dropdown.getFirstSelectedOption().getText();
		System.out.println(firstslection3);
	
	}

}
