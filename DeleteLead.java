package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		//go to phone number
		driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234");
		//go to find  leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Thread.sleep(3000);
		//capture lead Id
		String id=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[6]")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[6]")).click();
		//delete
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		//click on find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//display message
		String msg=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(msg+ "message verified successfully");
		driver.close();
		
		
		
		
		
		
	}

}
