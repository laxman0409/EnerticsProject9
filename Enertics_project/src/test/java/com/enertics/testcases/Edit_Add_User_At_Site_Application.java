package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Edit_Add_User_At_Site_Application  extends Testbase {
	
	@Test(priority=1)
	public void sites__application_add_user() throws InterruptedException, AWTException, IOException
	{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='ng-tns-c191-1'][normalize-space()='Sites & Applications']")).click();
		Thread.sleep(4000);
		
		Thread.sleep(400);
		driver.findElement(By.xpath("//div[9]//div[2]//button[1]//span[1]")).click();
		
		Thread.sleep(400);
		driver.findElement(By.xpath("//a[normalize-space()='Edit']")).click();
		
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[normalize-space()='Associate user']")).click();
		
		Thread.sleep(2500);
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/label[1]/span[1]")).click();
		
		Thread.sleep(400);
		driver.findElement(By.xpath("//tbody/tr[4]/td[1]/label[1]/span[1]")).click();
		
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Update Sites & Applications']")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
	}	
	

}
