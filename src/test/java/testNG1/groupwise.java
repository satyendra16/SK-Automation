package testNG1;

import org.testng.annotations.Test;

public class groupwise {
  @Test(groups={"signUP"}, priority= -1)
 
  public void signUP() {
	  
	  System.out.println(" this is signup module");
  }
  
  
  @Test  (groups={"login"}, priority= 0)
  
  
  public void Login() {
	  
	  System.out.println(" this is login module");
  }
  
 @Test (groups={"forget"}, priority= 3, enabled=false)
 
  
  public void forget() {
	  
	  System.out.println(" this is forgetpassword module");
  }
 
 @Test (groups={"addtocart"}, priority= 4)
 
 
 public void addtocart() {
	  
	  System.out.println(" this is addtocart module");
 }
 
 @Test  (groups={"payment"}, priority= 5)
 
 
 public void payment() {
	  
	  System.out.println(" this is payment module");
 }
 
 @Test (groups={"order "}, priority= 6)
 
 
 public void order() {
	  
	  System.out.println(" this is order module");
 }
}
