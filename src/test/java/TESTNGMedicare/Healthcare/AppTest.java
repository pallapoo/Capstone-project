package TESTNGMedicare.Healthcare;

import org.testng.Reporter;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class AppTest 
{
	@Test
	
	public void launchbroser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8081/medicare/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signup\"]/a")).click();
		
		
		Reporter.log("Singup as user");
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Pavitra");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("R");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pavi4@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"contactNumber\"]")).sendKeys("9999976543");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pavi@123");
		driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("Pavi@123");
		
		
		driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[8]/div/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"addressLineOne\"]")).sendKeys("Navanagara");
		driver.findElement(By.xpath("//*[@id=\"addressLineTwo\"]")).sendKeys("Bagalkot");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Bagalkot");
		driver.findElement(By.xpath("//*[@id=\"postalCode\"]")).sendKeys("587101");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
		
		
		driver.findElement(By.xpath("//*[@id=\"billingForm\"]/div[7]/div/button[2]")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("pavi@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pavi@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/div/input[2]")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/a[1]")).click();
		Reporter.log("One item added to cart");
		
		driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[1]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[3]/div[2]/div/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/a[1]")).click();
		Reporter.log("Second item added to cart");
		
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[4]/a")).click();
		Reporter.log("Validated checkout button");
		
		
		
		
	}
	
    
   
}
