package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Edit_Client_Info extends Testbase  {
	
	
		@Test(priority=1)
		public void edit_client_information() throws InterruptedException, AWTException, IOException
		{
			Thread.sleep(1250);
			//click on client link
			driver.findElement(By.xpath("//a[normalize-space()='Clients']")).click();
			Thread.sleep(2000);
			//search for client
			driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-client-list[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Demo");
			Thread.sleep(2000);
			
			//select 3 dots for edit purpose
			driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-client-list[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/button[1]/span[1]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			Thread.sleep(1000);
			
			
			//edit process start from here
			driver.findElement(By.xpath("//input[@id='company_name']")).clear();
			Thread.sleep(400);
			
			driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("Edit_Demo_company_N");
			Thread.sleep(1500);
			
			
			//select industry type
			Select industry= new Select(driver.findElement(By.xpath("//select[@id='industry_type']")));
			
			industry.selectByVisibleText("Food & Beverage");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='full_name']")).clear();
			Thread.sleep(400);
			driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Edit_Demo_client_N");
			Thread.sleep(500);
			
			
			/////////////////////
			
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			Thread.sleep(400);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("DemoClient_edit_05@yopmail.com");
			Thread.sleep(400);
			
			////////////////////////////////////
			
			
			
			//phone
		
		/*	driver.findElement(By.xpath("//button[@class='dropbtn btn']")).click();
			Thread.sleep(200);
			driver.findElement(By.xpath("//span[normalize-space()='+ 91']")).click();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).sendKeys("9876598765");
			*/
			
			//address
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='address_line1']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='address_line1']")).sendKeys("Demo client address edit one");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='address_line2']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='address_line2']")).sendKeys("Demo client address edit two");
			
			//select country
			Thread.sleep(500);
			Select country1= new Select(driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-create-clients[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/span[1]/select[1]")));
			Thread.sleep(500);
			country1.selectByVisibleText("India");
			
			//select State/Province
			Thread.sleep(500);
			Select state1= new Select(driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-create-clients[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[2]/span[1]/select[1]")));
			state1.selectByVisibleText("Telangana");
			//city
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='city_name']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='city_name']")).sendKeys("karimnagar");
			Thread.sleep(500);
			//Postal Code 
			driver.findElement(By.xpath("//input[@id='postcode']")).clear();
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("505301");
			
			// select time zone
			Thread.sleep(500);
			Select timezone1= new Select(driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-create-clients[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/span[1]/select[1]")));
			Thread.sleep(500);
			timezone1.selectByVisibleText("Asia/Kolkata");
			
			// select manager
			
			Thread.sleep(500);
			Select manager1= new Select(driver.findElement(By.xpath("//select[@id='account_manager']")));
			Thread.sleep(500);
			manager1.selectByVisibleText("Test Manager 2");	
			
			//click on update client button
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
			Thread.sleep(2500);
			System.out.println("client side edit  successfully at admin side");
			
			
			driver.close();
			
			

}
}




