package testNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class april14 {
	WebDriver driver;
	
	Actions act;
	
  @Test ( priority =2, enabled= false)
  
  public void rightclick() throws InterruptedException {
	  
	WebElement abc=  driver.findElement(By.xpath("//span[@class='demo-icon icon-hotels']"));
	  act = new Actions(driver);
	  act.contextClick(abc).build().perform();
	  Thread.sleep(2000);
  }
  
  @Test ( priority = 3)
  
  public void mhover() throws InterruptedException {
	  
	WebElement dm=  driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	
	act = new Actions(driver);
	act.moveToElement(dm).build().perform();
	
	Thread.sleep(2000);
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.yatra.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
