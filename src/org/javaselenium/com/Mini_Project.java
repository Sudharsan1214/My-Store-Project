package org.javaselenium.com;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/home/raghu/eclipse-workspace/Java_Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email_create")).sendKeys("sudharsanveluchamy123@gmail.com");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sudharsan");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Veluchamy");
		driver.findElement(By.id("passwd")).sendKeys("********");
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("14");
		WebElement month = driver.findElement(By.id("months"));
		Select d = new Select(month);
		d.selectByValue("2");
		WebElement year = driver.findElement(By.id("years"));
		Select v = new Select(year);
		v.selectByValue("2000");
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sudharsan");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Veluchamy");
		driver.findElement(By.id("company")).sendKeys("ABCD company");
		driver.findElement(By.id("address1")).sendKeys("Adress is unavailable");
		driver.findElement(By.id("address2")).sendKeys("Adress is unavailable");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		WebElement state = driver.findElement(By.id("id_state"));
		Select j = new Select(state);
		j.selectByValue("43");
		driver.findElement(By.id("postcode")).sendKeys("62255");
		WebElement coun = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select op = new Select(coun);
		op.selectByValue("21");
		driver.findElement(By.id("other")).sendKeys("Adress is unavailable");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7365429768");
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("745836353");
		WebElement cl = driver.findElement(By.id("alias"));
		cl.clear();
		cl.sendKeys("Adress is unavailable");
		driver.findElement(By.id("submitAccount")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sor = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("/home/raghu/eclipse-workspace/Java_Selenium/ScreenShots/miniproject.png");
		FileUtils.copyFile(sor, des);

	}

}
