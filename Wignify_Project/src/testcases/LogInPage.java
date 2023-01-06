package testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Wignify_AppUtils.Apputils;


public class LogInPage extends Apputils
{
	String uid="Abcd";
	String pwd="123456";
	
	
	public void login()
	{		
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("log-in")).click();
		
		
	}
	
	public boolean isHomeModuleDisplayed()
	{
		
		try 
		{
			if(driver.findElement(By.className("logged-user-info-w")).isDisplayed());
			return false;
		} catch (Exception e) 
		{
			return true;
		}
	}
}
	
