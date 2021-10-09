package org.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/home/raghu/eclipse-workspace/Java_Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://www.greenstechnologys.com");
		Actions move = new Actions(driver);
		WebElement con = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		move.moveToElement(con).perform();
		move.click().build().perform();
		driver.findElement(By.xpath("//input[@id='InputName']")).sendKeys("Sunny");
		WebElement email = driver.findElement(By.xpath("//input[@id='InputEmail1']"));
		String holder = email.getAttribute("placeholder");
		System.out.println(holder);
		email.sendKeys("sunny@gmail.com");
		String value = email.getAttribute("value");
		System.out.println(value);
		WebElement num = driver.findElement(By.xpath("(//input[@name='phone'])[1]"));
		num.sendKeys("8056518420");
		String num1 = num.getAttribute("value");
		System.out.println(num1);
		WebElement courses = driver.findElement(By.xpath("(//select[@name='courses'])[1]"));
		Select cou = new Select(courses);
		cou.selectByValue("Software Testing");
		WebElement bat = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		Select batch = new Select(bat);
		batch.selectByValue("Porur");
		WebElement time = driver.findElement(By.xpath("(//select[@name='time'])[1]"));
		Select ti = new Select(time);
		ti.selectByVisibleText("Immediately");
		WebElement mas = driver.findElement(By.xpath("(//textarea[@name='comments'])[1]"));
		String place1 = mas.getAttribute("placeholder");
		System.out.println(place1);
		mas.sendKeys("nice.");
		WebElement sum = driver.findElement(By.xpath("//button[@type='submit']"));
		sum.click();
	
	}

}
