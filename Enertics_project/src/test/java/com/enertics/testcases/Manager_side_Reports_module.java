package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Manager_side_Reports_module extends Testbase  {

	
	@Test(priority=1)
	public void report_Info_manager_side() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(1250);
		//click on reports link
		driver.findElement(By.xpath("//a[@class='ng-tns-c191-1'][normalize-space()='Reports']")).click();
		Thread.sleep(4000);
		
		//apply date filters

		driver.findElement(By.xpath("//input[@placeholder='Search by date']")).sendKeys("2022-01-01");

		Thread.sleep(1250);
	
		driver.quit();
	
	
	}
}
