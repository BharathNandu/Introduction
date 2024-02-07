package org.learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spiecejetdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		if(driver.findElement(By.className("mapbg")).isDisplayed())
		{
			System.out.println("*******");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[value='BLR']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //*[@value=\"BLR\"]"))).click();
		}
		
		// 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //*[@value=\"MAA\"]")).click();
	}

}
