package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Client_List_At_ManagerAccount  extends Testbase {
	
	
	@Test(priority=1)
	public void client_list_At_ManagerAccount_Side() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(4000);
		//click on client link
		driver.findElement(By.xpath("//a[normalize-space()='Clients']")).click();
		Thread.sleep(2000);
	
	
		driver.findElement(By.xpath("//div[4]//div[2]//button[1]//span[1]")).click();
		Thread.sleep(500);
	
		
	
		driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[contains(text(),'ABC 1258')]")).click();
		Thread.sleep(2000);
	
	
		driver.findElement(By.xpath("//a[@class='download ng-star-inserted']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='tab-2']")).click();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//a[@id='tab-3']")).click();
		Thread.sleep(2000);
		
	
		
		driver.findElement(By.xpath("//a[normalize-space()='Clients']")).click();
		Thread.sleep(5000);
		
		driver.close();
	
		
	}

}
