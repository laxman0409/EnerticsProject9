package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Client_Side_Reports_module extends Testbase {
	@Test(priority=1)
	public void report_Info_client_side() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(1250);
		//click on reports link
		driver.findElement(By.xpath("//a[@class='ng-tns-c191-1'][normalize-space()='Reports']")).click();
		Thread.sleep(4000);
		
		//apply date filters

		driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-reports[1]/div[3]/mat-toolbar[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("2022-01-31");

		Thread.sleep(3500);
		driver.findElement(By.xpath("//span[contains(text(),'View')]")).click();
		
		System.out.println("report we will see in different window in browser");
		
		Thread.sleep(15000);
		
		
		
		driver.quit();
		
		
	}
}
