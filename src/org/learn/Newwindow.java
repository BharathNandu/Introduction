package org.learn;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindow {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Miscellenous abc = new Miscellenous();
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set <String> handle=driver.getWindowHandles();
		Iterator<String> it= handle.iterator();
		String ParentID=it.next();
		String ChildId= it.next();
		driver.switchTo().window(ChildId);
		driver.get("https://www.google.com/");
		String text=driver.findElement(By.name("btnK")).getAttribute("value");
		
		driver.switchTo().window(ParentID);
		WebElement login=driver.findElement(By.name("name"));
		login.sendKeys(text);
		File src=login.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File ("Screenshots.png"));
		//abc.getscreenshot(driver);
		System.out.println(login.getRect().getDimension().getHeight());
		System.out.println(login.getRect().getDimension().getWidth());
		System.out.println(login.getSize().getWidth());
	}

}
