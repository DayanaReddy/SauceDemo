package demoNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\OneDrive\\Documents\\Software Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
				
		//URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		//UserName
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	
		//Password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		//Login
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		
		//Add to cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		
		//Cart
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(2000);
		
		//CheckOut
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		//Details_FirstName
		driver.findElement(By.id("first-name")).sendKeys("Dayana");
		Thread.sleep(2000);
		
		//LastName
		driver.findElement(By.id("last-name")).sendKeys("Reddy");
		Thread.sleep(2000);
		
		//Postal Code
		driver.findElement(By.id("postal-code")).sendKeys("500086");
		Thread.sleep(2000);
		
		//Continue
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		//Finish
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		//Back to home
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		
		
		
		
		

	}

}
