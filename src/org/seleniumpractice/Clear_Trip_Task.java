package org.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Clear_Trip_Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/home/raghu/eclipse-workspace/Java_Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains");
		driver.findElement(By.id("from_station")).sendKeys("Chennai");
		driver.findElement(By.id("to_station")).sendKeys("Theni");
		WebElement trainclass = driver.findElement(By.id("trainClass"));
		Select trcl = new Select(trainclass);
		trcl.selectByValue("1A");
		driver.findElement(By.id("dpt_date")).sendKeys("03/11/2021");
		WebElement ad = driver.findElement(By.id("train_adults"));
		Select adult = new Select(ad);
		adult.selectByValue("1");
		driver.findElement(By.id("trainFormButton")).click();

	}

}
