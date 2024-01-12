package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC\\Desktop\\SDMArihant\\SelenuimData\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		
    	obj.get("https://demo.automationtesting.in/Alerts.html");
    	
    	WebElement we4 =obj.findElement(By.xpath("//button[contains(text(),'alert box:')]"));
		we4.click();
		Thread.sleep(5000);
		 Alert a=obj.switchTo().alert();
  	   System.out.println(a.getText());
  	   a.accept();
  	   
 		WebElement we5 =obj.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]"));
	we5.click();

  		WebElement we6 =obj.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]"));
		 we6.click();
  		Alert a1=obj.switchTo().alert();
 	   System.out.println(a1.getText());
 	   a1.accept();
 	   
 	  Thread.sleep(5000);
 	   
 	  WebElement we7 =obj.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
		we7.click();

		WebElement we8 =obj.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]"));
		we8.click();
		 Alert a2=obj.switchTo().alert();
	  
	   a2.sendKeys("Arihant Here");
	   a2.accept();
	   System.out.println(a2.getText());
 	   ////a[contains(text(),'Alert with Textbox')]
		
  	   
	
	}

}
