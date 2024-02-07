package org.learn;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle2as {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//https://the-internet.herokuapp.com/windows
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector(".example a")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentID = it.next();
		String childID =it.next();
		driver.switchTo().window(childID);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class=\"example\"]/h3")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class=\"example\"]/h3")));
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//*[@class='example']/h3")));
		
		
		
	}

}
