package Abstract;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;

public class AbstarctClass {

	WebDriver driver;
	public AbstarctClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public void windowSwitch() {
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String firstWin=it.next();
		String secondWin=it.next();
		driver.switchTo().window(secondWin);
		
		
	}
	

}
