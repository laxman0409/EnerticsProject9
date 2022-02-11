package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Versioning_Module  extends Testbase {
	
	@Test(priority=1)
	public void Versioning_Info() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(1250);
		//click on version link
		driver.findElement(By.xpath("//a[contains(text(),'Versioning')]")).click();
		Thread.sleep(2000);
		//enter data  on search 
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("11199999_126");
		Thread.sleep(500);
		//click on search button
		driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-device-versioning[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		
		//select the version number
		
		Thread.sleep(1500);
		Select versionNUmber= new Select(driver.findElement(By.xpath("//span[2]//select[1]")));
		Thread.sleep(500);
		versionNUmber.selectByVisibleText("2.0.9");
		Thread.sleep(500);
		
		//click on check box
		driver.findElement(By.xpath("//input[@value='395']")).click();
		Thread.sleep(500);
		
		//click on apply button
		
		driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		
		System.out.println("Version number is updated successfully ");
		
		driver.close();

}
}

