package Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class RadiCheckBox {
	WebDriver driver;
	@Test
	public void ChekRadAndChkBox()throws InterruptedException
	{
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement radBtn=driver.findElement(By.id("bmwradio"));
		radBtn.click();
		Thread.sleep(3000);
		boolean chkradBmw=radBtn.isSelected();
		
		System.out.println("Radio Button-BMW="+chkradBmw);
		
		WebElement chkBoxBenz=driver.findElement(By.id("benzcheck"));
		chkBoxBenz.click();
		Thread.sleep(3000);
		boolean checkchkBoxBenz=chkBoxBenz.isSelected();
		System.out.println("check Box-Benz="+checkchkBoxBenz);
		
		WebElement chkBoxHonda=driver.findElement(By.id("hondacheck"));
		chkBoxHonda.click();
		Thread.sleep(3000);
		boolean chkCheckBBoxHonda=chkBoxHonda.isSelected();
		System.out.println("check Box-Honda="+chkCheckBBoxHonda);
		
		driver.quit();
	}
}
