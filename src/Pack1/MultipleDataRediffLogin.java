package Pack1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pack2.XLS_Reader;

public class MultipleDataRediffLogin {
	
	@Test
	public void rediffmultipledata(){
		
		XLS_Reader xls = new XLS_Reader("V:/testfile/mytestdata.xlsx");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		for (int i=2; i<=xls.getRowCount("testdata"); i++){
		
		driver.get("http://rediff.com");
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("login1")).sendKeys(xls.getCellData("testdata", 0, i));
		driver.findElement(By.id("password")).sendKeys(xls.getCellData("testdata", 1, i));
		
		driver.findElement(By.name("proceed")).click();
		}
	}		
}
	


