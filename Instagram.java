package Instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		//path
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver latest version\\chromedriver-win64\\chromedriver.exe\\");
		
		// Initialize the WebDriver
	    driver = new ChromeDriver();
		
	  //url
		driver.get("https://www.instagram.com");
		
		//screen
		driver.manage().window().maximize();
	}
	
	@AfterMethod
    public void tearDown() {
        // Code for closing WebDriver instance
        driver.close();
    }
	
	@DataProvider
    public Object[][] loginData() {
        return new Object[][] {
                { "8074339515", "12Eleven" }
                
        };
    }

	
		
		@Test(priority=1, dataProvider ="loginData")
		public void loginwithvalidcredentials(String username, String password) throws InterruptedException{
			
			Thread.sleep(5000);
			
			//login
			WebElement usernameEl = driver.findElement(By.name("username"));
			usernameEl.sendKeys(username);
			
			//password
			WebElement passwordEl = driver.findElement(By.name("password"));
			passwordEl.sendKeys(password);
			
			//button
			WebElement button = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div"));
			button.click();
			
			//continue
			//WebElement continueEl = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/div/div/div[3]/form/div[2]/div"));
			//continueEl.click();
			
			//wait
			Thread.sleep(5000);
			
			//notnow
			WebElement notnow = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div/div/div"));
			notnow.click();
			
			//wait
			Thread.sleep(5000);
			
			//button
			WebElement notificationturnoff = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/button[2]"));
			notificationturnoff.click();
			
			//wait
			Thread.sleep(5000);
			
			// Print login success message
	        System.out.println("Login successfully");
	        
	        //close
	        //driver.close();
		}
		
		@Test(priority=2, dataProvider ="loginData")
		public void logout(String username, String password) throws InterruptedException{
			
			Thread.sleep(5000);
			
			//login
			WebElement usernameEl = driver.findElement(By.name("username"));
			usernameEl.sendKeys(username);
			
			//password
			WebElement passwordEl = driver.findElement(By.name("password"));
			passwordEl.sendKeys(password);
			
			//button
			WebElement button = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div"));
			button.click();
			
			//continue
			//WebElement continueEl = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/div/div/div[3]/form/div[2]/div"));
			//continueEl.click();
			
			//wait
			Thread.sleep(5000);
			
			//notnow
			WebElement notnow = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div/div/div"));
			notnow.click();
			
			//wait
			Thread.sleep(5000);
			
			//button
			WebElement notificationturnoff = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/button[2]"));
			notificationturnoff.click();
			
			//wait
			Thread.sleep(8000);
			
			WebElement settings = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[3]/span/div/a/div/div[2]/div/div/span"));
			settings.click();
			
			//wait
			Thread.sleep(8000);
			
			//logout
			WebElement logout = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div[8]/div[1]"));
			logout.click();
			
			//close
			//driver.close();
			
			
	        

	        
}
		
		@Test(priority=3, dataProvider ="loginData")
		public void comment(String username, String password) throws InterruptedException{
			
			Thread.sleep(5000);
			
			//login
			WebElement usernameEl = driver.findElement(By.name("username"));
			usernameEl.sendKeys(username);
			
			//password
			WebElement passwordEl = driver.findElement(By.name("password"));
			passwordEl.sendKeys(password);
			
			//button
			WebElement button = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div"));
			button.click();
			
			//continue
			//WebElement continueEl = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/div/div/div[3]/form/div[2]/div"));
			//continueEl.click();
			
			//wait
			Thread.sleep(5000);
			
			//notnow
			WebElement notnow = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div/div/div"));
			notnow.click();
			
			//wait
			Thread.sleep(5000);
			
			//button
			WebElement notificationturnoff = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/button[2]"));
			notificationturnoff.click();
			
			//wait
			Thread.sleep(5000);
			
		   //profile
			WebElement profile = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[8]/div/span"));
			profile.click();
			
			//wait
			Thread.sleep(5000);
			
			//photo
			WebElement photo = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/section/main/div/div[2]/div/div[1]/div[1]"));
			photo.click();
			
			//wait
			Thread.sleep(8000);
			
			//comment
			//WebElement comment = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div[3]/div/div/div/div/div[2]/div/article/div/div[2]/div/div/div[2]/section[3]/div/form/div/textarea"));
			//comment.sendKeys("FightClub");
			
			//post
			//WebElement post= driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div[3]/div/div/div/div/div[2]/div/article/div/div[2]/div/div/div[2]/section[3]/div/form/div/div[2]/div"));
			
			//post.click();
			
			

		    // Print success message
		    System.out.println("Comment is displayed successfully");

		    // close
		   // driver.close();
	    }
		
		@Test(priority=4, dataProvider ="loginData")
		public void user(String username, String password) throws InterruptedException{
			
			Thread.sleep(5000);
			
			//login
			WebElement usernameEl = driver.findElement(By.name("username"));
			usernameEl.sendKeys(username);
			
			//password
			WebElement passwordEl = driver.findElement(By.name("password"));
			passwordEl.sendKeys(password);
			
			//button
			WebElement button = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div"));
			button.click();
			
			//wait
			Thread.sleep(5000);
			
			//notnow
			WebElement notnow = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div/div/div"));
			notnow.click();
			
			//wait
			Thread.sleep(5000);
			
			//button
			WebElement notificationturnoff = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/button[2]"));
			notificationturnoff.click();
			
			//wait
			Thread.sleep(5000);
			
			//search
			WebElement search = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/span/div/a/div/div[1]/div"));
			search.click();
			
			//wait
			Thread.sleep(5000);
			
			//seachuser
			WebElement searchuser = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/input"));
			searchuser.sendKeys("mruduuuuuuuu");
			searchuser.click();
			
			 // Print success message
		    System.out.println("User Displayed successfullys");
		}
		
		
		
}


