package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sesson01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	WebDriver  driver= new ChromeDriver();
 driver.get("https://demo.automationtesting.in/Register.html");
 
 WebElement element=driver.findElement(By.xpath("//select[@id='Skills']"));
 
 Select dropdown= new Select(element);
 dropdown.selectByVisibleText("C");

	}

}
