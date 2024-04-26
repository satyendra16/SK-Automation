package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Project7pm\\drivers\\chromedriver.exe");
  
  WebDriver driver= new ChromeDriver();
  
  driver.get("https://demo.automationtesting.in/Index.html");
// String a= driver.getCurrentUrl();
 //System.err.println(a);
  
 
//String b= driver.getPageSource();
//System.out.println(b);

String c=driver.getTitle();
System.out.println(c);

driver.close();
 //driver.quit();

driver.manage().window().maximize();

	}

}
