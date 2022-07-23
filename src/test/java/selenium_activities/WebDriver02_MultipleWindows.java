package selenium_activities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver02_MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		System.out.println("Parent window id is:"+ parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("Child window id is:"+ childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
