package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class session03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://demo.automationtesting.in/Register.html");
		  
		WebElement abc=  driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select dropdown= new Select(abc);
		
		//dropdown.selectByValue("C");
		
		//dropdown.selectByIndex(4);
		
		dropdown.selectByVisibleText("APIs");
		
		if(dropdown.isMultiple())
		{
			System.out.println("dropdown is multiple");
		}
		else
		{
			System.out.println("dropdown is not multiple");
			
			
		}
		
		List<WebElement> alldropdowns =    dropdown.getOptions();
		
		System.out.println("total dropdowns  " + alldropdowns.size());
		
		
		for ( WebElement el:alldropdowns)
		{
			System.out.println(el.getText());
		}
		
		
		
		//driver.close();
	}

}
