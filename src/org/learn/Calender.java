package org.learn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
//w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("form_fields[travel_comp_date]"))));
////*[@data-testid="departure-date-dropdown-label-test-id"]
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@data-testid=\"departure-date-dropdown-label-test-id\"]")).click();
		
		List<WebElement> dateslist =driver.findElements(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']"));
		int count =dateslist.size();
		// 19 jan
		for(int i=0;i<count;i++)
		{
			String text =driver.findElements(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).get(i).getText();
			if(text.equalsIgnoreCase("19"))
			{
				driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
				System.out.println("******");
			}
		}
		
	}

}
