package org.javaselenium.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/home/raghu/eclipse-workspace/Java_Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement clickme = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickme.click();
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> ite = handles.iterator();
		String one = ite.next();
		String two = ite.next();
		driver.switchTo().window(two);
		WebElement text1 = driver.findElement(By.xpath("//div[@class='example']"));
		String t1 = text1.getText();
		System.out.println(t1);
		driver.switchTo().window(one);
		WebElement text2 = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
		String t2 = text2.getText();
		System.out.println(t2);
	}
	
}
