package selenium_activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_TakeScreenshots {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\sreenshots\\Selenium"+System.currentTimeMillis()+ ".png");
//	    File dest = new File("E:\\SeleniumAutomationFramework-10-07-2022\\com.AutomationFramework\\sreenshots\\selenium1.png");
		FileUtils.copyFile(src, dest);

		driver.quit();

	}

}
