package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_pageObjects 
{
    @FindBy(how=How.XPATH, using="//input[@id='Email']") 
	public static WebElement username;
	@FindBy(how=How.XPATH,using="//input[@id='Password']")
	public static WebElement password;
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Log in']")
	//@FindBy(name="//button[normalize-space()='Log in']")
	public static  WebElement loginButton;
	
	/*
	//username, password, submit 
	 public static WebElement username(WebDriver driver) {
		 WebElement username=driver.findElement(By.xpath("//input[@id='Email']"));
		 return username;
	 } 
	public static WebElement password(WebDriver driver)	{ 
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		return password; 
		 }
	public static  WebElement loginButton(WebDriver driver) {
		 WebElement submit=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));	 
		return submit;	 
	}*/
}
	

