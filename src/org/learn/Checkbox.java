package org.learn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*=\"chk_friendsandfamily\"]")).isSelected());
		driver.findElement(By.cssSelector("input[id*=\"chk_friendsandfamily\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=\"chk_friendsandfamily\"]")).isSelected());
		
		//count the checkboxes
		List<WebElement> count =driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		System.out.println(count.size());
	}

}
