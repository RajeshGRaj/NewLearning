package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumlaunch {
	
	public static void main(String args[]) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 // get method is used to launch application
		 driver.get("https://letcode.in/");
		 
		 driver.findElement(By.xpath("//a[.='Work-Space']")).click();
		 driver.findElement(By.xpath("//a[.='Drop-Down']")).click();
		 
		 //fruid dropdown
		 WebElement fruit = driver.findElement(By.id("fruits"));
		 
		 //Iam Dropdown Handler class
		 Select f = new Select(fruit);
		 
		 //to get all options from dropdown
		 List<WebElement> options = f.getOptions();
		 
		 
		 // I will Print all values of option
		 for(WebElement option : options) {
			 System.out.println(option.getText());
		 }
		 
		 
		
		 
		 
		 
		 driver.quit();
		 
		 
	}
}
