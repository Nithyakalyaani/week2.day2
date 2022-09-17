package week2day1;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		//confirm title
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		System.out.println("The title is" +driver.getTitle());
		driver.navigate().back();
		//button disabled
		boolean output=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		if (output==true)
		{
		System.out.println("The button is Enabled");
		}
		else
		{
		System.out.println("The button is disabled");
		}
		//get the location
		org.openqa.selenium.Point location=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		//get color
		String color=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background");
		System.out.println("The color is" +color);
		//get size
		org.openqa.selenium.Dimension size=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
		System.out.println("the height is" +size.getHeight());
		System.out.println("The width is" +size.getWidth());
		
		
	}

}
