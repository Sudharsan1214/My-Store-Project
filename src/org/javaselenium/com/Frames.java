package org.javaselenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/home/raghu/eclipse-workspace/Java_Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		driver.findElement(By.id("mobileNoInp")).sendKeys("8056518419");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//i[@class='icon-close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='BUS HIRE ']")).click();

	}

}
