package com.datadriven.test;

import org.testng.annotations.Test;

import com.excel.utilites.Xls_Reader;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest {


	@Test
	public void test1() {
		Xls_Reader reader = new Xls_Reader("D:\\Materials\\EclipseWorkspace\\WebTestNG\\nopcommerceData.xlsx");
		for(int i=2; i<=reader.getRowCount("RegTestData"); i++) {
			
			String email = reader.getCellData("RegTestData", "email", i);
			String password = reader.getCellData("RegTestData", "password", i);
			System.setProperty("webdriver.chrome.driver", "D:\\Materials\\EclipseWorkspace\\WebTestNG\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin");
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath(".//*[@type='submit']")).submit();
		}	
				
	}

}
