package org.learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framestest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		List<WebElement> countofframes = driver.findElements(By.cssSelector("frameset[frameborder='1']"));
		System.out.println(countofframes.size());
		
		driver.switchTo().frame(0);
		System.out.println("Going into deafultframe");
		List<WebElement> countofinnerframes = driver.findElements(By.cssSelector("frameset[frameborder='1'] frame"));
		System.out.println(countofinnerframes.size());
		driver.switchTo().frame("frame-middle");
		
		System.out.println("nested frame with 3 frames inside");
		
		
			
		System.out.println(driver.findElement(By.id("content")).getText());
		System.out.println("******");
	}

}
