package org.learn;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert s = new SoftAssert();
		
		List<WebElement>linkscount = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement p :linkscount)
		{
			String URL=p.getAttribute("href");
			
			HttpURLConnection conn= (HttpURLConnection) new URL(URL).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responcecode=conn.getResponseCode();
			System.out.println(responcecode);
			s.assertTrue(responcecode<400, "\"The broken link is\"+p.getText()+\"the resonce code is \"\r\n"
					 +responcecode);
			
			/*
			 * if(responcecode>400) {
			 * System.out.println("The broken link is"+p.getText()+"the resonce code is "
			 * +responcecode); Assert.assertFalse(true);
			 * 
			 * 
			 * }
			 */
		
		}
		s.assertAll();
	}

}
