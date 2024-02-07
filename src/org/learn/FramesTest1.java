package org.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);// frame with id
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // frame identified with webelement
		WebElement dropbox=driver.findElement(By.xpath("//*[@id='draggable']"));
		System.out.println("*****");
		dropbox.click();
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(dropbox, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[text()='Accept']")).click();
		
	}

}
