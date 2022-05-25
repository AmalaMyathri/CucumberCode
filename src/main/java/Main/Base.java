package Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.internal.Throwables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver owebdriver;
	public static String datetimeseconds;
	public void lundriver()
	{
		WebDriverManager.chromedriver().setup();
		owebdriver = new ChromeDriver();
		owebdriver.manage().window().maximize();
	}
	
}
