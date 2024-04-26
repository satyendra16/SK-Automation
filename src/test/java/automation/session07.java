package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class session07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 
		 driver.manage().window().maximize();
		 
	WebElement abc=	 driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	
	Actions act=new Actions (driver);
	
	act.moveToElement(abc).build().perform();

	}

}
