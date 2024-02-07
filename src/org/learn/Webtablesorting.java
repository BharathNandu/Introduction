package org.learn;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtablesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List <WebElement> count= driver.findElements(By.xpath("//tbody/tr/td[1]"));
		count.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		List<String> origninallist =count.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> newlist =origninallist.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(newlist.equals(origninallist));
		
		count.stream().forEach(s->System.out.println(s));// to print the values we use foreach
		 List<WebElement> beansRows = driver.findElements(By.xpath("//td[contains(text(),'Beans')]/preceding-sibling::td[1]"));
	        List<String> beanPrices = beansRows.stream().map(WebElement::getText).collect(Collectors.toList());
	        beanPrices.forEach(System.out::println);

	}
	private static String getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();



		return pricevalue;

		}


}
