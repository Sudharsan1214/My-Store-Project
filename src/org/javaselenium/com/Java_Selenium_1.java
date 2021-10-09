package org.javaselenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Selenium_1 {
	public static void main(String[] args) {
		String s;
		System.setProperty("webdriver.chrome.driver",
				"/home/raghu/eclipse-workspace/Java_Selenium/Driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		s = driver.getTitle();
		System.out.println(s);
		s = driver.getCurrentUrl();
		System.out.println(s);
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		driver.navigate().to("https://www.facebook.com/");
		s = driver.getTitle();
		System.out.println(s);
		driver.navigate().refresh();
		driver.navigate().to("https://www.youtube.com/");
		s = driver.getCurrentUrl();
		System.out.println(s);
		driver.close();

	}

}
