package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class License_Module extends Testbase {

	
	@Test(priority=1)
	public void add_license() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(1250);
		//click on License link
		driver.findElement(By.xpath("//a[contains(text(),'Licence')]")).click();
		Thread.sleep(2000);
		//click on add License button
		driver.findElement(By.xpath("//span[contains(text(),'Add licenses')]")).click();
		
		//fill basic info of Add License
		Thread.sleep(1500);
		Select DeviceType= new Select(driver.findElement(By.xpath("//select[@id='select1']")));
		Thread.sleep(500);
		DeviceType.selectByVisibleText("New motor_01");
		Thread.sleep(500);
		// Enter the Quantity number
		driver.findElement(By.xpath("//input[@id='qu']")).sendKeys("5");		
		Thread.sleep(500);
		
		//click on Add button
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(4000);
		
		System.out.println("License module completed successfully");
		
		driver.close();
	
	
}
}
