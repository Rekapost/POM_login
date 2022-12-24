package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Update_pageObjects {
	
	public static WebElement customer(WebDriver driver) {
		WebElement customerMain=driver.findElement(By.xpath("//a[@href='#']//p[contains(text(),'Customers')]"));
		return customerMain;
	}
	
	public static WebElement customerMenuItem(WebDriver driver) {
		WebElement customerItem=driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]"));
		return customerItem;
	}
	public static WebElement customerAdd(WebDriver driver){
		 WebElement newCustomer=driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a"));
		return newCustomer;
	 }
	
	public static WebElement emailAdd(WebDriver driver){
		 WebElement addEMAILr=driver.findElement(By.xpath("//input[@id='Email']"));
		return addEMAILr;
	}
	public static WebElement firstName(WebDriver driver) {
		WebElement firstNameEnter=driver.findElement(By.xpath("//input[@id='FirstName']"));
		return firstNameEnter;
	}
	public static WebElement lastName(WebDriver driver) {
		WebElement lastNameEnter=driver.findElement(By.xpath("//input[@id='LastName']"));
		return lastNameEnter;	
	}
	public static WebElement saveCustomer(WebDriver driver) {
		WebElement savebuton=driver.findElement(By.xpath("//button[@name='save']"));
		return savebuton;
	}
}
