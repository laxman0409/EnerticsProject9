package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Add_Assets extends Testbase {
	
	
	@Test(priority=1)
	public void AddAssets() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Add Asset')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Testing_Device_03");
		
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#site_id")).sendKeys("Tata Steel");
		
		Thread.sleep(600);
		
		driver.findElement(By.cssSelector("#inventory_id")).sendKeys(" 352913090244797");              
		
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#motor_make")).sendKeys("motor_Demo_01");              
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#frame")).sendKeys("315");              
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#ambient_temperature")).sendKeys("12");              
		Thread.sleep(600);
	//	driver.findElement(By.cssSelector("#mat-radio-66")).click();            
		Thread.sleep(600);
		
		driver.findElement(By.cssSelector("#insulation_class")).sendKeys("A"); 
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='motor_serial']")).sendKeys("8595575959575955");
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='rated_power']")).sendKeys("1200");
		
		Thread.sleep(600);
	//	driver.findElement(By.xpath("#mat-radio-69")).click();
		
		
		
		//driver.findElement(By.xpath("//div[@class='mat-radio-outer-circle']")).click();
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#rated_rpm")).sendKeys("2100");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#rated_voltage")).sendKeys("2000");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#efficiency")).sendKeys("200");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#line_frequency")).sendKeys("60");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#power_factor")).sendKeys("200");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#duty")).sendKeys("abc");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#de_bearing_number")).sendKeys("1200");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#nde_bearing_number")).sendKeys("1200");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#data_frequency")).clear();
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#data_frequency")).sendKeys("20");
		
		
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#machine_threshold_status")).clear();
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#machine_threshold_status")).sendKeys("0");
		Thread.sleep(600);
	
		
		driver.findElement(By.cssSelector("#sensor_mounting_axis_option")).sendKeys("Parallel to Machine Shaft");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#de_bearing")).sendKeys("1");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#winding_rtd")).sendKeys("2");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#nde_bearing")).sendKeys("3");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#rtd_one")).sendKeys("DE Bearing");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#rtd_two")).sendKeys("DE Bearing");
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#rtd_three")).sendKeys("DE Bearing");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[type='submit'] span[class='mat-button-wrapper']")).click();
		Thread.sleep(6000);
		
		System.out.println("Asset created successfully at client side");
		
		driver.close();
	
		
		
	}

}
