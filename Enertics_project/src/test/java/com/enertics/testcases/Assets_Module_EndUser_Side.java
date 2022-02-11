package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Assets_Module_EndUser_Side  extends Testbase {

	
	@Test(priority=1)
	public void Assets_EndUser_side() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(3000);
		//click on Assets module link
		driver.findElement(By.xpath("//a[@class='ng-tns-c191-1'][normalize-space()='Assets']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//h4[normalize-space()='demo_asset_1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='download ng-star-inserted']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='tab-2']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@id='tab-3']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ng-tns-c191-1'][normalize-space()='Assets']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
}
}