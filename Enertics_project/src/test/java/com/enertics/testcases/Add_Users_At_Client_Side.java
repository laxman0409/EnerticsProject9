package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Add_Users_At_Client_Side extends Testbase {
	
	@Test(priority=1)
	public void Add_users() throws InterruptedException, AWTException, IOException
	{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Add Users')]")).click();
		Thread.sleep(600);
		
		driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Demo_User_02");
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("DemoUser02@yopmail.com");
		Thread.sleep(600);
		
		
		//phone
		driver.findElement(By.xpath("//button[@class='dropbtn btn']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[normalize-space()='+ 91']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).sendKeys("9898989898");
		
		
		//address
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='address_line1']")).sendKeys("Demo user address one");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='address_line2']")).sendKeys("Demo user address two");
		
		
		Thread.sleep(600);
		
		// select the country
		driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-add-users[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/span[1]/select[1]")).sendKeys("India");
		Thread.sleep(400);
				
		//select the state
		driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-add-users[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[2]/span[1]/select[1]")).sendKeys("Telangana");
		Thread.sleep(400);
		
		//city
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='city_name']")).sendKeys("Hyderabad");
		Thread.sleep(500);
		//Postal Code 
		driver.findElement(By.xpath("//input[@formcontrolname='postcode']")).sendKeys("500018");
		
		// select time zone
		
		Thread.sleep(1500);
		Select timezone1= new Select(driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-add-users[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/span[1]/select[1]")));
		Thread.sleep(500);
		timezone1.selectByVisibleText("Asia/Kolkata");
		
		 Thread.sleep(1500);
		    
		//click on create user button
		 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		 Thread.sleep(4000);
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
		 Thread.sleep(1500);
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Demo_User_02");
		 Thread.sleep(500);
		 System.out.println("User  is created successfully at client side");
		 Thread.sleep(5000);
		driver.close();
		
		
		
	

		
	}

}
