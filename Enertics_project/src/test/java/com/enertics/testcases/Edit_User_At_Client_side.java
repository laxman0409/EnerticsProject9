package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Edit_User_At_Client_side extends Testbase {

	
	@Test(priority=1)
	public void Edit_user() throws InterruptedException, AWTException, IOException
	{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
		Thread.sleep(4000);
		//click on 3 dots for edit
		driver.findElement(By.cssSelector("div[id='3'] span[class='sprite_icon ellipse_black']")).click();
		Thread.sleep(500);
		
	    // click on edit option
		driver.findElement(By.cssSelector("div[class='cdk-overlay-container'] a:nth-child(1)")).click();
		Thread.sleep(1500);
		
		//edit process
		driver.findElement(By.xpath("//input[@id='full_name']")).clear();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Demo_Edit_User_09");
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("DemoEditUser01@yopmail.com");
		Thread.sleep(600);  
		
		
		//phone
		
		driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).clear();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).sendKeys("9898989898");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='dropbtn btn']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[normalize-space()='+ 91']")).click();
		
		//address
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='address_line1']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='address_line1']")).sendKeys("Demo edit user address one");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='address_line2']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='address_line2']")).sendKeys("Demo edit user address two");
		
		
		
		//city
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='city_name']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='city_name']")).sendKeys("Hyderabad city");
		Thread.sleep(500);
		//Postal Code 
		driver.findElement(By.xpath("//input[@formcontrolname='postcode']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@formcontrolname='postcode']")).sendKeys("500032");
		
		// select time zone
		
		Thread.sleep(1500);
		Select timezone1= new Select(driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-add-users[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/span[1]/select[1]")));
		Thread.sleep(500);
		timezone1.selectByVisibleText("Asia/Kolkata");
		
		 Thread.sleep(1500);
		    
		//click on update user button
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Update User')]")).click();
		
		 Thread.sleep(4000);
		
		
		 driver.navigate().refresh();
		 Thread.sleep(1500);
		 driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Demo_Edit_User_09");
		 Thread.sleep(500);
		 System.out.println("User edit is done successfully at client side");
		 Thread.sleep(5000);
		 driver.close();
		
	
	
	
	
	
	
	
	
	
	}
	
}
