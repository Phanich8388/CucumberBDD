package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base {
	public WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public  WebDriver launchBrowser(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Materials\\EclipseWorkspace\\Project\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
		}else if(browser.equals("edge")){
			System.setProperty("webdriver.edge.driver", "D:\\Materials\\EclipseWorkspace\\WebTestNG\\Drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
