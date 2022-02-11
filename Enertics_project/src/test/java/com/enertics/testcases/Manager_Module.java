package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Manager_Module  extends Testbase {
	
	@Test(priority=1)
	public void Add_manager() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(1250);
		//click on manager link
		driver.findElement(By.xpath("//a[contains(text(),'Account managers')]")).click();
		Thread.sleep(2000);
		//click on add manager button
		driver.findElement(By.xpath("//span[contains(text(),'Add Account Manager')]")).click();
		
		//fill manager form account
		Thread.sleep(1000);
		
		//enter the name
		driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Manager_02");
		Thread.sleep(400);
		//enter the email id 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Manager_02@yopmail.com");
		Thread.sleep(400);
		// enter the phone number
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/international-phone-number[1]/div[1]/input[1]")).sendKeys("+918360676343");
		
		//enter the address1
		Thread.sleep(400);
		driver.findElement(By.xpath("//input[@id='address_line1']")).sendKeys("12 street");
		Thread.sleep(400);
		//enter the address 2
		driver.findElement(By.xpath("//input[@id='address_line2']")).sendKeys("13 street");
		Thread.sleep(400);
		// select the country
		driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/span[1]/select[1]")).sendKeys("India");
		Thread.sleep(400);
		
		//select the state
		driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[2]/span[1]/select[1]")).sendKeys("Telangana");
		Thread.sleep(400);
		
		//enter the city name
		driver.findElement(By.xpath("//input[@id='city_name']")).sendKeys("Hyderabad");
		//enter the pincode
		Thread.sleep(400);
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("500018");
		
		//select the time zone
		Thread.sleep(400);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/span[1]/select[1]")).sendKeys("Asia/Kolkata");
		Thread.sleep(400);
		// click on create manager button
		driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/button[1]")).click();
		Thread.sleep(400);
		
		// output
		System.out.println("manager account created successfully ");
		Thread.sleep(5000);
		
		driver.close();
		
	

}
}