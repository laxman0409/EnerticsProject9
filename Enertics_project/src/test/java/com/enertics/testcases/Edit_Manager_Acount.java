package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Edit_Manager_Acount  extends Testbase {
	
	
	@Test(priority=1)
	public void edit_manager_account() throws InterruptedException, AWTException, IOException
	{
		Thread.sleep(1250);
		//click on manager link
		driver.findElement(By.xpath("//a[contains(text(),'Account managers')]")).click();
		Thread.sleep(2000);
		
		
		//select 3 dots for edit purpose
		driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-user[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/button[1]/span[1]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(1000);
		
		
			//edit  manager form account
					
			Thread.sleep(1000);
			
			//enter the name
			driver.findElement(By.xpath("//input[@id='full_name']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Edit_Manager_02");
			Thread.sleep(400);
			//enter the email id 
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Edit_Manager_02@yopmail.com");
			Thread.sleep(400);
			// enter the phone number
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/international-phone-number[1]/div[1]/input[1]")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/international-phone-number[1]/div[1]/input[1]")).sendKeys("+918360676343");
			
			//enter the address1
			Thread.sleep(400);
			driver.findElement(By.xpath("//input[@id='address_line1']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='address_line1']")).sendKeys("12 street edit address 1");
			Thread.sleep(400);
			driver.findElement(By.xpath("//input[@id='address_line2']")).clear();
			Thread.sleep(200);
			//enter the address 2
			driver.findElement(By.xpath("//input[@id='address_line2']")).sendKeys("13 street edit address 2 ");
			Thread.sleep(400);
			// select the country
			driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/span[1]/select[1]")).sendKeys("India");
			Thread.sleep(400);
			
			//select the state
			
			driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[2]/span[1]/select[1]")).sendKeys("Telangana");
			Thread.sleep(400);
			
			//enter the city name
			driver.findElement(By.xpath("//input[@id='city_name']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='city_name']")).sendKeys("Karimnagar");
			//enter the pincode
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='postcode']")).clear();
			Thread.sleep(400);
			
			driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("505305");
			
			//select the time zone
			Thread.sleep(400);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/span[1]/select[1]")).sendKeys("Asia/Kolkata");
			Thread.sleep(400);
			// click on create manager button
			driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-user-create[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/button[1]")).click();
			Thread.sleep(400);
			
			// output
			System.out.println("manager account edited successfully ");
			Thread.sleep(5000);
			
			driver.close();
	

}
}

