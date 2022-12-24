package pageFactoryWithoutAnnotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {
	//finding web element without using findelementBy and FindBy annotation
	//it works only for webelement having id and name
public static WebElement Email;
public static WebElement Password;
public static WebElement Log ;   // it is xpath , so dont work

	@Test
	public void login() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Reka\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://admin-demo.nopcommerce.com/login");
		 PageFactory.initElements(driver, LoginWithoutFindBy.class);
		 Email.clear();
		 Email.sendKeys("admin@yourstore.com");
		 Password.clear();
		 Password.sendKeys("admin");
		 Log.click();
		 
		 
	}
}
