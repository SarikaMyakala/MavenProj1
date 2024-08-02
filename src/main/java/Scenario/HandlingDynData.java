package Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HandlingDynData {
	WebDriver driver;
	@Test
	public void DynData() throws InterruptedException
	{
		driver = new EdgeDriver();
		driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.id("ebcaptchatext"));
		//String str=driver.findElement(By.id("ebcaptchatext")).getText();
		String str=ele.getText();
		System.out.println(str);
		String str1=str.substring(8, 9);
		String str2=str.substring(12, 13);
		System.out.println(str1+"\t"+str2);
		
		Integer res = Integer.valueOf(str1) + Integer.valueOf(str2);
		
		driver.findElement(By.id("ebcaptchainput")).sendKeys(String.valueOf(res));
		boolean chkSubmit=driver.findElement(By.xpath("//*[@id=\"form\"]/input[2]")).isEnabled();
		System.out.println(chkSubmit);
		if(chkSubmit==true)
		{
			System.out.println("Button enable and Calculation is correct");
		}
		else
		{
			System.out.println("Button disable and Calculation is incorrect");
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
