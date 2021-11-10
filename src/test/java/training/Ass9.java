package training;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Ass9 {
WebDriver driver;
  @Test
   @Parameters({"susername","spassword"})
  public void f(String susername,String spassword) {
	  WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
	  username.sendKeys(susername);
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys(spassword);
	  WebElement button=driver.findElement(By.xpath("//input[@name='submit']"));
	  button.click();
	
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get("http://demo.guru99.com/test/newtours/"); 
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
