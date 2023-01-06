package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class HomePage extends LogInPage
{
	@Test
	public void sortelement() throws InterruptedException
	{
		LogInPage lp = new LogInPage();
		lp.login();
		boolean result = lp.isHomeModuleDisplayed();
		Assert.assertFalse(result);
		//Thread.sleep(5);
		driver.findElement(By.id("amount")).click();
		
		Select amtlist = new Select (driver.findElement(By.id("amount")));
		List<WebElement> blist = amtlist.getOptions();
		
		String amtlist1,amtlist2;
		boolean orderd = true;
		
		for(int i=1;i<blist.size();i++)
		{
			amtlist1 = blist.get(i-1).getText();
			amtlist2 = blist.get(i).getText();
			if(amtlist2.compareToIgnoreCase(amtlist1)<0)
			{
				orderd = false;
				break;
			}			
		}
		
		if(orderd)
		{
			System.out.println("Sorted , test pass");			
		}else
		{
			System.out.println("Not Sorted, test fail");
		}
		
		
		
		
		
		
		
	}

}
