package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Home_Module extends Testbase {
	
	@Test(priority=1)
	public void home_module() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(1250);
		//click on home link
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(2000);
		//click on CLIENTS SUMMARY button
		driver.findElement(By.xpath("//h6[contains(text(),'Clients summary')]")).click();
		Thread.sleep(1000);
		System.out.println("we can see CLIENTS SUMMARY information in client module");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(1000);
		//click on DEVICE SUMMARY button
		driver.findElement(By.xpath("//h6[contains(text(),'Device summary')]")).click();
		Thread.sleep(1000);
		System.out.println("we can see DEVICE SUMMARY information in device module");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(1000);
		//click on NEW DEVICES REGISTERED button
		driver.findElement(By.xpath("//h6[contains(text(),'New devices registered')]")).click();
		Thread.sleep(1000);
		System.out.println("we can see  NEW DEVICES REGISTERED information");
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(3500);
		driver.close();
	

}
}