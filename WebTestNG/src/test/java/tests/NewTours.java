package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.HashMap;


public class NewTours extends Base{

	
	@Test(priority = 1)
	public void executSessionOne() {
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
	}
	
	@Test(priority = 2)
	public void executeSessionTwo() {
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
	}
	
	@Test(priority = 3)
	public void executSessionThree() {
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
	}

}
