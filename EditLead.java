package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//go to Leads
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//go to Find Lead
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//enter username
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Nithya");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("kalyaani");
		//click on Find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//click on resulting page
		driver.findElement(By.xpath("//a[text()='10213']")).click();
		//get title
		System.out.println("The title is" + driver.getTitle());
		//change company name
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		ele.clear();
		ele.sendKeys("TestLeaf");
		//update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//System.out.println("Changed name is" +text.getText());
		driver.close();
		String newname=driver.findElement(By.xpath("//input[@id='viewLead_companyName_sp']")).getText();
		//confirm new company name
		if(ele.equals(newname))
		{
			System.out.println("company name not changed");
		}
		else
		{
			System.out.println("company name changed");
		
			}
		}
		 
}
		
		
		
		
		
		



