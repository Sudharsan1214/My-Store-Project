package org.javaselenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Selenium_2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/home/raghu/eclipse-workspace/Java_Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement s = driver.findElement(By.xpath("//input[@type='text']"));
		s.sendKeys("Vambula Thumbula song");
		boolean b = s.isDisplayed();
		System.out.println(b);
		boolean c = s.isEnabled();
		System.out.println(c);
		String d = s.getAttribute("value");
		System.out.println(d);
		WebElement s1 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		s1.click();
		
		
		
	}

}
