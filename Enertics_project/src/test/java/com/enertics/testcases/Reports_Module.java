package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Reports_Module extends Testbase {
	
	@Test(priority=1)
	public void report_Info() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(1250);
		//click on version link
		driver.findElement(By.xpath("//a[@class='ng-tns-c191-1'][normalize-space()='Reports']")).click();
		Thread.sleep(2000);
		
		//apply date filters
		
		driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-reports[1]/div[3]/mat-toolbar[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("2022-01-07");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'View')]")).click();
		
		Thread.sleep(5000);
		
		System.out.println("report we will see in different window in browser");
		
		driver.quit();
}
}