package org.seleniumproject.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTable {
	static int indexoflost,indexofpoints,indexofnrr;
	static String team="Mumbai Indians";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/home/raghu/eclipse-workspace/Java_Selenium/Driver/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/points-table");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement> table = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/thead/tr"));
	//iterator
	for(int i=0;i<table.size();i++) {
		String text = table.get(i).getText();
        String ortext = text.replace(" ", "\n");		
	    System.out.println(ortext);
        if(ortext.equalsIgnoreCase(" Lost ")) {
        	indexoflost=i;
        	System.out.println("Lost match Index Value :"+indexoflost);
        }
        if(ortext.equalsIgnoreCase(" Pts ")) {
        	indexofpoints=i;
        	System.out.println("Points index value :"+indexofpoints);
        }
        if(ortext.equalsIgnoreCase(" NRR ")) {
        	indexofnrr=i;
        	System.out.println("NRR index value :"+indexofnrr);
        }
	
	}
	
	List<WebElement> allrows = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr"));
	
//	for(int i=0;i<allrows.size();i++) {
//		List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));
//	    for(int j=0;j<alldata.size();j++) {
//	    	if(alldata.get(j).getText().equalsIgnoreCase(team)) {
//	    		System.out.println("Team is :"+team);
//	    		System.out.println("total NRR :"+alldata.get(indexofnrr).getText());
//	    		System.out.println("total points :"+alldata.get(indexofpoints).getText());
//	    		System.out.println("total Lost :"+alldata.get(indexoflost).getText());
//	    		System.exit(0);
//	    	}
//	    }
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
