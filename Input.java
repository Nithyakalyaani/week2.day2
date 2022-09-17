package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		//enter name
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Nithika");
		//append
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("Bangalore");
		//isdisabled
		Boolean value=driver.findElement(By.xpath("(//div[@class='col-12'])[3]")).isEnabled();
		System.out.println("meesage is"+value);
		//clear text
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		//Retrieve text
		String text=driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println("the value is" +text);
		//name and choose 3rd option
		driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']")).sendKeys("nithi,");
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']"));
		Select dd=new Select(ele);
		dd.selectByIndex(4);
		//keyboard appears
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
		boolean appear=driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).isDisplayed();
		if(appear==true)
		{
			System.out.println("keyboard appearing");
		}
		else
		{
			System.out.println("Keyboard not appearing");
		}

		
		
		
		
	}

}
