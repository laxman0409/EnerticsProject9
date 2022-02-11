
	
	package com.enertics.testcases;

	import java.awt.AWTException;
	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.ui.Select;
    import org.testng.annotations.Test;

	import com.enertics.base.Testbase;

	//import Library.Utility;

	public class Client_module extends Testbase {
		
		@Test(priority=1)
		public void client() throws InterruptedException, AWTException, IOException
		{
			Thread.sleep(1250);
			//click on client link
			driver.findElement(By.xpath("//a[normalize-space()='Clients']")).click();
			Thread.sleep(2000);
			//click on add client button
			driver.findElement(By.xpath("//span[@class='sprite_icon plus_white']")).click();
			Thread.sleep(500);
			//
			
			
			driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("Demo_company_01");
			Thread.sleep(1500);
			
			
			
			Select industry= new Select(driver.findElement(By.xpath("//select[@id='industry_type']")));
			industry.selectByVisibleText("Food & Beverage");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Demo_client_N");
			Thread.sleep(500);
			
			
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("DemoClient02@yopmail.com");
			
			
			
			
			//phone
			driver.findElement(By.xpath("//button[@class='dropbtn btn']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[normalize-space()='+ 91']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).sendKeys("9898989898");
			
			//address
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='address_line1']")).sendKeys("Demo client address one");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='address_line2']")).sendKeys("Demo client address two");
			
			//select country
			Thread.sleep(1500);
			Select country1= new Select(driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-create-clients[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/span[1]/select[1]")));
			Thread.sleep(500);
			country1.selectByVisibleText("India");
			
			//select State/Province
			Thread.sleep(1500);
			Select state1= new Select(driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-create-clients[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[2]/span[1]/select[1]")));
			state1.selectByVisibleText("Telangana");
			//city
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='city_name']")).sendKeys("Hyderabad");
			Thread.sleep(500);
			//Postal Code 
			driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("500018");
			
			// select time zone
			
			Thread.sleep(1500);
			Select timezone1= new Select(driver.findElement(By.xpath("//body/app-root[1]/app-side-menu[1]/div[2]/app-admin-create-clients[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/span[1]/select[1]")));
			Thread.sleep(500);
			timezone1.selectByVisibleText("Asia/Kolkata");
			
			// select manager
			
			Thread.sleep(1500);
			Select manager1= new Select(driver.findElement(By.xpath("//select[@id='account_manager']")));
			Thread.sleep(500);
			manager1.selectByVisibleText("Test Manager_02");	
			
			//click on create client button
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[contains(text(),'Create Client')]")).click();
			Thread.sleep(2500);
			System.out.println("client is created successfully at admin side");
			
			
			

}
	}
	
