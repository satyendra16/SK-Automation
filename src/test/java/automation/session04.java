package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class session04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		/*
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		
		driver.switchTo().alert().accept();  
		   
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();  */
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
		
		driver.switchTo().alert().sendKeys("java");
		driver.switchTo().alert().accept();
	}

}
