package com.enertics.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.enertics.base.Testbase;

public class Assets_Edit_At_client_side extends Testbase {

	@Test(priority=1)
	public void Assets_edit_At_Client_Side() throws InterruptedException, AWTException, IOException
	{
		
		 
		//edit section in edit asset
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='menuCl_16']//span[@class='sprite_icon ellipse_black']")).click();
		
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[normalize-space()='Edit']")).click();
		
		Thread.sleep(4500);
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Asset_edit_done");
		
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#site_id")).sendKeys("Demo_01");
		
		Thread.sleep(600);
		
		
	
		driver.findElement(By.xpath("//span[contains(text(),'Update Asset')]")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Asset edited successfully at client side");
		
		
		
		
		
	
		//Assets setting section
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='menuCl_16']//span[@class='sprite_icon ellipse_black']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[normalize-space()='Settings']")).click();
		
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-dialog-overview-example-dialog[1]/div[1]/div[2]/div[2]/section[1]/mat-radio-group[1]/mat-radio-button[2]/label[1]/span[1]/span[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".btn.primary_btn")).click();
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-dialog-overview-example-dialog[1]/div[1]/div[4]/button[1]")).click();
		
		
		
		
		
		//plate details section
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@id='menuCl_16']//span[@class='sprite_icon ellipse_black']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@id='btnClick_']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
	
		Thread.sleep(500);
		
		
		
		
		
		//service section in edit asset functionality
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='menuCl_16']//span[@class='sprite_icon ellipse_black']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[normalize-space()='Service']")).click();
		
		
		
		
		
		//Thread.sleep(1500);
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-dialog-overview-example-dialog[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("2/10/2022");
		//driver.findElement(By.xpath("//div[@class='service_popup ng-star-inserted']//div[1]//div[1]//div[1]//div[1]//button[1]//i[1]")).click();
		//Thread.sleep(500);
		//driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-dialog-overview-example-dialog[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/ngb-datepicker[1]/div[2]/div[1]/ngb-datepicker-month[1]/div[3]/div[4]/div[1]")).click();
		
		//driver.findElement(By.xpath("//body/div[@class='cdk-overlay-container']/div[@class='cdk-global-overlay-wrapper']/div[@id='cdk-overlay-15']/mat-dialog-container[@id='mat-dialog-2']/app-dialog-overview-example-dialog[@class='ng-star-inserted']/div[@class='service_popup ng-star-inserted']/div[@class='modal-body']/form[@class='ng-untouched ng-pristine ng-valid']/div[1]/div[1]/div[1]/input[1]")).sendKeys("02/10/2022");
		
		//driver.findElement(By.cssSelector("body > div:nth-child(8) > div:nth-child(2) > div:nth-child(1) > mat-dialog-container:nth-child(2) > app-dialog-overview-example-dialog:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("02/10/2022");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@placeholder='Select']")).click();
		
		//Thread.sleep(500);
		//driver.findElement(By.xpath("//label[normalize-space()='Machine DE Bearing repaired']")).click();
		
		//Thread.sleep(500);
		//driver.findElement(By.xpath("//input[@placeholder='Select']")).click();
		
		Thread.sleep(500);
		//driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']")).sendKeys("Demo service");
		
		Thread.sleep(500);
		//driver.findElement(By.xpath("//input[@placeholder='Service performed by']")).sendKeys("Demo purpose");
		
		driver.findElement(By.cssSelector("input[placeholder='Service performed by']")).clear();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[placeholder='Service performed by']")).sendKeys("Demo purpose");
		
		//Thread.sleep(500);
		//driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("02/21/2022");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(1500);
		
		//Delete section in edit asset functionality  
		
	/*	(Skipping)
	 * 
	 * Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='menuCl_16']//span[@class='sprite_icon ellipse_black']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[normalize-space()='Delete']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		
		*/
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		System.out.println("Asset edit functionalities  successfully at client side");
		
		driver.close();
	}
}
