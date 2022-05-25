package stepDefinition;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Reusable.VATT;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends VATT{
	public static WebDriver owebdriver=VATT.owebdriver;
	public static String Name;
	public static String ScreenSLocation1;
	public static FileOutputStream outputStrem=null;
	Properties prop=new Properties();
	public static int i=0;
	public Hooks()
	{
		
	}
@Before
public void InitializeTest(Scenario scenario) throws IOException
{
	
	 System.out.println("Test Execution started");
}

@AfterStep
	public void ScreenShotCapture(Scenario scenario) throws IOException 
	{
		this.owebdriver=VATT.owebdriver;
		if(scenario.isFailed())
		{
		System.out.println(scenario.getStatus());
		 final byte[] screenshot1=((TakesScreenshot)owebdriver).getScreenshotAs(OutputType.BYTES);
      		scenario.attach(screenshot1, "image/png", "image");
		  }
		
	}
	
	@After
	public void TearDown()
	{
		System.out.println("Test Execution Ended");

	}

}
