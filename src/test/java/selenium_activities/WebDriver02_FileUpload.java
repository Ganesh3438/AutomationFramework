package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver02_FileUpload {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Lenovo\\OneDrive\\Desktop\\DataBase-Details.PNG");
		

	}

}
