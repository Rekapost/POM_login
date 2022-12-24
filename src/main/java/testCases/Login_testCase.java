package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.Login_pageObjects;


public class Login_testCase {
	@Test
	public void login() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Reka\\Drivers\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://admin-demo.nopcommerce.com/login");
	 Thread.sleep(3000);
	 
	 PageFactory.initElements(driver, Login_pageObjects.class);  // for null exception 
	 Login_pageObjects.username.clear();
	 Login_pageObjects.username.sendKeys("admin@yourstore.com");
	 Login_pageObjects.password.clear();
	 Login_pageObjects.password.sendKeys("admin");
	 Login_pageObjects.loginButton.click();
	 
	 //(not using object as we put static in method )Login_pageObjects 
     //loginpageObjects=new Login_pageObjects();
	 /*
	 Login_pageObjects.username(driver).clear();
	 Login_pageObjects.username(driver).sendKeys("admin@yourstore.com");
	 Login_pageObjects.password(driver).clear();
	 Login_pageObjects.password(driver).sendKeys("admin");
	 Login_pageObjects.loginButton(driver).click();
	 */
	}
}
