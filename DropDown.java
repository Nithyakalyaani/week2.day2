package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//select value
		WebElement et=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dd=new Select(et);
		dd.selectByVisibleText("Playwright");
		WebElement et1=driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
		Select dd1=new Select(et1);
		dd1.selectByVisibleText("Brazil");
		WebElement et2=driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));
		Select dd2=new Select(et2);
		dd2.selectByVisibleText("Selenium WebDriver");
		WebElement et3=driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']"));
		Select dd3=new Select(et3);
		dd3.selectByVisibleText("English");
		WebElement et4=driver.findElement(By.xpath("//label[@id='j_idt87:value_label']"));
		Select dd4=new Select(et4);
		dd4.selectByIndex(4);
		
		
		
		
	}

}
