package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {

//	@Test
 public static void main(String[] args) throws InterruptedException {
	
     System.setProperty("webdriver.edge.driver", "D:\\ADriver\\msedgedriver.exe");
//	WebDriverManager.edgedriver().setup();
	 WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	 driver.findElement(By.xpath("nam")).click();

	 Thread.sleep(5000);
 
	 String actualTitle =driver.getTitle();
	 String expectedTitle = "Googl";
	 
	 Assert.assertEquals(actualTitle, expectedTitle);
	 Thread.sleep(5000);
	 driver.quit();
}
	
}