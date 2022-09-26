package com.scripts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class S2_BrowserActions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");// ucan use "//" also
		//Open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	   
	
	   
	    Thread.sleep(5000);
	    String text = driver.findElement(By.id("logoutLink")).getText();
	    System.out.println(text);
	    driver.findElement(By.id("logoutLink")).click();
	    //driver.findElement(By.linkText("Logout")).click();
	    //driver.findElement(By.partialLinkText("gout").click();
	    //driver.findElement(By.cssSelector("a[class='logout']")).click();
	    
	    Thread.sleep(5000);
	    driver.quit();
	   
			

	}

}
