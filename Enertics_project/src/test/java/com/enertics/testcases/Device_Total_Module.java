package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Device_Total_Module extends Testbase {
	
	
	@Test(priority=1)
	public void Device_module_information() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(1250);
		//click on device link
		driver.findElement(By.xpath("//a[normalize-space()='Devices']")).click();
		Thread.sleep(2000);
		//click on add device button
		driver.findElement(By.xpath("//span[contains(text(),'Add Device')]")).click();
		Thread.sleep(2000);
		
		// fill basic of device info
		
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New motor_01");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-dialog-overview-example-dialog/div/div[2]/form/div[2]/input")).sendKeys("testing type");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		System.out.println("Basic device information added successfully ");
		
		
		// click on view button
		Thread.sleep(1500);
		 driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-device-type-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
		
		 //click on add inventories button
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[contains(text(),'Add Inventories')]")).click();
		   Thread.sleep(1000);
		  //enter Device Serial
		  driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-dialog-overview-example-dialog/div/div[2]/form/div[1]/input")).sendKeys("New motor_01");
		 
		  Thread.sleep(1000);
		  
		  ///////////////////////////////////////
		  
		  //enter Mac Address
	 driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid\']")).sendKeys("11199999_126");
		  
		  Thread.sleep(1500);
		  
		  ////////////////////////////////////
		  
		  //Select Cloud Api
		  Select drop    = new Select(driver.findElement(By.cssSelector("#mat-dialog-1 > app-dialog-overview-example-dialog > div > div.modal-body > form > div:nth-child(3) > span > select")));
		  Thread.sleep(1000);
		  drop.selectByIndex(2);
		 
		  //click on add button
		  Thread.sleep(1500); 
		 driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		 Thread.sleep(2500); 
		 
		 System.out.println("Add Inventory information successfully");
		 
		 
		//edit process start from here
		 Thread.sleep(2000);
			driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]/button[1]/span[1]")).click();
			Thread.sleep(400);
			
			//click on edit option
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			Thread.sleep(1500);
			
			//select client name 
			Thread.sleep(500);
			Select client1= new Select(driver.findElement(By.cssSelector("#exampleFormControlSelect1")));
			Thread.sleep(1500);
			client1.selectByVisibleText("Demo client_01");	
			Thread.sleep(500);
			
			//click on update
			driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
			Thread.sleep(1500);
			
			System.out.println("add client info added successfully in edit Inventory information ");
			
		 driver.close();
		

}
}
