package selenium_activities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Handling_SikuliActivities {

	public static void main(String[] args) throws AWTException, InterruptedException, FindFailed {
		
		Robot r  = new Robot();
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_D);
		
		Thread.sleep(2000);
	
			Screen s  = new Screen();
			s.doubleClick("C:\\Users\\Lenovo\\OneDrive\\Desktop\\DataBase-Details.png");
			
		

	}

}
