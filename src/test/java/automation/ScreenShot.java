package automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		        File       src= screenshot.getScreenshotAs(OutputType.FILE);
		        
		        File dist= new File("C:\\Users\\DELL\\eclipse-workspace\\Project7pm\\screenshot\\rizvan.png");
		        
		        try {
					FileUtils.copyFile(src, dist);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

}
