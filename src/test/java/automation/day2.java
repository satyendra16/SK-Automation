package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Project7pm\\drivers\\chromedriver.exe");
		  
		  WebDriver driver= new ChromeDriver();
		  
		  driver.get("https://www.saucedemo.com/v1/");
		  
		  driver.findElement(By.id("user-name")).sendKeys("problem_user");
		//  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  
		 // driver.findElement(By.className("btn_action")).click();
		  
		//List <WebElement> elementlist  =driver.findElements(By.id("user-name"));
		
		driver.findElements(By.id("user-name"));
		
		//System.out.println("list numbers" + elementlist.size());
	}
}

