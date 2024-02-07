package org.learn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		/*
		 * List <WebElement> profile
		 * =driver.findElements(By.xpath("//*[@class='figure']/img"));
		 * 
		 * for(int i=0;i< profile.size();i++) { Actions act = new Actions(driver);
		 * act.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id='nav-link-accountList']"))).build().perform(); }
		 */
		// mouse hover the element
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector(".desktop-userIconsContainer"))).build().perform();
		System.out.println("*****");
		
		//enter the keys with the shift button.
		WebElement searchbar =driver.findElement(By.cssSelector(".desktop-searchBar"));
		act.moveToElement(searchbar).click().keyDown(Keys.SHIFT).sendKeys("jackets").build().perform();
																												
		//Selecting the text by doubleclick
		act.moveToElement(searchbar).click().keyDown(Keys.SHIFT).sendKeys("jackets").doubleClick().build().perform();
		act.moveToElement(searchbar).contextClick().build().perform();
		
		//in myntra right click is disabled
		
		act.moveByOffset(0, 150).build().perform();
		System.out.println("*******");
		
		
	}

}
