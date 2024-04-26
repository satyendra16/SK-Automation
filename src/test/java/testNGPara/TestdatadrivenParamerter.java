package testNGPara;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class TestdatadrivenParamerter {
	WebDriver driver;
	
	
  @Test(dataProvider = "authencation")
  public void login(String UID, String PASS) 
  
  {
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UID);
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PASS);
	  driver.findElement(By.name("login")).click();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }


  @DataProvider (name = "authencation")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "jeetesh", "123@" },
      new Object[] { "samay", "bab@" },
      new Object[] { "aditi", "@123" },
      new Object[] { "sagar", "bab123" },
      new Object[] { "vikrant", "bab#" },
    };
  }
}
