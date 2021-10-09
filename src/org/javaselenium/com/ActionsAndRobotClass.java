package org.javaselenium.com;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndRobotClass {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/home/raghu/eclipse-workspace/Java_Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		Actions mouse = new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[2]"));
		mouse.moveToElement(mobile).perform();
		mouse.contextClick().build().perform();
		Robot kb = new Robot();
		kb.keyPress(KeyEvent.VK_DOWN);
		kb.keyRelease(KeyEvent.VK_DOWN);
		kb.keyPress(KeyEvent.VK_ENTER);
		kb.keyRelease(KeyEvent.VK_ENTER);
		WebElement bestseller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		mouse.moveToElement(bestseller).perform();
		mouse.contextClick().perform();
		Robot kb1 = new Robot();
		kb1.keyPress(KeyEvent.VK_DOWN);
		kb1.keyRelease(KeyEvent.VK_DOWN);
		kb1.keyPress(KeyEvent.VK_ENTER);
		kb1.keyRelease(KeyEvent.VK_ENTER);
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		mouse.contextClick(fashion).perform();
		kb.keyPress(KeyEvent.VK_DOWN);
		kb.keyRelease(KeyEvent.VK_DOWN);
		kb.keyPress(KeyEvent.VK_ENTER);
		kb.keyRelease(KeyEvent.VK_ENTER);
		WebElement ele = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		mouse.contextClick(ele).perform();
		kb1.keyPress(KeyEvent.VK_DOWN);
		kb1.keyRelease(KeyEvent.VK_DOWN);
		kb1.keyPress(KeyEvent.VK_ENTER);
		kb1.keyRelease(KeyEvent.VK_ENTER);
		String handle = driver.getWindowHandle();
		String title = driver.switchTo().window(handle).getTitle();
		System.out.println(title);
		Set<String> Handles = driver.getWindowHandles();
		for (String joy : Handles) {

			String title2 = driver.switchTo().window(joy).getTitle();
			System.out.println(title2);
			}
		for (String joy1 : Handles) {
			if ( driver.switchTo().window(joy1).getTitle().equalsIgnoreCase("Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids")) {
				break;
			}
		}

	}

}
