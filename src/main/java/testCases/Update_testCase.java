package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Login_pageObjects;
import pageObjects.Update_pageObjects;

public class Update_testCase {
	
	@Test
	public void update() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Reka\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://admin-demo.nopcommerce.com/login");
		 Thread.sleep(3000);
		 PageFactory.initElements(driver, Login_pageObjects.class);
		 Login_pageObjects.username.clear();
		 Login_pageObjects.username.sendKeys("admin@yourstore.com");
		 Login_pageObjects.password.clear();
		 Login_pageObjects.password.sendKeys("admin");
		 Login_pageObjects.loginButton.click();
		 Thread.sleep(3000);
		 	 
// if thread .sleep does not work , u can use javascript executor to wait and click
// below listitem is the output of if else loop , in chosing between values , not related to this code
// it is for an example
//		 listitem.click();
//		 Thread.sleep(3000);
//		 JavascriptExecutor js=(JavascriptExecutor)ldriver;
//		 js.executeScript("arguments[0].click();",listitem);
		 
		 
// to generate unique email id randomly:		 
//public static String randomstring() {
//	String generatedString1=RandomStringUtils.randomAlphabetic(5);
//	return(generatedString1);	 		
//}                //random_generator()+"@gmail.com" 
		 
		 Update_pageObjects.customer(driver).click();
		 Update_pageObjects.customerMenuItem(driver).click();
		 Update_pageObjects.customerAdd(driver).click();
		 Update_pageObjects.emailAdd(driver).sendKeys("admin@gmail.com");
		 Update_pageObjects.firstName(driver).sendKeys("Reka");
		 Update_pageObjects.lastName(driver).sendKeys("NV");
		 Update_pageObjects.saveCustomer(driver).click();
	}

}
