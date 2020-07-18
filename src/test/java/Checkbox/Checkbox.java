package Checkbox;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	@Test
	public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Katiusca\\MiscelaneosSelenium\\Checkbox\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());
	//driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
 
	 List <WebElement> li= driver.findElements(By.xpath("//input[@type='checkbox']"));
	 
	 for (WebElement el: li) {
		 
		 if(!el.isSelected()) {
			 el.click();
		 }
		 
	 }
		 
	 
	}

}
