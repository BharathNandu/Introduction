package org.learn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement tablebox =driver.findElement(By.className("tableFixHead"));
		WebDriverWait  w= new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(tablebox));
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		String dd = driver.findElement(By.xpath("//*[@class='tableFixHead']/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(dd);
		List <WebElement> values = driver.findElements(By.xpath("//*[@class='tableFixHead']/table/tbody/tr/td[4]"));
		int n=values.size();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum = sum+Integer.parseInt(values.get(i).getText());//28
			System.out.println(sum);
		}
		
		WebElement total=driver.findElement(By.cssSelector(".totalAmount"));
		System.out.println(total.getText());
		String[] totalpresent=total.getText().split(":");
		String totalp =totalpresent[1].trim();
		System.out.println(totalp);
		
		Assert.assertEquals(totalp, String.valueOf(sum));
		
		
		
			
	}

}
