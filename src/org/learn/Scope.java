package org.learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//to find the count of links present in the website
		
		List<WebElement> countoflinks = driver.findElements(By.tagName("a"));
		System.out.println(countoflinks.size());
		// to find the links in the footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		// to get the links in the first column.
		WebElement columnlinks=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> columnlinkscount =columnlinks.findElements(By.tagName("a"));
		System.out.println(columnlinkscount.size());
		for(int i=1;i<columnlinkscount.size();i++)
		{
			String clickonelement =Keys.chord(Keys.CONTROL,Keys.ENTER);
			
		 columnlinks.findElements(By.tagName("a")).get(i).sendKeys(clickonelement);
			
			System.out.println("******");
		}
		
	}

}
