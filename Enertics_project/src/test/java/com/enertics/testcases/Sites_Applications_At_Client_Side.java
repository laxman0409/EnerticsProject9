package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Sites_Applications_At_Client_Side extends Testbase {
	
	@Test(priority=1)
	public void sites__application_module() throws InterruptedException, AWTException, IOException
	{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='ng-tns-c191-1'][normalize-space()='Sites & Applications']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Add Sites & Applications')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='site_name']")).sendKeys("Testing_Demo_site_01");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='group_name']")).sendKeys("App 1.1");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Add more")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-side-menu[1]/div[2]/app-add-site-group[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("App 1.1.2");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='site_description']")).sendKeys("Testing purpose");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='group_description']")).sendKeys("Testing"); 
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#page_container > app-add-site-group > div.Content_outer > div > div > div > form > div > div.form_actions.text-right > button.primary_btn.mat-raised-button.mat-button-base.ng-star-inserted > span")).click(); 

		Thread.sleep(5000);
	
	}

}
