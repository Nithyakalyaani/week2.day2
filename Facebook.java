package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nithya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("p");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abc123");
		WebElement ele=driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg']"));
		//driver.findElement(By.xpath("//select[@id='year']")).click();
		Select dd=new Select(ele);
		dd.selectByIndex(17);
		WebElement ele1=driver.findElement(By.xpath("//select[@id='month']"));
		Select dd1=new Select(ele1);
		dd1.selectByVisibleText("Jan");
		WebElement ele2=driver.findElement(By.xpath("//select[@id='year']"));
		Select dd2=new Select(ele2);
		dd2.selectByValue("1995");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		
		
		
		
		
		
		
		
	}

}
