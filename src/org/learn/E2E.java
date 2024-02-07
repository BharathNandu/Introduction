package org.learn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // hit the Url

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		if (driver.findElement(By.className("mapbg")).isDisplayed()) {
			System.out.println("*******");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[value='BLR']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //*[@value=\"BLR\"]"))).click();
		}

		//

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //*[@value=\"MAA\"]")).click();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			Assert.assertTrue(true);

		}
		System.out.println(driver.findElement(By.cssSelector("input[id*=\"chk_friendsandfamily\"]")).isSelected());
		driver.findElement(By.cssSelector("input[id*=\"chk_friendsandfamily\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=\"chk_friendsandfamily\"]")).isSelected());
		
		//count the checkboxes
		List<WebElement> count =driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		System.out.println(count.size());
		driver.findElement(By.id("divpaxinfo")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	} 
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		String firstslection =dropdown.getFirstSelectedOption().getText();
		System.out.println(firstslection);
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();


	}

}
