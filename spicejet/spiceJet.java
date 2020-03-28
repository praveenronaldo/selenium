package selectionJunit;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class spiceJet {


WebDriver driver;
@BeforeAll
public static void InitAll()
{
System.setProperty("webdriver.chrome.driver", "C:/online/chromedriver.exe");
}

@BeforeEach
public void Init()
{
driver = new ChromeDriver();
driver.get("https://www.spicejet.com/");
}

@Test
void opensite() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   WebElement origin = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
   origin.click();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   WebElement ocity=driver.findElement(By.linkText("Hyderabad (HYD)"));
   ocity.click();
WebElement dep=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction"));
dep.click();
WebElement dcity=driver.findElement(By.linkText("Chennai (MAA)"));
dcity.click();
WebElement date=driver.findElement(By.linkText("27"));
date.click();
WebElement pass=driver.findElement(By.className("paxinfo"));
pass.click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement sel=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]/option[2]"));
sel.click();

WebElement find=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]"));
find.click();

}

//@AfterEach
//public void CloseDriver()
//{
//driver.close();
// }

}