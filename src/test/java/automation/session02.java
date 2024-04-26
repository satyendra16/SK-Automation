package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class session02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		List<WebElement>  linkelement=  driver.findElements(By.tagName("a"));
		
		System.out.println("total hyperlinks on this page " + linkelement.size());
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
