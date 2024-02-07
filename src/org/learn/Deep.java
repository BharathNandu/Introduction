package org.learn;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Deep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Beetroot", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Implicitwait(driver, 5);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5000));
		
		Deep d1 = new Deep();
		d1.addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoWrapper']/input")));
		driver.findElement(By.xpath("//*[@class='promoWrapper']/input")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//*[@class='promoWrapper']/button")).click();
		//driver.findElement(By.xpath("//*[@class='promoWrapper']/span")).isDisplayed();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoWrapper']/span")));
		System.out.println(driver.findElement(By.xpath("//*[@class='promoWrapper']/span")).getText());
		tearDown(driver);
		
	
		
		
		//driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		
	}

	public void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException 
	{
		
		int j = 0;
	List<WebElement> product = driver.findElements(By.cssSelector(".product-name"));product.size();

	/*
	 * for( WebElement p: product) { System.out.println(p.getText());
	 * System.out.println("****"); if(p.getText().contains("Cucumber")) {
	 * System.out.println(p); Thread.sleep(2000); List <WebElement> addtocart
	 * =driver.findElements(By.xpath("//button[@text='ADD TO CART']")); //addtocart
	 * break; } }
	 */

	for(int i = 0;i<product.size();i++)
	{
	String[] name = product.get(i).getText().split("-");
	String formattedName =name[0].trim();
	List itemsNeededlist = Arrays.asList(itemsNeeded);
	if(itemsNeededlist.contains(formattedName))
	{
		Thread.sleep(5000);
		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		
		if(j == itemsNeeded.length)
		{
			break;
		}
		
	}	
	
	}
	}
	
	public  static void Implicitwait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void tearDown(WebDriver driver)
	{
		driver.close();
		
	}
}
