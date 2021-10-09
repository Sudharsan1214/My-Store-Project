package org.seleniumproject.com;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStoreProject {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/home/raghu/eclipse-workspace/Java_Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement email = driver.findElement(By.id("email_create"));
		wait.until(ExpectedConditions.visibilityOf(email));
		driver.findElement(By.id("email_create")).sendKeys("Sudharsanveluchamy123456789@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Sudharsan");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Veluchamy");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456789");
		WebElement day = driver.findElement(By.id("days"));
		Select d = new Select(day);
		d.selectByValue("14");
		WebElement month = driver.findElement(By.id("months"));
		Select m = new Select(month);
		m.selectByValue("2");
		WebElement years = driver.findElement(By.id("years"));
		Select y = new Select(years);
		y.selectByValue("2000");
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sudharsan");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Veluchamy");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("xyz Tech Solutions");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Nothing, 600026, xyz Tech Solutions");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("12E, west street, iyyappanthangal, chennai");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chennai");
		WebElement state = driver.findElement(By.id("id_state"));
		Select st = new Select(state);
		st.selectByValue("32");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("60002");
		driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9834552846");
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("8056518419");
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("nothing too");
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("/home/raghu/eclipse-workspace/Java_Selenium/ScreenShots/sample1.png");
		FileUtils.copyFile(src, dest);
//	    FileUtils.copyFile((File)((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), 
//	    		new File("/home/raghu/eclipse-workspace/Java_Selenium/ScreenShots/sample1.png"));
//		ChromeOptions bn = new ChromeOptions();
//		bn.addArguments("--start-maximize");

	}

}
