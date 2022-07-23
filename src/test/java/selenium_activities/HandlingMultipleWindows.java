package selenium_activities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWindows {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		String parentID = driver.getWindowHandle();
		System.out.println("Parent window id is:"+ parentID);
		System.out.println("Parent window:"+ driver.getTitle());
		
		driver.findElement(By.xpath("//div[text()='Companies']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Total count of the windows are:"+ (allWindows.size()));
		System.out.println("Total windows are:"+ allWindows);
		
		for(String child: allWindows) {
			
			if(!parentID.equalsIgnoreCase(child)) {
			
				driver.switchTo().window(child);
				System.out.println("Child window title:"+ driver.getTitle());
				System.out.println("Child window url is:"+ driver.getCurrentUrl());
				driver.close();
			}
		}
		
		
		
		
		driver.switchTo().window(parentID);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
