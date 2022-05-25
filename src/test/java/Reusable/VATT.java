package Reusable;


import org.apache.commons.lang3.BooleanUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadablePartial;
import org.joda.time.LocalDate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.Text;
import com.google.common.base.Throwables;

import io.cucumber.messages.internal.com.google.protobuf.Message;
import io.github.bonigarcia.wdm.WebDriverManager;
import stepDefinition.Hooks;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.PasswordAuthentication;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.regex.Pattern;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;

import org.openqa.selenium.Capabilities;


/**
 * SFA Reusable Functions which can be called at any point of time
 * while automating your application
 * 
 * @author Vuram Automation Team
 *
 */
public class VATT{
	private static final long TimeOut = 20;
	public String key="Vuram";
	public static WebDriver owebdriver;
	public List<String> Result = new ArrayList<String>();
	public static String documentname;
	public static String DocumentName;
	public static VATT flow = new VATT();
	public int allowcount = 0;
	public String BROWSER;
	public String  mainwindowhandle;
	public String[] text;
	private static SecretKeySpec q4e232424234;
	private static byte[] safsdf343t45354;
	public static String Platform = Dynamicxmlcreation.Platform;
	public static String Directorypath = Dynamicxmlcreation.Directorypath;

	public WebDriver lundriver()
	{
		WebDriverManager.chromedriver().setup();
		owebdriver = new ChromeDriver();
		owebdriver.manage().window().maximize();
		return owebdriver;
	}
	
	public void SingleSelectDropDown(String inputtext, String fieldname) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbtMDYL8OL8SQzjV2fiisc4Bflvat2MJjjxegxV/QUCl3", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbtMDYL8OL8SQzjV2fiisc4Bflvat2MJjjxegxV/QUCl3", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			element.click();
			element.sendKeys(new CharSequence[] { inputtext });
			element.sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SingleSelectDropDown with fieldname " + fieldname + " is throwing function error", true);
			System.out.println("SingleSelectDropDown with fieldname " + fieldname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SingleSelectDropDownBasedonIndex(String inputtext, String fieldname, int indexnumber) throws Exception {
		try {
			if (fieldname.equals("false")) {
				System.out.println("false");
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKPwMaWZEVc7q9HZIbD75HTzBJ/rLtAJrgZl8BOBq5BXDESJKUQrhcsECViPs+Vn3lQOR4HocgUSrO4XdCwE+xvh/NbzZ+pyMK/+nLClcN6MBQbJGaIKMF4tcegIZTwZreKcwhLNpXWyHhPez4+Y8vxE1gc2RYdts5soJcGSj0XFw9UBmv4SA+zQutWNParnrwvQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKPwMaWZEVc7q9HZIbD75HTzBJ/rLtAJrgZl8BOBq5BXDESJKUQrhcsECViPs+Vn3lQOR4HocgUSrO4XdCwE+xvh/NbzZ+pyMK/+nLClcN6MBQbJGaIKMF4tcegIZTwZreKcwhLNpXWyHhPez4+Y8vxE1gc2RYdts5soJcGSj0XFw9UBmv4SA+zQutWNParnrwvQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				element.click();
				element.sendKeys(new CharSequence[] { inputtext });
				element.sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
			} else {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMnqwQvZ9pHSmcq/kE1khdzLjBVLWlJTaa5FY/s22HaiHDFe0PXr/19xlOAJUvx0EaDXk9BqGmgbRyIJdNh5/Rcw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMnqwQvZ9pHSmcq/kE1khdzLjBVLWlJTaa5FY/s22HaiHDFe0PXr/19xlOAJUvx0EaDXk9BqGmgbRyIJdNh5/Rcw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				element.click();
				element.sendKeys(new CharSequence[] { inputtext });
				element.sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SingleSelectDropDown with fieldname " + fieldname + "at the index " + indexnumber + " is throwing function error", true);
			System.out.println("SingleSelectDropDown with fieldname " + fieldname + "at the index " + indexnumber + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SingleSelectDropDownBasedonPlaceholderText(String placeholdertext, String inputtext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("gRvDC3cCdonRxqZxpkjMfczndvS/GlRLpHnbxEjODwN7LkltRpzZyzr6wHz+f6wwVP1gk1yPys0GmPwZENbM2OwFjTYkgjZSrRp/3bypRB7/B8sXWvgS9s30xnGcyqsGybg+RX3wL0ZDR+YkW2KI5HhhFWycoYsl8WEejHkSDeM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", placeholdertext)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("gRvDC3cCdonRxqZxpkjMfczndvS/GlRLpHnbxEjODwN7LkltRpzZyzr6wHz+f6wwVP1gk1yPys0GmPwZENbM2OwFjTYkgjZSrRp/3bypRB7/B8sXWvgS9s30xnGcyqsGybg+RX3wL0ZDR+YkW2KI5HhhFWycoYsl8WEejHkSDeM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", placeholdertext)));
			element.click();
			element.sendKeys(new CharSequence[] { inputtext });
			element.sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SingleSelectDropDown with placeholder text " + placeholdertext + " is throwing function error", true);
			System.out.println("SingleSelectDropDown with placeholder text " + placeholdertext + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SingleSelectDropDownBasedonInstructionText(String InstructionText, String inputtext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq6y1N8P895P7whjqbg0JFyKfdSahoVEjp49z9G72VoDVw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq6y1N8P895P7whjqbg0JFyKfdSahoVEjp49z9G72VoDVw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText)));
			element.click();
			element.sendKeys(new CharSequence[] { inputtext });
			element.sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SingleSelectDropDown with instruction text " + InstructionText + " is throwing function error", true);
			System.out.println("SingleSelectDropDown with instruction text " + InstructionText + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SingleSelectDropDownBasedonToolTipText(String TooltipText, String inputtext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa11Ig47t/ytBpwjHrEp/RRawMyWI5Mi3p56nx5zXboMZBZ+Hcn4HKjQMjrpUMDC4n3QMaWZEVc7q9HZIbD75HTzBJ/rLtAJrgZl8BOBq5BXDEMAGNkm+ujO3dhBQjZSUXOvY1I/1xis8bHtJLPYiRTFvnHQcAvx+JoDLxsJ+DqwH5FCskHs6Zj7PR2ravpHsjE/OkxpTFh6/hWmVx87vz9cp3jlenYPnubgG2VFZexOrigKDUNakCZL21yYoI3MNFH327dPb8aktlTPnND+wIjcHVG77z/4HkUODhC+0lAc9O", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + TooltipText + \"", TooltipText)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa11Ig47t/ytBpwjHrEp/RRawMyWI5Mi3p56nx5zXboMZBZ+Hcn4HKjQMjrpUMDC4n3QMaWZEVc7q9HZIbD75HTzBJ/rLtAJrgZl8BOBq5BXDEMAGNkm+ujO3dhBQjZSUXOvY1I/1xis8bHtJLPYiRTFvnHQcAvx+JoDLxsJ+DqwH5FCskHs6Zj7PR2ravpHsjE/OkxpTFh6/hWmVx87vz9cp3jlenYPnubgG2VFZexOrigKDUNakCZL21yYoI3MNFH327dPb8aktlTPnND+wIjcHVG77z/4HkUODhC+0lAc9O", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + TooltipText + \"", TooltipText)));
			element.click();
			element.sendKeys(new CharSequence[] { inputtext });
			System.out.println("Value entered");
			element.sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			//flow.StepFail("SingleSelectDropDown with tool tip text " + TooltipText + " is throwing function error", true);
			System.out.println("SingleSelectDropDown with tool tip text " + TooltipText + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SingleSelectDropDownforCustomizedFieldname(String inputtext, String fieldname) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("j6xpTtarq35BOitvZUyKTe89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbtMDYL8OL8SQzjV2fiisc4AYf9onH4b+KBWCg2d3NnaP", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
//			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("OhETMjaQ3w1MClcTseRF4Pbl4UuL/l7VDy29EtGEalwmyZNCxWTD4siu1lr3S0RLOYGgD64Q04/aWWpR4iFagHQ0ZPomok3FnCFjQ2VwDuSRdZrmIhOkd1O8cLp6HH5Z", this.FF23242524354dfdgdgdgsdfsdfd5)));
//			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("OhETMjaQ3w1MClcTseRF4OTdIldiQy1bavOtAJCh/Io6XDbEGIB0hFSeNoHfT1g5ax7vu1VVe5CYyqdrBB+jplaKqRMzpaO2z1lwFPOWqzT7vq+iz+SWEtA3mYWijlIy", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("j6xpTtarq35BOitvZUyKTe89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbtMDYL8OL8SQzjV2fiisc4AYf9onH4b+KBWCg2d3NnaP", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			element.click();
			element.sendKeys(new CharSequence[] { inputtext });
			element.sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SingleSelectDropDownforCustomizedFieldname function error", true);
			System.out.println("SingleSelectDropDownforCustomizedFieldname function error");
			e.printStackTrace();
		} 
	}

	public void MultiSelectDropDown(String fieldname, String text) throws Exception {
		try {
			String[] Text = text.split(",");
			Text = SortMultipleString(Text);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSPsFW2YgbRpeXXoEl0WONsw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSPsFW2YgbRpeXXoEl0WONsw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).click();
			flow.TurnOffImplicitWaits();
			for (int i = 0; i < Text.length; i++) {
				try {
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VL+gWUHQffSIusTm6fYqqQcYi108srUEYVGAQxcyQNE/", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text[i]+\"", Text[i]))).click();
				} catch (Exception e) {
//					flow.StepFail("Option is not available - " + Text[i], false);
					System.out.println("Option is not available - " + Text[i]);
				} 
			} 
			owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSPsFW2YgbRpeXXoEl0WONsw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(new CharSequence[] { (CharSequence)Keys.ESCAPE });
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultiSelectDropDown function error", true);
			System.out.println("MultiSelectDropDown function error");
			e.printStackTrace();
		} 
	}

	public void MultiSelectDropDownForCustomizedDates(String fieldname, String text) throws Exception {
		try {
			String[] Text = text.split("&");
			Text = SortMultipleString(Text);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSPsFW2YgbRpeXXoEl0WONsw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSPsFW2YgbRpeXXoEl0WONsw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).click();
			flow.TurnOffImplicitWaits();
			for (int i = 0; i < Text.length; i++) {
				try {
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VL+gWUHQffSIusTm6fYqqQcYi108srUEYVGAQxcyQNE/", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text[i]+\"", Text[i]))).click();
				} catch (Exception e) {
//					flow.StepFail("Option is not available - " + Text[i], false);
					System.out.println("Option is not available - " + Text[i]);
				} 
			} 
			owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSPsFW2YgbRpeXXoEl0WONsw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(new CharSequence[] { (CharSequence)Keys.ESCAPE });
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultiSelectDropDownForCustomizedDates function error", true);
			System.out.println("MultiSelectDropDownForCustomizedDates function error");
			e.printStackTrace();
		} 
	}

	public void MultiSelectDropDownBasedonIndex(String fieldname, String text, int indexnumber) throws Exception {
		try {
			WebElement dropdown;
			String[] Text = text.split(",");
			Text = SortMultipleString(Text);
			if (fieldname.equals("false")) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKP/l87o7yV1IAn1MMy3oRROcmvOBEzwPMBTZWlHNF6WcM0PykE8GpE1Vf1GWLW2FUhzj/rjDBPwdyyagFdUV0xx8Wr4O/29eMadl3QADj755g", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				dropdown = owebdriver.findElement(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKP/l87o7yV1IAn1MMy3oRROcmvOBEzwPMBTZWlHNF6WcM0PykE8GpE1Vf1GWLW2FUhzj/rjDBPwdyyagFdUV0xx8Wr4O/29eMadl3QADj755g", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				dropdown.click();
			} else {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMnqwQvZ9pHSmcq/kE1khdzETeN8KQn5PtMi06lcEqn+n1riAk4YejzxzBcI/M12Zg", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				dropdown = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMnqwQvZ9pHSmcq/kE1khdzETeN8KQn5PtMi06lcEqn+n1riAk4YejzxzBcI/M12Zg", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				dropdown.click();
			} 
			flow.TurnOffImplicitWaits();
			for (int i = 0; i < Text.length; i++) {
				try {
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VL+gWUHQffSIusTm6fYqqQcYi108srUEYVGAQxcyQNE/", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text[i]+\"", Text[i]))).click();
				} catch (Exception e) {
//					flow.StepFail("Option is not available - " + Text[i], false);
					System.out.println("Option is not available - " + Text[i]);
				} 
			} 
			flow.TurnOnImplicitWaits();
			dropdown.sendKeys(new CharSequence[] { (CharSequence)Keys.ESCAPE });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultiSelectDropDown function error", true);
			System.out.println("MultiSelectDropDown function error");
			e.printStackTrace();
		} 
	}

	public void MultiSelectDropDownBasedonPlaceHolderText(String placeholdertext, String text) throws Exception {
		try {
			String[] Text = text.split(",");
			Text = SortMultipleString(Text);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("/OOWTM0x8Sg+uxrawubI+HLJjboB647dQpLWWBJH8KMRME35tElcaSCwGCtBInSX+6cL/tCDtA0rvf9W3Xb1Aba3TT7C6RNcY56SB7gchE2speYe2A0BY///yO57nDb4sbs10dpafGk9LyO2iRvGc6BxwxZVclocy8eEO4xue/hyyY26AeuO3UKS1lgSR/CjETBN+bRJXGkgsBgrQSJ0l4iYr5oeZYGryaDxrXGXRRQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", placeholdertext)));
			WebElement dropdown = owebdriver.findElement(By.xpath(SingleDropCheckBox("/OOWTM0x8Sg+uxrawubI+HLJjboB647dQpLWWBJH8KMRME35tElcaSCwGCtBInSX+6cL/tCDtA0rvf9W3Xb1Aba3TT7C6RNcY56SB7gchE2speYe2A0BY///yO57nDb4sbs10dpafGk9LyO2iRvGc6BxwxZVclocy8eEO4xue/hyyY26AeuO3UKS1lgSR/CjETBN+bRJXGkgsBgrQSJ0l4iYr5oeZYGryaDxrXGXRRQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", placeholdertext)));
			dropdown.click();
			flow.TurnOffImplicitWaits();
			for (int i = 0; i < Text.length; i++) {
				try {
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VL+gWUHQffSIusTm6fYqqQcYi108srUEYVGAQxcyQNE/", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text[i]+\"", Text[i]))).click();
				} catch (Exception e) {
//					flow.StepFail("Option is not available - " + Text[i], false);
					System.out.println("Option is not available - " + Text[i]);
				} 
			} 
			dropdown.sendKeys(new CharSequence[] { (CharSequence)Keys.ESCAPE });
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultiSelectDropDownBasedonPlaceHolderText function error", true);
			System.out.println("MultiSelectDropDownBasedonPlaceHolderText function error");
			e.printStackTrace();
		} 
	}

	public void MultiSelectDropDownBasedonInstructionText(String InstructionText, String text) throws Exception {
		try {
			String[] Text = text.split(",");
			Text = SortMultipleString(Text);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq6y1N8P895P7whjqbg0JFyKfdSahoVEjp49z9G72VoDVw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText)));
			WebElement dropdown = owebdriver.findElement(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq6y1N8P895P7whjqbg0JFyKfdSahoVEjp49z9G72VoDVw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText)));
			dropdown.click();
			flow.TurnOffImplicitWaits();
			for (int i = 0; i < Text.length; i++) {
				try {
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VL+gWUHQffSIusTm6fYqqQcYi108srUEYVGAQxcyQNE/", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text[i]+\"", Text[i]))).click();
				} catch (Exception e) {
//					flow.StepFail("Option is not available - " + Text[i], false);
					System.out.println("Option is not available - " + Text[i]);
				} 
			} 
			flow.TurnOnImplicitWaits();
			dropdown.sendKeys(new CharSequence[] { (CharSequence)Keys.ESCAPE });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultiSelectDropDownBasedonInstructionText function error", true);
			System.out.println("MultiSelectDropDownBasedonInstructionText function error");
			e.printStackTrace();
		} 
	}

	public void MultiSelectDropDownBasedonToolTipText(String TooltipText, String text) throws Exception {
		try {
			String[] Text = text.split(",");
			Text = SortMultipleString(Text);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa11Ig47t/ytBpwjHrEp/RRawMyWI5Mi3p56nx5zXboMZBZ+Hcn4HKjQMjrpUMDC4n3QMaWZEVc7q9HZIbD75HTzBJ/rLtAJrgZl8BOBq5BXDEMAGNkm+ujO3dhBQjZSUXOvY1I/1xis8bHtJLPYiRTFvnHQcAvx+JoDLxsJ+DqwH5FCskHs6Zj7PR2ravpHsjE/OkxpTFh6/hWmVx87vz9cp3jlenYPnubgG2VFZexOrigKDUNakCZL21yYoI3MNFH327dPb8aktlTPnND+wIjcHVG77z/4HkUODhC+0lAc9O", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + TooltipText + \"", TooltipText)));
			WebElement dropdown = owebdriver.findElement(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa11Ig47t/ytBpwjHrEp/RRawMyWI5Mi3p56nx5zXboMZBZ+Hcn4HKjQMjrpUMDC4n3QMaWZEVc7q9HZIbD75HTzBJ/rLtAJrgZl8BOBq5BXDEMAGNkm+ujO3dhBQjZSUXOvY1I/1xis8bHtJLPYiRTFvnHQcAvx+JoDLxsJ+DqwH5FCskHs6Zj7PR2ravpHsjE/OkxpTFh6/hWmVx87vz9cp3jlenYPnubgG2VFZexOrigKDUNakCZL21yYoI3MNFH327dPb8aktlTPnND+wIjcHVG77z/4HkUODhC+0lAc9O", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + TooltipText + \"", TooltipText)));
			dropdown.click();
			flow.TurnOffImplicitWaits();
			for (int i = 0; i < Text.length; i++) {
				try {
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VL+gWUHQffSIusTm6fYqqQcYi108srUEYVGAQxcyQNE/", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text[i]+\"", Text[i]))).click();
				} catch (Exception e) {
//					flow.StepFail("Option is not available - " + Text[i], false);
					System.out.println("Option is not available - " + Text[i]);
				} 
			} 
			flow.TurnOnImplicitWaits();
			dropdown.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
//			flow.StepFail("MultiSelectDropDownBasedonToolTipText function error", true);
			System.out.println("MultiSelectDropDownBasedonToolTipText function error");
		} 
	}

	public void MultiSelectDropDownforCustomizedFieldname(String fieldname, String text) throws Exception {
		try {
			String[] Text = text.split(",");
			Text = SortMultipleString(Text);
//			flow.ExplicitWait(By.xpath(SingleDropCheckBox("OhETMjaQ3w1MClcTseRF4Pbl4UuL/l7VDy29EtGEalwmyZNCxWTD4siu1lr3S0RLOYGgD64Q04/aWWpR4iFagMc41aaYhLBbVXtkA+519zk=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + fieldname + \"", fieldname)));
//			owebdriver.findElement(By.xpath(SingleDropCheckBox("OhETMjaQ3w1MClcTseRF4Pbl4UuL/l7VDy29EtGEalwmyZNCxWTD4siu1lr3S0RLOYGgD64Q04/aWWpR4iFagMc41aaYhLBbVXtkA+519zk=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + fieldname + \"", fieldname))).click();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("j6xpTtarq35BOitvZUyKTelcKYjWuecheQ5h/lu9Phl3jlenYPnubgG2VFZexOriwSGl0lLPpf2CzL05a6jXBp7nX3BA33hQuGkKXMlPTn0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + fieldname + \"", fieldname)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("j6xpTtarq35BOitvZUyKTelcKYjWuecheQ5h/lu9Phl3jlenYPnubgG2VFZexOriwSGl0lLPpf2CzL05a6jXBp7nX3BA33hQuGkKXMlPTn0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + fieldname + \"", fieldname))).click();
			flow.TurnOffImplicitWaits();
			for (int i = 0; i < Text.length; i++) {
				try {
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VL+gWUHQffSIusTm6fYqqQcYi108srUEYVGAQxcyQNE/", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text[i]+\"", Text[i]))).click();
				} catch (Exception e) {
//					flow.StepFail("Option is not available - " + Text[i], false);
					System.out.println("Option is not available - " + Text[i]);
				} 
			} 
			owebdriver.findElement(By.xpath(SingleDropCheckBox("j6xpTtarq35BOitvZUyKTelcKYjWuecheQ5h/lu9Phl3jlenYPnubgG2VFZexOriwSGl0lLPpf2CzL05a6jXBp7nX3BA33hQuGkKXMlPTn0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + fieldname + \"", fieldname))).sendKeys(new CharSequence[] { (CharSequence)Keys.ESCAPE });
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultiSelectDropDownforCustomizedFieldname function error", true);
			System.out.println("MultiSelectDropDownforCustomizedFieldname function error");
			e.printStackTrace();
		} 
	}

	public void SelectValuefromPicker(String Text, String fieldname) throws Exception {
		try {
			String[] valuetext = Text.split(",");
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+LuSEA5CMfNH82zAazk8bm1cQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			for (int i = 0; i < valuetext.length; i++) {
				for (int j = 0; j < valuetext[i].length(); j++) {
					String character = Character.toString(valuetext[i].charAt(j));
					owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+LuSEA5CMfNH82zAazk8bm1cQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(new CharSequence[] { character });
				} 
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOHT76YEEQLmkkJgmpHwgc+w", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[i]+\"", valuetext[i])));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOHT76YEEQLmkkJgmpHwgc+w", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[i]+\"", valuetext[i]))).click();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectValuefromPicker with fieldname " + fieldname + " is throwing function error", true);
			System.out.println("SelectValuefromPicker with fieldname " + fieldname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SelectValuefromPickerBasedonIndex(String Text, String fieldname, int indexnumber) throws Exception {
		try {
			String[] valuetext = Text.split(",");
			if (fieldname.equals("false")) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKPzaB3597NlQcGsCUsRtDsV46AFpBSkBwuqc7GY0c/NeMSuLnOAbDKUUyIseefBrdvWGAiN9Onzna1Xlu1wBegBA=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				for (int j = 0; j < valuetext.length; j++) {
					for (int i = 0; i < valuetext[j].length(); i++) {
						String character = Character.toString(valuetext[j].charAt(i));
						owebdriver.findElement(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKPzaB3597NlQcGsCUsRtDsV46AFpBSkBwuqc7GY0c/NeMSuLnOAbDKUUyIseefBrdvWGAiN9Onzna1Xlu1wBegBA=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).sendKeys(new CharSequence[] { character });
					} 
					flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j])));
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j]))).click();
				} 
			} else {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMreEhiNDcMlgOXal7wUL9iGGAiN9Onzna1Xlu1wBegBA=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				for (int j = 0; j < valuetext.length; j++) {
					for (int i = 0; i < valuetext[j].length(); i++) {
						String character = Character.toString(valuetext[j].charAt(i));
						owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMreEhiNDcMlgOXal7wUL9iGGAiN9Onzna1Xlu1wBegBA=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).sendKeys(new CharSequence[] { character });
					} 
					flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j])));
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j]))).click();
				} 
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectValuefromPicker with fieldname " + fieldname + " at the index " + indexnumber + " is throwing function error", true);
			System.out.println("SelectValuefromPicker with fieldname " + fieldname + " at the index " + indexnumber + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SelectValuefromPickerBasedonPlaceholderText(String PlaceholderText, String Text) throws Exception {
		try {
			String[] valuetext = Text.split(",");
			WebElement spanlabel = owebdriver.findElement(By.xpath(SingleDropCheckBox("gRvDC3cCdonRxqZxpkjMfYG0tHfHrdh5k9h9ORNsFRtwySquqe9k2FmGXq62Pt1mtAeOzYtgD3+a9HXNZnaxDe1mScsa71g78NFk38uBLE/LbowXNw7VyCpCQgDzqsA3hawwE4HS8nwx9wh8VgnXXA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+PlaceholderText+\"", PlaceholderText)));
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("gRvDC3cCdonRxqZxpkjMfYG0tHfHrdh5k9h9ORNsFRtwySquqe9k2FmGXq62Pt1mtAeOzYtgD3+a9HXNZnaxDe1mScsa71g78NFk38uBLE9VvtUD10crNsvK5JgyzNS5", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+PlaceholderText+\"", PlaceholderText)));
			for (int j = 0; j < valuetext.length; j++) {
				if (j == 0) {
					for (int i = 0; i < valuetext[j].length(); i++) {
						String character = Character.toString(valuetext[j].charAt(i));
						owebdriver.findElement(By.xpath(SingleDropCheckBox("gRvDC3cCdonRxqZxpkjMfYG0tHfHrdh5k9h9ORNsFRtwySquqe9k2FmGXq62Pt1mtAeOzYtgD3+a9HXNZnaxDe1mScsa71g78NFk38uBLE9VvtUD10crNsvK5JgyzNS5", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+PlaceholderText+\"", PlaceholderText))).sendKeys(new CharSequence[] { character });
					} 
					flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j])));
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j]))).click();
				} else {
					String labeltext = spanlabel.getAttribute("innerText");
					for (int i = 0; i < valuetext[j].length(); i++) {
						String character = Character.toString(valuetext[j].charAt(i));
						owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM8PFh9tp6QJ8j/jx/ZeAnDfAgpGsGGKV4HI215izI+LuSEA5CMfNH82zAazk8bm1cQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+labeltext+\"", labeltext))).sendKeys(new CharSequence[] { character });
					} 
					flow.Timeout(1000L);
					flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j])));
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j]))).click();
				} 
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectValuefromPicker with placeholder text " + PlaceholderText + " is throwing function error", true);
			System.out.println("SelectValuefromPicker with placeholder text " + PlaceholderText + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SelectValuefromPickerBasedonInstructionText(String InstructionText, String Text) throws Exception {
		try {
			String[] valuetext = Text.split(",");
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq5FqOcOA41BtKhL1TBqs3wvSEA5CMfNH82zAazk8bm1cQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText)));
			for (int j = 0; j < valuetext.length; j++) {
				for (int i = 0; i < valuetext[j].length(); i++) {
					String character = Character.toString(valuetext[j].charAt(i));
					owebdriver.findElement(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq5FqOcOA41BtKhL1TBqs3wvSEA5CMfNH82zAazk8bm1cQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText))).sendKeys(new CharSequence[] { character });
				} 
				flow.Timeout(1000L);
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j])));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j]))).click();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectValuefromPicker with instruction text " + InstructionText + " is throwing function error", true);
			System.out.println("SelectValuefromPicker with instruction text " + InstructionText + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SelectValuefromPickerBasedonToolTipText(String Tooltiptext, String Text) throws Exception {
		try {
			String[] valuetext = Text.split(",");
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa13RM1Q7FPuT8YLYl/S0XNTQMyWI5Mi3p56nx5zXboMZBZ+Hcn4HKjQMjrpUMDC4n3QMaWZEVc7q9HZIbD75HTzBJ/rLtAJrgZl8BOBq5BXDEMAGNkm+ujO3dhBQjZSUXOvY1I/1xis8bHtJLPYiRTFvnHQcAvx+JoDLxsJ+DqwH5FCskHs6Zj7PR2ravpHsjE2FrU+wSjR3XAw6FG8j++Ut3jlenYPnubgG2VFZexOrigKDUNakCZL21yYoI3MNFHxXay7vyerc9zq+Rsqbr9kQMpJevC9SOL8j+bQqeQkB5JxXqYZl1qRu00oDPcPYpGhGWeiFUsP31xdqvPI1m8UI=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + Tooltiptext + \"", Tooltiptext)));
			for (int j = 0; j < valuetext.length; j++) {
				owebdriver.findElement(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa13RM1Q7FPuT8YLYl/S0XNTQMyWI5Mi3p56nx5zXboMZBZ+Hcn4HKjQMjrpUMDC4n3QMaWZEVc7q9HZIbD75HTzBJ/rLtAJrgZl8BOBq5BXDEMAGNkm+ujO3dhBQjZSUXOvY1I/1xis8bHtJLPYiRTFvnHQcAvx+JoDLxsJ+DqwH5FCskHs6Zj7PR2ravpHsjE2FrU+wSjR3XAw6FG8j++Ut3jlenYPnubgG2VFZexOrigKDUNakCZL21yYoI3MNFHxXay7vyerc9zq+Rsqbr9kQMpJevC9SOL8j+bQqeQkB5JxXqYZl1qRu00oDPcPYpGsGCjo8sBROpfaS7gKwKmMI=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + Tooltiptext + \"", Tooltiptext))).sendKeys(valuetext[j]);
				flow.Timeout(1000L);
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j])));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j]))).click();
			} 

		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectValuefromPicker with tool tip text " + Tooltiptext + " is throwing function error", true);
			System.out.println("SelectValuefromPicker with tool tip text " + Tooltiptext + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SelectValuefromPickerforCustomizedFieldname(String Text, String fieldname) throws Exception {
		try {
			String[] valuetext = Text.split(",");
//			flow.ExplicitWait(By.xpath(SingleDropCheckBox("OhETMjaQ3w1MClcTseRF4Pbl4UuL/l7VDy29EtGEalwmyZNCxWTD4siu1lr3S0RLaBSTy2oS/TFkjo2fYbNcgwtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5)));
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("j6xpTtarq35BOitvZUyKTelcKYjWuecheQ5h/lu9Phl3jlenYPnubgG2VFZexOri7zFiLbotmwRY/ZxizSQphg==", this.FF23242524354dfdgdgdgsdfsdfd5.replace("\" + fieldname + \"", fieldname))));
			for (int i = 0; i < valuetext.length; i++) {
				for (int j = 0; j < valuetext[i].length(); j++) {
					String character = Character.toString(valuetext[i].charAt(j));
//					owebdriver.findElement(By.xpath(SingleDropCheckBox("OhETMjaQ3w1MClcTseRF4Pbl4UuL/l7VDy29EtGEalwmyZNCxWTD4siu1lr3S0RLaBSTy2oS/TFkjo2fYbNcgwtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { character });
//					owebdriver.findElement(By.xpath(SingleDropCheckBox("OhETMjaQ3w1MClcTseRF4Pbl4UuL/l7VDy29EtGEalwmyZNCxWTD4siu1lr3S0RLaBSTy2oS/TFkjo2fYbNcgwtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + fieldname + \"", fieldname))).sendKeys(new CharSequence[] { character });
					owebdriver.findElement(By.xpath(SingleDropCheckBox("j6xpTtarq35BOitvZUyKTelcKYjWuecheQ5h/lu9Phl3jlenYPnubgG2VFZexOri7zFiLbotmwRY/ZxizSQphg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + fieldname + \"", fieldname))).sendKeys(new CharSequence[] { character });
				} 
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOHT76YEEQLmkkJgmpHwgc+w", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[i]+\"", valuetext[i])));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOHT76YEEQLmkkJgmpHwgc+w", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[i]+\"", valuetext[i]))).click();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectValuefromPickerforCustomizedFieldname function error");
			System.out.println("SelectValuefromPickerforCustomizedFieldname function error");
			e.printStackTrace();
		} 
	}

	public void PopulateValuesForAnyFieldBasedonPartialFieldName(String Componentname, String Partialfieldname, String inputtext) throws Exception {
		try {
			if (Componentname.equalsIgnoreCase("TextBox")) {
				flow.SetWebTextBasedonPartialFieldName(inputtext, Partialfieldname);
			} else if (Componentname.equalsIgnoreCase("SingleSelectDropDown")) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8IPm0uYeht0LlHDNL9vVOAHRoIqeyLjMZOT5Xp/REUW7TA2C/Di/EkM41dn4orHOAX5b2rdjCY48XoMVf0FApdw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname)));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8IPm0uYeht0LlHDNL9vVOAHRoIqeyLjMZOT5Xp/REUW7TA2C/Di/EkM41dn4orHOAX5b2rdjCY48XoMVf0FApdw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname)));
				element.click();
				element.sendKeys(new CharSequence[] { inputtext });
				element.sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
			} else if (Componentname.equalsIgnoreCase("MultiSelectDropDown")) {
				String[] Text = inputtext.split(",");
				Text = SortMultipleString(Text);
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8IPm0uYeht0LlHDNL9vVOAD7BVtmIG0aXl16BJdFjjbM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname)));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8IPm0uYeht0LlHDNL9vVOAD7BVtmIG0aXl16BJdFjjbM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname))).click();
				flow.TurnOffImplicitWaits();
				for (int i = 0; i < Text.length; i++) {
					try {
						owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VL+gWUHQffSIusTm6fYqqQcYi108srUEYVGAQxcyQNE/", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text[i]+\"", Text[i]))).click();
					} catch (Exception e) {
//						flow.StepFail("Option is not available - " + Text[i], false);
						System.out.println("Option is not available - " + Text[i]);
					} 
				} 
				owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8IPm0uYeht0LlHDNL9vVOAD7BVtmIG0aXl16BJdFjjbM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname))).sendKeys(new CharSequence[] { (CharSequence)Keys.ESCAPE });
				flow.TurnOnImplicitWaits();
			} else if (Componentname.equalsIgnoreCase("PickerField")) {
				String[] valuetext = inputtext.split(",");
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8EDvQ6fr2llhT3L8sYyV9QEhAOQjHzR/NswGs5PG5tXE=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname)));
				for (int i = 0; i < valuetext.length; i++) {
					for (int j = 0; j < valuetext[i].length(); j++) {
						String character = Character.toString(valuetext[i].charAt(j));
						owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8EDvQ6fr2llhT3L8sYyV9QEhAOQjHzR/NswGs5PG5tXE=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname))).sendKeys(new CharSequence[] { character });
					} 
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOHT76YEEQLmkkJgmpHwgc+w", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[i]+\"", valuetext[i]))).click();
				} 
			} else if (Componentname.equalsIgnoreCase("DateField")) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8EDvQ6fr2llhT3L8sYyV9QNtUS+X2GxP/+PRXHpZ2nLR53qF7bR2E76dvB3Uz5dfKyY8EHornA1xRP/TYvcgUPTgyayx6kh87TjGFliI5Zk5Gr/PEppooufT7KSsM9gyS1djpIKnKB8khFgVr6xDNaCI8O6dcmNfcNsNEovtFlO2lIsb7UiwKpw5YiYDzBwtV", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname)));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8EDvQ6fr2llhT3L8sYyV9QNtUS+X2GxP/+PRXHpZ2nLR53qF7bR2E76dvB3Uz5dfKyY8EHornA1xRP/TYvcgUPTgyayx6kh87TjGFliI5Zk5Gr/PEppooufT7KSsM9gyS1djpIKnKB8khFgVr6xDNaCI8O6dcmNfcNsNEovtFlO2lIsb7UiwKpw5YiYDzBwtV", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname)));
				System.out.println(element);
				element.sendKeys(new CharSequence[] { inputtext });
				element.sendKeys(new CharSequence[] { (CharSequence)Keys.TAB });
			} else if (Componentname.equalsIgnoreCase("Checkbox")) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("oZ4hi2jNYUjbtA1QpFAtTJVUHDis8KokR6/BYE7zNnxxTxIHoRXg4fy185k/i5SUUVySZr3fgYmf6+Y70uHk19P+9uoeIT/HVALKTHONObHdMAL4/vJ5AuZ5CWTiStaSzmQeXHMe55ALhq+j1d6BtYrZoV91w3NQxgEg39XdhPx9xQ2xrtV7yDV8WjroMgzJcpQzpHh9ayMQoz8jEdDR8hZv4EpnJmYkP451C2hyVqB7kqLSYp7Ls1//xNZikc/iMSF1u8SiP6ZXagqbyS1gtHynTzYWXhEFTVtLk+JSxnR4sMzEUtNuXUtpRcxWE0ca/deW7G822WmVL6STUxaBgT8xHh/X6BPBJok0VxtTLfenvDaSlp5JlNCNqgS8yKBC/5sKGoM9UijZsIFChSHFVlAO2GaWXkgOSdWelNqVhrVDY3gFwgHzi7DM922qoPtAzaKg2Kf0ze1YTnsENGT+ooihs4EHewSPbb1KruKUGe8zn2t4AOKRaOUibFyUU/UUbAMe7DJxKmyyPa2JwCgAI+cTQ9m0DyV7F7QRdjzdjoaJOwaK0gBXqlLbBFjr9dl9T9dFHi1XiFkhgWAxV4ZAsoBpO1zKhl4p58xwVSi3tqZ94fHecNKhOrehudOfq+CDqI9qjCLCWqi+vcLOuBc8t7Uj4dW/PvWlK8YMZAHNkCIIei9bmv+BhCf78CxY7SzfDgZjMnnPuyU5VvFQPqsYfE31VwBAcTgql+HVgKhrgLLhIqC2WpjC+VvuHhKb+AG+uLq177zv6UUORC/lnbVkNMktQ9tt6jlHDeE8lOhfuTj65fFyc3OblEfTzesiloMlNeSVr1i9BeZx3ab26I6lESJVX7Tf+DXrITYPbhMyLlJC/6VBhUAKHyRTxfXbn10tZ3edpsvMX5CtjUSHfayRlOTbD/U9KD3JRmFZuQDKtfVXHlHwOn5CttHrtdZhOiBKPWLnvScXjr+pKyypNzfN1AmmOzgKn+kI4PhfR5+TXhA=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname).replace("\"+inputtext+\"", inputtext)));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("oZ4hi2jNYUjbtA1QpFAtTJVUHDis8KokR6/BYE7zNnxxTxIHoRXg4fy185k/i5SUUVySZr3fgYmf6+Y70uHk19P+9uoeIT/HVALKTHONObHdMAL4/vJ5AuZ5CWTiStaSzmQeXHMe55ALhq+j1d6BtYrZoV91w3NQxgEg39XdhPx9xQ2xrtV7yDV8WjroMgzJcpQzpHh9ayMQoz8jEdDR8hZv4EpnJmYkP451C2hyVqB7kqLSYp7Ls1//xNZikc/iMSF1u8SiP6ZXagqbyS1gtHynTzYWXhEFTVtLk+JSxnR4sMzEUtNuXUtpRcxWE0ca/deW7G822WmVL6STUxaBgT8xHh/X6BPBJok0VxtTLfenvDaSlp5JlNCNqgS8yKBC/5sKGoM9UijZsIFChSHFVlAO2GaWXkgOSdWelNqVhrVDY3gFwgHzi7DM922qoPtAzaKg2Kf0ze1YTnsENGT+ooihs4EHewSPbb1KruKUGe8zn2t4AOKRaOUibFyUU/UUbAMe7DJxKmyyPa2JwCgAI+cTQ9m0DyV7F7QRdjzdjoaJOwaK0gBXqlLbBFjr9dl9T9dFHi1XiFkhgWAxV4ZAsoBpO1zKhl4p58xwVSi3tqZ94fHecNKhOrehudOfq+CDqI9qjCLCWqi+vcLOuBc8t7Uj4dW/PvWlK8YMZAHNkCIIei9bmv+BhCf78CxY7SzfDgZjMnnPuyU5VvFQPqsYfE31VwBAcTgql+HVgKhrgLLhIqC2WpjC+VvuHhKb+AG+uLq177zv6UUORC/lnbVkNMktQ9tt6jlHDeE8lOhfuTj65fFyc3OblEfTzesiloMlNeSVr1i9BeZx3ab26I6lESJVX7Tf+DXrITYPbhMyLlJC/6VBhUAKHyRTxfXbn10tZ3edpsvMX5CtjUSHfayRlOTbD/U9KD3JRmFZuQDKtfVXHlHwOn5CttHrtdZhOiBKPWLnvScXjr+pKyypNzfN1AmmOzgKn+kI4PhfR5+TXhA=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname).replace("\"+inputtext+\"", inputtext)));
				element.click();
			} else if (Componentname.equalsIgnoreCase("RadioButton")) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8EDvQ6fr2llhT3L8sYyV9QKe1IPJlVuNwkvThx9Ts9zcX8B/EzE2PEfw8WlzZbj7jd3R+g+mXF/eQwSoKAcpHVSm+pUG2wqSgiHPndjgXmBQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname).replace("\"+inputtext+\"", inputtext)));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8EDvQ6fr2llhT3L8sYyV9QKe1IPJlVuNwkvThx9Ts9zcX8B/EzE2PEfw8WlzZbj7jd3R+g+mXF/eQwSoKAcpHVSm+pUG2wqSgiHPndjgXmBQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname).replace("\"+inputtext+\"", inputtext)));
				element.click();
			} else if (Componentname.equalsIgnoreCase("UploadField")) {
				owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8bJONbkykDaDbB2uSZhh4c8mgJ/EJaEdP9o2Dy7vLNDo=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname))).sendKeys(new CharSequence[] { inputtext });
			} else if (Componentname.equalsIgnoreCase("MultipleUploadField")) {
				String[] Files = inputtext.split(",");
				int i = 0;
				byte b;
				int j;
				String[] arrayOfString1;
				for (j = (arrayOfString1 = Files).length, b = 0; b < j; ) {
					String file = arrayOfString1[b];
					owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8IPm0uYeht0LlHDNL9vVOADO405aeD5cAmS54oLip1p0WINFcY+o/rHOzxdYekWk9", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname))).sendKeys(new CharSequence[] { file });
					b = (byte)(b + 1);
				} 
				List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxgh6L1ua/4GEJ/vwLFjtLN8OBmMyec+7JTlW8VA+qxh8IPm0uYeht0LlHDNL9vVOABaE7Dutlyi7NPmczAwzRcNg6xnh799e4Cv/xtMivB/2X5b2rdjCY48XoMVf0FApdw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Partialfieldname+\"", Partialfieldname)));
				if (Files.length == result.size()) {
//					StepPassWithoutScreenshot("All the documents are uploaded properly");
					System.out.println("All the documents are uploaded properly");
				} else {
					String time = GetDateandTimewithSeconds();
//					flow.StepFail("Documents are not uploaded properly - " + time, true);
					System.out.println("Documents are not uploaded properly - " + time);
				} 
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("PopulateValuesForAnyField for the component " + Componentname + "with the partial fieldname " + Partialfieldname + " is throwing function error", true);
			System.out.println("PopulateValuesForAnyField for the component " + Componentname + "with the partial fieldname " + Partialfieldname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SelectRadioButtonBasedonFieldName(String fieldname, String option) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Lup7Ug8mVW43CS9OHH1Oz3NxfwH8TMTY8R/DxaXNluPuN3dH6D6ZcX95DBKgoBykdVfMGkBwLQIw9C6feHDvxiuA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Lup7Ug8mVW43CS9OHH1Oz3NxfwH8TMTY8R/DxaXNluPuN3dH6D6ZcX95DBKgoBykdVfMGkBwLQIw9C6feHDvxiuA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectRadioButton with fieldname " + fieldname + " is throwing function error", true);
			System.out.println("SelectRadioButton with fieldname " + fieldname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SelectRadioButtonBasedonFieldNameIndex(String fieldname, String option, int indexnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVDQjYnavjKmaeMNHkBEgvrNIgLoDDzegtoJbXdoGqsbPA6SYoPOtSIxJ6XjSMHC03AfRgL3HE9h3P47a9Jx7RLF2UUYP4u/vAYwrebeFhpuPSBWK5Ms0jBAc1K3gayNmsrdqTG9XmlhBAKu/9ZxbiAUN8N7tiJnD2jgN27CvVmW1X0oOPAKFjJIUK/HX2e9VdY=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option).replace("\"+indexnumber+\"", String.valueOf(indexnumber)).replace("\"+fieldname+\"", String.valueOf(fieldname))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVDQjYnavjKmaeMNHkBEgvrNIgLoDDzegtoJbXdoGqsbPA6SYoPOtSIxJ6XjSMHC03AfRgL3HE9h3P47a9Jx7RLF2UUYP4u/vAYwrebeFhpuPSBWK5Ms0jBAc1K3gayNmsrdqTG9XmlhBAKu/9ZxbiAUN8N7tiJnD2jgN27CvVmW1X0oOPAKFjJIUK/HX2e9VdY=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option).replace("\"+indexnumber+\"", String.valueOf(indexnumber)).replace("\"+fieldname+\"", String.valueOf(fieldname))));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectRadioButton with fieldname " + fieldname + " at the index" + indexnumber + " is throwing function error", true);
			System.out.println("SelectRadioButton with fieldname " + fieldname + " at the index" + indexnumber + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SelectRadioButtonBasedonCustomizedFieldName(String fieldname, String option) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("wkOLIOwcinazLNZSnq8D4TRY8OcrX7UFVGdZ/bBWDHdaG8HJE0cYMzvfAPFkQ9v20hvjS2AcI1lowSe0oQhEwhYILzj8gPOynkPB/NedQQFebuC+nMjYkoIwsUFKSPwaTc0mrq/QlmCrMf05B1fOaA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("wkOLIOwcinazLNZSnq8D4TRY8OcrX7UFVGdZ/bBWDHdaG8HJE0cYMzvfAPFkQ9v20hvjS2AcI1lowSe0oQhEwhYILzj8gPOynkPB/NedQQFebuC+nMjYkoIwsUFKSPwaTc0mrq/QlmCrMf05B1fOaA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectRadioButtonBasedonCustomizedFieldName function error", true);
			System.out.println("SelectRadioButtonBasedonCustomizedFieldName function error");
			e.printStackTrace();
		} 
	}

	public void SelectCheckBoxBasedonFieldName(String fieldname, String option) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("XZgn/Wi0bXqswPp3Sx5lJKgen+7j5bi5KrPhOt8K6crz+ZRcTeMR9oIFvlSApU2DLF7N/kkLNls9+YxLK5yqb7WPHsdL5nO6YOOEIUV+j+yvldTaVJFTz/zdaIQk6EhQhIqPYkDojZuXJEUfTeOmx6RJzVCOTddQYToGUhzGrOpN2Xx6FHR/QQ7OfOVbIspEFptZwNBcvbtBmnOfzF//rNEMx4pCnALG9Ofo6RHK/w/p+IM4XLi3geNbdOSNG6B48YARjgm5lTLXasNuWjPQKxi6JO2OjvzwTTznTfagycE0WPDnK1+1BVRnWf2wVgx3NTTmkQxvueoUxIeNKiqhaNP+9uoeIT/HVALKTHONObHdMAL4/vJ5AuZ5CWTiStaSV7A5hl9h0fva3ZOo85ZT8iK+TaGLg0bW8V++bGT3PMGfP950PlU2XqJUPgG3LXrkIy9t8EMHdMhnSMMY1K2cs+LF5BjnnfD2Gklm5jwxNhVDY3gFwgHzi7DM922qoPtAzaKg2Kf0ze1YTnsENGT+omAZZ9gJR8sFQyc0VrgtS+8K6oWdsvZdBGIT7yZrChkgNFjw5ytftQVUZ1n9sFYMdzU05pEMb7nqFMSHjSoqoWjT/vbqHiE/x1QCykxzjTmx3TAC+P7yeQLmeQlk4krWklewOYZfYdH72t2TqPOWU/IptNT4fI8P7Khjnlkn+KTUqDa0+hnlgSavHRGPQc+ORlZ0Lt3oRYQK+b8H3JsNNtVDqvvVDSAtYFQgUWSpBLM7wDCdK22WGk4vAfocY+Awt9Os5Tp9PcKkeFPzZQAj/epWWKPwiQoDuFEg0gUNF3NlGH/aJx+G/igVgoNndzZ2jw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("XZgn/Wi0bXqswPp3Sx5lJKgen+7j5bi5KrPhOt8K6crz+ZRcTeMR9oIFvlSApU2DLF7N/kkLNls9+YxLK5yqb7WPHsdL5nO6YOOEIUV+j+yvldTaVJFTz/zdaIQk6EhQhIqPYkDojZuXJEUfTeOmx6RJzVCOTddQYToGUhzGrOpN2Xx6FHR/QQ7OfOVbIspEFptZwNBcvbtBmnOfzF//rNEMx4pCnALG9Ofo6RHK/w/p+IM4XLi3geNbdOSNG6B48YARjgm5lTLXasNuWjPQKxi6JO2OjvzwTTznTfagycE0WPDnK1+1BVRnWf2wVgx3NTTmkQxvueoUxIeNKiqhaNP+9uoeIT/HVALKTHONObHdMAL4/vJ5AuZ5CWTiStaSV7A5hl9h0fva3ZOo85ZT8iK+TaGLg0bW8V++bGT3PMGfP950PlU2XqJUPgG3LXrkIy9t8EMHdMhnSMMY1K2cs+LF5BjnnfD2Gklm5jwxNhVDY3gFwgHzi7DM922qoPtAzaKg2Kf0ze1YTnsENGT+omAZZ9gJR8sFQyc0VrgtS+8K6oWdsvZdBGIT7yZrChkgNFjw5ytftQVUZ1n9sFYMdzU05pEMb7nqFMSHjSoqoWjT/vbqHiE/x1QCykxzjTmx3TAC+P7yeQLmeQlk4krWklewOYZfYdH72t2TqPOWU/IptNT4fI8P7Khjnlkn+KTUqDa0+hnlgSavHRGPQc+ORlZ0Lt3oRYQK+b8H3JsNNtVDqvvVDSAtYFQgUWSpBLM7wDCdK22WGk4vAfocY+Awt9Os5Tp9PcKkeFPzZQAj/epWWKPwiQoDuFEg0gUNF3NlGH/aJx+G/igVgoNndzZ2jw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectCheckBox with fieldname " + fieldname + " is throwing function error", true);
			System.out.println("SelectCheckBox with fieldname " + fieldname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SelectCheckBoxBasedonFieldNameIndex(String fieldname, String option, int indexnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVDQjYnavjKmaeMNHkBEgvrNIgLoDDzegtoJbXdoGqsbPA6SYoPOtSIxJ6XjSMHC03AfRgL3HE9h3P47a9Jx7RLF2UUYP4u/vAYwrebeFhpuPRixoRsCHssjZsabDWNRpAfDdA3o9gqIyhsBgDUlMx9e", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option).replace("\"+indexnumber+\"", String.valueOf(indexnumber)).replace("\"+fieldname+\"", String.valueOf(fieldname))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVDQjYnavjKmaeMNHkBEgvrNIgLoDDzegtoJbXdoGqsbPA6SYoPOtSIxJ6XjSMHC03AfRgL3HE9h3P47a9Jx7RLF2UUYP4u/vAYwrebeFhpuPRixoRsCHssjZsabDWNRpAfDdA3o9gqIyhsBgDUlMx9e", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option).replace("\"+indexnumber+\"", String.valueOf(indexnumber)).replace("\"+fieldname+\"", String.valueOf(fieldname))));
			JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
			executor.executeScript("arguments[0].click();", new Object[] { element });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectCheckBox with fieldname " + fieldname + " at the index" + indexnumber + " is throwing function error", true);
			System.out.println("SelectCheckBox with fieldname " + fieldname + " at the index" + indexnumber + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SelectCheckBoxBasedonCustomizedFieldName(String fieldname, String option) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("wkOLIOwcinazLNZSnq8D4TRY8OcrX7UFVGdZ/bBWDHdaG8HJE0cYMzvfAPFkQ9v20hvjS2AcI1lowSe0oQhEwhYILzj8gPOynkPB/NedQQHhIqC2WpjC+VvuHhKb+AG+uLq177zv6UUORC/lnbVkNBw9v/OO1in118RVeQssOldNzSaur9CWYKsx/TkHV85o", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("wkOLIOwcinazLNZSnq8D4TRY8OcrX7UFVGdZ/bBWDHdRXJJmvd+BiZ/r5jvS4eTX0/726h4hP8dUAspMc405sd0wAvj+8nkC5nkJZOJK1pJXsDmGX2HR+9rdk6jzllPy7ZJRMdeOTGqoQ3Q3FwTDLA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+option+\"", option)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectCheckBoxBasedonCustomizedFieldName function error", true);
			System.out.println("SelectCheckBoxBasedonCustomizedFieldName function error");
			e.printStackTrace();
		} 
	}

	public void PopulateTextFieldBasedonPlaceholderText(String placeholdertext, String inputtext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC8yvdcyhO8lGo6vdJv/TR1nA2agkioDoZpJh9oOjRPGqoSluwHllFQgWE0eADjld0cyvdcyhO8lGo6vdJv/TR1kHOQs/K3p/I4KEnFGpj3B2", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", placeholdertext)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC8yvdcyhO8lGo6vdJv/TR1nA2agkioDoZpJh9oOjRPGqoSluwHllFQgWE0eADjld0cyvdcyhO8lGo6vdJv/TR1kHOQs/K3p/I4KEnFGpj3B2", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", placeholdertext))).sendKeys(new CharSequence[] { inputtext });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("PopulateTextField with placeholder text " + placeholdertext + " is throwing function error", true);
			System.out.println("PopulateTextField with placeholder text " + placeholdertext + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void PopulateTextFieldBasedonInstructionText(String InstructionText, String inputtext) throws Exception {
		try {
			flow.TurnOffImplicitWaits();
			boolean textfield = false;
			try {
				textfield = owebdriver.findElement(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq41vbLztDDyX6DkA2aAfnRRNbbVhqLizjXeCdYd+LJM9F+W9q3YwmOPF6DFX9BQKXc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText))).isDisplayed();
			} catch (Exception e) {
				textfield = false;
			} 
			if (textfield) {
				owebdriver.findElement(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq41vbLztDDyX6DkA2aAfnRRNbbVhqLizjXeCdYd+LJM9F+W9q3YwmOPF6DFX9BQKXc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText))).sendKeys(new CharSequence[] { inputtext });
			} else {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq41vbLztDDyX6DkA2aAfnRRzA/9SiLRIqd12t3ZQu5vDcAEcOFVx24Z4m8FdJ/5VRM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText)));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq41vbLztDDyX6DkA2aAfnRRzA/9SiLRIqd12t3ZQu5vDcAEcOFVx24Z4m8FdJ/5VRM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText))).sendKeys(new CharSequence[] { inputtext });
			} 
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("PopulateTextField with instruction text " + InstructionText + " is throwing function error", true);
			System.out.println("PopulateTextField with instruction text " + InstructionText + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void PopulateTextFieldBasedonTooltipText(String TooltipText, String inputtext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa11Ig47t/ytBpwjHrEp/RRawMyWI5Mi3p56nx5zXboMZBKNGkKNkHUHz+Xl5Gkpzs0ESIFZ27zH7cLPAeYpfjy1SPZOBFyhfDQ1bJupVZOVSp", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + TooltipText + \"", TooltipText)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa11Ig47t/ytBpwjHrEp/RRawMyWI5Mi3p56nx5zXboMZBKNGkKNkHUHz+Xl5Gkpzs0ESIFZ27zH7cLPAeYpfjy1SPZOBFyhfDQ1bJupVZOVSp", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + TooltipText + \"", TooltipText))).sendKeys(new CharSequence[] { inputtext });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("PopulateTextField with tool tip text " + TooltipText + " is throwing function error", true);
			System.out.println("PopulateTextField with tool tip text " + TooltipText + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void PopulateDateFieldBasedonInstructionText(String InstructionText, String inputdate) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq5FqOcOA41BtKhL1TBqs3wvSEA5CMfNH82zAazk8bm1cQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq5FqOcOA41BtKhL1TBqs3wvSEA5CMfNH82zAazk8bm1cQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText))).sendKeys(new CharSequence[] { inputdate });
			owebdriver.findElement(By.xpath(SingleDropCheckBox("/F45dps7mcHF+ZlOpP5BNRKYQBUy82bIsd6CfNZwhnCVCTzszqueikoIs26DKFp5l9D/9tnBrOMmbpnGzQUkOak8ghIuVJ+90e/GDKL0hq5FqOcOA41BtKhL1TBqs3wvSEA5CMfNH82zAazk8bm1cQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+InstructionText+\"", InstructionText))).sendKeys(new CharSequence[] { (CharSequence)Keys.TAB });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("PopulateDateField with instruction text " + InstructionText + " is throwing function error", true);
			System.out.println("PopulateDateField with instruction text " + InstructionText + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void PopulateDateFieldBasedonTooltipText(String TooltipText, String inputdate) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa11Ig47t/ytBpwjHrEp/RRawMyWI5Mi3p56nx5zXboMZBKNGkKNkHUHz+Xl5Gkpzs0M+V5C8zvvx1POSRNVGQ25qpYnIIqaMjW8uQfgJDantXkqTIxH1ubTdpoMPcfWv5VQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + TooltipText + \"", TooltipText)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa11Ig47t/ytBpwjHrEp/RRawMyWI5Mi3p56nx5zXboMZBKNGkKNkHUHz+Xl5Gkpzs0M+V5C8zvvx1POSRNVGQ25qpYnIIqaMjW8uQfgJDantXkqTIxH1ubTdpoMPcfWv5VQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + TooltipText + \"", TooltipText))).sendKeys(new CharSequence[] { inputdate });
			owebdriver.findElement(By.xpath(SingleDropCheckBox("vlZDJqYe835fzdVSDmBgAD21e1t4RGsN8gBgt1F+RvwdL5TzYfZLwEst+99FA171AXdlybDk2NpphZyZsCDa11Ig47t/ytBpwjHrEp/RRawMyWI5Mi3p56nx5zXboMZBKNGkKNkHUHz+Xl5Gkpzs0M+V5C8zvvx1POSRNVGQ25qpYnIIqaMjW8uQfgJDantXkqTIxH1ubTdpoMPcfWv5VQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + TooltipText + \"", TooltipText))).sendKeys(new CharSequence[] { (CharSequence)Keys.TAB });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
//			flow.StepFail("PopulateDateField with tool tip text " + TooltipText + " is throwing function error", true);
			System.out.println("PopulateDateField with tool tip text " + TooltipText + " is throwing function error");
		} 
	}

	public void PopulateDateFieldBasedonPlaceholderText(String placeholdertext, String inputdate) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC8yvdcyhO8lGo6vdJv/TR1kHOQs/K3p/I4KEnFGpj3B2", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", placeholdertext)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC8yvdcyhO8lGo6vdJv/TR1kHOQs/K3p/I4KEnFGpj3B2", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", placeholdertext))).sendKeys(new CharSequence[] { inputdate });
			owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC8yvdcyhO8lGo6vdJv/TR1kHOQs/K3p/I4KEnFGpj3B2", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", placeholdertext))).sendKeys(new CharSequence[] { (CharSequence)Keys.TAB });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("PopulateDateField with placeholder text " + placeholdertext + " is throwing function error", true);
			System.out.println("PopulateDateField with placeholder text " + placeholdertext + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SetWebTextBasedonIndex(int indexnumber, String fieldname, String inputtext) throws Exception {
		try {
			if (fieldname.equals("false")) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("UYP80jq0WCPNhj8T0ZBdop9RtLz8lVi5Cn+mMawcCAen9RjdTbqKu4RCS5ShsHu+2LBVC72Bk0iJiN0+qYOzpnY2QbUV52l/Huow281tOyE8Zlm4qJui7Q+w25NhZAwiL/QSR/8uWhEyyP/iNdPHHl+W9q3YwmOPF6DFX9BQKXc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("UYP80jq0WCPNhj8T0ZBdop9RtLz8lVi5Cn+mMawcCAen9RjdTbqKu4RCS5ShsHu+2LBVC72Bk0iJiN0+qYOzpnY2QbUV52l/Huow281tOyE8Zlm4qJui7Q+w25NhZAwiL/QSR/8uWhEyyP/iNdPHHl+W9q3YwmOPF6DFX9BQKXc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).sendKeys(new CharSequence[] { inputtext });
			} else {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMqjFO9sjl3Q7VWKj756s0waV46uWbxAhLfu4EzkUBmPYn54tvR0YNNNNaUESdEWL7+DukiM1uNdudECSLD1Ge2XvJDYDYcg33atYJYoL7ib52/yEaavGkaJ40jHpe+QHml40ojoAVG5/D4vzOAx443xafbilfSrvQIMmLi2R2s5atucUivYbKHA7MMwXFqHnn", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMqjFO9sjl3Q7VWKj756s0waV46uWbxAhLfu4EzkUBmPYn54tvR0YNNNNaUESdEWL7+DukiM1uNdudECSLD1Ge2XvJDYDYcg33atYJYoL7ib52/yEaavGkaJ40jHpe+QHml40ojoAVG5/D4vzOAx443xafbilfSrvQIMmLi2R2s5atucUivYbKHA7MMwXFqHnn", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).sendKeys(new CharSequence[] { inputtext });
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SetWebText with fieldname " + fieldname + " at the index" + indexnumber + " is throwing function error", true);
			System.out.println("SetWebText with fieldname " + fieldname + " at the index" + indexnumber + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SetWebTextBasedonPartialFieldName(String inputtext, String partialfieldname) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxr8HVpF2D8tnoJoP4DwGcRoOBmMyec+7JTlW8VA+qxh8EDvQ6fr2llhT3L8sYyV9QMNP8GpdhV480wh3SHr5yQmuZak95c+HNH3odkAttFNArcXV3+CT92yqrjVjUtknpGzlMihkSrgLpr6aITQNCzobO6OY6vjqdfbodhBQnymvxRTe3aigsmw+jnvjFMDKAo0orWeIU1kqtBe9j1awNmOvpM5vQUOZFGNE2DduFatebAMe7DJxKmyyPa2JwCgAI91SAspndlDuBL9GPrE0K3eJOwaK0gBXqlLbBFjr9dl9mLr/AKtSLINhXuUDbSNA8Q==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+partialfieldname+\"", partialfieldname)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxr8HVpF2D8tnoJoP4DwGcRoOBmMyec+7JTlW8VA+qxh8EDvQ6fr2llhT3L8sYyV9QMNP8GpdhV480wh3SHr5yQmuZak95c+HNH3odkAttFNArcXV3+CT92yqrjVjUtknpGzlMihkSrgLpr6aITQNCzobO6OY6vjqdfbodhBQnymvxRTe3aigsmw+jnvjFMDKAo0orWeIU1kqtBe9j1awNmOvpM5vQUOZFGNE2DduFatebAMe7DJxKmyyPa2JwCgAI91SAspndlDuBL9GPrE0K3eJOwaK0gBXqlLbBFjr9dl9mLr/AKtSLINhXuUDbSNA8Q==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+partialfieldname+\"", partialfieldname))).sendKeys(new CharSequence[] { inputtext });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SetWebText with partial fieldname " + partialfieldname + " is throwing function error", true);
			System.out.println("SetWebText with partial fieldname " + partialfieldname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SetWebText(String inputtext, String fieldname) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8pr8UU3t2ooLJsPo574xTAygKNKK1niFNZKrQXvY9WsDZjf6o3H9iyDnDo8hpwvLJSAESyBtyBdZO2CTd7cFhuEmJwTh1U6yn/u0168Bm3qTfpLaFgjJiCWCeksJbbp9v+ZA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8pr8UU3t2ooLJsPo574xTAygKNKK1niFNZKrQXvY9WsDZjf6o3H9iyDnDo8hpwvLJSAESyBtyBdZO2CTd7cFhuEmJwTh1U6yn/u0168Bm3qTfpLaFgjJiCWCeksJbbp9v+ZA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(new CharSequence[] { inputtext });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SetWebText with fieldname " + fieldname + " is throwing function error", true);
			System.out.println("SetWebText with fieldname " + fieldname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SetWebTextforCustomizedFieldname(String inputtext, String fieldname) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("wkOLIOwcinazLNZSnq8D4Wh3bsl6SEFKnhF8t4XhXruoQt3INCkdCSbWJ7GDZ0phVavis4IBjEs+cX752fULYy0mPAWO4TGd7HGxRKrlDyaNB5yyO1d0Ym5Ypm7IeiHI1djpIKnKB8khFgVr6xDNaOXkn5+ZMNOy0vekJhLWVwU=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + fieldname + \"", fieldname)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("wkOLIOwcinazLNZSnq8D4Wh3bsl6SEFKnhF8t4XhXruoQt3INCkdCSbWJ7GDZ0phVavis4IBjEs+cX752fULYy0mPAWO4TGd7HGxRKrlDyaNB5yyO1d0Ym5Ypm7IeiHI1djpIKnKB8khFgVr6xDNaOXkn5+ZMNOy0vekJhLWVwU=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\" + fieldname + \"", fieldname))).sendKeys(new CharSequence[] { inputtext });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SetWebTextforCustomizedFieldname function error", true);
			System.out.println("SetWebTextforCustomizedFieldname function error");
			e.printStackTrace();
		} 
	}

	public void SetDateforDateField(String fieldname, String inputtext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8prwtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8prwtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			element.sendKeys(new CharSequence[] { inputtext });
			element.sendKeys(new CharSequence[] { (CharSequence)Keys.TAB });
//			
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SetDate with fieldname " + fieldname + " is throwing function error", true);
			System.out.println("SetDate with fieldname " + fieldname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void SetDateforDateFieldforCustomizedFieldname(String fieldname, String inputtext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("wkOLIOwcinazLNZSnq8D4TRY8OcrX7UFVGdZ/bBWDHdaG8HJE0cYMzvfAPFkQ9v2qrojiGBSKt1BWuIH7LVqIuTbD/U9KD3JRmFZuQDKtfXr+Zd9H0DL9+GYeBteiM++tZhvebYkHedWitBoD0jUz/h/PtIDLxKU95ezvRDVRqkoKoFmuUdOpjUaw8vy//j29WFnLLJqJhKKkhUg05vocPkTvHDKtsFwV2Rn2lU7nbQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("wkOLIOwcinazLNZSnq8D4TRY8OcrX7UFVGdZ/bBWDHdaG8HJE0cYMzvfAPFkQ9v2qrojiGBSKt1BWuIH7LVqIuTbD/U9KD3JRmFZuQDKtfXr+Zd9H0DL9+GYeBteiM++tZhvebYkHedWitBoD0jUz/h/PtIDLxKU95ezvRDVRqkoKoFmuUdOpjUaw8vy//j29WFnLLJqJhKKkhUg05vocPkTvHDKtsFwV2Rn2lU7nbQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			System.out.println(element);
			element.sendKeys(new CharSequence[] { inputtext });
			element.sendKeys(new CharSequence[] { (CharSequence)Keys.TAB });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SetDateforDateField function error", true);
			System.out.println("SetDateforDateField function error");
			e.printStackTrace();
		} 
	}

	public void PopulateDateTime(String fieldname, String Date, String Time) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8prwtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8prwtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			element.sendKeys(new CharSequence[] { Date });
			owebdriver.findElement(By.xpath(SingleDropCheckBox("19P/X99QRL4EAoPEK/F770ciASU+27Vd4YzhC1BKWkyYPmPwCr00++kzn3Zu+eznGK6PB5oYhBvucJF/+MOo7EtQhqQ9g9hzrcSGlUM4CA1Rj/W8qoIq/kN7ZwWz7nDgETBN+bRJXGkgsBgrQSJ0l8GCjo8sBROpfaS7gKwKmMI=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).click();
			owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyerva02iezsBuhj/zCZCvp9vc0nuwT80p0uvpDjztpdzH7XQe06Z13IqVDVizk6ulaprIm0P45NPUaaDC2bSdfYlflvat2MJjjxegxV/QUCl3", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Time+\"", Time))).click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("PopulateDateTime with fieldname " + fieldname + " is throwing function error", true);
			System.out.println("PopulateDateTime with fieldname " + fieldname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void UploadFileBasedonIndex(String filepath, int index) throws Exception {
		try {
//			System.out.println(owebdriver.findElement(By.xpath(String.valueOf(String.valueOf(String.valueOf(SingleDropCheckBox(Constants.uploadxpath, this.FF23242524354dfdgdgdgsdfsdfd5)))) + "[" + index + "]")));
			owebdriver.findElement(By.xpath(String.valueOf(String.valueOf(String.valueOf(SingleDropCheckBox(Constants.uploadxpath, this.FF23242524354dfdgdgdgsdfsdfd5)))) + "[" + index + "]")).sendKeys(new CharSequence[] { filepath });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("UploadFileBasedonIndex at the index " + index + " is throwing function error", true);
			System.out.println("UploadFileBasedonIndex at the index " + index + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void UploadFile(String filepath) throws Exception {
		try {
			owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.uploadxpath, this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { filepath });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("UploadFile function error", true);
			System.out.println("UploadFile function error");
			e.printStackTrace();
		} 
	}

	public void VerifyMouseHoverTextfromButton(String Buttonname, String inputtext) throws Exception {
		try {
			String ButtonName = flow.CaptilizeText(Buttonname);
			WebElement tooltiptext = owebdriver.findElement(By.xpath(SingleDropCheckBox("UzydxljBvlZWF7JXakmNbGNSnPH/eDLdcW2o7ziKnez3nu/zPjQtEqthaeMw59BxGiBauoTXpuK6wzkUV4VRFEGqRYWxd6rWTLb3UjJh5c/nE7yyMbV6HmdinVGwHsV2KylR10eW65SgKbDt2GUpAg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+ButtonName+\"", ButtonName).replace("\"+Buttonname+\"", Buttonname)));
			String OutputText = tooltiptext.getAttribute("innerHTML");
			if (OutputText.equals(inputtext)) {
//				flow.StepPassWithoutScreenshot("MouseHover Text matched with the button and its value - " + OutputText);
				System.out.println("MouseHover Text matched with the button and its value - " + OutputText);
			} else {
//				flow.StepFailWithoutScreenshot("MouseHover Text mismatched with the button and its value - " + OutputText);
				System.out.println("MouseHover Text mismatched with the button and its value - " + OutputText);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyMouseHoverText from the button " + Buttonname + " is throwing function error", true);
			System.out.println("VerifyMouseHoverText from the button " + Buttonname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void ClearField(String fieldname) throws Exception {
		try {
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+GSYCbRtVHOkPdRUuSnmXi/RB1UlGwYsujpbAPVqxxA1cc8vnyO8Xg/m3cV0EG+QNT304KGGAFMxP5H08TF0bKuOC01Z1Eo1xqJqwWIFJ6lCTP0p4oGA7ynRm89ZIItdbmDhUvjhcfnY1aPmOadT152STgwDcaVQHd06NVDs38CFh+pCr6WmrTJmEM6/jmwJuDmK/xg0QHlbDZ72YZ+vqG7nzQ0/GvGmMUpJHHMZfHaRvkjqWnD/MixuTC+7NheNeOVumlGeZa80pK6W+ywCd52Yuv8Aq1Isg2Fe5QNtI0Dx", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
			executor.executeScript("arguments[0].value='';", new Object[] { element });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearField for the fieldname " + fieldname + " is throwing function error", true);
			System.out.println("ClearField for the fieldname " + fieldname + " is throwing function error");
			e.printStackTrace();
		} 
	}

	public void ClearDropDownField(String fieldname) throws Exception {
		try {
			WebElement element = owebdriver.findElement(By.xpath(".//div//*[text()='"+fieldname+"']//following::div[1]//div//div[@role='listbox']"));
			element.click();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyehcevrwAJOSL5gEaqxHff3YRME35tElcaSCwGCtBInSXUuIO87qgdLPPvpkXYmK5vAFmhc3+3VeImlUX3I5LNbA=", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyehcevrwAJOSL5gEaqxHff3YRME35tElcaSCwGCtBInSXUuIO87qgdLPPvpkXYmK5vAFmhc3+3VeImlUX3I5LNbA=", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearDropDown for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClearMultiSelectDropDownField(String fieldname) throws Exception {

		try {

			WebElement element = owebdriver.findElement(By.xpath(".//div//*[contains(@class,'FieldLayout---field_label') and text()='"+fieldname+"']//following::div[1]//div//div//span[@class='MultipleDropdownWidget---value_display']"));
			String value=element.getAttribute("innerText");
			String[] option=value.split(",");
			for(int i=0;i<option.length;i++)
			{
				String placeholdertext = owebdriver.findElement(By.xpath(".//div//*[contains(@class,'FieldLayout---field_label') and text()='"+fieldname+"']//following::div[1]//div//div//span[@class='MultipleDropdownWidget---value_display']")).getAttribute("data-placeholder");
				WebElement element1 = owebdriver.findElement(By.xpath(".//div//*[contains(@class,'FieldLayout---field_label') and text()='"+fieldname+"']//following::div[1]//div//div"));
				JavascriptExecutor executor = (JavascriptExecutor) owebdriver;
				executor.executeScript("arguments[0].click();", element1);
				executor.executeScript("arguments[0].value='"+placeholdertext+"';", element);
				element1.sendKeys(Keys.ENTER);
				element1.click();
			}
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearMultiSelectDropDown for the fieldname "+fieldname+" is throwing function error",true);
			e.printStackTrace();
		}
	}

	public void ClearPickerField(String fieldname) throws Exception {
		try {
			List<WebElement> pickervalue = owebdriver.findElements(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSPsahEkglcUAiQLBRpOrNUQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			int value = 1;
			for (int i = 1; i <= pickervalue.size(); i++) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtk811CGBcaDBuMF93bzYkgWItzhkQrNEg4maIEeIC6U=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+value+\"", String.valueOf(value))));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtk811CGBcaDBuMF93bzYkgWItzhkQrNEg4maIEeIC6U=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+value+\"", String.valueOf(value))));
				element.click();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearPicker for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyPlaceholderTextfromtheField(String fieldname, String placeholdervalue) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8pr3YU4q0zWXI1nEDeg49guh3zfaazL6aC2haRhw9rpfFRyrFT5O83ggWWkIzvKe25lE4wK558/hgu0oXiJI7CszPk3SJXYkMtW2rzrQCQofyKOlw2xBiAdIRUnjaB309YOWse77tVVXuQmMqnawQfo6bTXGmU8Ij83BKQwQODf8dNWRR9tIHfdY1KbUwF2MLwh9oZvJh8gCZ0043rFUnpwiXjfZYQN6gEgQThFVqQ8rCr", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8pr3YU4q0zWXI1nEDeg49guh3zfaazL6aC2haRhw9rpfFRyrFT5O83ggWWkIzvKe25lE4wK558/hgu0oXiJI7CszPk3SJXYkMtW2rzrQCQofyKOlw2xBiAdIRUnjaB309YOWse77tVVXuQmMqnawQfo6bTXGmU8Ij83BKQwQODf8dNWRR9tIHfdY1KbUwF2MLwh9oZvJh8gCZ0043rFUnpwiXjfZYQN6gEgQThFVqQ8rCr", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			String placeholder = new String();
			placeholder = element.getAttribute("placeholder");
			System.out.println(placeholder);
			if (placeholder.isEmpty()) {
				placeholder = element.getAttribute("data-placeholder");
				if (placeholder.isEmpty())
					placeholder = element.getText(); 
			} 
			if (placeholder.equals(placeholdervalue)) {
//				flow.StepPassWithoutScreenshot("Placeholder text matched and its value - " + placeholder);
				System.out.println("Placeholder text matched and its value - " + placeholder);
			} else {
//				flow.StepFailWithoutScreenshot("Placeholder text mismatched and its value - " + placeholder);
				System.out.println("Placeholder text mismatched and its value - " + placeholder);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyPlaceholderText for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyPlaceholderTextfromtheSingleSelectDropDownField(String fieldname,String placeholdervalue) throws Exception {
	    try {
	        flow.ExplicitWait(By.xpath(SingleDropCheckBox("KgKZ54bUggFOsQfNez/GyeTdIldiQy1bavOtAJCh/Io6XDbEGIB0hFSeNoHfT1g5ax7vu1VVe5CYyqdrBB+jpsBg6Md4Y6nl/2O8rmG2rduuiRd1M+IxikLP6XIrelZWNFjw5ytftQVUZ1n9sFYMd05kvP72RDUOpQ2sCHtRR3K3Qvp1Gb5HCyd35J+WG9+g", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
	        WebElement element=owebdriver.findElement(By.xpath(SingleDropCheckBox("KgKZ54bUggFOsQfNez/GyeTdIldiQy1bavOtAJCh/Io6XDbEGIB0hFSeNoHfT1g5ax7vu1VVe5CYyqdrBB+jpsBg6Md4Y6nl/2O8rmG2rduuiRd1M+IxikLP6XIrelZWNFjw5ytftQVUZ1n9sFYMd05kvP72RDUOpQ2sCHtRR3K3Qvp1Gb5HCyd35J+WG9+g", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
	        String placeholder = element.getText();
	        System.out.println(placeholder);
	        if(placeholder.equals(placeholdervalue))
	        {
	         System.out.println("Placeholder text matched in the dropdown field and its value - "+placeholder);
//	         flow.StepPassWithoutScreenshot("Placeholder text matched in the dropdown field and its value - "+placeholder);
	        }
	        else {
	        	System.out.println("Placeholder text mismatched in the dropdown field and its value - "+placeholder);
//	        flow.StepFailWithoutScreenshot("Placeholder text mismatched in the dropdown field and its value - "+placeholder);
	        }
	        
	        }
	        catch (Exception e) {
	        String Exception = Throwables.getStackTraceAsString(e);
//	        flow.StepFail("VerifyPlaceholderTextfromtheSingleSelectDropDown for the fieldname "+fieldname+" is throwing function error",true);
	        e.printStackTrace();
	        }
	    }

	public void VerifyInstructionbelowtheField(String fieldname, String inputtext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMn5bGpB7jJ0bfRIr2xT3TLOT4ttmKY7NYxeydp4rM73UcV1YdDibyxUbPvy1vFsMHC0wnPgF1IYmIxCe5xF8GKQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			String instruction = flow.RetrieveWebElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMn5bGpB7jJ0bfRIr2xT3TLOT4ttmKY7NYxeydp4rM73UcV1YdDibyxUbPvy1vFsMHC0wnPgF1IYmIxCe5xF8GKQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).getText();
			System.out.println(instruction);
			if (instruction.equals(inputtext)) {
//				flow.StepPassWithoutScreenshot("Instruction text matched below the field and its value - " + instruction);
				System.out.println("Instruction text matched below the field and its value - " + instruction);
			} else {
//				flow.StepFailWithoutScreenshot("Placeholder text mismatched below the field and its value - " + instruction);
				System.out.println("Placeholder text mismatched below the field and its value - " + instruction);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyInstruction below the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ValidateTextFieldWithoutInputs(String fieldname) throws Exception {
		try {
			String count = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMn5bGpB7jJ0bfRIr2xT3TLOT4ttmKY7NYxeydp4rM73UcV1YdDibyxUbPvy1vFsMHC0wnPgF1IYmIxCe5xF8GKQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).getText();
//			String count = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMn5bGpB7jJ0bfRIr2xT3TLOT4ttmKY7NYxeydp4rM73X7FOEuIb7tGxeFe4PfHxNB", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).getText();
//			System.out.println(count);
			String[] FirstCOUNTING = count.split(" ");
			System.out.println(FirstCOUNTING[0]);
			String[] SecondCOUNTING = FirstCOUNTING[0].split(Pattern.quote("/"));
			System.out.println(SecondCOUNTING[1]);
//			System.out.println(Integer.parseInt(SecondCOUNTING1[1]));
			int COUNT = Integer.parseInt(SecondCOUNTING[1]);
			System.out.println(COUNT);
			flow.PopulateDataforTextFieldBasedonFieldName(fieldname, String.valueOf(COUNT+1), "false");
			flow.WaitforProgressBar();
			boolean errortext = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMn5bGpB7jJ0bfRIr2xT3TLOT4ttmKY7NYxeydp4rM73X7FOEuIb7tGxeFe4PfHxNB", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).isDisplayed();
			if (errortext) {
//				flow.StepPassWithoutScreenshot("Error message is getting displayed for the field - " + fieldname);
				System.out.println("Error message is getting displayed for the field - " + fieldname);
			} else {
//				flow.StepFailWithoutScreenshot("Error message is not getting displayed for the field - " + fieldname);
				System.out.println("Error message is not getting displayed for the field - " + fieldname);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ValidateTextFieldWithoutInputs for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ValidateTextFieldWithInputs(String fieldname, String inputtext) throws Exception {
		try {
			owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMqjFO9sjl3Q7VWKj756s0waV46uWbxAhLfu4EzkUBmPYn54tvR0YNNNNaUESdEWL7+DukiM1uNdudECSLD1Ge2XvJDYDYcg33atYJYoL7ib52/yEaavGkaJ40jHpe+QHml40ojoAVG5/D4vzOAx4436KqD7DPA6ZGT+AjThReQ5Q=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(new CharSequence[] { inputtext });
			flow.WaitforProgressBar();
			boolean errortext = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMn5bGpB7jJ0bfRIr2xT3TLOT4ttmKY7NYxeydp4rM73X7FOEuIb7tGxeFe4PfHxNB", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).isDisplayed();
			if (errortext) {
//				flow.StepPassWithoutScreenshot("Error message is getting displayed for the field - " + fieldname);
				System.out.println("Error message is getting displayed for the field - " + fieldname);
			} else {
//				flow.StepFailWithoutScreenshot("Error message is not getting displayed for the field - " + fieldname);
				System.out.println("Error message is not getting displayed for the field - " + fieldname);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ValidateTextFieldWithInputs for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ValidateErrorMessageforTextFieldWithInputs(String fieldname, String inputtext, String Errormessage) throws Exception {
		try {
			owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMqjFO9sjl3Q7VWKj756s0waV46uWbxAhLfu4EzkUBmPYn54tvR0YNNNNaUESdEWL7+DukiM1uNdudECSLD1Ge2XvJDYDYcg33atYJYoL7ib52/yEaavGkaJ40jHpe+QHml40ojoAVG5/D4vzOAx4436KqD7DPA6ZGT+AjThReQ5Q=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(new CharSequence[] { inputtext });
			owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMqjFO9sjl3Q7VWKj756s0waV46uWbxAhLfu4EzkUBmPYn54tvR0YNNNNaUESdEWL7+DukiM1uNdudECSLD1Ge2XvJDYDYcg33atYJYoL7ib52/yEaavGkaJ40jHpe+QHml40ojoAVG5/D4vzOAx4436KqD7DPA6ZGT+AjThReQ5Q=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(Keys.ENTER);
			flow.WaitforProgressBar();
			String errortext = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMn5bGpB7jJ0bfRIr2xT3TLOT4ttmKY7NYxeydp4rM73X7FOEuIb7tGxeFe4PfHxNB", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).getText();
			if (errortext.equals(Errormessage)) {
//				flow.StepPassWithoutScreenshot("Error message - " + errortext + " - is matching for the field - " + fieldname);
				System.out.println("Error message - " + errortext + " - is matching for the field - " + fieldname);
			} else {
//				flow.StepFailWithoutScreenshot("Error message - " + errortext + " - is not matching for the field - " + fieldname);
				System.out.println("Error message - " + errortext + " - is not matching for the field - " + fieldname);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ValidateErrorMessageforTextFieldWithInputs for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void MultipleUploadUsingInputValues(String files, String fieldname) throws Exception {
		try {
			String[] Files = files.split(",");
			int i = 0;
			byte b;
			int j;
			String[] arrayOfString1;
			for (j = (arrayOfString1 = Files).length, b = 0; b < j; ) {
				String file = arrayOfString1[b];
				owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSM7jTlp4PlwCZLniguKnWnRYg0Vxj6j+sc7PF1h6RaT0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(new CharSequence[] { file });
				b = (byte)(b + 1);
			} 
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSFoTsO62XKLs0+ZzMDDNFw2DrGeHv317gK//G0yK8H/Zflvat2MJjjxegxV/QUCl3", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			if (Files.length == result.size()) {
//				StepPassWithoutScreenshot("All the documents are uploaded properly");
				System.out.println("All the documents are uploaded properly");
			} else {
				String time = GetDateandTimewithSeconds();
//				flow.StepFail("Documents are not uploaded properly - " + time, true);
				System.out.println("Documents are not uploaded properly - " + time);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultipleUploadUsingInputValues for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void MultipleUpload(String Excelfilepath, String sheetname, String columnname, String fieldname) throws Exception {
		try {
			List<HashMap<String, String>> mydata = new ArrayList<>();
			HashMap<String, String> testcase = new HashMap<>();
			Excel inputsheet = new Excel(Excelfilepath, sheetname);
			mydata = Excel.getcelldata();
			int i = 0;
			for (HashMap<String, String> mtestcase : mydata) {
				testcase.put("Document_path", mtestcase.get(columnname));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSM7jTlp4PlwCZLniguKnWnRYg0Vxj6j+sc7PF1h6RaT0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(new CharSequence[] { ((String)testcase.get("Document_path")).replace("\"+fieldname+\"", fieldname) });
			} 
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSFoTsO62XKLs0+ZzMDDNFw2DrGeHv317gK//G0yK8H/Zflvat2MJjjxegxV/QUCl3", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			if (mydata.size() == result.size()) {
//				flow.StepPassWithoutScreenshot("All the documents are uploaded properly");
				System.out.println("All the documents are uploaded properly");
			} else {
//				flow.StepFail("Documents are not uploaded properly", true);
				System.out.println("Documents are not uploaded properly");
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultipleUpload for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void SelectCheckboxBasedonIndex(int indexnumber) throws Exception {
		try {
			if (this.BROWSER.equals("FIREFOX")) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("pueoV6Pz6tfYxK3sCxJidQF6FzsIHLvDs+Pc9ChV4TIYrOY6ZntkA6C6L33PJV2L", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("pueoV6Pz6tfYxK3sCxJidQF6FzsIHLvDs+Pc9ChV4TIYrOY6ZntkA6C6L33PJV2L", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
				executor.executeScript("arguments[0].click();", new Object[] { element });
			} else {
				System.out.println("C");
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("pueoV6Pz6tfYxK3sCxJidQF6FzsIHLvDs+Pc9ChV4TIYrOY6ZntkA6C6L33PJV2L", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("pueoV6Pz6tfYxK3sCxJidQF6FzsIHLvDs+Pc9ChV4TIYrOY6ZntkA6C6L33PJV2L", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).click();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectCheckbox at the index " + indexnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void SelectCheckboxsBasedonIndex(int indexnumber) throws Exception {
		try {
			if (this.BROWSER.equals("FIREFOX")) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("pueoV6Pz6tfYxK3sCxJidQF6FzsIHLvDs+Pc9ChV4TIYrOY6ZntkA6C6L33PJV2L", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("pueoV6Pz6tfYxK3sCxJidQF6FzsIHLvDs+Pc9ChV4TIYrOY6ZntkA6C6L33PJV2L", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				element.click();
			} else {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("pueoV6Pz6tfYxK3sCxJidQF6FzsIHLvDs+Pc9ChV4TIYrOY6ZntkA6C6L33PJV2L", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("pueoV6Pz6tfYxK3sCxJidQF6FzsIHLvDs+Pc9ChV4TIYrOY6ZntkA6C6L33PJV2L", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).click();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectCheckbox at the index " + indexnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void SelectCheckboxBasedonText(String Text) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("ujWB115nb0ncJ/4PhBX77ZcvmJnsB5KcZeVrqlN7Y+awo7I1Q4/Gsl6PNH+zh3xP", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text+\"", Text)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("ujWB115nb0ncJ/4PhBX77ZcvmJnsB5KcZeVrqlN7Y+awo7I1Q4/Gsl6PNH+zh3xP", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text+\"", Text)));
			JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
			executor.executeScript("arguments[0].click();", new Object[] { element });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectCheckbox with the text " + Text + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void SelectRadioButtonBasedonIndex(int indexnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("Ply/7vUXJ3fmAok2yqHE6RfwH8TMTY8R/DxaXNluPuOmA6k+X4WNFYR2y56NV6VeYYCI306fOdrVeW7XAF6AEA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("Ply/7vUXJ3fmAok2yqHE6RfwH8TMTY8R/DxaXNluPuOmA6k+X4WNFYR2y56NV6VeYYCI306fOdrVeW7XAF6AEA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectRadioButton at the index " + indexnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void WaitforProgressBar() {
		try {
			flow.Timeout(3000);
			flow.TurnOffImplicitWaits();
			int count = 1;
			while (owebdriver.findElement(By.xpath(SingleDropCheckBox("8ZHVQDiwoeBdpVxiLRy08WIqtpq8vDRVaVBAcv8D+auY+S+NBZslZCKlLiCbLfp5", this.FF23242524354dfdgdgdgsdfsdfd5))).isDisplayed())
			{
				Thread.sleep(1000L); 
			if (count == 120)
				throw new Exception("Maximum timeout for Wait for Progress bar exceeds"); 
			count++;
		} 
		}
		catch (Exception e) {
			if (e.toString().equals("Maximum timeout for Wait for Progress bar exceeds"))
					System.out.println("Maximum timeout for Wait for Progress bar exceeds");
		}
			flow.TurnOnImplicitWaits();
		} 
	
	
	public void ClickImageBasedonIndex(int indexnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("E5yyy2UHP1Z+dh6CiZUfAh+4qLs8jY+tsNJ9OEbocNewb5YjW4tuquXhyiA2QCtHaYOgzBfzlPasCsuuMEvS9yH9ArnfN7hdQ7PBJDiiuAQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("E5yyy2UHP1Z+dh6CiZUfAh+4qLs8jY+tsNJ9OEbocNewb5YjW4tuquXhyiA2QCtHaYOgzBfzlPasCsuuMEvS9yH9ArnfN7hdQ7PBJDiiuAQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickImageBasedonIndex function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickSVGIconBasedonFieldname(String fieldname) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMcoWyFOPj77JXdLbKYmZCkZj0lt6fnXbSIw5fq8qwlu8=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMcoWyFOPj77JXdLbKYmZCkZj0lt6fnXbSIw5fq8qwlu8=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickSVGIcon with the fieldname " + fieldname + " function error", true);
			e.printStackTrace();
		} 
	}



	public void ClickSVGIconBasedonToolTipText(String fieldname) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(".//a[contains(@class,'Linked')]//*[text()='" + fieldname + "']//parent::a//*[name()='svg']"));
			WebElement element = owebdriver.findElement(By.xpath(".//a[contains(@class,'Tooltip')]//*[text()='" + fieldname + "']//parent::a//*[name()='svg']"));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickSVGIcon with the ToolTipText " + fieldname + " function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickBoldlinkBasedonFieldname(String fieldname) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(".//strong[@class='StrongText---richtext_strong']//a[text()='" + fieldname + "']"));
			WebElement element = owebdriver.findElement(By.xpath(".//strong[@class='StrongText---richtext_strong']//a[text()='" + fieldname + "']"));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickBoldlinkBasedonFieldname with the fieldname " + fieldname + " function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickSVGIconBasedonIndex(int indexnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("3QflKAGL0NMNHOOr2WVFJ/Q8sHB/e+yuzGl1vgtWv/4Wr4O/29eMadl3QADj755g", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("3QflKAGL0NMNHOOr2WVFJ/Q8sHB/e+yuzGl1vgtWv/4Wr4O/29eMadl3QADj755g", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickSVGIconBasedonIndex function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickElementbyJavascript(String fieldnameastext) throws Exception {
		try {
			String FIELDNAME = flow.CaptilizeText(fieldnameastext);
			String fieldname = fieldnameastext.toUpperCase();
			String lowercasetext = fieldnameastext.toLowerCase();
			String fieldnametext = flow.CaptilizeText(lowercasetext);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("t9aQdkGRD9QnppgQu//Bor9lhew9VnyIvwX/yNELN10JmY+EUGwfM5Yvtx/gi6UCAELWEA+V2m2wVL/kRyMZC55pLBuQJ7eT8Nlhiw3iuosvtjPAgTNOjCrVX8xe/aGkTyE+nAG72Hc8h+DBmnn43hIt6yOP3/6x+//WY1htlsa+ldxm/q1KRmp4ucPlbiLA5SH9D8yig1F5fmmdOUmlms1aXngY2S9d2j+Nvjwe1Y7ggKrXURE2tIPwh7yWvIBLQjDtyPRjQ5Ih6llMD1P8T0nSFhLTbs9M0Cv6yJQlhYF0IknQUTWIgQ55UvPLSnHsc5Z2xKpAVe6d5+yZpHEuiTZ5FJnp0KyoJuui6bE8dhSnW+XzYDFbxs836GPKEznHS8lZ34AOsEojYRp7WKXq5Dc7y+zuVzn6H+OKNLiaAwhkAn/XYVfsqUwMOhu8XTKA9TcyaAcsYgRl+hQaKmKvgEqT0KxuMLVR5FfUcgBv2Cyqleg6qf/aDeK8Pi0XGyYPJt9psVHTZ6IZys82N1Qt0W/GqZcACzJ7+MAQbfLOyO8dcUtjiVnjBW2Ar+ztD7GnN/HKwZ/M+Edujzz72NBQj+ti6ZVbAK6yIL89TudJ67Z1baKCS5zpmS8rEFKFxonJiLXtx+mwCKZ1drsHqmcsywEdRmZtomCW4sBJd1v5U2pikVrxvzFBBd7a4C8HYwiHi+BMh9KX2Oca3nyxZ9PBMugnoScRVMpKzLpAurM3ilpBct6fRiFVQ/l9LU6vPzcZflYUnRTLxhDo7Ftgt+hGtsJYIo7/ePgMIEsHBiZgHCOLuqKmfr10EuDIHunClNHQctLwortQ9Li4LLkFHi4KPuoQA4szkmSjouGnjURtt3FkmAm0bVRzpD3UVLkp5l4v+uwzcajvzePGnzJ7o9Ld20Iw7cj0Y0OSIepZTA9T/E9J0hYS027PTNAr+siUJYWBSnIBGR7wZIDtr/oEETkPRmwDHuwycSpssj2ticAoACMJiX3tn6klkEAIEmXjRLBU5O1lZqalR4TzuK8adoqc/S6hsVhmIs/RKkhAWNCNg7SvnM0g3vQdbWa/f2h20w42", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+FIELDNAME +\"", FIELDNAME).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("t9aQdkGRD9QnppgQu//Bor9lhew9VnyIvwX/yNELN10JmY+EUGwfM5Yvtx/gi6UCAELWEA+V2m2wVL/kRyMZC55pLBuQJ7eT8Nlhiw3iuosvtjPAgTNOjCrVX8xe/aGkTyE+nAG72Hc8h+DBmnn43hIt6yOP3/6x+//WY1htlsa+ldxm/q1KRmp4ucPlbiLA5SH9D8yig1F5fmmdOUmlms1aXngY2S9d2j+Nvjwe1Y7ggKrXURE2tIPwh7yWvIBLQjDtyPRjQ5Ih6llMD1P8T0nSFhLTbs9M0Cv6yJQlhYF0IknQUTWIgQ55UvPLSnHsc5Z2xKpAVe6d5+yZpHEuiTZ5FJnp0KyoJuui6bE8dhSnW+XzYDFbxs836GPKEznHS8lZ34AOsEojYRp7WKXq5Dc7y+zuVzn6H+OKNLiaAwhkAn/XYVfsqUwMOhu8XTKA9TcyaAcsYgRl+hQaKmKvgEqT0KxuMLVR5FfUcgBv2Cyqleg6qf/aDeK8Pi0XGyYPJt9psVHTZ6IZys82N1Qt0W/GqZcACzJ7+MAQbfLOyO8dcUtjiVnjBW2Ar+ztD7GnN/HKwZ/M+Edujzz72NBQj+ti6ZVbAK6yIL89TudJ67Z1baKCS5zpmS8rEFKFxonJiLXtx+mwCKZ1drsHqmcsywEdRmZtomCW4sBJd1v5U2pikVrxvzFBBd7a4C8HYwiHi+BMh9KX2Oca3nyxZ9PBMugnoScRVMpKzLpAurM3ilpBct6fRiFVQ/l9LU6vPzcZflYUnRTLxhDo7Ftgt+hGtsJYIo7/ePgMIEsHBiZgHCOLuqKmfr10EuDIHunClNHQctLwortQ9Li4LLkFHi4KPuoQA4szkmSjouGnjURtt3FkmAm0bVRzpD3UVLkp5l4v+uwzcajvzePGnzJ7o9Ld20Iw7cj0Y0OSIepZTA9T/E9J0hYS027PTNAr+siUJYWBSnIBGR7wZIDtr/oEETkPRmwDHuwycSpssj2ticAoACMJiX3tn6klkEAIEmXjRLBU5O1lZqalR4TzuK8adoqc/S6hsVhmIs/RKkhAWNCNg7SvnM0g3vQdbWa/f2h20w42", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+FIELDNAME +\"", FIELDNAME).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext)));
			JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
			executor.executeScript("arguments[0].click();", new Object[] { element });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickElementbyJavascript for the element " + fieldnameastext + " function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickWebElement(String fieldnameastext) throws Exception {
		try {
			String FIELDNAME = flow.CaptilizeText(fieldnameastext);
			String fieldname = fieldnameastext.toUpperCase();
			String lowercasetext = fieldnameastext.toLowerCase();
			String fieldnametext = flow.CaptilizeText(lowercasetext);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("t9aQdkGRD9QnppgQu//BooiEqQT7YAcf2OBHSlfNHePK9OEMNJANwMJTInBNGmtnDXKbVUPNi8ilWdPiKxGHYuTdIldiQy1bavOtAJCh/IpHMq3MejaB9iqYWjKwyNlB/KeQv5ZzVB1e75btTZLTN/sQZ4+jbcwJZxZastSg8Xqey60FZOTcYn1utUBwoE679dlamJWsEaS1QnGA1WnQnAEdRmZtomCW4sBJd1v5U2oyNJIdEwGvi5VMw3S2Dq/cQdV6dm4yzz5egqLqekuiQZz0trFxEhmVEa+eMYNjEeVsVhK1UvppGXWXlSb3JJnwNFjw5ytftQVUZ1n9sFYMd/CZR9PELGKIezyubpaj9xiW1aVWWZdv/dVfr+vYHXcQ", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldnameastext+\"", fieldnameastext).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("t9aQdkGRD9QnppgQu//BooiEqQT7YAcf2OBHSlfNHePK9OEMNJANwMJTInBNGmtnDXKbVUPNi8ilWdPiKxGHYuTdIldiQy1bavOtAJCh/IpHMq3MejaB9iqYWjKwyNlB/KeQv5ZzVB1e75btTZLTN/sQZ4+jbcwJZxZastSg8Xqey60FZOTcYn1utUBwoE679dlamJWsEaS1QnGA1WnQnAEdRmZtomCW4sBJd1v5U2oyNJIdEwGvi5VMw3S2Dq/cQdV6dm4yzz5egqLqekuiQZz0trFxEhmVEa+eMYNjEeVsVhK1UvppGXWXlSb3JJnwNFjw5ytftQVUZ1n9sFYMd/CZR9PELGKIezyubpaj9xiW1aVWWZdv/dVfr+vYHXcQ", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldnameastext+\"", fieldnameastext).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext)));
			System.out.println(element);
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickWebElement for the element " + fieldnameastext + " function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickSectionorBoxLayout(String fieldnameastext) throws Exception {
		try {
			String FIELDNAME = flow.CaptilizeText(fieldnameastext);
			String fieldname = fieldnameastext.toUpperCase();
			String lowercasetext = fieldnameastext.toLowerCase();
			String fieldnametext = flow.CaptilizeText(lowercasetext);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("ibmVVbVBGtxaELuMwPgHFUC/O8RjVmVb/ugW+9aZPMO3NRP1P8g1kqkVjIKMHrR4J1cFUf2C8KVO0NSRIhdyNGZ8cyq3+uCZn6rCp6Mpo4RkmAm0bVRzpD3UVLkp5l4vFo1s+PnzrMQk1ztNat5kG5Wj8zf4VjbtLpkRVub77/kohRihIbWFbeJQ3QSaKcIWouWa1cMmteyiNjY1BRjnjcTvXcO8ZMh2Qnf6KZDjlvn53lSqjC/K8qetZZZk7JvryDZp3J/7qbuBYbN+wW/40F1mx1tbluZFFzdn7g+MuFD67DNxqO/N48afMnuj0t3bs+sVp+7v8jD6qi/51XE06/tf5FmP9tSwjd298AGlPW14P7umXo3Qg8MiVE6W+Hxd51i1nSElf0W9yGX8tFrPeW/GqZcACzJ7+MAQbfLOyO8dcUtjiVnjBW2Ar+ztD7GnN/HKwZ/M+Edujzz72NBQj+ti6ZVbAK6yIL89TudJ67bxGLnUYi+6T1rxYCiycGbFITkjZjikkHjJo0LyD3Y5meBcwBFQgMPCCurRU3UvSrw=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldnameastext+\"", fieldnameastext).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("ibmVVbVBGtxaELuMwPgHFUC/O8RjVmVb/ugW+9aZPMO3NRP1P8g1kqkVjIKMHrR4J1cFUf2C8KVO0NSRIhdyNGZ8cyq3+uCZn6rCp6Mpo4RkmAm0bVRzpD3UVLkp5l4vKIUYoSG1hW3iUN0EminCFqLlmtXDJrXsojY2NQUY543E713DvGTIdkJ3+imQ45b5+d5UqowvyvKnrWWWZOyb68g2adyf+6m7gWGzfsFv+NBdZsdbW5bmRRc3Z+4PjLhQ+1/kWY/21LCN3b3wAaU9bXg/u6ZejdCDwyJUTpb4fF3nWLWdISV/Rb3IZfy0Ws95b8aplwALMnv4wBBt8s7I7x1xS2OJWeMFbYCv7O0Psac38crBn8z4R26PPPvY0FCP62LplVsArrIgvz1O50nrts4cdwmhfMji1obgsutorvU=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickSectionorBoxLayout for the sectionorboxlayout " + fieldnameastext + " function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickCardLayoutBasedonIndex(int indexnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKP86RDldej5de/To37CHIO30N7URgxHYN0LmL+t4VyUs+qVYqJ557RENjxxocqEg4BVhOejWBQ3S/hPanxaPedy7EzNL3uhj+875HEWbgCvJq", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKP86RDldej5de/To37CHIO30N7URgxHYN0LmL+t4VyUs+qVYqJ557RENjxxocqEg4BVhOejWBQ3S/hPanxaPedy7EzNL3uhj+875HEWbgCvJq", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickCardLayoutBasedonIndex function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickButtonBasedonName(String Fieldnameastext) throws Exception {
		try {
			String FIELDNAME = flow.CaptilizeText(Fieldnameastext);
			String fieldname = Fieldnameastext.toUpperCase();
			String lowercasetext = Fieldnameastext.toLowerCase();
			String fieldnametext = flow.CaptilizeText(lowercasetext);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("UzydxljBvlZWF7JXakmNbCbmSRsDJeGvGpkIiINiwgLH4n/0PpqF58WdOZt4DzB4v2WF7D1WfIi/Bf/I0Qs3XeTdIldiQy1bavOtAJCh/IoZ63MZbFL+3ihgBlZZQfQbXwiHZovWGOsBY/RAu0eOGbeD8LPl5PQkm1Oym3NKX9eT/kvfwqg624W2sTK1P1+KQjDtyPRjQ5Ih6llMD1P8T0nSFhLTbs9M0Cv6yJQlhYE1BLAn6citb2MNDo70nAAvB+5TmeHp5bQnfXCZu+dTdSQ5xAPCCX8VlAVdnDYYsewJJfV1t02PfGrAbI5Wp/5pX0QejAvjktsimDcwiVBWBw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext).replace("\"+Fieldnameastext+\"", Fieldnameastext)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("UzydxljBvlZWF7JXakmNbCbmSRsDJeGvGpkIiINiwgLH4n/0PpqF58WdOZt4DzB4v2WF7D1WfIi/Bf/I0Qs3XeTdIldiQy1bavOtAJCh/IoZ63MZbFL+3ihgBlZZQfQbXwiHZovWGOsBY/RAu0eOGbeD8LPl5PQkm1Oym3NKX9eT/kvfwqg624W2sTK1P1+KQjDtyPRjQ5Ih6llMD1P8T0nSFhLTbs9M0Cv6yJQlhYE1BLAn6citb2MNDo70nAAvB+5TmeHp5bQnfXCZu+dTdSQ5xAPCCX8VlAVdnDYYsewJJfV1t02PfGrAbI5Wp/5pX0QejAvjktsimDcwiVBWBw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext).replace("\"+Fieldnameastext+\"", Fieldnameastext)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickButton for the button " + Fieldnameastext + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickColumnNameonGridBasedonIndex(int Gridnumber, int columnnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath("(.//table)[" + Gridnumber + "]//thead//th[" + columnnumber + "]"));
			owebdriver.findElement(By.xpath("(.//table)[" + Gridnumber + "]//thead//th[" + columnnumber + "]//div")).click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickColumnNameonGridBasedonIndex for the grid " + Gridnumber + " at the column " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickPartialLinkBasedonName(String linknameastext) throws Exception {
		try {
			String FIELDNAME = flow.CaptilizeText(linknameastext);
			String fieldname = linknameastext.toUpperCase();
			String lowercasetext = linknameastext.toLowerCase();
			String fieldnametext = flow.CaptilizeText(lowercasetext);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("sotOui6/ldN4Fu5tjvASUKofnayEcV70ir7NM7iOBXjG8RmGyN6gZX0nA/6lN1y0gFShQhDeEuWEm3dkSCv6neUGzL1Nnb6LYE8C08egpBD4C0OCO9qy37LqvNoi1TcPNzvL7O5XOfof44o0uJoDCPklW2zl1Ic7LXidNRKokUTR3UqD+hM8QwmwlZq0XwVjE1KPZPUNwSJdwrdqmMiiWFbF3XiW48hXFwuQNmIPwW3lserA2OVGyXZ1NeXmchCTSpPQrG4wtVHkV9RyAG/YLPynkL+Wc1QdXu+W7U2S0zcd28CSIFu0SgxV2/IeZ7d7Az7qh4Kpx8pw8QDqRiNI7cAAAHZ7IisbfqUcrDXGOXBkAn/XYVfsqUwMOhu8XTKACYXeqspvB/ErfeefL4FdSRazyZbIn4lHgOFTbdDp6pg=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+linknameastext+\"", linknameastext).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("sotOui6/ldN4Fu5tjvASUKofnayEcV70ir7NM7iOBXjG8RmGyN6gZX0nA/6lN1y0gFShQhDeEuWEm3dkSCv6neUGzL1Nnb6LYE8C08egpBD4C0OCO9qy37LqvNoi1TcPNzvL7O5XOfof44o0uJoDCPklW2zl1Ic7LXidNRKokUTR3UqD+hM8QwmwlZq0XwVjE1KPZPUNwSJdwrdqmMiiWFbF3XiW48hXFwuQNmIPwW3lserA2OVGyXZ1NeXmchCTSpPQrG4wtVHkV9RyAG/YLPynkL+Wc1QdXu+W7U2S0zcd28CSIFu0SgxV2/IeZ7d7Az7qh4Kpx8pw8QDqRiNI7cAAAHZ7IisbfqUcrDXGOXBkAn/XYVfsqUwMOhu8XTKACYXeqspvB/ErfeefL4FdSRazyZbIn4lHgOFTbdDp6pg=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+linknameastext+\"", linknameastext).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickPartialLink for the link name " + linknameastext + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickPartialLinkBasedonNamewithIndex(String linknameastext, int Indexnumber) throws Exception {
		try {
			String FIELDNAME = flow.CaptilizeText(linknameastext);
			String fieldname = linknameastext.toUpperCase();
			String lowercasetext = linknameastext.toLowerCase();
			String fieldnametext = flow.CaptilizeText(lowercasetext);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("PGLYQMf7tF5SzUTVRvSP/RIVqAyDy2URhQggoUsOE5COljv+pLoXx79ANba+VCLTflYUnRTLxhDo7Ftgt+hGtsJYIo7/ePgMIEsHBiZgHCOLuqKmfr10EuDIHunClNHQAwActbRtRPXZNzMEt05PrC7MzxbCVkXMQhS0TIr/pbTSGWOac+s5mnhKlZ+aCdCyuY7iJ/KFNF2iBRDfiYA3wEJpw7JLW4fNy7yE8VdiQ4uqH52shHFe9Iq+zTO4jgV4xvEZhsjeoGV9JwP+pTdctIBUoUIQ3hLlhJt3ZEgr+p3lBsy9TZ2+i2BPAtPHoKQQ+AtDgjvast+y6rzaItU3Dzc7y+zuVzn6H+OKNLiaAwj5JVts5dSHOy14nTUSqJFE0d1Kg/oTPEMJsJWatF8FYyWGKRwKEA9JwK0OI3HjbTQ2c9ULJc3AvneoecX1Linc", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+linknameastext+\"", linknameastext).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber)).replace("\"+FIELDNAME+\"", String.valueOf(FIELDNAME)).replace("\"+fieldname+\"", String.valueOf(fieldname))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("PGLYQMf7tF5SzUTVRvSP/RIVqAyDy2URhQggoUsOE5COljv+pLoXx79ANba+VCLTflYUnRTLxhDo7Ftgt+hGtsJYIo7/ePgMIEsHBiZgHCOLuqKmfr10EuDIHunClNHQAwActbRtRPXZNzMEt05PrC7MzxbCVkXMQhS0TIr/pbTSGWOac+s5mnhKlZ+aCdCyuY7iJ/KFNF2iBRDfiYA3wEJpw7JLW4fNy7yE8VdiQ4uqH52shHFe9Iq+zTO4jgV4xvEZhsjeoGV9JwP+pTdctIBUoUIQ3hLlhJt3ZEgr+p3lBsy9TZ2+i2BPAtPHoKQQ+AtDgjvast+y6rzaItU3Dzc7y+zuVzn6H+OKNLiaAwj5JVts5dSHOy14nTUSqJFE0d1Kg/oTPEMJsJWatF8FYyWGKRwKEA9JwK0OI3HjbTQ2c9ULJc3AvneoecX1Linc", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+linknameastext+\"", linknameastext).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber)).replace("\"+FIELDNAME+\"", String.valueOf(FIELDNAME)).replace("\"+fieldname+\"", String.valueOf(fieldname))));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickPartialLink for the link name " + linknameastext + " at the index " + Indexnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickLinkBasedonName(String linknameastext) throws Exception {
		try {
			//			String FIELDNAME = flow.CaptilizeText(linknameastext);
			//			String fieldname = linknameastext.toUpperCase();
			//			String lowercasetext = linknameastext.toLowerCase();
			//			String fieldnametext = flow.CaptilizeText(lowercasetext);
			String FIELDNAME = linknameastext;
			String fieldname = linknameastext;
			String lowercasetext = linknameastext;
			String fieldnametext = linknameastext;
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("VResFvfd5N3rwax/+O9A4ctIV+eYekMnTSIcdF59qddEsgbcgXWTtgk3e3BYbhJi8FrdfD16yqJ/ep6o8Hv3c11mx1tbluZFFzdn7g+MuFD67DNxqO/N48afMnuj0t3bureBG/RPwNAO/+1h8Cgvy5Ld7blS4568EcV0vg7hQeunW+XzYDFbxs836GPKEznHS8lZ34AOsEojYRp7WKXq5Dgqi46n6huu/nSzbsYsQoS+SOpacP8yLG5ML7s2F414sF6nt1IdZX42CzUIm4G99prSI+X7gmEEJ4W2qMbnh9/H2RuF1JZ7SWsH4FppA2pa", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+linknameastext+\"", linknameastext).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("VResFvfd5N3rwax/+O9A4ctIV+eYekMnTSIcdF59qddEsgbcgXWTtgk3e3BYbhJi8FrdfD16yqJ/ep6o8Hv3c11mx1tbluZFFzdn7g+MuFD67DNxqO/N48afMnuj0t3bureBG/RPwNAO/+1h8Cgvy5Ld7blS4568EcV0vg7hQeunW+XzYDFbxs836GPKEznHS8lZ34AOsEojYRp7WKXq5Dgqi46n6huu/nSzbsYsQoS+SOpacP8yLG5ML7s2F414sF6nt1IdZX42CzUIm4G99prSI+X7gmEEJ4W2qMbnh9/H2RuF1JZ7SWsH4FppA2pa", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+linknameastext+\"", linknameastext).replace("\"+FIELDNAME+\"", FIELDNAME).replace("\"+fieldname+\"", fieldname).replace("\"+fieldnametext+\"", fieldnametext)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickLink for the link name " + linknameastext + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickButtonBasedonIndex(int Indexnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("X66CvkWUNS6ql54i9zSpepKSZN/sdKBKT9aYfXRbTfRmKFGizNcR8QQmiQE8x/9+q3EEHOaLCsEoEJ+alIVElyIrV6YEK1+McEL0W0eDTI7E5DMTN+q/B+/4B9vcbcrsFq+Dv9vXjGnZd0AA4++eYA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("X66CvkWUNS6ql54i9zSpepKSZN/sdKBKT9aYfXRbTfRmKFGizNcR8QQmiQE8x/9+q3EEHOaLCsEoEJ+alIVElyIrV6YEK1+McEL0W0eDTI7E5DMTN+q/B+/4B9vcbcrsFq+Dv9vXjGnZd0AA4++eYA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber))));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickButtonBasedonIndex function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickLinkBasedonIndex(int Indexnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("GjI5944Z5bai6+ySTxrjhB0sG2IXEX4LeqwVh/uqxiGYfPY9BENuiCrOBuqkdzjHgtBNbuP4zLk6DH2mnqqK0w==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("GjI5944Z5bai6+ySTxrjhB0sG2IXEX4LeqwVh/uqxiGYfPY9BENuiCrOBuqkdzjHgtBNbuP4zLk6DH2mnqqK0w==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber))));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickLinkBasedonIndex function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickBoldLinkBasedonIndex(int Indexnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("6TPXBZdxa+4ixOTcTNYhSDafmswtew92kw0FevKQJRk=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("6TPXBZdxa+4ixOTcTNYhSDafmswtew92kw0FevKQJRk=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber))));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickBoldLinkBasedonIndex function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickSpecificColumnValueElementBasedonReferenceID(String RefernceName, int gridnumber, int refencenamecolumnnumber, int targetcolumnnumber) throws Exception {
		try {
			int rownumber = 0;
			List<WebElement> tablelist = owebdriver.findElements(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/oi5ZMfqCS3BS1Cha8lLxtP2ydv93YWRte7KMBox2VPPFJC4lSA2cXgWIjduOa0JnILQTW7j+My5Ogx9pp6qitM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+refencenamecolumnnumber+\"", String.valueOf(refencenamecolumnnumber))));
			for (int i = 1; i <= tablelist.size(); i++) {
				String referencetext = owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/oi5ZMfqCS3BS1Cha8lLxtOG/ptOfrnykeUyafJPOo+tLTFac/9eK0XOES919/XctRsaAyLfnoHyxLQcdepkKyKycSoV/yV8rBU2kZapw0XK", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+i+\"", String.valueOf(i)).replace("\"+refencenamecolumnnumber+\"", String.valueOf(refencenamecolumnnumber)))).getText();
				flow.TurnOffImplicitWaits();
				if (referencetext.equals(RefernceName))
					try {
						WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZEIEsOTZx5lu3gT4TVk9+dr2EdqjyG6InJh9ZhdjrNr8/gPwvicNx9iT1BYml2sbJEE=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+targetcolumnnumber+\"", String.valueOf(targetcolumnnumber)).replace("\"+i+\"", String.valueOf(i))));
						JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
						executor.executeScript("arguments[0].click();", new Object[] { element });
					} catch (Exception e) {
						try {
							WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZEIEsOTZx5lu3gT4TVk9+dr2EdqjyG6InJh9ZhdjrNr8/uBUnxEJKniYW4dD/Y5Eh6U=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+targetcolumnnumber+\"", String.valueOf(targetcolumnnumber)).replace("\"+i+\"", String.valueOf(i))));
							JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
							executor.executeScript("arguments[0].click();", new Object[] { element });
						} catch (Exception e1) {
							flow.TurnOnImplicitWaits();
							String Exception = Throwables.getStackTraceAsString(e);
//							flow.StepFail("ClickSpecificColumnValueElementBasedonReferenceID function error", true);
						} 
						try {
							WebElement element = owebdriver.findElement(By.xpath("(//table)[" + gridnumber + "]//tbody//tr[" + i + "]//td[" + refencenamecolumnnumber + "]//div[@role='group']"));
							JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
							executor.executeScript("arguments[0].click();", new Object[] { element });
						} catch (Exception e1) {
							flow.TurnOnImplicitWaits();
							String Exception = Throwables.getStackTraceAsString(e);
//							flow.StepFail("ClickSpecificColumnValueElementBasedonReferenceID function error", true);
						} 
					}  
			} 
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			flow.TurnOnImplicitWaits();
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickSpecificColumnValueElementBasedonReferenceID function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyTextPresentinUI(String text) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("wjmq7JgPd6teh7+Bnd5aEV9EHowL45LbIpg3MIlQVgc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", text)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("wjmq7JgPd6teh7+Bnd5aEV9EHowL45LbIpg3MIlQVgc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", text))).isDisplayed();
//			flow.StepPassWithoutScreenshot("UI Text is present - " + text);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyTextPresentinUI for the text " + text + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyTextNotPresentinUI(String text) throws Exception {
		try {
			flow.TurnOffImplicitWaits();
			boolean element = false;
			try {
				element = owebdriver.findElement(By.xpath(SingleDropCheckBox("wjmq7JgPd6teh7+Bnd5aEV9EHowL45LbIpg3MIlQVgc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", text))).isDisplayed();
			} catch (Exception e) {
				element = false;
				flow.TurnOnImplicitWaits();
			} 
			if (element) {
//				flow.StepFailWithoutScreenshot("UI Text is present - " + text);
				System.out.println("UI Text is present - " + text);
			} else {
//				flow.StepPassWithoutScreenshot("UI Text is not present - " + text);
				System.out.println("UI Text is not present - " + text);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyTextNotPresentinUI for the text " + text + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyPartialTextPresentinUI(String text) throws Exception {
		try {
			flow.Timeout(2000L);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("VsXdeJbjyFcXC5A2Yg/BbSZ5ZzocxYwmby+NzWbSsytflvat2MJjjxegxV/QUCl3", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", text))).isDisplayed();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyPartialTextPresentinUI for the partial text " + text + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyButtonName(String buttonname) throws Exception {
		try {
			String lowercaseletter = buttonname.toLowerCase();
			String BUTTONTEXT = flow.CaptilizeText(lowercaseletter);
			flow.Timeout(2000L);
	        owebdriver.findElement(By.xpath(SingleDropCheckBox("UzydxljBvlZWF7JXakmNbHwJujo3aWcr2nabIvVB2VrAW6N3ECy50rHNjjwDOzyhyABMgFslSCPYiWLnsigoXo9nxamATPsAVFv++15T07o=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+BUTTONTEXT+\"", BUTTONTEXT).replace("\"+buttonname+\"", buttonname))).isDisplayed();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyButtonName for the button " + buttonname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyUIFieldElements(String fieldname, String inputvalue) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(".//div//*[text()='" + fieldname + "' and contains(@class,'FieldLayout---field_label')]//following::p[1]|.//div//*[text()='" + fieldname + "' and contains(@class,'FieldLayout---field_label')]//following::p[1]//a"));
			String element = new String();
			element = owebdriver.findElement(By.xpath(".//div//*[text()='" + fieldname + "' and contains(@class,'FieldLayout---field_label')]//following::p[1]|.//div//*[text()='" + fieldname + "' and contains(@class,'FieldLayout---field_label')]//following::p[1]//a")).getText();
			if (element.equals(inputvalue)) {
//				flow.StepPassWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(fieldname))) + " Matched with the input value and the value present in UI - " + element);
				System.out.println(String.valueOf(String.valueOf(String.valueOf(fieldname))) + " Matched with the input value and the value present in UI - " + element);
			} else {
//				flow.StepFailWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(fieldname))) + " Mismatched with the input value and the value present in UI - " + element);
				System.out.println(String.valueOf(String.valueOf(String.valueOf(fieldname))) + " Mismatched with the input value and the value present in UI - " + element);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyUIFieldElements for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyMouseHoverValuefromICONBasedonIndex(int Index, String inputvalue) throws Exception {
		try {
			WebElement Icon = owebdriver.findElement(By.xpath(SingleDropCheckBox("3QflKAGL0NMNHOOr2WVFJ1gDS8BVGvFq7sUgNIvgJwj054YdCrjMNBQ/vWGSnICWX5b2rdjCY48XoMVf0FApdw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Index+\"", String.valueOf(Index))));
			WebElement tooltiptext = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aBtaRvNYPd3/ZtnjRQSD3V8DcjuP5UUt7DKWGZ15BG6BHMSQGLKt+aXZwey63VnkmITwkCQjWNgZEs8eAYRbOxPSuHy41EDemE3635L08PbZ56+JNpsCoblOHLSxVOAADeIxE6Fr91+UaoL98j+f2B3llkSHBxB7JFxEvPt3M0Yf", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Index+\"", String.valueOf(Index))));
			Actions action = new Actions(owebdriver);
			action.moveToElement(Icon).build().perform();
			String OutputText = tooltiptext.getText();
			System.out.println(OutputText);
			if (OutputText.isEmpty()) {
				OutputText = tooltiptext.getAttribute("aria-label");
				if (OutputText.contains(";")) {
					String[] output = OutputText.split(";");
					OutputText = output[0];
				} 
				if (OutputText.equals(inputvalue)) {
//					flow.StepPassWithoutScreenshot("MouseHover value matched and the value from the icon - " + OutputText);
					System.out.println("MouseHover value matched and the value from the icon - " + OutputText);
				} else {
//					flow.StepFailWithoutScreenshot("MouseHover value mismatched and the value from the icon - " + OutputText);
					System.out.println("MouseHover value mismatched and the value from the icon - " + OutputText);
				} 
			} else if (OutputText.equals(inputvalue)) {
//				flow.StepPassWithoutScreenshot("MouseHover value matched and the value from the icon - " + OutputText);
				System.out.println("MouseHover value matched and the value from the icon - " + OutputText);
			} else {
//				flow.StepFailWithoutScreenshot("MouseHover value mismatched and the value from the icon - " + OutputText);
				System.out.println("MouseHover value mismatched and the value from the icon - " + OutputText);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyMouseHoverValuefromICONBasedonIndex function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyValueFromtheStarIcon(int Gridnumber, int rownumber, int columnnumber, String expectedvalue) throws Exception {
		try {
			List<WebElement> value = owebdriver.findElements(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtOG2YNfkaJJ9FY/8w4fvmDzYMC+Mx9h1hW6eJphXw9+QU6ZuIcz4oOxc/SWp8DkSk5miCry+Bq0URiamzyBGtX4AOvUhZrfs73DIhVayA6iETA6l53psgWg8udKYPWiKcA=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
			List<String> scorevalue = new ArrayList<>();
			for (WebElement VALUE : value) {
				String Scorevalue = VALUE.getAttribute("d");
				String[] SCORE = Scorevalue.split(" ");
				if (SCORE[0].equals("M1664"))
					scorevalue.add("1"); 
				if (SCORE[0].equals("M1186"))
					scorevalue.add("0.5"); 
				if (SCORE[0].equals("M1137"))
					scorevalue.add("0"); 
			} 
			float finalscorevalue = 0.0F;
			for (int i = 0; i < scorevalue.size(); i++)
				finalscorevalue += Float.parseFloat(scorevalue.get(i)); 
			if (expectedvalue.equals(Float.toString(finalscorevalue))) {
//				flow.StepPass(String.valueOf(String.valueOf(finalscorevalue)) + " - Score value matches with the input value - " + expectedvalue, false);
				System.out.println(String.valueOf(String.valueOf(finalscorevalue)) + " - Score value matches with the input value - " + expectedvalue);
			} else {
//				flow.StepFail(String.valueOf(String.valueOf(finalscorevalue)) + " - Score value mismatches with the input value - " + expectedvalue, false);
				System.out.println(String.valueOf(String.valueOf(finalscorevalue)) + " - Score value mismatches with the input value - " + expectedvalue);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyValueFromtheStarIcon function error", true);
			e.printStackTrace();
		} 
	}

	public void ValidateToolTipText(String fieldLabelName, String inputvalue) throws Exception {
		try {
			WebElement tooltiptext = owebdriver.findElement(By.xpath(SingleDropCheckBox("+iicF+u0VbNGl9aNKCIf1CUgeeyGpTb8mpAjJA8ZjZ84iC14D+0IPhYaikcZK0ju", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldLabelName+\"", fieldLabelName)));
			String tooltipExpectedText = tooltiptext.getAttribute("aria-label");
//			String tooltipExpectedText1=tooltiptext.getText();
			System.out.println(tooltipExpectedText);
//			System.out.println(tooltipExpectedText1);
			flow.Timeout(2000L);
			if (tooltipExpectedText.equalsIgnoreCase(inputvalue)) {
//				StepPassWithoutScreenshot("Tooltip matching expected value: " + tooltipExpectedText);
				System.out.println("Tooltip matching expected value: " + tooltipExpectedText);
			} else {
//				flow.StepFail("Tooltip NOT matching error", true);
				System.out.println("Tooltip NOT matching error");
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ValidateToolTipText for the fieldname " + fieldLabelName + " is throwing function error", true);
			System.out.println("ValidateToolTipText for the fieldname " + fieldLabelName + " is throwing function error");
			e.printStackTrace();
		} 
	}


	public String GetDateandTimewithSeconds() throws Exception {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh-mm-ss aa");
			Date date = new Date();
			String datetimeseconds = formatter.format(date);
			return datetimeseconds;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			return null;
		} 
	}

	public void Refresh() throws Exception {
		try {
			owebdriver.navigate().refresh();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("Refresh function error", true);
			e.printStackTrace();
		} 
	}

	public String GetDateandTime() throws Exception {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm aa");
			Date date = new Date();
			String dataandtime = formatter.format(date);
			return dataandtime;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			return null;
		} 
	}

	public String GetCurrentDate() throws Exception {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			String Date = formatter.format(date);
			return Date;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			return null;
		} 
	}

	public String GetPastDate() throws Exception {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(6, -1);
			Date previousDate = calendar.getTime();
			String Date = formatter.format(previousDate);
			return Date;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			return null;
		} 
	}

	public String GetFutureDate() throws Exception {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(6, 1);
			Date previousDate = calendar.getTime();
			String Date = formatter.format(previousDate);
			return Date;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			return null;
		} 
	}

	public String GetFutureDateBasedonInputValue(int value) throws Exception {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(6, value);
			Date previousDate = calendar.getTime();
			String Date = formatter.format(previousDate);
			return Date;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			return null;
		} 
	}

	public String GetPastDateBasedonInputValue(int value) throws Exception {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(6, -value);
			Date previousDate = calendar.getTime();
			String Date = formatter.format(previousDate);
			return Date;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			return null;
		} 
	}

	public String GetBusinessDay() throws Exception {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			String dataandtime = formatter.format(date);
			Calendar check = Calendar.getInstance();
			check.setTime(date);
			if (check.get(7) == 7) {
				check.add(6, -1);
				Date Date = check.getTime();
				String updateddate = formatter.format(Date);
				return updateddate;
			} 
			if (check.get(7) == 1) {
				check.add(6, 1);
				Date Date = check.getTime();
				String updateddate = formatter.format(Date);
				return updateddate;
			} 
			return dataandtime;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			return null;
		} 
	}

	public void GetLatestFilefromDownloadDirectory() throws Exception {
		try {
			String username = System.getProperty("user.name");
			flow.Timeout(1000L);
			String dirpath = "C:\\Users\\" + username + "\\Downloads\\";
			File dir = new File(dirpath);
			File[] files = dir.listFiles();
			if (files == null || files.length == 0)
//				return null; 
				System.out.println("No Files");
			File lastModifiedFile = files[0];
			for (int i = 1; i < files.length; i++) {
				if (lastModifiedFile.lastModified() < files[i].lastModified())
					lastModifiedFile = files[i]; 
			} 
//			return lastModifiedFile.toString();
			System.out.println(lastModifiedFile.toString());
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
//			return null;
		} 
	}

	public String GetLatestFilefromDirectory(String directory) throws Exception {
		try {
			File dir = new File(directory);
			File[] files = dir.listFiles();
			if (files == null || files.length == 0)
				return null; 
			File lastModifiedFile = files[0];
			for (int i = 1; i < files.length; i++) {
				if (lastModifiedFile.lastModified() < files[i].lastModified())
					lastModifiedFile = files[i]; 
			} 
			return lastModifiedFile.toString();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			return null;
		} 
	}

	public String[] SortMultipleString(String[] text) throws IOException {
		try {
			for (int i = 0; i < text.length; i++) {
				for (int j = i + 1; j < text.length; j++) {
					if (text[i].compareTo(text[j]) > 0) {
						String temp = text[i];
						text[i] = text[j];
						text[j] = temp;
					} 
				} 
			} 
			return text;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			return null;
		} 
	}

	public void Assertion(String Actual, String Expected, String passmessage, String failmessage) throws Exception {
		try {
			Assert.assertEquals(Actual, Expected);
//			flow.StepPassWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(passmessage))) + Actual);
			System.out.println(String.valueOf(String.valueOf(String.valueOf(passmessage))) + Actual);
		} catch (AssertionError e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("Assertion Error - " + Actual + " mismatch with " + Expected, true);
			e.printStackTrace();
		} 
	}

	public void ExplicitWait(By variable) throws Exception {
		try {
//			System.out.println(variable);
			boolean checkcondition = false;
			try {
				WebDriverWait wait = new WebDriverWait(owebdriver, 20L);
				wait.until((Function)ExpectedConditions.visibilityOfElementLocated(variable));
//				System.out.println(owebdriver.findElement(By.xpath(String.valueOf(variable))).isDisplayed());
				checkcondition = true;
			} catch (Exception e) {
				checkcondition = false;
			} 
			if (checkcondition = false) {
				flow.WaitforProgressBar();
				WebDriverWait wait = new WebDriverWait(owebdriver, 20L);
				wait.until((Function)ExpectedConditions.visibilityOfElementLocated(variable));
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ExplicitWait function error", true);
			e.printStackTrace();
		} 
	}

	public void ExplicitWaitToBeClickable(By variable) throws Exception {
		try {
			boolean checkcondition = false;
			try {
				WebDriverWait wait = new WebDriverWait(owebdriver, 20L);
				wait.until((Function)ExpectedConditions.elementToBeClickable(variable));
				checkcondition = true;
			} catch (Exception e) {
				checkcondition = false;
			} 
			if (checkcondition = false) {
				flow.WaitforProgressBar();
				WebDriverWait wait = new WebDriverWait(owebdriver, 20L);
				wait.until((Function)ExpectedConditions.elementToBeClickable(variable));
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ExplicitWait function error", true);
			e.printStackTrace();
		} 
	}

	public void ExplicitWaitforSpecificText(String text) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(owebdriver, 20L);
			wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath(SingleDropCheckBox("wjmq7JgPd6teh7+Bnd5aEV9EHowL45LbIpg3MIlQVgc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", text))));
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ExplicitWaitforSomeSpecificText function error", true);
			e.printStackTrace();
		} 
	}

	public void ExplicitWaitforPartialText(String text) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(owebdriver, 20L);
			wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath(SingleDropCheckBox("VsXdeJbjyFcXC5A2Yg/BbSZ5ZzocxYwmby+NzWbSsytflvat2MJjjxegxV/QUCl3", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", text))));
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ExplicitWaitforPartialText function error", true);
			e.printStackTrace();
		} 
	}

	public void EnterKey(String fieldname) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8pr3YU4q0zWXI1nEDeg49guh3zfaazL6aC2haRhw9rpfFRyrFT5O83ggWWkIzvKe25lE4wK558/hgu0oXiJI7CszPk3SJXYkMtW2rzrQCQofyKOlw2xBiAdIRUnjaB309YOWse77tVVXuQmMqnawQfo6Z5kXq/mQvVqXFfXhM6JPY6832msy+mgtoWkYcPa6XxUcqxU+TvN4IFlpCM7yntuZROMCuefP4YLtKF4iSOwrMz5N0iV2JDLVtq860AkKH8ijpcNsQYgHSEVJ42gd9PWDlrHu+7VVV7kJjKp2sEH6Omx2RiYuaeiQIu0g4iqTAdjA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8pr3YU4q0zWXI1nEDeg49guh3zfaazL6aC2haRhw9rpfFRyrFT5O83ggWWkIzvKe25lE4wK558/hgu0oXiJI7CszPk3SJXYkMtW2rzrQCQofyKOlw2xBiAdIRUnjaB309YOWse77tVVXuQmMqnawQfo6Z5kXq/mQvVqXFfXhM6JPY6832msy+mgtoWkYcPa6XxUcqxU+TvN4IFlpCM7yntuZROMCuefP4YLtKF4iSOwrMz5N0iV2JDLVtq860AkKH8ijpcNsQYgHSEVJ42gd9PWDlrHu+7VVV7kJjKp2sEH6Omx2RiYuaeiQIu0g4iqTAdjA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("EnterKey for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public WebElement RetrieveWebElement(By variable) throws Exception {
		try {
			flow.ExplicitWait(variable);
			WebElement element = owebdriver.findElement(variable);
			return element;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("RetrieveWebElement function error", true);
			e.printStackTrace();
			return null;
		} 
	}

	public List<WebElement> RetrieveWebElementList(By variable) throws Exception {
		try {
			flow.ExplicitWait(variable);
			List<WebElement> element = owebdriver.findElements(variable);
			return element;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("RetrieveWebElementList function error", true);
			e.printStackTrace();
			return null;
		} 
	}

	public WebElement RetrieveSpanWebElement(By variable) throws Exception {
		try {
			WebElement element = owebdriver.findElement(variable);
			return element;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("RetrieveSpanWebElement function error", true);
			e.printStackTrace();
			return null;
		} 
	}

	public List<WebElement> RetrieveSpanWebElementList(By variable) throws Exception {
		try {
			List<WebElement> element = owebdriver.findElements(variable);
			return element;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("RetrieveSpanWebElementList function error", true);
			e.printStackTrace();
			return null;
		} 
	}

	public boolean CheckWebElement(By variable) throws Exception {
		try {
			flow.ExplicitWait(variable);
			boolean value = owebdriver.findElement(variable).isDisplayed();
			return value;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("CheckWebElement function error", true);
			e.printStackTrace();
			return false;
		} 
	}

	public void TurnOffImplicitWaits() {
		owebdriver.manage().timeouts().implicitlyWait(0L, TimeUnit.SECONDS);
	}

	public void TurnOnImplicitWaits() {
		owebdriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
	}

	public void Timeout(long timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}

	public boolean CheckforValidDate(String dateToValidate) throws Exception {
		if (dateToValidate == null) {
//			flow.StepFailWithoutScreenshot("Date is null");
			System.out.println("Date is null");
			boolean result = false;
			return result;
		} 
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(false);
		try {
			Date date = sdf.parse(dateToValidate);
			boolean result = true;
			return result;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
			boolean result = false;
			return result;
		} 
	}

	public String CaptilizeText(String Text) throws Exception {
		try {
			String outputtext = new String();
			String TEXT = Text.toLowerCase();
			String[] captialletter = TEXT.split(" ");
			String[] output = new String[captialletter.length];
			for (int i = 0; i < captialletter.length; i++)
				output[i] = String.valueOf(String.valueOf(String.valueOf(captialletter[i].substring(0, 1).toUpperCase()))) + captialletter[i].substring(1); 
			byte b;
			int j;
			String[] arrayOfString1;
			for (j = (arrayOfString1 = output).length, b = 0; b < j; ) {
				String Output = arrayOfString1[b];
				outputtext = String.valueOf(String.valueOf(String.valueOf(outputtext))) + Output + " ";
				b = (byte)(b + 1);
			} 
			String result = outputtext.trim();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}

	public void Logout() throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("jdQuwyylYprBsObFieTZvN9x8HHMbtAgub57es827zlGRsA8RRWerCbcXS0nxvDY", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("jdQuwyylYprBsObFieTZvN9x8HHMbtAgub57es827zlGRsA8RRWerCbcXS0nxvDY", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
			flow.Timeout(1000);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("OB4LOSeaS81E60Ve9af1zFHoK52cOnsOVWYoFJZKLr7V55GpSzICGUWqZZH6/lkE1+kPw3OXtpjliWnGTv72e1UZz4yaRJhg28gVR1kdbBn5E7xwyrbBcFdkZ9pVO520", this.FF23242524354dfdgdgdgsdfsdfd5)));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("OB4LOSeaS81E60Ve9af1zFHoK52cOnsOVWYoFJZKLr7V55GpSzICGUWqZZH6/lkE1+kPw3OXtpjliWnGTv72e1UZz4yaRJhg28gVR1kdbBn5E7xwyrbBcFdkZ9pVO520", this.FF23242524354dfdgdgdgsdfsdfd5)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("Logout function error", true);
			e.printStackTrace();
		} 
	}

	public void LoginwithUserNameandPassword(String username, String password) throws Exception {
		try {
			owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.usernamexpath, this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { username });
			owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.passwordxpath, this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { password });
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.submitxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("LoginwithUserNameandPassword function error", true);
			e.printStackTrace();
		} 
	}

	public void RefreshFilterClick() throws Exception {
		try {
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.refreshfilterxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("RefreshFilterClick function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyDatefieldErrorValidation(String Date, String Fieldname) throws Exception {
		try {
			flow.SetDateforDateField(Fieldname, Date);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("WQhyIoec4VvDC1mYzwFc2VqBlqJeAmA7r/60SodpH7gxO2dsx/MOgy5IeJYp3pHVVfOoryTTmiQCTy3OcBVEU+gN03ks0susfBsAPAftYUHC0fyqZ0yN2NuDA/DEe9a8UfV+9OELqrM8+ejfZ8Nrnw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Date+\"", Date))).sendKeys(Keys.TAB);
			flow.WaitforProgressBar();
			boolean element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM02dCfiu4c/QZR72S5nEGpq+8FxMHvRjxA3Tz29FIMkSJczdaBF2C8nlVN4voxrmyws2CUvUrN/u8nE6q22yCAcLqr+YqYpEgHys6nldL/DY", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Fieldname+\"", Fieldname))).isDisplayed();
			if (element) {
				String text = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM02dCfiu4c/QZR72S5nEGpq+8FxMHvRjxA3Tz29FIMkSJczdaBF2C8nlVN4voxrmyws2CUvUrN/u8nE6q22yCAcLqr+YqYpEgHys6nldL/DY", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Fieldname+\"", Fieldname))).getText();
//				flow.StepPassWithoutScreenshot("Date Field error is thrown - " + text);
				System.out.println("Date Field error is thrown - " + text);
			} else {
//				flow.StepFail("Date Field error is not thrown", true);
				System.out.println("Date Field error is not thrown");
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyDatefieldErrorValidation for the Fieldname " + Fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyDatefieldErrorValidationBasedonIndex(String Date, int Indexnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("EHiIPJTxDfS/+gtC9x1zBc+V5C8zvvx1POSRNVGQ25qAkAmnL7RwHQ0DRfVoKKO6YYCI306fOdrVeW7XAF6AEA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber))));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("EHiIPJTxDfS/+gtC9x1zBc+V5C8zvvx1POSRNVGQ25qAkAmnL7RwHQ0DRfVoKKO6YYCI306fOdrVeW7XAF6AEA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber)))).sendKeys(new CharSequence[] { Date });
			owebdriver.findElement(By.xpath(SingleDropCheckBox("EHiIPJTxDfS/+gtC9x1zBc+V5C8zvvx1POSRNVGQ25qAkAmnL7RwHQ0DRfVoKKO6YYCI306fOdrVeW7XAF6AEA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber)))).sendKeys(new CharSequence[] { (CharSequence)Keys.TAB });
			owebdriver.findElement(By.xpath(SingleDropCheckBox("WQhyIoec4VvDC1mYzwFc2VqBlqJeAmA7r/60SodpH7gxO2dsx/MOgy5IeJYp3pHVVfOoryTTmiQCTy3OcBVEU+gN03ks0susfBsAPAftYUHC0fyqZ0yN2NuDA/DEe9a8UfV+9OELqrM8+ejfZ8Nrnw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Date+\"", Date))).sendKeys(Keys.TAB);
			flow.WaitforProgressBar();
			boolean element = owebdriver.findElement(By.xpath(SingleDropCheckBox("XuKIhgMvZx2ahS+AA3lkuWqIBfQhrBuCmKHwKBNxf2z2mIkApWpeE6hTOQpLcDlH8+u5+5wHtfByxOoI2AV0KqflbC5jAtewegsEv9MkpzEDm8zDzzKN/DhwnYOIWnUjbUnEyqxP35FUPOnjA+9psEue/0r2gvQp51WhQAb5110=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber)))).isDisplayed();
			if (element) {
				String text = owebdriver.findElement(By.xpath(SingleDropCheckBox("XuKIhgMvZx2ahS+AA3lkuWqIBfQhrBuCmKHwKBNxf2z2mIkApWpeE6hTOQpLcDlH8+u5+5wHtfByxOoI2AV0KqflbC5jAtewegsEv9MkpzEDm8zDzzKN/DhwnYOIWnUjbUnEyqxP35FUPOnjA+9psEue/0r2gvQp51WhQAb5110=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber)))).getText();
//				flow.StepPassWithoutScreenshot("Date Field error is thrown - " + text);
				System.out.println("Date Field error is thrown - " + text);
			} else {
//				flow.StepFail("Date Field error is not thrown", true);
				System.out.println("Date Field error is not thrown");
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyDatefieldErrorValidationBasedonIndex function error", true);
			e.printStackTrace();
		} 
	}

	public void ExportToExcelClick() throws Exception {
		try {
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.exporttoexcelxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ExportToExcelClick function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickClearFilter() throws Exception {
		try {
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.clearfilterxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickClearFilter function error", true);
			e.printStackTrace();
		} 
	}

	public void VisibilityCheckforBasicUser() throws Exception {
		try {
			boolean rejectbutton = flow.CheckWebElement(By.xpath(SingleDropCheckBox(Constants.rejectbuttonxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
			boolean reassignbutton = flow.CheckWebElement(By.xpath(SingleDropCheckBox(Constants.reassignbuttonxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
			if (reassignbutton) {
//				StepFail("Reassignbutton_visible", true);
				System.out.println("Reassignbutton_visible");
			} else {
//				StepPassWithoutScreenshot("Reassign button is not visible");
				System.out.println("Reassign button is not visible");
			} 
			if (rejectbutton) {
//				StepFail("Rejectbutton_visible", true);
				System.out.println("Rejectbutton_visible");
			} else {
//				StepPassWithoutScreenshot("Reject button is not visible");
				System.out.println("Reject button is not visible");
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VisibilityCheckforBasicUser function error", true);
			e.printStackTrace();
		} 
	}

	public void ClearFilterCheckforTextField(String fieldname) throws Exception {
		try {
			WebElement Element = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.clearfilterxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
			Element.click();
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8prwtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
			String tText = element.getText();
			if (tText.isEmpty()) {
//				StepPassWithoutScreenshot("Filter has been cleared properly");
				System.out.println("Filter has been cleared properly");
			} else {
//				flow.StepFail("Filter has not been cleared properly", true);
				System.out.println("Filter has not been cleared properly");
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearFilterCheckforTextField for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void DateFilterValidation(String Gridnumber, String Columnnumber, String FirstFiltername, String SecondFiltername, String FromDate, String ToDate) throws Exception {
		try {
			flow.ClearField(FirstFiltername);
			flow.ClearField(SecondFiltername);
			flow.SetDateforDateField(FirstFiltername, FromDate);
			flow.SetDateforDateField(SecondFiltername, ToDate);
			flow.Timeout(2000L);
			flow.WaitforProgressBar();
			LocalDate Parseddate=null;
			String[] DATE1 = FromDate.split("/");
			String FROMDATE = String.valueOf(String.valueOf(String.valueOf(DATE1[2]))) + "-" + DATE1[1] + "-" + DATE1[0];
			String[] DATE2 = ToDate.split("/");
			String TODATE = String.valueOf(String.valueOf(String.valueOf(DATE2[2]))) + "-" + DATE2[1] + "-" + DATE2[0];
			LocalDate startDate = LocalDate.parse(FROMDATE);
			LocalDate endDate = LocalDate.parse(TODATE);
//			SimpleDateFormat Format=new SimpleDateFormat("yyyy-dd-mm");
			int days = Days.daysBetween((ReadablePartial)startDate,(ReadablePartial)endDate).getDays();
//			days = (days > 0) ? days : 0;  
			List<LocalDate> dates = new ArrayList<>(days);
			String[] Month= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			String[] Monthint= {"01","02","03","04","05","06","07","08","09","10","11","12"};
	
			for (int i = 0; i < days; i++) {
				LocalDate d = startDate.withFieldAdded(DurationFieldType.days(), i);
				dates.add(d);
			}  
			HashMap<String,String> Mon=new HashMap<String,String>();
			for(int j=0;j<Month.length;j++)
			{
				Mon.put(Month[j], Monthint[j]);
			}
			
			List<WebElement> Datecolumn = flow.RetrieveWebElementList(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtOmp7b2qrnrgFe6fTEr8JnwuUXs+jZROF21IF5rF89D7z6ZboyqFgyG826yErMluqlgKvnPnHwDi7cnK9B75n4NqSR6LHbfnVFOdNZvPCs9YciCseEo/HxSl1/WcPM8ZBJpy/c+tFU493X2S+61Bvwe", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", Gridnumber).replace("\"+Columnnumber+\"", Columnnumber)));
			System.out.println(Datecolumn.size());
			String[] DateValues = new String[Datecolumn.size()];
			int k = 0;
			for (int l=1;l<Datecolumn.size()+1;l++) 
			{
				System.out.println(l);
				WebElement date=owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtMbHfkCDC63mfj3VGvVmsKOtRbj0ze4751xLwcMgCUFwzQAqtxbFblewZigCkVOXIgASKZs/Jtxe46PhrxuVjaOjDEu8hszfgnVQBs2fbub6YbRjqlQ1Mage9xwkVLf0bEb3d0JWRpxrklzsyknHXspSwSXLVQ8AcDdZg7c7AvTtw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", Gridnumber).replace("\"+Columnnumber+\"", Columnnumber).replace("\"+l+\"", String.valueOf(l))));
			    System.out.println(date);
				DateValues[k] = date.getText();
				System.out.println(DateValues[k]);
				boolean datetype=Mon.containsKey(DateValues[k].substring(3, 6));
				int val=BooleanUtils.toInteger(datetype);
			if(val==1)
			{
					String[] FilterdDate= DateValues[k].split(" ");
					String value=Mon.get(FilterdDate[1]);
					System.out.println(value);
					String value1=FilterdDate[1].replace(FilterdDate[1], value);
					System.out.println(value1);
					String Finaldate=FilterdDate[2]+"-"+FilterdDate[0]+"-"+value1;
					System.out.println(Finaldate);
					LocalDate parsedate=LocalDate.parse(Finaldate);
					System.out.println(parsedate);
			}
			else
				
			    {
					System.out.println(DateValues[k]);
					String[] FilterdDate1= DateValues[k].split("/");
					Parseddate=LocalDate.parse(FilterdDate1[2]+"-"+FilterdDate1[1]+"-"+FilterdDate1[0]);
	                System.out.println(Parseddate);
				}
			
				if(dates.contains(Parseddate))
				{
					System.out.println(String.valueOf(String.valueOf(String.valueOf(DateValues[k]))) + " Date comes up with filter");
				}
				else
				{
					System.out.println(String.valueOf(String.valueOf(String.valueOf(DateValues[k]))) + " Date doesnot comes up with filter");
				}
				k++;
			} 
			
//			
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("DateFilterValidation function error", true);
			e.printStackTrace();
		} 
	}

	public void SingleFilterValidation() throws Exception {
		try {
			boolean firstcheckinputbox = false;
			boolean firstcheckinputboxpicker = false;
			boolean firstdropdownbox = false;
			boolean firstmultiselectdropdownbox = false;
			boolean firstfilteroutputcheck = true;
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("N8Tu5GGN76CooSoCNtNS4A==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			String value=owebdriver.findElement(By.xpath(SingleDropCheckBox("XdhDqCbDqiQOjOVkJB6dVA==",this.FF23242524354dfdgdgdgsdfsdfd5))).getAttribute("abbr");
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("uRMXUmBQx0n5lwdzUNQvXSMIPfooj/BUWUOUhr9XqHxzft+1EQe6sm+1Xvnjc6iGX5b2rdjCY48XoMVf0FApdw==", this.FF23242524354dfdgdgdgsdfsdfd5))).getText();
			System.out.println(value);
			try {
				flow.TurnOffImplicitWaits();
				System.out.println(owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+Ow1fFVV98faqUVdLhKHEpCnJr4g/VziDA7GrY/7ggKBw48poXkLPnZ62MeASPiK6n2JDgu7zeh2iBpNuFTV2iYeMkkVcvj32DolekvWWaS917Lfhd66tX15PQ9RntG/1Net8d2GK1mq6+2VrXxqRG25PnbxwXOsRsPDU2B2F0WjLwYj8ettAq1NxLIFj/UmIg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+value+\"", value))));
				firstcheckinputbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+Ow1fFVV98faqUVdLhKHEpCnJr4g/VziDA7GrY/7ggKBw48poXkLPnZ62MeASPiK6n2JDgu7zeh2iBpNuFTV2iYeMkkVcvj32DolekvWWaS917Lfhd66tX15PQ9RntG/1Net8d2GK1mq6+2VrXxqRG25PnbxwXOsRsPDU2B2F0WjLwYj8ettAq1NxLIFj/UmIg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+value+\"", value))).isDisplayed();
				System.out.println(firstcheckinputbox);
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstcheckinputbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstcheckinputboxpicker = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjMwKCtBwlyFlYEN1e7mnlqH9AM5Th2dkVnMtObynLbcii4r2OHV2KYWnhE5izBkmHqnBi3tHce/Cw78XxFtrxpaERlnohVLD99cXarzyNZvFC", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+value+\"", value))).isDisplayed();
				System.out.println(firstcheckinputboxpicker);
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstcheckinputboxpicker = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstdropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+Ow1fFVV98faqUVdLhKHEpCnJr4g/VziDA7GrY/7ggKBzIVo9CQxDrNbP7+UzFqkxQ4p9vxTi4598YBd8IpG3+cL8KfU92hpcyab81pBler2n0em1JO+eQSD/8edW88zV/d7Hjr55uloVg0Td429RtlvaZuKQuexWO4u1D7gG1d/YDLaA4bNuPCn2S2pGscsn7JkvEyw8yWNVPFHyLFCfyzBIaXSUs+l/YLMvTlrqNcGm0q9A+aFydQDqm4aYqpfjY3Ci3z2WxVmhinqwiHrIaY3zWcAV4UHTK5L+reV+Alp0O3snTyJVybgfwXhtmsYs4vc2jbkvNtzCakXDMbpUyc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+value+\"", value))).isDisplayed();
				System.out.println(firstdropdownbox);
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstdropdownbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstmultiselectdropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+Ow1fFVV98faqUVdLhKHEpCnJr4g/VziDA7GrY/7ggKBlfaNzPIfODcTZ8+tLlGeYcXEwRrzPVlhkfNY/uj+2bJ4YVpp04C4ONabPCgPNS9Tyi6AWKAOtOcMp6vsoJQwoknWEUH5h9iUcLT9Hm1+nw1gMtoDhs248KfZLakaxyyfsmS8TLDzJY1U8UfIsUJ/LMEhpdJSz6X9gsy9OWuo1wYxCAYZEjDRToshLJJ9qTghBcP/2llnEuQyheXpElgQWMbpP4YOidOyxBye4cb/iIIAir0pFv2Nfi0u41PAva0y", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+value+\"", value))).isDisplayed();
				System.out.println(firstmultiselectdropdownbox);
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstmultiselectdropdownbox = false;
			} 
			if (firstcheckinputbox) {
				System.out.println("No");
				flow.SetWebText(filtertext, value);
				flow.EnterKey(value);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstcheckinputboxpicker) {
				System.out.println("Yes");
				flow.SelectValuefromPicker(filtertext, value);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstdropdownbox) {
				flow.SingleSelectDropDown(filtertext, value);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstmultiselectdropdownbox) {
				flow.MultiSelectDropDown(value, filtertext);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else {
				firstfilteroutputcheck = false;
//				flow.StepFailWithoutScreenshot("First Filter is not selected");
				System.out.println("First Filter is not selected");
			} 
			flow.WaitforProgressBar();
			if (firstfilteroutputcheck) {
				flow.Timeout(4000L);
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i0H6Brd1PDztvMaku1r3SBAMwjNFjNm8Lyj0cs3lWsTULaZjxnnN1icLyV3voGmaag==", this.FF23242524354dfdgdgdgsdfsdfd5)));
				List<WebElement> result = RetrieveWebElementList(
						By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i0H6Brd1PDztvMaku1r3SBAMwjNFjNm8Lyj0cs3lWsTULaZjxnnN1icLyV3voGmaag==", this.FF23242524354dfdgdgdgsdfsdfd5)));
				String[] Result = new String[result.size()];
				for (int i = 0; i < result.size(); i++) {
					Result[i] = ((WebElement)result.get(i)).getText();
					if (Result[i].equalsIgnoreCase(filtertext)) {
//						flow.StepPassWithoutScreenshot("Filter is working properly for the filter " + value + " - " + Result[i]);
						System.out.println("Filter is working properly for the filter " + value + " - " + Result[i]);
					} else {
//						flow.StepFail("Filter is not working properly for the filter " + value + " - " + Result[i], true);
						System.out.println("Filter is not working properly for the filter " + value + " - " + Result[i]);
					} 
				} 
			} else {
//				flow.StepFail("Since first filter is not selected we can't able to verify the value ", true);
				System.out.println("Since first filter is not selected we can't able to verify the value ");
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SingleFilterValidation function error", true);
			e.printStackTrace();
		} 
	}

	public void SingleFilterValidationWithColumnandFilterName(String ColumnName, String Filtername) throws Exception {
		try {
			boolean firstcheckinputbox = false;
			boolean firstcheckinputboxpicker = false;
			boolean firstdropdownbox = false;
			boolean firstmultiselectdropdownbox = false;
			boolean firstfilteroutputcheck = true;
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("ZhlJpeU/AGPEsJJfpc02fg==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			int firstcolumnnumber = 0;
			List<WebElement> columnlist = flow.RetrieveWebElementList(By.xpath(SingleDropCheckBox("zMIyS8T8mbrRJLqmZMU+rg==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			for (WebElement text : columnlist) {
				firstcolumnnumber++;
				System.out.println(firstcolumnnumber);
				System.out.println(text.getText());
				String[] Text1=text.getText().split(Pattern.quote("Sortable"));
				System.out.println(Text1[0]);
				if (Text1[0].equalsIgnoreCase(ColumnName))
				{
					System.out.println("Yes");
					break; 
				}
			} 
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("1RL1aqlQQNgZo0sWBvFBHbuT0EpZFDbJyBl42fhDs7YmeBVezz3ua3WGCJxFrg4j", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+firstcolumnnumber+\"", String.valueOf(firstcolumnnumber))));
			WebElement XP=owebdriver.findElement(By.xpath(SingleDropCheckBox("UQOreIwlqGoeAY4WDF+BlU8vTVAF9a3Mnh8Y70xfCuSIYEe5CwpzhjAXOzDSlOlh3iVXX91mfKTx0IP0gGiz2mh0U+/ZnTt1jFaOaNVzU+Jpy/c+tFU493X2S+61Bvwe", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+firstcolumnnumber+\"", String.valueOf(firstcolumnnumber))));
			System.out.println(XP);
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("UQOreIwlqGoeAY4WDF+BlU8vTVAF9a3Mnh8Y70xfCuSIYEe5CwpzhjAXOzDSlOlh3iVXX91mfKTx0IP0gGiz2mh0U+/ZnTt1jFaOaNVzU+Jpy/c+tFU493X2S+61Bvwe", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+firstcolumnnumber+\"", String.valueOf(firstcolumnnumber)))).getText();
			try {
				flow.TurnOffImplicitWaits();
				firstcheckinputbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("yEat2bsa1QTrHCnORHvoHT/aVpH+C613QPlrsp2eJvKnJr4g/VziDA7GrY/7ggKBw48poXkLPnZ62MeASPiK6uWYw7zGw3FxDBXo7LWydzVBekHk7s3peMb+AHzY7UkiNs77VArAGMX8M/BVtGurC9et8d2GK1mq6+2VrXxqRG25PnbxwXOsRsPDU2B2F0WjLwYj8ettAq1NxLIFj/UmIg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Filtername+\"", Filtername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstcheckinputbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstcheckinputboxpicker = owebdriver.findElement(By.xpath(SingleDropCheckBox("aj9N+soDc9LiwM8SGfRcUDE6pFA4Tl0MhhQK1BAn0dFAybsPh5dG73JCTgFBlWqigPe92UX8YWEoBAhNtdTT7ZURFlK9ykRFBVhhzQt5nqH5E7xwyrbBcFdkZ9pVO520", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Filtername+\"", Filtername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstcheckinputboxpicker = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstdropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("yEat2bsa1QTrHCnORHvoHT/aVpH+C613QPlrsp2eJvKnJr4g/VziDA7GrY/7ggKBzIVo9CQxDrNbP7+UzFqkxQ4p9vxTi4598YBd8IpG3+cL8KfU92hpcyab81pBler2n0em1JO+eQSD/8edW88zV/d7Hjr55uloVg0Td429RtkDplWBDVdEa9Jk1mB6hNF+BOpgFIqIoYpt54aevEaVf3BOHVTrKf+7TXrwGbepN+nBIaXSUs+l/YLMvTlrqNcGm0q9A+aFydQDqm4aYqpfjY3Ci3z2WxVmhinqwiHrIaY3zWcAV4UHTK5L+reV+Alp0O3snTyJVybgfwXhtmsYs4vc2jbkvNtzCakXDMbpUyc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Filtername+\"", Filtername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstdropdownbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstmultiselectdropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("yEat2bsa1QTrHCnORHvoHT/aVpH+C613QPlrsp2eJvKnJr4g/VziDA7GrY/7ggKBlfaNzPIfODcTZ8+tLlGeYcXEwRrzPVlhkfNY/uj+2bJ4YVpp04C4ONabPCgPNS9Tyi6AWKAOtOcMp6vsoJQwopnbt1zI6bCHVq4TTQjNw5sE6mAUioihim3nhp68RpV/cE4dVOsp/7tNevAZt6k36cEhpdJSz6X9gsy9OWuo1wYxCAYZEjDRToshLJJ9qTghBcP/2llnEuQyheXpElgQWMbpP4YOidOyxBye4cb/iIIAir0pFv2Nfi0u41PAva0y", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Filtername+\"", Filtername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstmultiselectdropdownbox = false;
			} 
			if (firstcheckinputbox) {
				System.out.println(filtertext);
				flow.SetWebText(filtertext, Filtername);
				flow.EnterKey(Filtername);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstcheckinputboxpicker) {
				flow.SelectValuefromPicker(filtertext, Filtername);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstdropdownbox) {
				flow.SingleSelectDropDown(filtertext, Filtername);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstmultiselectdropdownbox) {
				flow.MultiSelectDropDown(Filtername, filtertext);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else {
				firstfilteroutputcheck = false;
//				flow.StepFailWithoutScreenshot("First Filter is not selected");
				System.out.println("First Filter is not selected");
			} 
			flow.WaitforProgressBar();
			if (firstfilteroutputcheck) {
				flow.Timeout(4000L);
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/iyBGMKLOd1k/1QxQeUgZIO7M5IoXeCgcu/+6mWx9cTHacdcpnvx8T6MpPQUMpsnbuAiddKYohPNI6kd9nP4kXRQRTZJ63TWxbJHhgEMnfK/4eLH6Rzt4vfc65h2cpQB+Nw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+firstcolumnnumber+\"", String.valueOf(firstcolumnnumber))));
				List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/iyBGMKLOd1k/1QxQeUgZIO7M5IoXeCgcu/+6mWx9cTHacdcpnvx8T6MpPQUMpsnbuAiddKYohPNI6kd9nP4kXRQRTZJ63TWxbJHhgEMnfK/4eLH6Rzt4vfc65h2cpQB+Nw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+firstcolumnnumber+\"", String.valueOf(firstcolumnnumber))));
				String[] Result = new String[result.size()];
				for (int i = 0; i < result.size(); i++) {
					Result[i] = ((WebElement)result.get(i)).getText();
					if (Result[i].equalsIgnoreCase(filtertext)) {
//						flow.StepPassWithoutScreenshot("Filter is working properly for the filter " + Filtername + " - " + Result[i]);
						System.out.println("Filter is working properly for the filter " + Filtername + " - " + Result[i]);
					} else {
//						flow.StepFail("Filter is not working properly for the filter " + Filtername + " - " + Result[i], true);
						System.out.println("Filter is not working properly for the filter " + Filtername + " - " + Result[i]);
					} 
				} 
			} else {
//				flow.StepFail("Since first filter is not selected we can't able to verify the value ", false);
				System.out.println("Since first filter is not selected we can't able to verify the value ");
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SingleFilterValidationWithColumnandFilterName function error", true);
			e.printStackTrace();
		} 
	}

	public void DoubleFilterValidation() throws Exception {
		try {
			boolean firstcheckinputbox = false;
			boolean firstcheckinputboxpicker = false;
			boolean firstdropdownbox = false;
			boolean firstmultiselectdropdownbox = false;
			boolean firstdatefieldbox = false;
			boolean firstfilteroutputcheck = true;
			boolean Secondcheckinputbox = false;
			boolean Secondcheckinputboxpicker = false;
			boolean Seconddropdownbox = false;
			boolean Secondmultiselectdropdownbox = false;
			boolean Seconddatefieldbox = false;
			boolean Secondfilteroutputcheck = true;
			flow.ExplicitWait(By.xpath(SingleDropCheckBox(Constants.Gridfirstfilterheadingxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
			String value = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.Gridfirstfilterheadingxpath, this.FF23242524354dfdgdgdgsdfsdfd5))).getAttribute("abbr");
//			System.out.println(value);
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.Gridfirstfiltervaluexpath, this.FF23242524354dfdgdgdgsdfsdfd5))).getText();
			String secondvalue = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.Gridsecondfilterheadingxpath, this.FF23242524354dfdgdgdgsdfsdfd5))).getAttribute("abbr");
			String secondfiltertext = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.Gridsecondfiltervaluexpath, this.FF23242524354dfdgdgdgsdfsdfd5)))
					.getText();
			Constants obj = new Constants(value, secondvalue, filtertext, secondfiltertext);
			try {
				flow.TurnOffImplicitWaits();
				firstcheckinputbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+Ow1fFVV98faqUVdLhKHEpCnJr4g/VziDA7GrY/7ggKBw48poXkLPnZ62MeASPiK6n2JDgu7zeh2iBpNuFTV2iYeMkkVcvj32DolekvWWaS917Lfhd66tX15PQ9RntG/1Net8d2GK1mq6+2VrXxqRG25PnbxwXOsRsPDU2B2F0WjLwYj8ettAq1NxLIFj/UmIg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+value+\"", value))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstcheckinputbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstcheckinputboxpicker = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjMwKCtBwlyFlYEN1e7mnlqH9AM5Th2dkVnMtObynLbcii4r2OHV2KYWnhE5izBkmHqnBi3tHce/Cw78XxFtrxpaERlnohVLD99cXarzyNZvFC", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+value+\"", value))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstcheckinputboxpicker = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstdropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+Ow1fFVV98faqUVdLhKHEpCnJr4g/VziDA7GrY/7ggKBzIVo9CQxDrNbP7+UzFqkxQ4p9vxTi4598YBd8IpG3+cL8KfU92hpcyab81pBler2n0em1JO+eQSD/8edW88zV/d7Hjr55uloVg0Td429RtlvaZuKQuexWO4u1D7gG1d/YDLaA4bNuPCn2S2pGscsn7JkvEyw8yWNVPFHyLFCfyzBIaXSUs+l/YLMvTlrqNcGm0q9A+aFydQDqm4aYqpfjY3Ci3z2WxVmhinqwiHrIaY3zWcAV4UHTK5L+reV+Alp0O3snTyJVybgfwXhtmsYs4vc2jbkvNtzCakXDMbpUyc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+value+\"", value))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstdropdownbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstmultiselectdropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+Ow1fFVV98faqUVdLhKHEpCnJr4g/VziDA7GrY/7ggKBlfaNzPIfODcTZ8+tLlGeYcXEwRrzPVlhkfNY/uj+2bJ4YVpp04C4ONabPCgPNS9Tyi6AWKAOtOcMp6vsoJQwoknWEUH5h9iUcLT9Hm1+nw1gMtoDhs248KfZLakaxyyfsmS8TLDzJY1U8UfIsUJ/LMEhpdJSz6X9gsy9OWuo1wYxCAYZEjDRToshLJJ9qTghBcP/2llnEuQyheXpElgQWMbpP4YOidOyxBye4cb/iIIAir0pFv2Nfi0u41PAva0y", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+value+\"", value))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstmultiselectdropdownbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstdatefieldbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjMwKCtBwlyFlYEN1e7mnlqH8vDUyWYKr+QtMkJIsY1mHikpJk3+x0oEpP1ph9dFtN9DhR11bhqAHg5dpc2YZIbWc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+value+\"", value))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstdatefieldbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				Secondcheckinputbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+JCjLKj9/ndZ6K+yzBQ5uEOyZLxMsPMljVTxR8ixQn8sjq3SRA2V2wio57VkMSwvH8WB4j38Brl0AWOuZWiiAqxq1+Z/vWy6eN0m2pc//AbtkKMsqP3+d1nor7LMFDm4Q7JkvEyw8yWNVPFHyLFCfyyOrdJEDZXbCKjntWQxLC8fhrWUTtbVKonpLpeV4pRRgg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+secondvalue+\"", secondvalue))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				Secondcheckinputbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				Secondcheckinputboxpicker = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM1IJKxPmmj+6gzDmKdGtgwbRB1UlGwYsujpbAPVqxxA1yRTVWqMb74yk4lzj/c0ZiJKSZN/sdKBKT9aYfXRbTfRspsq2+BSso053WlLLvksb", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+secondvalue+\"", secondvalue))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				Secondcheckinputboxpicker = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				Seconddropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+JCjLKj9/ndZ6K+yzBQ5uEOyZLxMsPMljVTxR8ixQn8swSGl0lLPpf2CzL05a6jXBptKvQPmhcnUA6puGmKqX42Nwot89lsVZoYp6sIh6yGmN81nAFeFB0yuS/q3lfgJadDt7J08iVcm4H8F4bZrGLPr0ZYclE16ifei0VJDBetXt4esmlk4ZArguRWPogQrrqgJ/BXniU7mGUtcjIW+vdK+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbkkqy9gWHe9c4j8J2ngcjzl7LkltRpzZyzr6wHz+f6wwVP1gk1yPys0GmPwZENbM2OwFjTYkgjZSrRp/3bypRB7EmBCZ0TM2yVbaoURlU2cQ", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+secondvalue+\"", secondvalue))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				Seconddropdownbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				Secondmultiselectdropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("zkcoJFpvkQ9wBh7HZlv9+JCjLKj9/ndZ6K+yzBQ5uEOyZLxMsPMljVTxR8ixQn8swSGl0lLPpf2CzL05a6jXBjEIBhkSMNFOiyEskn2pOCEFw//aWWcS5DKF5ekSWBBYxuk/hg6J07LEHJ7hxv+IgjPb6o0jEe85QnINNd4WMpi3h6yaWThkCuC5FY+iBCuuqAn8FeeJTuYZS1yMhb690r7wXEwe9GPEDdPPb0UgyRI0Q0uou9aOz/qGv4gWcqG/0RkFWqMyREiAonlCwNdMx81vNn6nIwr/6csKVw3owFCHiOFEF8Cq4z3zYlCjhUKp+OySqtexTuun9nI20z9djg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+secondvalue+\"", secondvalue))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				Secondmultiselectdropdownbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				Seconddatefieldbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM1IJKxPmmj+6gzDmKdGtgwbRB1UlGwYsujpbAPVqxxA18pfBRKT2ONXH1XliB9+2pmmAHguKNtNVz/TvvizezdERlnohVLD99cXarzyNZvFC", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+secondvalue+\"", secondvalue))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				Seconddatefieldbox = false;
			} 
			if (firstcheckinputbox) {
				flow.SetWebText(filtertext, value);
				flow.EnterKey(value);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstcheckinputboxpicker) {
				flow.SelectValuefromPicker(filtertext, value);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstdropdownbox) {
				flow.SingleSelectDropDown(filtertext, value);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstmultiselectdropdownbox) {
				flow.MultiSelectDropDown(value, filtertext);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstdatefieldbox) {
				flow.ClearField(value);
				flow.WaitforProgressBar();
				flow.SetDateforDateField(value, filtertext);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else {
				firstfilteroutputcheck = false;
//				flow.StepFailWithoutScreenshot("First Filter is not selected");
				System.out.println("First Filter is not selected");
			} 
			if (Secondcheckinputbox) {
				flow.SetWebText(secondfiltertext, secondvalue);
				flow.EnterKey(secondvalue);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (Secondcheckinputboxpicker) {
				flow.SelectValuefromPicker(secondfiltertext, secondvalue);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (Seconddropdownbox) {
				flow.SingleSelectDropDown(secondfiltertext, secondvalue);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (Secondmultiselectdropdownbox) {
				flow.MultiSelectDropDown(secondvalue, secondfiltertext);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (Seconddatefieldbox) {
				flow.ClearField(secondvalue);
				flow.WaitforProgressBar();
				flow.SetDateforDateField(secondvalue, secondfiltertext);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else {
				Secondfilteroutputcheck = false;
//				flow.StepFailWithoutScreenshot("Second Filter is not selected");
				System.out.println("Second Filter is not selected");
			} 
			flow.WaitforProgressBar();
			flow.Timeout(4000L);
			if (firstfilteroutputcheck) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox(Constants.Gridfirstfilterresultxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
				List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox(Constants.Gridfirstfilterresultxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
				String[] Result = new String[result.size()];
				for (int i = 0; i < result.size(); i++) {
					Result[i] = ((WebElement)result.get(i)).getText();
					if (Result[i].equalsIgnoreCase(filtertext)) {
//						flow.StepPassWithoutScreenshot("Filter is  working properly for the filter " + value + " - " + Result[i]);
						System.out.println("Filter is  working properly for the filter " + value + " - " + Result[i]);
					} else {
//						flow.StepFail("Filter is not working properly for the filter " + value + " - " + Result[i], true);
						System.out.println("Filter is not working properly for the filter " + value + " - " + Result[i]);
					} 
				} 
			} else {
//				flow.StepFail("Since first filter is not selected we can't able to verify the value ", true);
				System.out.println("Since first filter is not selected we can't able to verify the value ");
			} 
			if (Secondfilteroutputcheck) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox(Constants.Gridsecondfilterresultxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
				List<WebElement> secondresult = RetrieveWebElementList(By.xpath(SingleDropCheckBox(Constants.Gridsecondfilterresultxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
				String[] SecondResult = new String[secondresult.size()];
				String[] Value = { secondfiltertext };
				List<String> wordList = Arrays.asList(Value);
				for (int i = 0; i < secondresult.size(); i++) {
					SecondResult[i] = ((WebElement)secondresult.get(i)).getText();
					if (wordList.contains(SecondResult[i])) {
//						flow.StepPassWithoutScreenshot("Filter is working properly for the filter " + secondvalue + "- " + SecondResult[i]);
						System.out.println("Filter is working properly for the filter " + secondvalue + "- " + SecondResult[i]);
					} else {
//						flow.StepFail("Filter is not working properly for the filter " + secondvalue + " - " + SecondResult[i], true);
						System.out.println("Filter is not working properly for the filter " + secondvalue + " - " + SecondResult[i]);
					} 
				} 
			} else {
//				flow.StepFail("Since second filter is not selected we can't able to verify the value ", true);
				System.out.println("Since second filter is not selected we can't able to verify the value ");
			} 
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("DoubleFilterValidation function error", true);
			flow.TurnOnImplicitWaits();
			e.printStackTrace();
		} 
	}

	public void DoubleFilterValidationWithColumnandFilterName(String FirstColumnname, String SecondColumnname, String FirstFiltername, String SecondFiltername) throws Exception {
		try {
			boolean firstcheckinputbox = false;
			boolean firstcheckinputboxpicker = false;
			boolean firstdropdownbox = false;
			boolean firstmultiselectdropdownbox = false;
			boolean firstdatefieldbox = false;
			boolean firstfilteroutputcheck = true;
			boolean Secondcheckinputbox = false;
			boolean Secondcheckinputboxpicker = false;
			boolean Seconddropdownbox = false;
			boolean Secondmultiselectdropdownbox = false;
			boolean Seconddatefieldbox = false;
			boolean Secondfilteroutputcheck = true;
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("ZhlJpeU/AGPEsJJfpc02fg==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			int firstcolumnnumber = 0;
			int secondcolumnnumber = 0;
			List<WebElement> columnlist = flow.RetrieveWebElementList(By.xpath(SingleDropCheckBox("zMIyS8T8mbrRJLqmZMU+rg==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			for (WebElement text : columnlist) {
				firstcolumnnumber++;
				if (text.getText().equalsIgnoreCase(FirstColumnname))
					break; 
			} 
			for (WebElement text : columnlist) {
				secondcolumnnumber++;
				if (text.getText().equalsIgnoreCase(SecondColumnname))
					break; 
			} 
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("1RL1aqlQQNgZo0sWBvFBHbuT0EpZFDbJyBl42fhDs7YmeBVezz3ua3WGCJxFrg4j", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+firstcolumnnumber+\"", String.valueOf(firstcolumnnumber))));
			String value = owebdriver.findElement(By.xpath(SingleDropCheckBox("1RL1aqlQQNgZo0sWBvFBHbuT0EpZFDbJyBl42fhDs7YmeBVezz3ua3WGCJxFrg4j", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+firstcolumnnumber+\"", String.valueOf(firstcolumnnumber)))).getText();
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("UQOreIwlqGoeAY4WDF+BlU8vTVAF9a3Mnh8Y70xfCuSIYEe5CwpzhjAXOzDSlOlh3iVXX91mfKTx0IP0gGiz2mh0U+/ZnTt1jFaOaNVzU+Jpy/c+tFU493X2S+61Bvwe", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+firstcolumnnumber+\"", String.valueOf(firstcolumnnumber)))).getText();
			String secondvalue = owebdriver.findElement(By.xpath(SingleDropCheckBox("WFhvsQPHuPVnK+7HObI+mcBrxKe/zaL2OUYRJFpWY0HHZGJi5p6JAi7SDiKpMB2M", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+secondcolumnnumber+\"", String.valueOf(secondcolumnnumber)))).getText();
			String secondfiltertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("s1Fn+3i4YuOnbQIUl98WJ51is1/JqylTDxGy9ydF6xFvDPR4hDKrx6J+/N2rY/GcHA0p/5W14DT/ZxPkTOoajzIiAFkagTIEzhw2j1ZX3q+DH/nwy4Wsn+7NqePR8H8C", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+secondcolumnnumber+\"", String.valueOf(secondcolumnnumber)))).getText();
			Constants obj = new Constants(value, secondvalue, filtertext, secondfiltertext);
			try {
				flow.TurnOffImplicitWaits();
				firstcheckinputbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("yEat2bsa1QTrHCnORHvoHStob5en9e818xAs6clwz2Q6XDbEGIB0hFSeNoHfT1g50b68NrPdJT2zroxR8WWTQ/nUZL/O/mz+pdTHGorkNbceMkkVcvj32DolekvWWaS9QKK/AJ4XLcHQwbKHaZw8HtEHVSUbBiy6OlsA9WrHEDXfv0lGtuvD6Xkn8w10YQOsfSUq02wsSqU2Tl4CC2M+UA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+FirstFiltername+\"", FirstFiltername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstcheckinputbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstcheckinputboxpicker = owebdriver.findElement(By.xpath(SingleDropCheckBox("aj9N+soDc9LiwM8SGfRcUMhHpbUSy/hUKrhvm4vGa2hOZLz+9kQ1DqUNrAh7UUdy240U6I5EhaT9pn2EU636CNd6pigwh2nccwI7fIsr0PoCyB/qtShNc+SZQuhom9g4", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+FirstFiltername+\"", FirstFiltername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstcheckinputboxpicker = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstdropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("yEat2bsa1QTrHCnORHvoHStob5en9e818xAs6clwz2Q6XDbEGIB0hFSeNoHfT1g5ax7vu1VVe5CYyqdrBB+jpgWrmmGOu6C7SB6arn6KKRVqD2cm26HKrXdrS44sssX3WpDKlnEnRGTK2d3KuyNBQlj/hDH0oRY6wlunFZodnru8f6p9XvJ+dq4823AsHmXFw6S1zSB69xmwvd2jPhd4sCfzjQ3NP/ulRVH/bv9A0pGnJr4g/VziDA7GrY/7ggKBzIVo9CQxDrNbP7+UzFqkxQ4p9vxTi4598YBd8IpG3+cL8KfU92hpcyab81pBler2n0em1JO+eQSD/8edW88zV/d7Hjr55uloVg0Td429Rtl0aVdkHbDdweDclivTAxcR", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+FirstFiltername+\"", FirstFiltername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstdropdownbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstmultiselectdropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("yEat2bsa1QTrHCnORHvoHStob5en9e818xAs6clwz2Q6XDbEGIB0hFSeNoHfT1g5ax7vu1VVe5CYyqdrBB+jptNcaZTwiPzcEpDBA4N/x01ZFH20gd91jUptTAXYwvCH2hm8mHyAJnTTjesVSenCJRMXHtXTaH7IfWsrsxG/ekfDpLXNIHr3GbC93aM+F3iwJ/ONDc0/+6VFUf9u/0DSkacmviD9XOIMDsatj/uCAoGV9o3M8h84NxNnz60uUZ5hxcTBGvM9WWGR81j+6P7ZsnhhWmnTgLg41ps8KA81L1PKLoBYoA605wynq+yglDCigMlkKLlMQpbg3+JveVAgQA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+FirstFiltername+\"", FirstFiltername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstmultiselectdropdownbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				firstdatefieldbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM6C3we8HDgQ+DE6R1QWrPFRN2Xx6FHR/QQ7OfOVbIspE5UpOddnt3dBe14K4fIoeJV4xclDOLjT8lqpzyeezUeG88/5h1SzRlqGIMs3IbLDk", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+FirstFiltername+\"", FirstFiltername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				firstdatefieldbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				Secondcheckinputbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("yEat2bsa1QTrHCnORHvoHdmADgk0MLot+p0VJriDWH1wTh1U6yn/u0168Bm3qTfpjq3SRA2V2wio57VkMSwvH8WB4j38Brl0AWOuZWiiAqw3oV2+mPRU1dif5yLHC3gU2YAOCTQwui36nRUmuINYfXBOHVTrKf+7TXrwGbepN+mOrdJEDZXbCKjntWQxLC8fhrWUTtbVKonpLpeV4pRRgg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondFiltername+\"", SecondFiltername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				Secondcheckinputbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				Secondcheckinputboxpicker = owebdriver.findElement(By.xpath(SingleDropCheckBox("dJYyMoW4QoRb6KYlerhbsjQ1kJIGx5XblKlKlh9nGsy+8FxMHvRjxA3Tz29FIMkS51fN6Lpn5PZKvjMlWzA03N+XS5XSupJsq6WeVKQ4uqu88/5h1SzRlqGIMs3IbLDk", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondFiltername+\"", SecondFiltername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				Secondcheckinputboxpicker = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				Seconddropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("yEat2bsa1QTrHCnORHvoHdmADgk0MLot+p0VJriDWH1wTh1U6yn/u0168Bm3qTfpwSGl0lLPpf2CzL05a6jXBptKvQPmhcnUA6puGmKqX42Nwot89lsVZoYp6sIh6yGmN81nAFeFB0yuS/q3lfgJadDt7J08iVcm4H8F4bZrGLNL8XJY++Xstp1u7Ak1jv3Laf+UbScC/X5J5GRXm/Y1NzQ1kJIGx5XblKlKlh9nGsy+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbkkqy9gWHe9c4j8J2ngcjzl7LkltRpzZyzr6wHz+f6wwVP1gk1yPys0GmPwZENbM2OwFjTYkgjZSrRp/3bypRB7EmBCZ0TM2yVbaoURlU2cQ", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondFiltername+\"", SecondFiltername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				Seconddropdownbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				Secondmultiselectdropdownbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("yEat2bsa1QTrHCnORHvoHdmADgk0MLot+p0VJriDWH1wTh1U6yn/u0168Bm3qTfpwSGl0lLPpf2CzL05a6jXBjEIBhkSMNFOiyEskn2pOCEFw//aWWcS5DKF5ekSWBBYxuk/hg6J07LEHJ7hxv+IgtV5NhgXw666qTvPwrln3Axp/5RtJwL9fknkZFeb9jU3NDWQkgbHlduUqUqWH2cazL7wXEwe9GPEDdPPb0UgyRI0Q0uou9aOz/qGv4gWcqG/0RkFWqMyREiAonlCwNdMx81vNn6nIwr/6csKVw3owFCHiOFEF8Cq4z3zYlCjhUKp+OySqtexTuun9nI20z9djg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondFiltername+\"", SecondFiltername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				Secondmultiselectdropdownbox = false;
			} 
			try {
				flow.TurnOffImplicitWaits();
				Seconddatefieldbox = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM4tKQNi/prSaGL/3tnpKiiGFYngeuK9yu+RmodlNu4Q9IPqc8qu5FIT89vLt7VnTnc+V5C8zvvx1POSRNVGQ25odxeco+hGzeZGxZNl0Go0g", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondFiltername+\"", SecondFiltername))).isDisplayed();
				flow.TurnOnImplicitWaits();
			} catch (Exception e) {
				flow.TurnOnImplicitWaits();
				Seconddatefieldbox = false;
			} 
			if (firstcheckinputbox) {
				flow.SetWebText(filtertext, FirstFiltername);
				flow.EnterKey(FirstFiltername);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstcheckinputboxpicker) {
				flow.SelectValuefromPicker(filtertext, FirstFiltername);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstdropdownbox) {
				flow.SingleSelectDropDown(filtertext, FirstFiltername);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstmultiselectdropdownbox) {
				flow.MultiSelectDropDown(FirstFiltername, filtertext);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (firstdatefieldbox) {
				flow.ClearField(SecondFiltername);
				flow.WaitforProgressBar();
				flow.SetDateforDateField(FirstFiltername, filtertext);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else {
				firstfilteroutputcheck = false;
//				flow.StepFailWithoutScreenshot("First Filter is not selected");
				System.out.println("First Filter is not selected");
			} 
			if (Secondcheckinputbox) {
				flow.SetWebText(secondfiltertext, SecondFiltername);
				flow.EnterKey(SecondFiltername);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (Secondcheckinputboxpicker) {
				flow.SelectValuefromPicker(secondfiltertext, SecondFiltername);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (Seconddropdownbox) {
				flow.SingleSelectDropDown(secondfiltertext, SecondFiltername);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (Secondmultiselectdropdownbox) {
				flow.MultiSelectDropDown(SecondFiltername, secondfiltertext);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else if (Seconddatefieldbox) {
				flow.ClearField(SecondFiltername);
				flow.WaitforProgressBar();
				flow.SetDateforDateField(SecondFiltername, secondfiltertext);
				flow.WaitforProgressBar();
				flow.WaitforProgressBar();
			} else {
				Secondfilteroutputcheck = false;
//				flow.StepFailWithoutScreenshot("Second Filter is not selected");
				System.out.println("Second Filter is not selected");
			} 
			flow.WaitforProgressBar();
			flow.Timeout(4000L);
			if (firstfilteroutputcheck) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/iyBGMKLOd1k/1QxQeUgZIO7M5IoXeCgcu/+6mWx9cTHacdcpnvx8T6MpPQUMpsnbuAiddKYohPNI6kd9nP4kXRQRTZJ63TWxbJHhgEMnfK/4eLH6Rzt4vfc65h2cpQB+Nw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+firstcolumnnumber+\"", String.valueOf(firstcolumnnumber))));
				List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/iyBGMKLOd1k/1QxQeUgZIO7M5IoXeCgcu/+6mWx9cTHacdcpnvx8T6MpPQUMpsnbuAiddKYohPNI6kd9nP4kXRQRTZJ63TWxbJHhgEMnfK/4eLH6Rzt4vfc65h2cpQB+Nw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+firstcolumnnumber+\"", String.valueOf(firstcolumnnumber))));
				String[] Result = new String[result.size()];
				for (int i = 0; i < result.size(); i++) {
					Result[i] = ((WebElement)result.get(i)).getText();
					if (Result[i].equalsIgnoreCase(filtertext)) {
//						flow.StepPassWithoutScreenshot("Filter is  working properly for the filter " + FirstFiltername + " - " + Result[i]);
						System.out.println("Filter is  working properly for the filter " + FirstFiltername + " - " + Result[i]);
					} else {
//						flow.StepFail("Filter is not working properly for the filter " + FirstFiltername + " - " + Result[i], true);
						System.out.println("Filter is not working properly for the filter " + FirstFiltername + " - " + Result[i]);
					} 
				} 
			} else {
//				flow.StepFail("Since first filter is not selected we can't able to verify the value ", false);
				System.out.println("Since first filter is not selected we can't able to verify the value ");
			} 
			if (Secondfilteroutputcheck) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/izIiAFkagTIEzhw2j1ZX3q8jQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4yXiBOXntPmCoICNADUEp6neiFFRltxl523TA8WMjoF9DrtfyzHxhSPTmZbRFYoLJg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+secondcolumnnumber+\"", String.valueOf(secondcolumnnumber))));
				List<WebElement> secondresult = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/izIiAFkagTIEzhw2j1ZX3q8jQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4yXiBOXntPmCoICNADUEp6neiFFRltxl523TA8WMjoF9DrtfyzHxhSPTmZbRFYoLJg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+secondcolumnnumber+\"", String.valueOf(secondcolumnnumber))));
				String[] SecondResult = new String[secondresult.size()];
				for (int i = 0; i < secondresult.size(); i++) {
					SecondResult[i] = ((WebElement)secondresult.get(i)).getText();
					if (SecondResult[i].equalsIgnoreCase(secondfiltertext)) {
//						flow.StepPassWithoutScreenshot("Filter is working properly for the filter " + SecondFiltername + " - " + SecondResult[i]);
						System.out.println("Filter is working properly for the filter " + SecondFiltername + " - " + SecondResult[i]);
					} else {
//						flow.StepFail("Filter is not working properly for the filter " + SecondFiltername + " - " + SecondResult[i], true);
						System.out.println("Filter is not working properly for the filter " + SecondFiltername + " - " + SecondResult[i]);
					} 
				} 
			} else {
//				flow.StepFail("Since second filter is not selected we can't able to verify the value ", false);
				System.out.println("Since second filter is not selected we can't able to verify the value ");
			} 
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("DoubleFilterValidationWithColumnandFilterName function error", true);
			flow.TurnOnImplicitWaits();
			e.printStackTrace();
		} 
	}

	public void SingleFilterValidationWithColumnNumberandFilterName(String FirstFilterComponentType,int Columnnumber,String filtername) throws Exception {
		try {
//			flow.StepInfoWithoutScreenshot("Single filter validation for the filter component - " + FirstFilterComponentType + " in the column number - " + Columnnumber + " with the filter name - " + filtername);
			System.out.println("Single filter validation for the filter component - " + FirstFilterComponentType + " in the column number - " + Columnnumber + " with the filter name - " + filtername);
			if (FirstFilterComponentType == "TextBox" || FirstFilterComponentType == "textbox" || FirstFilterComponentType == "TEXTBOX") {

			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5zsiCseEo/HxSl1/WcPM8ZBLTwk6Md8hlvvz/tXsfrTTC7Q0sAtln89xeVvG3FEIRUCnWZ00vSSzZT2bJOPjymHHUny1migOqz7Uj/Nzg/YkDC0wnPgF1IYmIxCe5xF8GKQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)))).getText();

			// flow.SetWebText(filtername, filtertext);  //Edited
			flow.SetWebText(filtertext,filtername);
			flow.WaitforProgressBar();
			//   cy.Timeout(4000)
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+filtername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}

			else if (FirstFilterComponentType == "Picker" || FirstFilterComponentType == "picker" || FirstFilterComponentType == "PICKER") {
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5zsiCseEo/HxSl1/WcPM8ZBLTwk6Md8hlvvz/tXsfrTTC7Q0sAtln89xeVvG3FEIRUCnWZ00vSSzZT2bJOPjymHHUny1migOqz7Uj/Nzg/YkDC0wnPgF1IYmIxCe5xF8GKQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)))).getText();
			// flow.SelectValuefromPicker(filtername, filtertext); //Edited
			flow.SelectValuefromPicker(filtertext, filtername);
			flow.WaitforProgressBar();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+filtername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}

			else if (FirstFilterComponentType == "SingleSelectDropdown" || FirstFilterComponentType == "singleselectdropdown" || FirstFilterComponentType == "SINGLESELECTDROPDOWN") {
			WebElement XP=owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5zsiCseEo/HxSl1/WcPM8ZBLTwk6Md8hlvvz/tXsfrTTC7Q0sAtln89xeVvG3FEIRUCnWZ00vSSzZT2bJOPjymHHUny1migOqz7Uj/Nzg/YkDC0wnPgF1IYmIxCe5xF8GKQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5zsiCseEo/HxSl1/WcPM8ZBLTwk6Md8hlvvz/tXsfrTTC7Q0sAtln89xeVvG3FEIRUCnWZ00vSSzZT2bJOPjymHHUny1migOqz7Uj/Nzg/YkDC0wnPgF1IYmIxCe5xF8GKQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)))).getText();
			flow.SingleSelectDropDown(filtertext, filtername);
			flow.WaitforProgressBar();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+filtername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}
			else if (FirstFilterComponentType == "MultiSelectDropdown" || FirstFilterComponentType == "multiselectdropdown" || FirstFilterComponentType == "MULTISELECTDROPDOWN") {
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5zsiCseEo/HxSl1/WcPM8ZBLTwk6Md8hlvvz/tXsfrTTC7Q0sAtln89xeVvG3FEIRUCnWZ00vSSzZT2bJOPjymHHUny1migOqz7Uj/Nzg/YkDC0wnPgF1IYmIxCe5xF8GKQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)))).getText();
			flow.MultiSelectDropDown(filtername, filtertext);
			flow.WaitforProgressBar();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+filtername+" - "+Result[i]);
				System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+filtername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}

			}
			catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SingleFilterValidationWithColumnandFilterName function error",true);
			e.printStackTrace();
			}
			}



	public void DoubleFilterValidationWithColumnNumberandFilterName(String FirstFilterComponentType,int Columnnumber,String filtername,String SecondFilterComponentType,int SecondColumnnumber,String Secondfiltername) throws Exception {
		try {
//			flow.StepInfoWithoutScreenshot("Double filter validation for the filter components - " + FirstFilterComponentType + "," + SecondFilterComponentType + " in the column numbers - " + Columnnumber + ","+SecondColumnnumber+" with the filter name - " + filtername  + ","+Secondfiltername);
			System.out.println("Double filter validation for the filter components - " + FirstFilterComponentType + "," + SecondFilterComponentType + " in the column numbers - " + Columnnumber + ","+SecondColumnnumber+" with the filter name - " + filtername  + ","+Secondfiltername);
			if (FirstFilterComponentType == "TextBox" || FirstFilterComponentType == "textbox" || FirstFilterComponentType == "TEXTBOX") {

			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5zsiCseEo/HxSl1/WcPM8ZBLTwk6Md8hlvvz/tXsfrTTC7Q0sAtln89xeVvG3FEIRUCnWZ00vSSzZT2bJOPjymHHUny1migOqz7Uj/Nzg/YkDC0wnPgF1IYmIxCe5xF8GKQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)))).getText();

			flow.SetWebText(filtertext, filtername);
			flow.WaitforProgressBar();
			//   cy.Timeout(4000)
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+filtername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}

			else if (FirstFilterComponentType == "Picker" || FirstFilterComponentType == "picker" || FirstFilterComponentType == "PICKER") {
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5zsiCseEo/HxSl1/WcPM8ZBLTwk6Md8hlvvz/tXsfrTTC7Q0sAtln89xeVvG3FEIRUCnWZ00vSSzZT2bJOPjymHHUny1migOqz7Uj/Nzg/YkDC0wnPgF1IYmIxCe5xF8GKQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)))).getText();
			flow.SelectValuefromPicker(filtertext,filtername);
			flow.WaitforProgressBar();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+filtername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}

			else if (FirstFilterComponentType == "SingleSelectDropdown" || FirstFilterComponentType == "singleselectdropdown" || FirstFilterComponentType == "SINGLESELECTDROPDOWN") {
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5zsiCseEo/HxSl1/WcPM8ZBLTwk6Md8hlvvz/tXsfrTTC7Q0sAtln89xeVvG3FEIRUCnWZ00vSSzZT2bJOPjymHHUny1migOqz7Uj/Nzg/YkDC0wnPgF1IYmIxCe5xF8GKQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)))).getText();
			flow.SingleSelectDropDown(filtertext, filtername);
			flow.WaitforProgressBar();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+filtername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}
			else if (FirstFilterComponentType == "MultiSelectDropdown" || FirstFilterComponentType == "multiselectdropdown" || FirstFilterComponentType == "MULTISELECTDROPDOWN") {
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5zsiCseEo/HxSl1/WcPM8ZBLTwk6Md8hlvvz/tXsfrTTC7Q0sAtln89xeVvG3FEIRUCnWZ00vSSzZT2bJOPjymHHUny1migOqz7Uj/Nzg/YkDC0wnPgF1IYmIxCe5xF8GKQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)))).getText();
			flow.MultiSelectDropDown(filtername, filtertext);
			flow.WaitforProgressBar();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+filtername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}
			if (SecondFilterComponentType == "TextBox" || SecondFilterComponentType == "textbox" || SecondFilterComponentType == "TEXTBOX") {

			// String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i7UW49M3uO+dcS8HDIAlBcM0AKrcWxW5XsGYoApFTlyIv7999lHU/Hp6nK7s355i0Rvd3QlZGnGuSXOzKScdeylLBJctVDwBwN1mDtzsC9O3",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber)))).getText();
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i9io1EsW+j5S4rfBpi2RjOUjQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4//cn3zaaEhCwsMvxHOLjJyveKCXkUTVp8W1QPK8JuFWDrtfyzHxhSPTmZbRFYoLJg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber)))).getText();//Edited
			System.out.println(filtertext);
			flow.SetWebText(filtertext,Secondfiltername);
			flow.WaitforProgressBar();
			//   cy.Timeout(4000)
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i9io1EsW+j5S4rfBpi2RjOUjQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4//cn3zaaEhCwsMvxHOLjJyveKCXkUTVp8W1QPK8JuFWDrtfyzHxhSPTmZbRFYoLJg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i9io1EsW+j5S4rfBpi2RjOUjQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4//cn3zaaEhCwsMvxHOLjJyveKCXkUTVp8W1QPK8JuFWDrtfyzHxhSPTmZbRFYoLJg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+Secondfiltername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+Secondfiltername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}

			else if (SecondFilterComponentType == "Picker" || SecondFilterComponentType == "picker" || SecondFilterComponentType == "PICKER") {
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i9io1EsW+j5S4rfBpi2RjOUjQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4//cn3zaaEhCwsMvxHOLjJyveKCXkUTVp8W1QPK8JuFWDrtfyzHxhSPTmZbRFYoLJg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber)))).getText();
			flow.SelectValuefromPicker(filtertext, Secondfiltername);
			flow.WaitforProgressBar();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i9io1EsW+j5S4rfBpi2RjOUjQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4//cn3zaaEhCwsMvxHOLjJyveKCXkUTVp8W1QPK8JuFWDrtfyzHxhSPTmZbRFYoLJg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i9io1EsW+j5S4rfBpi2RjOUjQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4//cn3zaaEhCwsMvxHOLjJyveKCXkUTVp8W1QPK8JuFWDrtfyzHxhSPTmZbRFYoLJg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+Secondfiltername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+Secondfiltername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}

			else if (SecondFilterComponentType == "SingleSelectDropdown" || SecondFilterComponentType == "singleselectdropdown" || SecondFilterComponentType == "SINGLESELECTDROPDOWN") {
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5ztuRVxbhLyKg/SXP1zPycZ06wNSu6adPrO77euEjQjkyCyVPdqYzRPDeYcYkH/g2dIqDjZfOoy7B2LRp+Ipi1E9EM0tEuoGuP+jyrTBeH205YYpx+PqfLlJ6SXGnjP8EoQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber)))).getText();
			flow.SingleSelectDropDown(filtertext, Secondfiltername);
			flow.WaitforProgressBar();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i9io1EsW+j5S4rfBpi2RjOUjQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4//cn3zaaEhCwsMvxHOLjJyveKCXkUTVp8W1QPK8JuFWDrtfyzHxhSPTmZbRFYoLJg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i9io1EsW+j5S4rfBpi2RjOUjQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4//cn3zaaEhCwsMvxHOLjJyveKCXkUTVp8W1QPK8JuFWDrtfyzHxhSPTmZbRFYoLJg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+Secondfiltername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+Secondfiltername+" - "+Result[i], true);
			System.out.println("Filter is not working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}
			else if (SecondFilterComponentType == "MultiSelectDropdown" || SecondFilterComponentType == "multiselectdropdown" || SecondFilterComponentType == "MULTISELECTDROPDOWN") {
			String filtertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("d97lZbADC9HYhBbwodV5ztuRVxbhLyKg/SXP1zPycZ06wNSu6adPrO77euEjQjkyCyVPdqYzRPDeYcYkH/g2dIqDjZfOoy7B2LRp+Ipi1E9EM0tEuoGuP+jyrTBeH205YYpx+PqfLlJ6SXGnjP8EoQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber)))).getText();
			flow.MultiSelectDropDown(Secondfiltername, filtertext);
			flow.WaitforProgressBar();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i9io1EsW+j5S4rfBpi2RjOUjQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4//cn3zaaEhCwsMvxHOLjJyveKCXkUTVp8W1QPK8JuFWDrtfyzHxhSPTmZbRFYoLJg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber))));
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("TAHHQ78aj80iUAQODOZ/i9io1EsW+j5S4rfBpi2RjOUjQ5DIIoj6yAvO2wvfvJdFlrdKt3qHCKOjl0oDBHEh4//cn3zaaEhCwsMvxHOLjJyveKCXkUTVp8W1QPK8JuFWDrtfyzHxhSPTmZbRFYoLJg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+SecondColumnnumber+\"", String.valueOf(SecondColumnnumber))));
			String Result[] = new String[result.size()];
			for (int i = 0; i < result.size(); i++) {
			Result[i] = result.get(i).getText();
			if (Result[i].equalsIgnoreCase(filtertext)) {
//			flow.StepPassWithoutScreenshot("Filter is working properly for the filter "+Secondfiltername+" - "+Result[i]);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			} else {
//			flow.StepFail("Filter is not working properly for the filter "+Secondfiltername+" - "+Result[i], true);
			System.out.println("Filter is working properly for the filter "+filtername+" - "+Result[i]);
			}
			}
			}
			}
			catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("DoubleFilterValidationWithColumnandFilterName function error",true);
			e.printStackTrace();
			}
	}

	public void CancelFlow() throws Exception {
		try {
			WebElement cancel = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.cancelbuttonxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
			cancel.click();
			flow.WaitforProgressBar();
			WebElement Dialogyesbutton = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.Dialogyesbuttonxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
			flow.WaitforProgressBar();
			Dialogyesbutton.click();
			System.out.println("Cancelflow is working properly");
//			flow.StepPassWithoutScreenshot("Cancelflow is working properly");
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("CancelFlow function error", true);
			e.printStackTrace();
		} 
	}

	public void RejectFlowCheck(String message) throws Exception {
		WebElement Rejectbutton = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.Rejectbuttonxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
		Rejectbutton.click();
		flow.WaitforProgressBar();
		WebElement Dialogyesbutton = owebdriver.findElement(By.xpath(SingleDropCheckBox(Constants.Dialogyesbuttonxpath, this.FF23242524354dfdgdgdgsdfsdfd5)));
		Dialogyesbutton.click();
		flow.WaitforProgressBar();
		String errortext = RetrieveWebElement(By.xpath(SingleDropCheckBox(Constants.fieldlayouterrorxpath, this.FF23242524354dfdgdgdgsdfsdfd5))).getText();
		try {
			flow.Assertion(errortext, message, "Alert Message is present - ", "Alert Message is not present - ");
//			flow.StepPassWithoutScreenshot("Alert message is displayed");
			System.out.println("Alert message is displayed");
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("RejectFlowCheck function error", true);
			e.printStackTrace();
		} 
	}

	public void InvalidDocumentValidation(String filepath, int index) throws Exception {
		try {
			UploadFileBasedonIndex(filepath, index);
			flow.Timeout(5000L);
			String alertmessage = RetrieveWebElement(By.xpath(SingleDropCheckBox(Constants.alertmessagexpath, this.FF23242524354dfdgdgdgsdfsdfd5))).getAttribute("innerHTML");
			if (alertmessage.isEmpty()) {
//				flow.StepFail("Alert message for the invalid doc is not displayed", true);
				System.out.println("Alert message for the invalid doc is not displayed");
			} else {
//				flow.StepPassWithoutScreenshot("Alert message for the doc is  displayed -" + alertmessage);
				System.out.println("Alert message for the doc is  displayed -" + alertmessage);
			} 
		} catch (Exception e) {
			String time = GetDateandTimewithSeconds();
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("InvalidDocumentValidation function error", true);
			e.printStackTrace();
		} 
	}

	public void UploadDocumentFieldCheck(String Excelfilepath, String sheetname, String columnname, int index) throws Exception {
        try {
            int i = 0;
            List<HashMap<String, String>> mydata = new ArrayList<>();
            HashMap<String, String> testcase = new HashMap<>();
            Excel inputsheet = new Excel(Excelfilepath, sheetname);
            mydata = Excel.getcelldata();
            for (HashMap<String, String> mtestcase : mydata) {
                flow.UploadFileBasedonIndex(mtestcase.get(columnname), index);
                if (i < mydata.size() - 1) {
                    WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqhl3R3juJafXhBzueX7PXhjR90U9nrn8keXZyLb9C1OjOA3Z5aKpM7OyC3f1DEd",this.FF23242524354dfdgdgdgsdfsdfd5)));
                    element.click();
                } 
                i++;
            } 
        } catch (Exception e) {
            String Exception = Throwables.getStackTraceAsString(e);
//            flow.StepFail("UploadDocumentFieldCheck function error", true);
            e.printStackTrace();
        } 
    }
	public void VerifyMilestoneSteps(String stepname, String inputvalue) throws Exception {
		try {
			String element = owebdriver.findElement(By.xpath(SingleDropCheckBox("/OOWTM0x8Sg+uxrawubI+FSc0y1v0pTs9oSFJ+QKesvIv6W83E74xwqTr+CnNTMR6WZAywaZyIlKllb5E6N62CUiWTwKKL1mZNbdOOOd5vI=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+stepname+\"", stepname))).getAttribute("innerText");
			if (inputvalue.equals(element)) {
//				flow.StepPassWithoutScreenshot("Milestone step " + stepname + " match & it's step detail - " + inputvalue);
				System.out.println("Milestone step " + stepname + " match & it's step detail - " + inputvalue);
			} else {
//				flow.StepFailWithoutScreenshot("Milestone step " + stepname + " mismatch & it's step detail -  " + inputvalue);
				System.out.println("Milestone step " + stepname + " mismatch & it's step detail -  " + inputvalue);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyMilestoneSteps for the stepname " + stepname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyGridFieldValueinBoxLayout(int boxnumber, String fieldname, String inputvalue) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aGLnhHTatv1+2fI7dnxugEqtiu9WaHcvAGvUQVqrrUFWGJ64AZy1PxINoN+CWqV9DA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+boxnumber+\"", String.valueOf(boxnumber))));
			String element = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aGLnhHTatv1+2fI7dnxugEqtiu9WaHcvAGvUQVqrrUFWniIJdARE+MFbkS7/ehMmWKIDe2VLxeyrNQLasyDgwLWvcoXZQBqGwW5PqJ4Gy/nUOMmjQVZEVnU5mzgd97R9AXBOHVTrKf+7TXrwGbepN+kAg4zTADwx96hyVG+x4tdz", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname).replace("\"+boxnumber+\"", String.valueOf(boxnumber)))).getAttribute("innerText");
			if (inputvalue.equals(element.trim())) {
//				flow.StepPassWithoutScreenshot("Box layout step " + fieldname + " match & it's step detail - " + inputvalue);
				System.out.println("Box layout step " + fieldname + " match & it's step detail - " + inputvalue);
			} else {
//				flow.StepFailWithoutScreenshot("Box layout step " + fieldname + " mismatch & it's step detail -  " + inputvalue);
				System.out.println("Box layout step " + fieldname + " mismatch & it's step detail -  " + inputvalue);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyGridFieldValueinBoxLayout for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ExtractDatafromPieChart(int indexnumber) throws Exception {
		try {
			List<WebElement> pieelement = owebdriver.findElements(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKP6EthffLBm6Pyn6KSzMPZD8rBJFs64FzeIFjasjwLbS4ZGx01i3XS+vzI0gj90TxFDfzVZy3gbHytnIb3rupuBRcMb/EwEQz3IXbBxIDCocs", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			for (int i = 1; i <= pieelement.size(); i++) {
				List<WebElement> nestedelement = owebdriver.findElements(By.xpath(SingleDropCheckBox("vu4K2Yr2+QKgyT5QTrdBNL6fUtQvJXbeIAiYfDZouVHe9/OljpcuRCe1zxAAmvQG/s//r0rYdG069UDv0TyWLx4vy8wGED3wILrcJhPbcboUpAjFuSBVbWAMy/+K+iiC9WRaSG7R2ltfBYIz25w22vg63o2JHL6ctWboig+o+gNrfKCTO8J7CpypxQNBV1Wf", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)).replace("\"+i+\"", String.valueOf(i))));
				if (nestedelement.size() == 2) {
					int j = 0;
					String[] array = new String[2];
					for (WebElement text : nestedelement) {
						array[j] = text.getText();
						j++;
					} 
//					flow.StepPassWithoutScreenshot("Pie chart value is - " + array[1] + " for the option - " + array[0]);
					System.out.println("Pie chart value is - " + array[1] + " for the option - " + array[0]);
				} else if (nestedelement.size() == 3) {
					int j = 0;
					String[] array = new String[3];
					for (WebElement text : nestedelement) {
						array[j] = text.getText();
						j++;
					} 
					String OPTIONNAME = String.valueOf(String.valueOf(String.valueOf(array[0]))) + " " + array[1];
//					flow.StepPassWithoutScreenshot("Pie chart value is - " + OPTIONNAME + " for the option - " + array[2]);
					System.out.println("Pie chart value is - " + OPTIONNAME + " for the option - " + array[2]);
				} 
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ExtractDatafromPieChart function error", true);
			e.printStackTrace();
		} 
	}

	public void ExtractDatafromBarChart(int indexnumber) throws Exception {
		try {
			List<WebElement> mousehover = owebdriver.findElements(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKPy0XrBoBpcM4VwzrbPIfm/i70gaPW9AtxvgxFK4F/5wBCyXnjQx6Di+gr1t7VqNyQVgV8kwaYsOhNKxX/aRp6UOT8g4crl3cMmu0RBTTULPuUR+ylX6ZPIsql1+U7b9Grj5H6jXbAz68qx8D7Ogy34hF3nUBdBPmqWWRtpSUdVTBEJWDg99kuPHku1/Sl94ZUct6Yx7uO8l4diVdI6uaVe8xIXW7xKI/pldqCpvJLWC01U3Bt16PUahw8Vq9FlATvusAEnfkEjXfPmt8qqxvq/3xn3XBr3XQufniSws9bKHt", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			int breakcount = 1;
			for (WebElement text : mousehover) {
				int i = 0;
				if (breakcount == 0)
					break; 
				Actions action = new Actions(owebdriver);
				action.moveToElement(text).perform();
				List<WebElement> elemment = owebdriver.findElements(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKPy0XrBoBpcM4VwzrbPIfm/i70gaPW9AtxvgxFK4F/5wBCyXnjQx6Di+gr1t7VqNyQVgV8kwaYsOhNKxX/aRp6UN/hJOrP62BMxeEBZ0AkD0cs/07NZDZYP0zhRoZhK4QADAlw+w/j8Og8hTsD/eER14kvyCbLr7qgYj/waTQNX0t", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				for (WebElement resulttext : elemment) {
					if (i == 0) {
						String value = owebdriver.findElement(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKPy0XrBoBpcM4VwzrbPIfm/i70gaPW9AtxvgxFK4F/5wBCyXnjQx6Di+gr1t7VqNyQVgV8kwaYsOhNKxX/aRp6UN/hJOrP62BMxeEBZ0AkD0cs/07NZDZYP0zhRoZhK4QADAlw+w/j8Og8hTsD/eER15ujYs01l50DIQsXnHCUw49v1GHcTvCqWStiSJP1j4W9nxMINZzmOd6Hcysi6Cez7o=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).getText();
						String[] Result = value.split("\n");
						String XAXISNAME = Result[0];
						for (int z = 1; z < Result.length; z++)
//							flow.StepPassWithoutScreenshot("Bar chart value is - " + Result[z] + " for the option - " + XAXISNAME); 
						System.out.println("Bar chart value is - " + Result[z] + " for the option - " + XAXISNAME);
						i++;
					} 
				} 
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFailWithoutScreenshot(Exception);
//			flow.StepFail("ExtractDatafromBarChart function error", true);
			e.printStackTrace();
		} 
	}

	public void ExtractDatafromLineChart(int indexnumber) throws Exception {
		try {
			WebElement start = owebdriver.findElement(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKPzCOmnRg0VETSPOWxzkHetPe9/OljpcuRCe1zxAAmvQG/s//r0rYdG069UDv0TyWLyCibo3RBBX2ckcmX4CeHc9o7G/H6uplnxMzu5lOoK/T/SXq+723ulSJB4ycWH9jN80+0nWtMq84and5GpmijPkQOzylea52HRVOj0zXFVRMkpJk3+x0oEpP1ph9dFtN9FyO5yjhJ3zpBmMA89ZsepL6A13OndRv+fCc/rzX95+4kBS5xNs3J8Qetizj/qaKD9L43f7Xim3cbnAmdrqOQrQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			Actions action1 = new Actions(owebdriver);
			action1.moveToElement(start).perform();
			List<WebElement> linemousehover = owebdriver.findElements(By.xpath(SingleDropCheckBox("u0xgQP8CuNyDw3rzysUKPzCOmnRg0VETSPOWxzkHetPe9/OljpcuRCe1zxAAmvQG/s//r0rYdG069UDv0TyWLyCibo3RBBX2ckcmX4CeHc9o7G/H6uplnxMzu5lOoK/T/SXq+723ulSJB4ycWH9jN80+0nWtMq84and5GpmijPkQOzylea52HRVOj0zXFVRMkpJk3+x0oEpP1ph9dFtN9FyO5yjhJ3zpBmMA89ZsepL6A13OndRv+fCc/rzX95+4kBS5xNs3J8Qetizj/qaKD9L43f7Xim3cbnAmdrqOQrQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			int breakcount = 1;
			for (WebElement text : linemousehover) {
				int i = 0;
				if (breakcount == 0)
					break; 
				Actions action = new Actions(owebdriver);
				action.moveToElement(text).perform();
				List<WebElement> elemment = owebdriver.findElements(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aAXHtyyS3PpebPALqz1L+RSqKZGCMBUJEcXyZUX22TsNG3Mx7Xuz1uAab3QKlTc+y8PfePCWnKvnl5zjtvNCEt+444B4ac9xQwL6YjXXwlTogtBNbuP4zLk6DH2mnqqK0w==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				for (WebElement resulttext : elemment) {
					if (i == 0) {
						String VALUE = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aAXHtyyS3PpebPALqz1L+RSqKZGCMBUJEcXyZUX22TsNG3Mx7Xuz1uAab3QKlTc+y/JAXiJqTFcv9g+rH/n+Pw7LMmHFHqn0k2FUcqqROaXGfRPDCU3ZP58zwbgsJdANXi/0Ekf/LloRMsj/4jXTxx5flvat2MJjjxegxV/QUCl3", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).getText();
						String[] Result = VALUE.split("\n");
						String XAXISNAME = Result[0];
						for (int z = 1; z < Result.length; z++)
//							flow.StepPassWithoutScreenshot("Line chart value is - " + Result[z] + " for the option - " + XAXISNAME); 
						System.out.println("Line chart value is - " + Result[z] + " for the option - " + XAXISNAME);
					} 
				} 
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ExtractDatafromLineChart function error", true);
			e.printStackTrace();
		} 
	}

	public String[] SecurityVisibilityCheck() throws Exception {
		try {
			List<WebElement> list = RetrieveWebElementList(By.xpath(SingleDropCheckBox("/NImjl8AaZsx+f5IOeTuJw==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			String[] siteslist = new String[list.size()];
			int i = 0;
			for (WebElement result : list) {
				siteslist[i] = result.getAttribute("title");
				System.out.println(siteslist[i]);
				i++;
			} 
			return siteslist;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SecurityVisibilityCheck function error", true);
			e.printStackTrace();
			return null;
		} 
	}

	public void TaskSecurityCheckbyReferenceIDinSites(String Sitestab, int Gridnumber, String referenceID, String presentcondition) throws Exception {
		try {
			boolean element = false;
			flow.ClickWebElement(Sitestab);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtPINM1V3tYQdI7X+VfVwRYc", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber))));
			flow.TurnOffImplicitWaits();
			try {
				flow.Timeout(3000);
				WebElement XP=owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtODidIAyk2aZORRQF73Yghb1djWXgw5dbKR8oEgJhpD3xE0KwG+Yt9ygFGf670Q91A=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+referenceID+\"", referenceID).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber))));
				element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtODidIAyk2aZORRQF73Yghb1djWXgw5dbKR8oEgJhpD3xE0KwG+Yt9ygFGf670Q91A=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+referenceID+\"", referenceID).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)))).isDisplayed();
			System.out.println(element);
			} catch (Exception e) {
				element = false;
			} 
			if (presentcondition.equalsIgnoreCase("Yes")) {
				if (element) {
//					flow.StepPass("Task is present in Sites with reference ID - " + referenceID, false);
					System.out.println("Task is present in Sites with reference ID - " + referenceID);
				} else {
//					flow.StepFail("Task is not present in Sites with reference ID - " + referenceID, false);
					System.out.println("Task is not present in Sites with reference ID - " + referenceID);
				} 
			} else if (!element) {
//				flow.StepPass("Task is not present in Sites with reference ID - " + referenceID, false);
				System.out.println("Task is not present in Sites with reference ID - " + referenceID);
			} else {
//				flow.StepFail("Task is present in Sites with reference ID - " + referenceID, false);
				System.out.println("Task is present in Sites with reference ID - " + referenceID);
			} 
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerificationbyProcessIDinSites function error", true);
			System.out.println("VerificationbyProcessIDinSites function error");
			e.printStackTrace();
		} 
	}
	public void TaskSecurityCheckbyTaskNameinSites(String Sitestab, int Gridnumber, String Taskname, String presentcondition) throws Exception {
		try {
			boolean element = false;
			flow.ClickWebElement(Sitestab);
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtPINM1V3tYQdI7X+VfVwRYc", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber))));
			flow.TurnOffImplicitWaits();
			try {
				flow.Timeout(3000);
//				System.out.println(owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtORg3R3sKmy6DQr7tPTuhyAiYgZmZ1S/JKp/s4fijsE8tkH0ev1FfgjsX6XbDnHYndCTUhCtJ0wiM+wUDUmOklUfEwg1nOY53odzKyLoJ7Pug==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Taskname+\"", String.valueOf(Taskname)))));
				element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtORg3R3sKmy6DQr7tPTuhyAiYgZmZ1S/JKp/s4fijsE8tkH0ev1FfgjsX6XbDnHYndCTUhCtJ0wiM+wUDUmOklUfEwg1nOY53odzKyLoJ7Pug==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+Taskname+\"", String.valueOf(Taskname)))).isDisplayed();
			   System.out.println(element);
			} catch (Exception e) {
				element = false;
			} 
			if (presentcondition.equalsIgnoreCase("Yes")) {
				if (element) {
//					flow.StepPass("Task is present in Sites with TaskName - " + Taskname, false);
					System.out.println("Task is present in Sites with TaskName - " + Taskname);
				} else {
//					flow.StepFail("Task is not present in Sites with TaskName - " + Taskname, false);
					System.out.println("Task is not present in Sites with TaskName - " + Taskname);
				} 
			} else if (!element) {
//				flow.StepPass("Task is not present in Sites with TaskName - " + Taskname, false);
				System.out.println("Task is not present in Sites with TaskName - " + Taskname);
			} else {
//				flow.StepFail("Task is present in Sites with TaskName - " + Taskname, false);
				System.out.println("Task is present in Sites with TaskName - " + Taskname);
			} 
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("TaskSecurityCheckbyTaskNameinSites function error", true);
			e.printStackTrace();
		} 
	}

	public void TaskSecurityCheckbyReferenceIDinTempo(String Tempotab, String referenceID, String presentcondition) throws Exception {
		try {
			boolean element = false;
			flow.ClickWebElement(Tempotab);
			flow.WaitforProgressBar();
			flow.TurnOffImplicitWaits();
			try {
				flow.Timeout(3000);
				element = owebdriver.findElement(By.xpath(SingleDropCheckBox("sotOui6/ldN4Fu5tjvASUJBV5vyCMREtr93S3aB5NMLeUMacxqwHEhJi7/zteFEU", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+referenceID+\"", referenceID))).isDisplayed();
			} catch (Exception exception) {}
			if (presentcondition.equalsIgnoreCase("Yes")) {
				if (element) {
//					flow.StepPass("Task is present in Tempo with reference ID - " + referenceID, false);
					System.out.println("Task is present in Tempo with reference ID - " + referenceID);
				} else {
//					flow.StepFail("Task is not present in Tempo with reference ID - " + referenceID, false);
					System.out.println("Task is not present in Tempo with reference ID - " + referenceID);
				} 
			} else if (!element) {
//				flow.StepPass("Task is not present in Tempo with reference ID - " + referenceID, false);
				System.out.println("Task is not present in Tempo with reference ID - " + referenceID);
			} else {
//				flow.StepFail("Task is present in Tempo with reference ID - " + referenceID, false);
				System.out.println("Task is present in Tempo with reference ID - " + referenceID);
			} 
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("TaskSecurityCheckbyReferenceIDinTempo function error", true);
			e.printStackTrace();
		} 
	}

	public void TaskSecurityCheckbyTaskNameinTempo(String Tempotab, String Taskname, String presentcondition) throws Exception {
		try {
			boolean element = false;
			flow.ClickWebElement(Tempotab);
			flow.WaitforProgressBar();
			flow.TurnOffImplicitWaits();
			try {
				element = owebdriver.findElement(By.xpath(SingleDropCheckBox("b4SGfDCx0q57PPeBabC1aNJWdsLFozg2AqmkRrGi5mCLuqKmfr10EuDIHunClNHQzwwVI+dhYDxCi/BtfO2kKw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Taskname+\"", Taskname))).isDisplayed();
			} catch (Exception exception) {}
			if (presentcondition.equalsIgnoreCase("Yes")) {
				if (element) {
//					flow.StepPass("Task is present in Tempo with TaskName - " + Taskname, false);
					System.out.println("Task is present in Tempo with TaskName - " + Taskname);
				} else {
//					flow.StepFail("Task is not present in Tempo with TaskName - " + Taskname, false);
					System.out.println("Task is not present in Tempo with TaskName - " + Taskname);
				} 
			} else if (!element) {
//				flow.StepPass("Task is not present in Tempo with TaskName - " + Taskname, false);
				System.out.println("Task is not present in Tempo with TaskName - " + Taskname);
			} else {
//				flow.StepFail("Task is present in Tempo with TaskName - " + Taskname, false);
				System.out.println("Task is present in Tempo with TaskName - " + Taskname);
			} 
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("TaskSecurityCheckbyTaskNameinTempo function error", true);
			e.printStackTrace();
		} 
	}

	public void SecurityCheckforRecordsorActionsorReportsByNameinSites(String tabname, String name, String presentcondition) throws Exception {
		try {
			boolean element = false;
			flow.ClickWebElement(tabname);
			flow.WaitforProgressBar();
			flow.TurnOffImplicitWaits();
			try {
				owebdriver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
				element = owebdriver.findElement(By.xpath(SingleDropCheckBox("TLkMyvVziLGavR3QSdn5hHWbbjY4w9B8uaoqlwOtmq0hOYhZWtjwBmcqN9OHjEyK5HIqUoeos71SotPNHmqXMt0eFqI3xah/kXM+Wj79GUDi77MbnbqhSRKeXC1XOiRTH7u0W7rBYQwtxfNxg27fBA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+name+\"", name))).isDisplayed();
				owebdriver.manage().timeouts().implicitlyWait(0L, TimeUnit.SECONDS);
			} catch (Exception exception) {}
			if (presentcondition.equalsIgnoreCase("Yes")) {
				if (element) {
//					flow.StepPass(String.valueOf(String.valueOf(String.valueOf(name))) + " is present in Sites", false);
					System.out.println(String.valueOf(String.valueOf(String.valueOf(name))) + " is present in Sites");
				} else {
//					flow.StepFail(String.valueOf(String.valueOf(String.valueOf(name))) + " is not present in Sites", false);
					System.out.println(String.valueOf(String.valueOf(String.valueOf(name))) + " is not present in Sites");
				} 
			} else if (!element) {
//				flow.StepPass(String.valueOf(String.valueOf(String.valueOf(name))) + " is not present in Sites", false);
				System.out.println(String.valueOf(String.valueOf(String.valueOf(name))) + " is not present in Sites");
			} else {
//				flow.StepFail(String.valueOf(String.valueOf(String.valueOf(name))) + " is present in Sites", false);
				System.out.println(String.valueOf(String.valueOf(String.valueOf(name))) + " is present in Sites");
			} 
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SecurityCheckforRecordsorActionsorReportsByNameinSites function error", true);
			e.printStackTrace();
		} 
	}

	public void SecurityCheckforRecordsorActionsorReportsByNameinTempo(String Tempotab, String name, String presentcondition) throws Exception {
		try {
			boolean element = false;
			flow.ClickWebElement(Tempotab);
			flow.WaitforProgressBar();
			flow.TurnOffImplicitWaits();
			try {
				owebdriver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
				element = owebdriver.findElement(By.xpath(SingleDropCheckBox("TLkMyvVziLGavR3QSdn5hHWbbjY4w9B8uaoqlwOtmq0hOYhZWtjwBmcqN9OHjEyK5HIqUoeos71SotPNHmqXMt0eFqI3xah/kXM+Wj79GUDi77MbnbqhSRKeXC1XOiRTH7u0W7rBYQwtxfNxg27fBA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+name+\"", name))).isDisplayed();
				owebdriver.manage().timeouts().implicitlyWait(0L, TimeUnit.SECONDS);
			} catch (Exception exception) {}
			if (presentcondition.equalsIgnoreCase("Yes")) {
				if (element) {
//					flow.StepPass(String.valueOf(String.valueOf(String.valueOf(name))) + " is present in Tempo", false);
					System.out.println(String.valueOf(String.valueOf(String.valueOf(name))) + " is present in Tempo");
				} else {
//					flow.StepFail(String.valueOf(String.valueOf(String.valueOf(name))) + " is not present in Tempo", false);
					System.out.println(String.valueOf(String.valueOf(String.valueOf(name))) + " is not present in Tempo");
				} 
			} else if (!element) {
//				flow.StepPass(String.valueOf(String.valueOf(String.valueOf(name))) + " is not present in Tempo", false);
				System.out.println(String.valueOf(String.valueOf(String.valueOf(name))) + " is not present in Tempo");
			} else {
//				flow.StepFail(String.valueOf(String.valueOf(String.valueOf(name))) + " is present in Tempo", false);
				System.out.println(String.valueOf(String.valueOf(String.valueOf(name))) + " is present in Tempo");
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SecurityCheckforRecordsorActionsorReportsByNameinTempo function error", true);
			e.printStackTrace();
		} 
	}

	public void BulkSecurityTestingforSitesTasks(String SecurityTab, int Gridnumber) throws Exception {
		try {
//			flow.StepInfoWithoutScreenshot("Task Name Check for Sites with Grid");
			System.out.println("Task Name Check for Sites with Grid");
			String ApplicationURL = new String();
			List<HashMap<String, String>> mydata = new ArrayList<>();
			List<HashMap<String, String>> myapplicationdata = new ArrayList<>();
			String apppath = new String();
				apppath = String.valueOf(System.getProperty("user.dir")) +"\\Security.xlsx";
				System.out.println(apppath);
			Excel Application = new Excel(apppath, "Application URL");
			myapplicationdata = Excel.getcelldata();
			for (HashMap<String, String> mtestcase : myapplicationdata)
				ApplicationURL = mtestcase.get("Application URL"); 
			String inputpath = new String();
				inputpath = String.valueOf(System.getProperty("user.dir")) + "\\Security.xlsx";
			Excel inputsheet = new Excel(inputpath, "Security");
			mydata = Excel.getcelldata();
			for (HashMap<String, String> mtestcase : mydata) {
				if (mtestcase.get("Execution_flag") != null && (
						(String)mtestcase.get("Execution_flag")).trim().equalsIgnoreCase("Y")) {
//					flow.StepInfoWithoutScreenshot("Logged in user - " + (String)mtestcase.get("User Name"));
					System.out.println("Logged in user - " + (String)mtestcase.get("User Name"));
//					flow.StepInfoWithoutScreenshot("Group name of the user - " + (String)mtestcase.get("Group Name"));
					System.out.println("Group name of the user - " + (String)mtestcase.get("Group Name"));
					flow.OpenURL(ApplicationURL);
					List<HashMap<String, String>> mysecuritydata = new ArrayList<>();
					String sheetname = mtestcase.get("Group Name");
					System.out.println(sheetname);
					Excel securitysheet = new Excel(apppath, sheetname);
					mysecuritydata = Excel.getcelldata();
					flow.LoginwithUserNameandPassword(mtestcase.get("User Name"), mtestcase.get("Password"));
					flow.ClickWebElement(SecurityTab);
					flow.WaitforProgressBar();
					flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Cnp095ZoHeBSR2gJEIi2gM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber))));
					flow.TurnOffImplicitWaits();
					for (HashMap<String, String> msecuritytestcase : mysecuritydata) {
						String checktest = new String();
						for (Map.Entry<String, String> entry : msecuritytestcase.entrySet())
							checktest = entry.getValue(); 
						checktest = msecuritytestcase.get("Task name to which user should have access");
						if (checktest != null) {
							boolean element = false;
							try {
								element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/GVMD9Qw0kJqvhgJIZzVC7yuZak95c+HNH3odkAttFNAC9qd8RHNWVenCGruWkqdZxGWeiFUsP31xdqvPI1m8UI=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+checktest+\"", checktest))).isDisplayed();
							} catch (Exception e) {
								element = false;
							} 
							if (element) {
//								flow.StepPassWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should have access is present");
								System.out.println(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should have access is present");
								continue;
							} 
//							flow.StepFailWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should have access is not present");
							System.out.println(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should have access is not present");
						} 
					} 
					for (HashMap<String, String> msecuritytestcase : mysecuritydata) {
						String checktest = new String();
						for (Map.Entry<String, String> entry : msecuritytestcase.entrySet())
							checktest = entry.getValue(); 
						checktest = msecuritytestcase.get("Task name to which user should not have access");
						if (checktest != null) {
							boolean element = false;
							try {
								element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/GVMD9Qw0kJqvhgJIZzVC7yuZak95c+HNH3odkAttFNAC9qd8RHNWVenCGruWkqdZxGWeiFUsP31xdqvPI1m8UI=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+checktest+\"", checktest))).isDisplayed();
							} catch (Exception e) {
								element = false;
							} 
							if (!element) {
//								flow.StepPassWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should not have access is not present");
								System.out.println(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should not have access is not present");
								continue;
							} 
//							flow.StepFailWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should not have access is present");
							System.out.println(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should not have access is present");
						} 
					} 
					flow.Logout();
					flow.TurnOnImplicitWaits();
				} 
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("BulkSecurityTestingforSitesTasks function error", true);
			e.printStackTrace();
		} 
	}

	public void BulkSecurityTestingforTempoTasks(String SecurityTab) throws Exception {
		try {
//			flow.StepInfoWithoutScreenshot("Task Name Check for Tempo");
			System.out.println("Task Name Check for Tempo");
			String ApplicationURL = new String();
			List<HashMap<String, String>> mydata = new ArrayList<>();
			List<HashMap<String, String>> myapplicationdata = new ArrayList<>();
			String Securitypath = new String();
			Securitypath = System.getProperty("user.dir") +"//Security.xlsx";
			Excel Application = new Excel(Securitypath, "Application URL");
			myapplicationdata = Excel.getcelldata();
			for (HashMap<String, String> mtestcase : myapplicationdata)
				ApplicationURL = mtestcase.get("Application URL"); 
			Excel inputsheet = new Excel(Securitypath, "Security");
			mydata = Excel.getcelldata();
			for (HashMap<String, String> mtestcase : mydata) {
				if (mtestcase.get("Execution_flag") != null && (
						(String)mtestcase.get("Execution_flag")).trim().equalsIgnoreCase("Y")) {
//					flow.StepInfoWithoutScreenshot("Logged in user - " + (String)mtestcase.get("User Name"));
					System.out.println("Logged in user - " + (String)mtestcase.get("User Name"));
//					flow.StepInfoWithoutScreenshot("Group name of the user - " + (String)mtestcase.get("Group Name"));
					System.out.println("Group name of the user - " + (String)mtestcase.get("Group Name"));
					flow.OpenURL(ApplicationURL);
					List<HashMap<String, String>> mysecuritydata = new ArrayList<>();
					String sheetname = mtestcase.get("Group Name");
					Excel securitysheet = new Excel(Securitypath, sheetname);
					mysecuritydata = Excel.getcelldata();
					flow.LoginwithUserNameandPassword(mtestcase.get("User Name"), mtestcase.get("Password"));
					String CheckURL = owebdriver.getCurrentUrl();
					flow.ClickWebElement(SecurityTab);
					flow.ExplicitWait(By.xpath(SingleDropCheckBox("VYdKSJvKKU52q3Hq1m9DJLRYKUgnZBkP+kCmLD0vpapufmlzeIqBIcYYrcqBOUY5LwYj8ettAq1NxLIFj/UmIg==", this.FF23242524354dfdgdgdgsdfsdfd5)));
					flow.TurnOffImplicitWaits();
					for (HashMap<String, String> msecuritytestcase : mysecuritydata) {
						String checktest = new String();
						for (Map.Entry<String, String> entry : msecuritytestcase.entrySet())
							checktest = entry.getValue(); 
						checktest = msecuritytestcase.get("Task name to which user should have access");
						if (checktest != null) {
							boolean element = false;
							try {
								element = owebdriver.findElement(By.xpath(SingleDropCheckBox("sotOui6/ldN4Fu5tjvASUMPSxSKGt7g+Cn0TeoKAUGWgBgHx3+1VlIU891o6JpJd", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+checktest+\"", checktest))).isDisplayed();
							} catch (Exception e) {
								element = false;
							} 
							if (element) {
//								flow.StepPassWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should have access is present");
								System.out.println(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should have access is present");
								continue;
							} 
//							flow.StepFailWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should have access is not present");
							System.out.println(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should have access is not present");
						} 
					} 
					for (HashMap<String, String> msecuritytestcase : mysecuritydata) {
						String checktest = new String();
						for (Map.Entry<String, String> entry : msecuritytestcase.entrySet())
							checktest = entry.getValue(); 
						checktest = msecuritytestcase.get("Task name to which user should not have access");
						if (checktest != null) {
							boolean element = false;
							try {
								element = owebdriver.findElement(By.xpath(SingleDropCheckBox("sotOui6/ldN4Fu5tjvASUMPSxSKGt7g+Cn0TeoKAUGWgBgHx3+1VlIU891o6JpJd", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+checktest+\"", checktest))).isDisplayed();
							} catch (Exception e) {
								element = false;
							} 
							if (!element) {
//								flow.StepPassWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should not have access is not present");
								System.out.println(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should not have access is not present");
								continue;
							} 
//							flow.StepFailWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should not have access is present");
							System.out.println(String.valueOf(String.valueOf(String.valueOf(checktest))) + "- task name to which user should not have access is present");
						} 
					} 
					flow.Logout();
					flow.TurnOnImplicitWaits();
				} 
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("BulkSecurityTestingforTempoTask function error", true);
			e.printStackTrace();
		} 
	}

	public void CreatePostinNewsTab(String postcontent) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("YhyntR3nVUo+suCyf+lDqQ==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("YhyntR3nVUo+suCyf+lDqQ==", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("3M/aga53RtxZTB7yN7DHxE2YgPYLmX0knTkKR1qkPDg2cp5kZ3l4MD9PSyrrUUUC", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("3M/aga53RtxZTB7yN7DHxE2YgPYLmX0knTkKR1qkPDg2cp5kZ3l4MD9PSyrrUUUC", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { postcontent });
			flow.Timeout(3000L);
			flow.ClickButtonBasedonName("Post");
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("CreatePostinNewsTab function error", true);
			e.printStackTrace();
		} 
	}

	public void CreateMessageinNewsTab(String messagecontent, String messagerecipients) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("YhyntR3nVUo+suCyf+lDqQ==", this.FF23242524354dfdgdgdgsdfsdfd5)));//(.//input)[2]
			owebdriver.findElement(By.xpath(SingleDropCheckBox("YhyntR3nVUo+suCyf+lDqQ==", this.FF23242524354dfdgdgdgsdfsdfd5))).click();//(.//input)[2]
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("2hoYpxL/0TTYZIwzB/q2L4gGrGRuCTVPN0/8AXMOn+c=", this.FF23242524354dfdgdgdgsdfsdfd5)));//.//a[text()='Message']
			owebdriver.findElement(By.xpath(SingleDropCheckBox("2hoYpxL/0TTYZIwzB/q2L4gGrGRuCTVPN0/8AXMOn+c=", this.FF23242524354dfdgdgdgsdfsdfd5))).click();//.//a[text()='Message']
			String[] recipients = messagerecipients.split(",");
			System.out.println(recipients);
			if (recipients.length == 1) {
				for (int k=0; k<recipients[0].length(); k++) {
					String character = Character.toString(recipients[0].charAt(k));
					owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC44Phm6thE80ETxPY7A+FOr2ooZMmrfO62mTNt9PKy9c", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(character);//.//input[@placeholder='Add recipients']
				}
				flow.Timeout(4000);
				owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC44Phm6thE80ETxPY7A+FOr2ooZMmrfO62mTNt9PKy9c", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(Keys.ENTER);//.//input[@placeholder='Add recipients']
			}
			else
			{
				for(int i=0;i<recipients.length;i++)
				{
					for(int k=0;k<recipients[i].length();k++)
					{
						String character = Character.toString(recipients[i].charAt(k));
						System.out.println(character);
						owebdriver.findElement(By.xpath(SingleDropCheckBox("4JeapH53uc9tgQVMbI15gw==", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(character);//(.//input)[3]

					}
					flow.Timeout(4000);
					owebdriver.findElement(By.xpath(SingleDropCheckBox("4JeapH53uc9tgQVMbI15gw==", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(Keys.ENTER );//(.//input)[3]
				}
			}
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("3M/aga53RtxZTB7yN7DHxILXrj2AxFn4095D278zOpA/dwLwfDc5xElVDyRSABIu", this.FF23242524354dfdgdgdgsdfsdfd5)));//.//textarea[@placeholder='Type message here']
			owebdriver.findElement(By.xpath(SingleDropCheckBox("3M/aga53RtxZTB7yN7DHxILXrj2AxFn4095D278zOpA/dwLwfDc5xElVDyRSABIu", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { messagecontent });//.//textarea[@placeholder='Type message here']
			flow.Timeout(3000L);
			flow.ClickButtonBasedonName("Send Message");
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("CreateMessageinNewsTab function error", true);
			e.printStackTrace();
		}
	}

	public void CreateTaskinNewsTab(String Taskcontent, String taskassignee) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("YhyntR3nVUo+suCyf+lDqQ==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("YhyntR3nVUo+suCyf+lDqQ==", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("w8YoxRPVU/1J51H40uE620KdG7xm/wZs2IkSj82N0mk=", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("w8YoxRPVU/1J51H40uE620KdG7xm/wZs2IkSj82N0mk=", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
			for (int j = 0; j < taskassignee.length(); j++) {
				String character = Character.toString(taskassignee.charAt(j));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC3aygE7WqKKrLwkhTrUOosQfvZE7DPNtU46r+l+pZCqY", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { character });
				Thread.sleep(100L);
			} 
			flow.Timeout(5000L);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC3aygE7WqKKrLwkhTrUOosQfvZE7DPNtU46r+l+pZCqY", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("3M/aga53RtxZTB7yN7DHxH1Op8br7kUaIDv0t41eQGJn0s4cEVwOYFZJOmtiEszlhif7sA+9SQbK7kPh/NdPUg==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("3M/aga53RtxZTB7yN7DHxH1Op8br7kUaIDv0t41eQGJn0s4cEVwOYFZJOmtiEszlhif7sA+9SQbK7kPh/NdPUg==", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { Taskcontent });
			flow.Timeout(3000L);
			flow.ClickButtonBasedonName("Send Task");
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("CreateTaskinNewsTab function error", true);
			e.printStackTrace();
		} 
	}

	public void GiveKudosinNewsTab(String postcontent, String kudosrecepient) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("YhyntR3nVUo+suCyf+lDqQ==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("YhyntR3nVUo+suCyf+lDqQ==", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
			owebdriver.findElement(By.xpath(SingleDropCheckBox("ZHDEsTbL5Pnackhrjf3XtMzcturt20mVJ3tBv9Eqx6w=", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
			for (int j = 0; j < kudosrecepient.length(); j++) {
				String character = Character.toString(kudosrecepient.charAt(j));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC1A6QFJn6yIupsWLxGR+LjeTFmll7gWw8CvM8bkwstAA", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { character });
				Thread.sleep(100L);
			} 
			flow.Timeout(5000L);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDC1A6QFJn6yIupsWLxGR+LjeTFmll7gWw8CvM8bkwstAA", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("3M/aga53RtxZTB7yN7DHxBrgakaY+FCKPBpQSb3TAsSnbQD3WRDRTzAU8lToQagS", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("3M/aga53RtxZTB7yN7DHxBrgakaY+FCKPBpQSb3TAsSnbQD3WRDRTzAU8lToQagS", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { postcontent });
			flow.Timeout(3000L);
			flow.ClickButtonBasedonName("Give Kudos");
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("GiveKudosinNewsTab function error", true);
			e.printStackTrace();
		} 
	}

	public void ExtractInformationfromNewsinNewsTab(String News) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("YJq/Lz+58IAG9468ecEcgQ==", this.FF23242524354dfdgdgdgsdfsdfd5)));//(.//input)[2]
			owebdriver.findElement(By.xpath(SingleDropCheckBox("YJq/Lz+58IAG9468ecEcgQ==", this.FF23242524354dfdgdgdgsdfsdfd5))).clear();//(.//input)[2]
			flow.VerifyNewsinNewsTab(News);
			flow.Timeout(3000);
			// List<WebElement> newscount = owebdriver.findElements(By.xpath(SingleDropCheckBox("j56sVezr+TMbpLzZ9ITxOwAKSDDq5y1humQS7HkT/NuXq9otv/d1yM1FYtibKGVH8lJ0wmAwstgmMOPI4/GRqw==", this.FF23242524354dfdgdgdgsdfsdfd5)));//.//div[@class='appian-feed-entry-message GBBMY-IKUC']
			List<WebElement> newscount = owebdriver.findElements(By.xpath(SingleDropCheckBox("j56sVezr+TMbpLzZ9ITxOwAKSDDq5y1humQS7HkT/Nvx7fYKss5W4qeU4FfIcrlByajOUBQnhPA6Bk2s5mzd7Ednk5Hrk8LSJNQl2sAUnEBa3HLXPd+VfQ94BMmomfoE", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+News+\"", News)));
			// List<WebElement> newscount = owebdriver.findElements(By.xpath(".//div[@class='appian-feed-entry-message GPGIXADDKUC' and contains(text(),'"+News+"')]"));
			System.out.println(newscount.get(0));
			int size = newscount.size();
			System.out.println(size);
			if (size == 0)
			{
//				flow.StepFailWithoutScreenshot("No such information is available");
				System.out.println("No such information is available");
			}
			else {
//				flow.StepPassWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(News))) + "- is having " + size + " Matches in the news feed");
				System.out.println(String.valueOf(String.valueOf(String.valueOf(News))) + "- is having " + size + " Matches in the news feed");
				flow.TurnOffImplicitWaits();
				for (int c = 1; c <= newscount.size(); c++) {
					String newspostedperson = owebdriver.findElement(By.xpath(SingleDropCheckBox("JnnDisetw7BXeqAG7AGx0vpT7AsIa6vzGpkiA6rzcvzGD9h0wxPxGSthvgU6tA7TfhxRKmy4FlhSzo6Ha/EH6A==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+c+\"", String.valueOf(c)))).getAttribute("innerText");//(.//a[@class='gwt-Anchor appian-feed-entry-author'])["+c+"]
//					flow.StepPassWithoutScreenshot("Person who posted the " + c + "st news" + newspostedperson);
					System.out.println("Person who posted the " + c + "st news" + newspostedperson);
					List<WebElement> filetypes = owebdriver.findElements(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aBiuIdWK1pFlzh4TZQw8q/FiEti0jogv4S/xjtkliQvze2GPX3DOx5hxU2ITx76FtmGulQDlKuRbQwhtdJWVMjnJbrD7YW2H6OwuaAl1JNHAN6Nlctwt0AK1us10dERJ9InQ443EqbACcfYeTOxgbY0Fmw5r8o8F+JnwyCh3EOPaC3/fINDU03dl05jQQJrGfABph+0yc6iDgfjEDr9lndg=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+c+\"", String.valueOf(c))));//(.//div[@class='appian-feed-entry GBBMY-ILQC appian-feed-entry-business-event'])["+c+"]//div[@class='GBBMY-ICQB']//div[@class='GBBMY-IEQB GBBMY-IHQB']//div[2]//p[1]//a
					if (!filetypes.isEmpty())
						for (int i = 1; i <= filetypes.size(); i++) {
							String filenametext = owebdriver.findElement(By.xpath(SingleDropCheckBox("HxAV8Pbw9tzc1D+dQ6Af3jWlhcGpE16bMgfVh8j4QWz5mec3wuZf6IUYvnDu5szWfVdOQ7XWumFgSDGyWG2r8eOAe+34DH6M7EO+jtkigVmDRzvORov0g1iSRR9S7p2qe8Kdo6eIkY/tCvuLeXX5UNo2oq3XAy11dYlv4cZie+u7GHyG1EBjgz9WJE4GOIzItpRBQiQWZtgN67lVryGKZrub8wrcHasEzo5e3PoE/B8=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+c+\"", String.valueOf(c)).replace("\"+i+\"", String.valueOf(i)))).getAttribute("innerText");//((.//div[@class='appian-feed-entry GBBMY-ILQC appian-feed-entry-business-event'])["+c+"]//div[@class='GBBMY-ICQB']//div[@class='GBBMY-IEQB GBBMY-IHQB']//div[2])["+i+"]//p//a
//							flow.StepPassWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(i))) + "st File name - " + filenametext + " " + "for the " + c + "st news");
							System.out.println(String.valueOf(String.valueOf(String.valueOf(i))) + "st File name - " + filenametext + " " + "for the " + c + "st news");
							String filetype = owebdriver.findElement(By.xpath(SingleDropCheckBox("HxAV8Pbw9tzc1D+dQ6Af3jWlhcGpE16bMgfVh8j4QWz5mec3wuZf6IUYvnDu5szWfVdOQ7XWumFgSDGyWG2r8eOAe+34DH6M7EO+jtkigVmDRzvORov0g1iSRR9S7p2qe8Kdo6eIkY/tCvuLeXX5UNo2oq3XAy11dYlv4cZie+u7GHyG1EBjgz9WJE4GOIzItpRBQiQWZtgN67lVryGKZnxNJ3M6RJXqxj+OnJJe+Z0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+c+\"", String.valueOf(c)).replace("\"+i+\"", String.valueOf(i)))).getAttribute("innerText");
//							flow.StepPassWithoutScreenshot(String.valueOf(String.valueOf(String.valueOf(i))) + "st File type - " + filetype + " " + "for the " + c + "st news");
							System.out.println(String.valueOf(String.valueOf(String.valueOf(i))) + "st File type - " + filetype + " " + "for the " + c + "st news");
						}  
				}
			}
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ExtractInformationfromNewsinNewsTab function error", true);
			e.printStackTrace();
		}
	}

	public void VerifyNewsinNewsTab(String newstext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("YJq/Lz+58IAG9468ecEcgQ==", this.FF23242524354dfdgdgdgsdfsdfd5)));//(.//input)[2]
			owebdriver.findElement(By.xpath(SingleDropCheckBox("YJq/Lz+58IAG9468ecEcgQ==", this.FF23242524354dfdgdgdgsdfsdfd5))).clear();
			flow.PopulateTextFieldBasedonPlaceholderText("Search news", newstext);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDCz5qQMGFDU0blqM2Ga1SI0hgc+MDXqK+cfk230eDlday", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
			flow.Timeout(5000L);
			// String retrievetext = owebdriver.findElement(By.xpath(SingleDropCheckBox("j56sVezr+TMbpLzZ9ITxOwAKSDDq5y1humQS7HkT/Nue4EfREnyIakJT8B/Dg5p88qs5fyhNHifsGhlTOAGbuCMvZ9NARuC3/G3hRjPvOODDK0yTT9Rpvd5l+oBHKqA9r3n+RHXqBGqT/+vn/d4+pncXBXYLQQgo1b6px8PvxOkvBiPx620CrU3EsgWP9SYi", this.FF23242524354dfdgdgdgsdfsdfd5))).getText();//.//div[@class='appian-feed-entry GBBMY-ILQC appian-feed-entry-business-event']//div[@class='appian-feed-entry-message GBBMY-IKUC']
			String retrievetext = owebdriver.findElement(By.xpath(SingleDropCheckBox("lfMdzs0wRvaSaje7J4/+x31XTkO11rphYEgxslhtq/EphEJl/bMr7KI5Urjgp+0F8lJ0wmAwstgmMOPI4/GRqw==", this.FF23242524354dfdgdgdgsdfsdfd5))).getText();
			// String retrievetext =owebdriver.findElement(By.xpath("//div[@class='appian-feed-entry-message GPGIXADDKUC']")).getText();
			String text = retrievetext.replace("\n", "");
			if (text.equals(newstext)) {
//				flow.StepPassWithoutScreenshot("Search news is working fine and the news fetched from UI is  - " + retrievetext);
				System.out.println("Search news is working fine and the news fetched from UI is  - " + retrievetext);
			} else {
//				flow.StepFailWithoutScreenshot("Search news is not working fine and the news fetched from UI is - " + retrievetext);
				System.out.println("Search news is not working fine and the news fetched from UI is - " + retrievetext);
			}
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyNewsinNewsTab function error", true);
			e.printStackTrace();
		}
	}

	public void AddCommentfortheNews(String news, String comments) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("YJq/Lz+58IAG9468ecEcgQ==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("YJq/Lz+58IAG9468ecEcgQ==", this.FF23242524354dfdgdgdgsdfsdfd5))).clear();
			flow.PopulateTextFieldBasedonPlaceholderText("Search news", news);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("YJq/Lz+58IAG9468ecEcgQ==", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
			Thread.sleep(5000L);
			flow.Timeout(5000);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("zikpmoH0LOdmGnjjeUHx0uk1UY2c5veyiT2Fzd1tTU0=", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
			flow.Timeout(2000L);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("fIfiyxMA2DcprQIsmqMTcV+W9q3YwmOPF6DFX9BQKXc=", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { comments });
			flow.Timeout(2000L);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("HrkfVuMPs4ebzhq+xs+u5Mt/L1umOp9rV46/OwMMhs1flvat2MJjjxegxV/QUCl3", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
			flow.Timeout(2000L);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("AddCommentfortheNews function error", true);
			e.printStackTrace();
		}
	}

	public void DeleteNews(String news) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("YJq/Lz+58IAG9468ecEcgQ==", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("YJq/Lz+58IAG9468ecEcgQ==", this.FF23242524354dfdgdgdgsdfsdfd5))).clear();
			flow.PopulateTextFieldBasedonPlaceholderText("Search news", news);
			flow.Timeout(2000L);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("6joiwpsm946nlW93SnqDCz5qQMGFDU0blqM2Ga1SI0hgc+MDXqK+cfk230eDlday", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
			// flow.WaitforProgressBar();
			flow.Timeout(5000);
			// flow.ClickLinkBasedonName("Delete");
			flow.ClickPartialLinkBasedonNamewithIndex("Delete", 1);
			flow.Timeout(3000L);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("UzydxljBvlZWF7JXakmNbJg0TUUK9VReTWJH1GkvZ5A=", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
			flow.Timeout(3000L);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("AddCommentfortheNews function error", true);
			e.printStackTrace();
		}
	}

	public void SingleSelectDropDownforGrid(String inputtext, int gridnumber, int rownumber, int columnnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C+wjDD7vlBNbPKm+0vZ5WluJqNbchZef+3acm0bGtBmSQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C+wjDD7vlBNbPKm+0vZ5WluJqNbchZef+3acm0bGtBmSQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			element.click();
			element.sendKeys(new CharSequence[] { inputtext });
			element.sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SingleSelectDropDown for the grid " + gridnumber + " at the row " + rownumber + " and at the column " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void MultiSelectDropDownforGrid(String text, int gridnumber, int rownumber, int columnnumber) throws Exception {
		try {
			String[] Text = text.split(",");
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C9GexaPEVlrPcUB3VzXNCUi", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			WebElement dropdown = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C9GexaPEVlrPcUB3VzXNCUi", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			dropdown.click();
			flow.TurnOffImplicitWaits();
			for (int i = 0; i < Text.length; i++) {
				try {
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VL+gWUHQffSIusTm6fYqqQcYi108srUEYVGAQxcyQNE/", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Text[i]+\"", Text[i]))).click();
				} catch (Exception e) {
//					flow.StepFail("Option is not available - " + Text[i], false);
					System.out.println("Option is not available - " + Text[i]);
				} 
			} 
			flow.TurnOnImplicitWaits();
			dropdown.sendKeys(new CharSequence[] { (CharSequence)Keys.ESCAPE });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultiSelectDropDownforGrid function error", true);
			e.printStackTrace();
		} 
	}

	public void SelectValuefromPickeronGrid(String Text, int gridnumber, int rownumber, int columnnumber) throws Exception {
		try {
			String[] valuetext = Text.split(",");
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/oi5ZMfqCS3BS1Cha8lLxtOG2YNfkaJJ9FY/8w4fvmDzYMC+Mx9h1hW6eJphXw9+QXYXrEztVcA7tnd7ZPGa12gWINFcY+o/rHOzxdYekWk9", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			for (int j = 0; j < valuetext.length; j++) {
				for (int i = 0; i < valuetext[j].length(); i++) {
					String character = Character.toString(valuetext[j].charAt(i));
					owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/oi5ZMfqCS3BS1Cha8lLxtOG2YNfkaJJ9FY/8w4fvmDzYMC+Mx9h1hW6eJphXw9+QXYXrEztVcA7tnd7ZPGa12gWINFcY+o/rHOzxdYekWk9", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber)))).sendKeys(new CharSequence[] { character });
				} 
				flow.Timeout(1000L);
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j])));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24dIb0bzz0ADoHJJIXjvXCOE8EIZ3vafvKTjbDF62xiIh", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+valuetext[j]+\"", valuetext[j]))).click();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("Picker for the grid " + gridnumber + " at the row " + rownumber + " and at the column " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickGridWebElementUsingIndex(int Gridnumber, int rownumber, int columnnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/BfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQg15PQahpoG0ciCXTYef0XM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
			flow.TurnOffImplicitWaits();
			try {
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/BfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQkdvF0vsl4vLEIg0UvaX6uo=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
				JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
				executor.executeScript("arguments[0].click();", new Object[] { element });
			} catch (Exception e) {
				try {
					WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/BfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQv6CigNf9ohNRYiqW9ThBOE=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
					JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
					executor.executeScript("arguments[0].click();", new Object[] { element });
				} catch (Exception e1) {
					try {
						WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/BfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQm2T7ob6f09ITXCDyQi9AVs=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
						JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
						executor.executeScript("arguments[0].click();", new Object[] { element });
					} catch (Exception e2) {
						try {
							WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/BfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQnBnbTyrNlOzyCXBZwKhK9U=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
							JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
							executor.executeScript("arguments[0].click();", new Object[] { element });
						} catch (Exception e3) {
							flow.TurnOnImplicitWaits();
							String Exception = Throwables.getStackTraceAsString(e);
//							flow.StepFail("ClickGridWebElementUsingIndex function error", true);
							System.out.println("ClickGridWebElementUsingIndex function error");
							e.printStackTrace();
						} 
					} 
				} 
			} 
		} catch (Exception e) {
			flow.TurnOnImplicitWaits();
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickGridWebElement for the grid " + Gridnumber + " at the row " + rownumber + " and at the column " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClickGridWebElementUsingText(int Gridnumber, String inputtext) throws Exception {
		try {
			String INPUTTEXT = flow.CaptilizeText(inputtext);
			String capitaltext = inputtext.toUpperCase();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtMJ/0byDGQEpk0NRIZQlkf4gz9b4ijXkEX16TAeFdsWMvrsM3Go783jxp8ye6PS3dsCJNg5kja0H/WRkYX8V1h9iSx0+TqovErnwGcQXR/C7dA0VcSLlSevw8Y5Lr1DRqk=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+capitaltext+\"", capitaltext).replace("\"+INPUTTEXT+\"", INPUTTEXT).replace("\"+inputtext+\"", inputtext).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+INPUTTEXT+\"", String.valueOf(INPUTTEXT))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtMJ/0byDGQEpk0NRIZQlkf4gz9b4ijXkEX16TAeFdsWMvrsM3Go783jxp8ye6PS3dsCJNg5kja0H/WRkYX8V1h9iSx0+TqovErnwGcQXR/C7dA0VcSLlSevw8Y5Lr1DRqk=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+capitaltext+\"", capitaltext).replace("\"+INPUTTEXT+\"", INPUTTEXT).replace("\"+inputtext+\"", inputtext).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+INPUTTEXT+\"", String.valueOf(INPUTTEXT))));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickGridWebElement with the text " + inputtext + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void SelectCheckBoxonGrid(int Gridnumber, int Rownumber, int Columnnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/BfPtYs0h3yIF2xDfBEbZEKCjotnF3stjBW2AxSHuc+9WSpU/tTxSGhsyMWx7rIfnW9Kvx38Wo3T+OUecCcGJxjSETXwIPmVgk8wQ1w3cRnq", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+Rownumber+\"", String.valueOf(Rownumber)).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/BfPtYs0h3yIF2xDfBEbZEKCjotnF3stjBW2AxSHuc+9WSpU/tTxSGhsyMWx7rIfnW9Kvx38Wo3T+OUecCcGJxjSETXwIPmVgk8wQ1w3cRnq", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+Rownumber+\"", String.valueOf(Rownumber)).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
			executor.executeScript("arguments[0].click();", new Object[] { element });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectCheckBox in the grid " + Gridnumber + " at the row " + Rownumber + " and at the column " + Columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyTextPresentinGrid(int Gridumber, String text) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/OZvctq4JvzdZ4ttBGowBHqOUQSFd8R9c+aovTt7iMwb", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", text)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/OZvctq4JvzdZ4ttBGowBHqOUQSFd8R9c+aovTt7iMwb", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", text))).isDisplayed();
//			flow.StepPassWithoutScreenshot("Text is present in Grid - " + text);
			System.out.println("Text is present in Grid - " + text);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyTextPresentinGrid at the grid " + Gridumber + " function error", true);
			e.printStackTrace();
		} 
	}

	public String RetrieveTextPresentinGrid(int Gridumber, int rownumber, int columnnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Al5ZPoUJ3Wiv3aM9kFnPBOYFpzFVqitfanql5Be2LxWJwrngWpFs/UbiprLpXoVjpHIgQxHgcXI+0EvZEdvXlI7hJzhOSz914aHUX/pqUMT/gmgZK4T059E7OyNmNuqnRPn8oC2PgLX8M4br4bgEHDDakIF/KXF5YsnSwsvRN3JbuxQpXNvoiBG8X00pd7iP0DVklMwqfHbcUPzGbl/9SFcubEgsA6JvkxEzXH7Au+XkVFjG1JJAUjcib28XcMBbJKkyMR9bm03aaDD3H1r+VU=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+Gridumber+\"", String.valueOf(Gridumber))));
			String text = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Al5ZPoUJ3Wiv3aM9kFnPBOYFpzFVqitfanql5Be2LxWJwrngWpFs/UbiprLpXoVjpHIgQxHgcXI+0EvZEdvXlI7hJzhOSz914aHUX/pqUMT/gmgZK4T059E7OyNmNuqnRPn8oC2PgLX8M4br4bgEHDDakIF/KXF5YsnSwsvRN3JbuxQpXNvoiBG8X00pd7iP0DVklMwqfHbcUPzGbl/9SFcubEgsA6JvkxEzXH7Au+XkVFjG1JJAUjcib28XcMBbJKkyMR9bm03aaDD3H1r+VU=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+Gridumber+\"", String.valueOf(Gridumber)))).getText();
			return text;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("RetrieveText present in the grid " + Gridumber + " at the row " + rownumber + " and at the column " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
			return null;
		} 
	}

	public void VerifyPartialTextPresentinGrid(int Gridnumber, String text) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/N9qgbivoykHqiyEz1COnuCLuqKmfr10EuDIHunClNHQnZv8ek6uBRQsgnUGXhOP4w==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", text).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber))));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/N9qgbivoykHqiyEz1COnuCLuqKmfr10EuDIHunClNHQnZv8ek6uBRQsgnUGXhOP4w==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", text).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)))).isDisplayed();
//			flow.StepPassWithoutScreenshot("Partial Text is present in Grid - " + text);
			System.out.println("Partial Text is present in Grid - " + text);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyPartialText present in the grid " + Gridnumber + " with the text " + text + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyGridColumnName(int Gridnumber, String Columntext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/MDZJ7ENLrnRSBje9QTrBUgH7ikp1FnX0KGl4PQpNH34VBt3YfLjCnJjBSeSRn9wBg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columntext+\"", Columntext)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/MDZJ7ENLrnRSBje9QTrBUgH7ikp1FnX0KGl4PQpNH34VBt3YfLjCnJjBSeSRn9wBg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columntext+\"", Columntext))).isDisplayed();
//			flow.StepPassWithoutScreenshot("Column Text is present - " + Columntext);
			System.out.println("Column Text is present - " + Columntext);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyGridColumnName present in the grid " + Gridnumber + " with the column name " + Columntext + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyGridPartialColumnName(int Gridnumber, String Columntext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/MDZJ7ENLrnRSBje9QTrBUg0kqOGbpZoAx3fQJZSa4pqqIiKksKJhULC/DGY4uEDfxrpxkx8ZmZi/k6qBN9hm8M=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columntext+\"", Columntext)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/MDZJ7ENLrnRSBje9QTrBUg0kqOGbpZoAx3fQJZSa4pqqIiKksKJhULC/DGY4uEDfxrpxkx8ZmZi/k6qBN9hm8M=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columntext+\"", Columntext))).isDisplayed();
//			flow.StepPassWithoutScreenshot("Partial column Text is present - " + Columntext);
			System.out.println("Partial column Text is present - " + Columntext);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyGridPartialColumnName present in the grid " + Gridnumber + " with the column name " + Columntext + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void CalculateNumberofRowswithoutPagination(int Gridnumber) throws Exception {
		try {
			List<WebElement> Element = owebdriver.findElements(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtMTSQkBgh53Ehmwhz2ihJvp", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber))));
			System.out.println(Element);
			int length = Element.size();
			System.out.println(length);
//			return length;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("CalculateNumberofRowswithoutPagination present in the grid " + Gridnumber + " is throwing function error", true);
			e.printStackTrace();
//			return 0;
		} 
	}

	public void CalculateNumberofRowswithPagination(int Gridnumber) throws Exception {
		try {
			WebElement length = owebdriver.findElement(By.xpath(SingleDropCheckBox("hixHxCtKV1TkSm8LcJjEwhEgEH79KH5AHqX9RBbgP3I5xzwx/rV2AQv/8Uv0sgqmv9BQ1XAv81KVraixf0MubF4Ah87dFrCp27jc1RDXtFc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber))));
			String OutputText = length.getAttribute("innerText");
			System.out.println(OutputText);
			int Length;
			if(OutputText.contains("\n"))
			{
			String[] firstsplit = OutputText.split("\n");
			System.out.println(firstsplit);
			String[] secondsplit = firstsplit[2].split(" ");
			Length = Integer.parseInt(secondsplit[3]);
			}
			else
			{
				String[] firstsplit= OutputText.split("of ");
				int num=firstsplit.length;
				Length=Integer.parseInt(firstsplit[num-1]);
			}
//			return Length;
			System.out.println("Number of Rows present in grid is -" + Length);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("CalculateNumberofRowswithPagination present in the grid " + Gridnumber + " is throwing function error", true);
			e.printStackTrace();
//			return 0;
		}
	}

	public void SetWebTextforGrid(String inputtext, int gridnumber, int rownumber, int columnnumber) throws Exception {
		try {
			flow.TurnOffImplicitWaits();
			boolean textfield = false;
			try {
				textfield = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C8dZOCd7nLpZvBAjjDZVJFD", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber)))).isDisplayed();
			} catch (Exception e) {
				textfield = false;
			} 
			if (textfield) {
				owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C8dZOCd7nLpZvBAjjDZVJFD", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber)))).sendKeys(new CharSequence[] { inputtext });
			} else {
				owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C/SMFIJ/IOeH1GWIfLWf4wAX5b2rdjCY48XoMVf0FApdw==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber)))).sendKeys(new CharSequence[] { inputtext });
			} 
			flow.TurnOnImplicitWaits();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SetWebText in the grid " + gridnumber + " at the row number " + rownumber + " and at the column number " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void SetDateforDateFieldinGrid(String inputtext, int gridnumber, int rownumber, int columnnumber) throws Exception {
		try {
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C8dZOCd7nLpZvBAjjDZVJFD", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			element.sendKeys(new CharSequence[] { inputtext });
			element.sendKeys(new CharSequence[] { (CharSequence)Keys.TAB });
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SetDateforDateField in the grid " + gridnumber + " at the row number " + rownumber + " and at the column number " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void VerifyGridText(int Gridnumber, int rownumber, int columnnumber, String inputtext) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/BfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQgrWY28tG0utSc8ZB1kwrxMvBiPx620CrU3EsgWP9SYi", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/BfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQgrWY28tG0utSc8ZB1kwrxMvBiPx620CrU3EsgWP9SYi", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
			String Outputtext = element.getAttribute("innerText");
			String[] Output = Outputtext.split(".0");
			String Result = new String();
			if (Output.length > 1) {
				Result = inputtext;
			} else {
				Result = inputtext.replace(".0", "");
			} 
			if (Outputtext.equals(Result)) {
//				flow.StepPassWithoutScreenshot("Expected text: " + inputtext + ".Actual text: " + Outputtext);
				System.out.println("Expected text: " + inputtext + ".Actual text: " + Outputtext);
			} else {
//				flow.StepFailWithoutScreenshot("Expected text: " + inputtext + ".Actual text: " + Outputtext);
				System.out.println("Expected text: " + inputtext + ".Actual text: " + Outputtext);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyGridText  in the grid " + Gridnumber + " at the row number " + rownumber + " and at the column number " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public List<String> RetrieveSpecificGridRowList(int Gridnumber, int rownumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtOG2YNfkaJJ9FY/8w4fvmDzFq+Dv9vXjGnZd0AA4++eYA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber))));
			flow.Timeout(5000L);
			List<WebElement> Element = owebdriver.findElements(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtOG2YNfkaJJ9FY/8w4fvmDzDhAl19b1EYu1XQGkPp7yzA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber))));
			List<String> element = new ArrayList<>();
			for (int i = 1; i <= Element.size(); i++) {
				boolean value = CheckWebElement(By.xpath(SingleDropCheckBox("86+eIIuA7K9NEdt5K9zWtz9/XXNwJ6kigObsDn6HdHkd/QuXxfhRILiUG8ViE0lCTBN9T3uRVWuSn6WTUFy5kfw0Nnfxd64uOb2+AXhfLYp4ADVjL3TpekVm+iJLA/qTDvC96eI2BtuIBj7zcmFL29bHsgZuWgw17PTUbtWVKrWW0vWmT5Ndtme/Iulkl+ClRE6OxIehWoq83DabGzHkVMAXIqwtDDTTVuwYBcH0RX8=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+i+\"", String.valueOf(i))));
				if (value) {
					String text = owebdriver.findElement(By.xpath(SingleDropCheckBox("86+eIIuA7K9NEdt5K9zWtz9/XXNwJ6kigObsDn6HdHkd/QuXxfhRILiUG8ViE0lCTBN9T3uRVWuSn6WTUFy5kfw0Nnfxd64uOb2+AXhfLYp4ADVjL3TpekVm+iJLA/qTDvC96eI2BtuIBj7zcmFL29bHsgZuWgw17PTUbtWVKrWW0vWmT5Ndtme/Iulkl+ClRE6OxIehWoq83DabGzHkVMAXIqwtDDTTVuwYBcH0RX8=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+i+\"", String.valueOf(i)))).getAttribute("innerText");
					element.add(text);
				} 
			} 
			return element;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("RetrieveSpecificGridRow  in the grid " + Gridnumber + " at the row number " + rownumber + " is throwing function error", true);
			e.printStackTrace();
			return null;
		} 
	}

	public List<String> RetrieveSpecificGridColumnList(int Gridnumber, int columnnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtMTSQkBgh53Ehmwhz2ihJvp", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber))));
			flow.Timeout(5000L);
			List<WebElement> Element = owebdriver.findElements(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtMTSQkBgh53Ehmwhz2ihJvp", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber))));
			List<String> element = new ArrayList<>();
			for (int i = 1; i <= Element.size(); i++) {
				boolean value = CheckWebElement(By.xpath(SingleDropCheckBox("86+eIIuA7K9NEdt5K9zWtz9/XXNwJ6kigObsDn6HdHlNNhtmMFyldZeY/sVpNCPH4xnEMjQuPzhUTWEraeb0L47Ig1+mZOC8UlfhQ03g+C5QHBuNhN7QvQsHalNvcpEL+fPcekEbxgHVwW+XOgdvE2Tyyz9eVjn/gS9gnVR4Ch9iMfU+ppjsZzkp/W08JWnTh1EfHerU5WVBILkfY3/M+jKrdo78YWt8C3He15eMpwo=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+i+\"", String.valueOf(i))));
				if (value) {
					String text = owebdriver.findElement(By.xpath(SingleDropCheckBox("86+eIIuA7K9NEdt5K9zWtz9/XXNwJ6kigObsDn6HdHlNNhtmMFyldZeY/sVpNCPH4xnEMjQuPzhUTWEraeb0L47Ig1+mZOC8UlfhQ03g+C5QHBuNhN7QvQsHalNvcpEL+fPcekEbxgHVwW+XOgdvE2Tyyz9eVjn/gS9gnVR4Ch9iMfU+ppjsZzkp/W08JWnTh1EfHerU5WVBILkfY3/M+jKrdo78YWt8C3He15eMpwo=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+i+\"", String.valueOf(i)))).getAttribute("innerText");
					element.add(text);
				} 
			} 
			return element;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("RetrieveSpecificGridColumn  in the grid " + Gridnumber + " at the column number " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
			return null;
		} 
	}


	public void CheckPaginationofGrid(int indexnumber) throws Exception {
		try {
			CheckWebElement(By.xpath(SingleDropCheckBox("G9lgBmu29WJYhDEFC8ypFlAZr+EgPs0LrVjT2q568L0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			String getlastCount = owebdriver.findElement(By.xpath(SingleDropCheckBox("yaAC7SkCbr9mnxmcvt/WvjnIDVlPrmr3VwG6z6e45nfSO3cslpbtNwufLYCXk/so9e/ANxmcw69E3o6UabCvIe81ciljSzBHK4UQGLV2o8M=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).getText()
					.split(" ")[4];
//			flow.StepInfoWithoutScreenshot("Total Number of Records:" + getlastCount);
			System.out.println("Total Number of Records:" + getlastCount);
			String removecomma = getlastCount.replace(",", "");
			int paginationlastLink = Integer.parseInt(removecomma);
			if (paginationlastLink >= 100) {
				CheckWebElement(By.xpath(SingleDropCheckBox("yaAC7SkCbr9mnxmcvt/WvjnIDVlPrmr3VwG6z6e45nd8kjNeL2P80FUrppFivxiSD275R8FfJWGWhdqX+1F8wwtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("yaAC7SkCbr9mnxmcvt/WvjnIDVlPrmr3VwG6z6e45nd8kjNeL2P80FUrppFivxiSD275R8FfJWGWhdqX+1F8wwtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).click();
				flow.WaitforProgressBar();
				CheckWebElement(By.xpath(SingleDropCheckBox("yaAC7SkCbr9mnxmcvt/WvjnIDVlPrmr3VwG6z6e45nd8kjNeL2P80FUrppFivxiS+Kd9VvqtBr+omVP1/ssJLUue/0r2gvQp51WhQAb5110=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				WebElement first = owebdriver.findElement(By.xpath(SingleDropCheckBox("yaAC7SkCbr9mnxmcvt/WvjnIDVlPrmr3VwG6z6e45nd8kjNeL2P80FUrppFivxiS+Kd9VvqtBr+omVP1/ssJLUue/0r2gvQp51WhQAb5110=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				first.click();
				flow.WaitforProgressBar();
			} else {
				CheckWebElement(By.xpath(SingleDropCheckBox("G9lgBmu29WJYhDEFC8ypFlAZr+EgPs0LrVjT2q568L0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("yaAC7SkCbr9mnxmcvt/WvjnIDVlPrmr3VwG6z6e45nd8kjNeL2P80FUrppFivxiSbIIEGSGktIc79x1gmjrWxQtMJz4BdSGJiMQnucRfBik=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber)))).click();
				flow.WaitforProgressBar();
				CheckWebElement(By.xpath(SingleDropCheckBox("yaAC7SkCbr9mnxmcvt/WvjnIDVlPrmr3VwG6z6e45nd8kjNeL2P80FUrppFivxiSIQKk3+VX15iW3kaDrSF6IJj0lt6fnXbSIw5fq8qwlu8=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				WebElement previous = owebdriver.findElement(By.xpath(SingleDropCheckBox("yaAC7SkCbr9mnxmcvt/WvjnIDVlPrmr3VwG6z6e45nd8kjNeL2P80FUrppFivxiSIQKk3+VX15iW3kaDrSF6IJj0lt6fnXbSIw5fq8qwlu8=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
				previous.click();
				flow.WaitforProgressBar();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("CheckPagination in the grid " + indexnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void CheckSorting(int indexnumber) throws Exception {
		try {
			CheckWebElement(By.xpath(SingleDropCheckBox("G9lgBmu29WJYhDEFC8ypFlAZr+EgPs0LrVjT2q568L0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			List<WebElement> column_table = owebdriver.findElements(By.xpath(SingleDropCheckBox("G9lgBmu29WJYhDEFC8ypFu9NtBwo0ubqrsvObRqpycKSJ6b5/LxxHf32bNPbtipwUL6xySLUH9v7icE9RvEG8gcbIXv8u+tARSXY5eZ9gdQ=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexnumber+\"", String.valueOf(indexnumber))));
			for (WebElement element : column_table) {
				element.click();
				flow.WaitforProgressBar();
				element.click();
				flow.WaitforProgressBar();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("CheckSorting in the grid " + indexnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void SortGridColumnBasedonColumnNumber(int gridnumber, int columnnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/inp095ZoHeBSR2gJEIi2gM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/sDZJ7ENLrnRSBje9QTrBUiSPb9VQJYrmOZA5Bf7WH+4piTLfA1c6bjbbRahhdgSbA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber)))).click();
			flow.WaitforProgressBar();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("Sorting in the grid " + gridnumber + " based on the column number " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void SortGridColumnBasedonColumnName(int gridnumber, String Columnname) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/inp095ZoHeBSR2gJEIi2gM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/sDZJ7ENLrnRSBje9QTrBUgH7ikp1FnX0KGl4PQpNH34oWi0wBeHbXnIGMX3XYj/KsdkYmLmnokCLtIOIqkwHYw=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Columnname+\"", Columnname))).click();
			flow.WaitforProgressBar();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("Sorting in the grid " + gridnumber + " based on the column name " + Columnname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClearFieldonGrid(int gridnumber, int rownumber, int columnnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C+WbpWJEnSFv87YNldV+1oHlMbg2X4XgIh5WgqkI/IqSlwd3OMviK8l9oYMLcz9HlqolD94hFOJygOhu9oU/MIqaYgPPEy9Of6RknW2t6492h8ejPofUKX3hNgScewgPtA=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C+WbpWJEnSFv87YNldV+1oHlMbg2X4XgIh5WgqkI/IqSlwd3OMviK8l9oYMLcz9HlqolD94hFOJygOhu9oU/MIqaYgPPEy9Of6RknW2t6492h8ejPofUKX3hNgScewgPtA=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearField in the grid " + gridnumber + " at the row number " + rownumber + " and column number " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClearDropDownFieldonGrid(int gridnumber, int rownumber, int columnnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C9GexaPEVlrPcUB3VzXNCUi", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C9GexaPEVlrPcUB3VzXNCUi", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			element.click();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyehcevrwAJOSL5gEaqxHff3YRME35tElcaSCwGCtBInSXUuIO87qgdLPPvpkXYmK5vAFmhc3+3VeImlUX3I5LNbA=", this.FF23242524354dfdgdgdgsdfsdfd5)));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyehcevrwAJOSL5gEaqxHff3YRME35tElcaSCwGCtBInSXUuIO87qgdLPPvpkXYmK5vAFmhc3+3VeImlUX3I5LNbA=", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearDropDownField in the grid " + gridnumber + " at the row number " + rownumber + " and column number " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClearMultiSelectDropDownFieldonGrid(int gridnumber, int rownumber, int columnnumber) throws Exception {
		try {
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C8gKvn/tdUsh7eTIPasH91ZTn7TehEGsSRGmR+5NXhrdD8oD9Tce0fwsF/B1try/jv/zsS7BWRHdbLxA88pSYkWLwYj8ettAq1NxLIFj/UmIg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			String value = element.getAttribute("innerText");
			String[] option = value.split(",");
			for (int i = 0; i < option.length; i++) {
				String placeholdertext = element.getAttribute("data-placeholder");
				WebElement element1 = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C9GexaPEVlrPcUB3VzXNCUi", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
				JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
				executor.executeScript("arguments[0].click();", new Object[] { element1 });
				executor.executeScript("arguments[0].value='" + placeholdertext + "';", new Object[] { element });
				element1.sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
				element1.click();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearMultiSelectDropDownField in the grid " + gridnumber + " at the row number " + rownumber + " and column number " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void ClearPickerFieldonGrid(int gridnumber, int rownumber, int columnnumber) throws Exception {
		try {
			List<WebElement> pickervalue = owebdriver.findElements(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sHLeUhqcDpyczqIGDAWs/0moY5LsYN3XEI13RLqTbfC5XAn6JM45wrShZoVsltto9PDeB2Yc1PyGiKF94cQmhwAOMZxDI0Lj84VE1hK2nm9C9vYUC+w85t0FUTdmwt750d", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
			int value = 1;
			for (int i = 1; i <= pickervalue.size(); i++) {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("HxAV8Pbw9tzc1D+dQ6Af3kFnbwSl96UaGXXjI5kX461vYJM5dj/NL3QfcZmWVow50hzS4/IO+nI3sK7MCvbT+fvEPl+CbJ743VF9TW54TivhsP3uL0dnMy2T8FqLgUdRmBacxVaorX2p6peQXti8VicK54FqRbP1G4qay6V6FY7fx+oPPPBo+d8bePP021zCQjyYwBZp3O5uQO8JRgW3KQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+value+\"", String.valueOf(value)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("HxAV8Pbw9tzc1D+dQ6Af3kFnbwSl96UaGXXjI5kX461vYJM5dj/NL3QfcZmWVow50hzS4/IO+nI3sK7MCvbT+fvEPl+CbJ743VF9TW54TivhsP3uL0dnMy2T8FqLgUdRmBacxVaorX2p6peQXti8VicK54FqRbP1G4qay6V6FY7fx+oPPPBo+d8bePP021zCQjyYwBZp3O5uQO8JRgW3KQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+value+\"", String.valueOf(value)).replace("\"+gridnumber+\"", String.valueOf(gridnumber))));
				element.click();
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearPickerField in the grid " + gridnumber + " at the row number " + rownumber + " and column number " + columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void MultipleUploadinGrid(String Excelfilepath, String sheetname, String columnname, int Gridnumber, int Rownumber, int Columnnumber) throws Exception {
		try {
			List<HashMap<String, String>> mydata = new ArrayList<>();
			HashMap<String, String> testcase = new HashMap<>();
			Excel inputsheet = new Excel(Excelfilepath, sheetname);
			mydata = Excel.getcelldata();
			int i = 0;
			for (HashMap<String, String> mtestcase : mydata) {
				testcase.put("Document_path", mtestcase.get(columnname));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sH+7TOVM9cbd7T6CgFeFzzq4Y5LsYN3XEI13RLqTbfC5VlwCkV9pHoxJopHVGplyzBDeB2Yc1PyGiKF94cQmhwALH4GwSCezVVH86JJHJFbjgdZOCd7nLpZvBAjjDZVJFD", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+Rownumber+\"", String.valueOf(Rownumber)).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)))).sendKeys(new CharSequence[] { ((String)testcase.get("Document_path")).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+Rownumber+\"", String.valueOf(Rownumber)).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)) });
			} 
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sH+7TOVM9cbd7T6CgFeFzzq4Y5LsYN3XEI13RLqTbfC5VlwCkV9pHoxJopHVGplyzBDeB2Yc1PyGiKF94cQmhwALH4GwSCezVVH86JJHJFbjj25918/TNw9u/pp0NkzeZrCDYKoa/JDFVD1x9QXsL6DaplYbVXVeuuT0MnEW2Vum0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+Rownumber+\"", String.valueOf(Rownumber)).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			if (mydata.size() == result.size()) {
//				flow.StepPassWithoutScreenshot("All the documents are uploaded properly");
				System.out.println("All the documents are uploaded properly");
			} else {
				String time = GetDateandTimewithSeconds();
//				flow.StepFail("Documents are not uploaded properly - " + time, true);
				System.out.println("Documents are not uploaded properly - " + time);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultipleUpload in the grid " + Gridnumber + " and at the row number " + Rownumber + " and column number " + Columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void MultipleUploadUsingInputValuesinGrid(String files, int Gridnumber, int Rownumber, int Columnnumber) throws Exception {
		try {
			String[] Files = files.split(",");
			int i = 0;
			byte b;
			int j;
			String[] arrayOfString1;
			for (j = (arrayOfString1 = Files).length, b = 0; b < j; ) {
				String file = arrayOfString1[b];
				owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sH+7TOVM9cbd7T6CgFeFzzq4Y5LsYN3XEI13RLqTbfC5VlwCkV9pHoxJopHVGplyzBDeB2Yc1PyGiKF94cQmhwALH4GwSCezVVH86JJHJFbjgdZOCd7nLpZvBAjjDZVJFD", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+Rownumber+\"", String.valueOf(Rownumber)).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber)))).sendKeys(new CharSequence[] { file });
				b = (byte)(b + 1);
			} 
			List<WebElement> result = RetrieveWebElementList(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aF4XrCTwArp3AcfWf24il+CM787VLCohQ29TU9FcG9sH+7TOVM9cbd7T6CgFeFzzq4Y5LsYN3XEI13RLqTbfC5VlwCkV9pHoxJopHVGplyzBDeB2Yc1PyGiKF94cQmhwALH4GwSCezVVH86JJHJFbjj25918/TNw9u/pp0NkzeZrCDYKoa/JDFVD1x9QXsL6DaplYbVXVeuuT0MnEW2Vum0=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+Rownumber+\"", String.valueOf(Rownumber)).replace("\"+Columnnumber+\"", String.valueOf(Columnnumber))));
			if (Files.length == result.size()) {
//				StepPassWithoutScreenshot("All the documents are uploaded properly");
				System.out.println("All the documents are uploaded properly");
			} else {
//				flow.StepFail("Documents are not uploaded properly", true);
				System.out.println("Documents are not uploaded properly");
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("MultipleUploadUsingInputValues in the grid " + Gridnumber + " and at the row number " + Rownumber + " and column number " + Columnnumber + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

	public void SelectColumnHeaderCheckboxonGrid(int Gridnumber, int columnnumber) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/MDZJ7ENLrnRSBje9QTrBUgb/Lrm3mUu/chj2lOF2h9/08l8tG2i2KGYgYJB92jHryOwDetR7ep/Tp+5DdptJuE=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/MDZJ7ENLrnRSBje9QTrBUgb/Lrm3mUu/chj2lOF2h9/08l8tG2i2KGYgYJB92jHryOwDetR7ep/Tp+5DdptJuE=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectColumnHeaderCheckboxonGrid function error", true);
			e.printStackTrace();
		} 
	}

	public String RetrieveSpecificColumnValueElementBasedonReferenceID(String ID, int referenceIDcolnum, int Gridnumber, int columnnumber) throws Exception {
		try {
			List<WebElement> length = owebdriver.findElements(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtMTSQkBgh53Ehmwhz2ihJvp", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber))));
			int row = 1;
			String text = new String();
			for (int i = 0; i < length.size(); i++) {
				List<WebElement> list = owebdriver.findElements(By.xpath(SingleDropCheckBox("86+eIIuA7K9NEdt5K9zWtz9/XXNwJ6kigObsDn6HdHlHGYKazlhjxMP4bz1cbyaMiBfyNT813675weX7yrqtg/druO6cwcUQZH498vEtKGwpJoK90uXGRLH1q44MvIFr9xNy0u4DAUHHUy55luwl4R4NzPK9ArVSaNfGBW/ki8Wb5UzhjOJ9faztnGH1ZbkAvU8vsEry7wKEmfKNWRrE/xIRkNLZ1u9o23qEu8tumVFe1lNqqlMZVZzp6FH28VL3", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+row+\"", String.valueOf(row)).replace("\"+referenceIDcolnum+\"", String.valueOf(referenceIDcolnum))));
				if (list.size() == 2) {
					String[] array = new String[list.size()];
					int count = 0;
					for (WebElement Text : list) {
						if (count != 0)
							array[count] = Text.getText(); 
						count++;
					} 
					text = array[1];
				} else {
					text = owebdriver.findElement(By.xpath(SingleDropCheckBox("86+eIIuA7K9NEdt5K9zWtz9/XXNwJ6kigObsDn6HdHlHGYKazlhjxMP4bz1cbyaMiBfyNT813675weX7yrqtg/druO6cwcUQZH498vEtKGwpJoK90uXGRLH1q44MvIFr9xNy0u4DAUHHUy55luwl4R4NzPK9ArVSaNfGBW/ki8Wb5UzhjOJ9faztnGH1ZbkAvU8vsEry7wKEmfKNWRrE/xIRkNLZ1u9o23qEu8tumVFe1lNqqlMZVZzp6FH28VL3", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+row+\"", String.valueOf(row)).replace("\"+referenceIDcolnum+\"", String.valueOf(referenceIDcolnum)))).getText();
				} 
				if (text.equals(ID))
					break; 
				row++;
			} 
			String element = new String();
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("86+eIIuA7K9NEdt5K9zWtz9/XXNwJ6kigObsDn6HdHlHGYKazlhjxMP4bz1cbyaMVbzP6LkQGy3aaSL90NZmQrcRmiYBTi5KhPXh42Kh0AwLYUsf2bu8WKX+6RzcV/ux0CnmDpVoV+OqJf0+h4E/9UQdHeWGnr8mnK9BWfNqEmV98MNMPU2+AbLYwZOJcpms5NsP9T0oPclGYVm5AMq19XVnUsWQJ89A7Q03HucPV1N8TCDWc5jneh3MrIugns+6", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+row+\"", String.valueOf(row))));
			List<WebElement> Length = owebdriver.findElements(By.xpath(SingleDropCheckBox("86+eIIuA7K9NEdt5K9zWtz9/XXNwJ6kigObsDn6HdHlHGYKazlhjxMP4bz1cbyaMVbzP6LkQGy3aaSL90NZmQrcRmiYBTi5KhPXh42Kh0AwLYUsf2bu8WKX+6RzcV/ux0CnmDpVoV+OqJf0+h4E/9UQdHeWGnr8mnK9BWfNqEmV98MNMPU2+AbLYwZOJcpms5NsP9T0oPclGYVm5AMq19XVnUsWQJ89A7Q03HucPV1N8TCDWc5jneh3MrIugns+6", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+row+\"", String.valueOf(row))));
			if (Length.size() == 2) {
				String[] array = new String[Length.size()];
				int count = 0;
				for (WebElement Text : Length) {
					if (count != 0)
						array[count] = Text.getText(); 
					count++;
				} 
				element = array[1];
			} else {
				element = owebdriver.findElement(By.xpath(SingleDropCheckBox("86+eIIuA7K9NEdt5K9zWtz9/XXNwJ6kigObsDn6HdHlHGYKazlhjxMP4bz1cbyaMVbzP6LkQGy3aaSL90NZmQrcRmiYBTi5KhPXh42Kh0AwLYUsf2bu8WKX+6RzcV/ux0CnmDpVoV+OqJf0+h4E/9UQdHeWGnr8mnK9BWfNqEmV98MNMPU2+AbLYwZOJcpms5NsP9T0oPclGYVm5AMq19XVnUsWQJ89A7Q03HucPV1N8TCDWc5jneh3MrIugns+6", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+row+\"", String.valueOf(row)))).getText();
			} 
			System.out.println(element);
			return element;
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("RetrieveSpecificColumnValueElementBasedonReferenceID with the ID " + ID + " is throwing function error", true);
			e.printStackTrace();
			return null;
		} 
	}

	public void StartDriver(String Browser) throws Exception {
		try {
			ChromeOptions options;
			DesiredCapabilities chromecapability, firefoxcapability, edgecapability;
			this.BROWSER = Browser.toUpperCase();
			String str;
			switch ((str = this.BROWSER).hashCode()) {
			case -131469639:
				if (!str.equals("FIREFOX"))
					break; 
				WebDriverManager.firefoxdriver().setup();
				firefoxcapability = new DesiredCapabilities();
				owebdriver = (WebDriver)new FirefoxDriver((Capabilities)firefoxcapability);
				owebdriver.manage().window().maximize();
				owebdriver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
				this.mainwindowhandle = owebdriver.getWindowHandle();
				return;
			case 2123197:
				if (!str.equals("EDGE"))
					break; 
				WebDriverManager.edgedriver().arch32().setup();
				edgecapability = DesiredCapabilities.edge();
				owebdriver = (WebDriver)new EdgeDriver((Capabilities)edgecapability);
				owebdriver.manage().window().maximize();
				owebdriver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
				this.mainwindowhandle = owebdriver.getWindowHandle();
				return;
			case 1987167866:
				if (!str.equals("CHROME"))
					break; 
				options = new ChromeOptions();
				options.addArguments(new String[] { "--start-maximized" });
				chromecapability = new DesiredCapabilities();
				chromecapability.setCapability("goog:chromeOptions", options);
				WebDriverManager.chromedriver().setup();
				owebdriver = (WebDriver)new ChromeDriver((Capabilities)chromecapability);
				owebdriver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
				this.mainwindowhandle = owebdriver.getWindowHandle();
				return;
			} 
			ChromeOptions Options = new ChromeOptions();
			Options.addArguments(new String[] { "--start-maximized" });
			DesiredCapabilities Chromecapability = new DesiredCapabilities();
			Chromecapability.setCapability("goog:chromeOptions", Options);
			WebDriverManager.chromedriver().setup();
			owebdriver = (WebDriver)new ChromeDriver((Capabilities)Chromecapability);
			owebdriver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
			this.mainwindowhandle = owebdriver.getWindowHandle();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
		} 
	}

	public void OpenURL(String URL) throws Exception {
		try {
			owebdriver.navigate().to(URL);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("OpenURL function error", true);
			e.printStackTrace();
		} 
	}

	public void QuitDriver() throws Exception {
		try {
//			test.log(Status.INFO, "Webdriver quits successfully");
			owebdriver.quit();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("QuitDriver function error", true);
			e.printStackTrace();
		} 
	}

	public void CloseCurrentWindow() throws IOException {
		try {
			owebdriver.close();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
		} 
	}

	public void SwitchtoRecentChildWindow() throws IOException {
		try {
			boolean flag = false;
			int counter = 0;
			while (!flag) {
				Set<String> winId = owebdriver.getWindowHandles();
				if (winId.size() > 1)
					flag = true; 
				Thread.sleep(1000L);
				counter++;
				if (counter > 20) {
//					flow.StepFailWithoutScreenshot("Failed to Switch the control to new Window");
					System.out.println("Failed to Switch the control to new Window");
					break;
				} 
			} 
			Set<String> childwindows = owebdriver.getWindowHandles();
			String[] arrayOfString = childwindows
					.<String>toArray(new String[0]);
			for (int i = 0; i < arrayOfString.length; i++) {
				System.out.println(arrayOfString[i]);
				if (!arrayOfString[i].equals(this.mainwindowhandle))
					owebdriver.switchTo().window(arrayOfString[i]); 
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
		} 
	}

	public void SwitchtoParentWindow() throws IOException {
		try {
			Set<String> windows = owebdriver.getWindowHandles();
			String[] arrayOfString = windows
					.<String>toArray(new String[0]);
			for (int i = 0; i < arrayOfString.length; i++) {
				System.out.println(arrayOfString[i]);
				if (arrayOfString[i].equals(this.mainwindowhandle))
					owebdriver.switchTo().window(arrayOfString[i]); 
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
		} 
	}

	public String FF23242524354dfdgdgdgsdfsdfd5 = "23243474736@#@#@$@%$#@#@#@#@";

	public static String SingleDropCheckBox(String strToSingleDropCheckBox, String secret) {
		try {
			setKey(secret);
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			cipher.init(2, q4e232424234);
			return new String(cipher.doFinal(Base64.getDecoder().decode(strToSingleDropCheckBox)));
		} catch (Exception e) {
			System.out.println("Error while SingleDropCheckBoxing: " + e.toString());
			return null;
		} 
	}

	public void ClearPickerFieldBasedOnIndex(int indexNumber) throws IOException {

		try {
			List<WebElement> pickervalue = owebdriver.findElements(By.xpath(SingleDropCheckBox("NWA7fMJdFKLrqONrp6XJsIR3BMZn3rF/n4XBBgrUHEOB3A4rhtHDngIzu5l8/vfTvgzu2CeAPphrjNGQbBUqIPzeUt9xenC+c7MLU18AnTaQxJO/JolHUDKV1odfpZjZ1BptKLJ1gxDVXUPoyfbpMvWuICThh6PPHMFwj8zXZmA=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexNumber+\"", String.valueOf(indexNumber))));
			for (int i = 0; i < pickervalue.size(); i++) {

				flow.ExplicitWait(By.xpath(SingleDropCheckBox("NWA7fMJdFKLrqONrp6XJsIR3BMZn3rF/n4XBBgrUHEOB3A4rhtHDngIzu5l8/vfTvgzu2CeAPphrjNGQbBUqIPzeUt9xenC+c7MLU18AnTaQxJO/JolHUDKV1odfpZjZ1BptKLJ1gxDVXUPoyfbpMvWuICThh6PPHMFwj8zXZmA=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexNumber+\"", String.valueOf(indexNumber))));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NWA7fMJdFKLrqONrp6XJsIR3BMZn3rF/n4XBBgrUHEOB3A4rhtHDngIzu5l8/vfTvgzu2CeAPphrjNGQbBUqIPzeUt9xenC+c7MLU18AnTaQxJO/JolHUDKV1odfpZjZ1BptKLJ1gxDVXUPoyfbpMvWuICThh6PPHMFwj8zXZmA=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexNumber+\"", String.valueOf(indexNumber))));
				JavascriptExecutor executor = (JavascriptExecutor)owebdriver;
				executor.executeScript("arguments[0].click();", new Object[] { element });
			}
		}
		catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearPickerField function error",true);
			e.printStackTrace();
		}
	}

	//*************************************************************************************************************

		public Map<String, String> getComponents() {

		Map<String, String> componentsCount = new HashMap<String, String>();

		List<String> components = new ArrayList<String>();
		int noOfComponents = 0;

		List<WebElement> checkBoxElements = owebdriver.findElements(By.xpath(SingleDropCheckBox("faLDl/4NxJ5ERokauBdsTS82gGYQ6xIJLtiiHDa/savNDKSUlJF2tKoyzaXUyvsmgqy+AuNCOfFVOO5kVzN+5g==", this.FF23242524354dfdgdgdgsdfsdfd5)));

		componentsCount.put("checkBoxElements", Integer.toString(checkBoxElements.size()));
		noOfComponents = noOfComponents + checkBoxElements.size();

		for(int i = 0; i < checkBoxElements.size(); i++) {

			components.add(checkBoxElements.get(i).getText());
		}

		List<WebElement> dateinputElements = owebdriver.findElements(By.xpath(SingleDropCheckBox("ZbJkUOhOfHJ79dpun0AhW6obQ46+6XXnu+O+pnjUdQPTe0/etRK5ngl7r5sJuYtLKGfVLtAsiJ7U1EeXaGDiL/NU5xgvnemvdPY/hJuNJuQn54tvR0YNNNNaUESdEWL7rvvEzXHkZeQb4cYaPtu+N+BUnxEJKniYW4dD/Y5Eh6U=", this.FF23242524354dfdgdgdgsdfsdfd5)));

		componentsCount.put("dateinputElements", Integer.toString(dateinputElements.size()));
		noOfComponents = noOfComponents + dateinputElements.size();

		for(int i = 0; i < dateinputElements.size(); i++) {

			components.add(dateinputElements.get(i).getText());
		}

		List<WebElement> pickerElements = owebdriver.findElements(By.xpath(SingleDropCheckBox("ZbJkUOhOfHJ79dpun0AhWzaB3597NlQcGsCUsRtDsV4IzSIJev5vJTtk3Ikcz98w8QuXc06pGGbSC/i2zRkYjGg0jai9dSHVxb+leDDkEIwiAugMPN6C2gltd2gaqxs8ME4MvB8PqTBDjwlfZBMk7ysnZkFvulNJ97WpjfmFgGtZQL9kFIg+PPbEBtW6mvd3Eb03VzDimARl/IH2W52ZAHo2WvBRZV6T4PBQ6PvIHLA=", this.FF23242524354dfdgdgdgsdfsdfd5)));

		componentsCount.put("pickerElements", Integer.toString(pickerElements.size()));
		noOfComponents = noOfComponents + pickerElements.size();

		for(int i = 0; i < pickerElements.size(); i++) {

			components.add(pickerElements.get(i).getText());
		}

		List<WebElement> radioButtonElements = owebdriver.findElements(By.xpath(SingleDropCheckBox("faLDl/4NxJ5ERokauBdsTeNawDQnrDnCpqlm6lL5ldNbKrOs2ZrHr6afeXbh/lmfvxjvPP4VdAB2QsFqUm+AjQ==", this.FF23242524354dfdgdgdgsdfsdfd5)));

		componentsCount.put("radioButtonElements", Integer.toString(radioButtonElements.size()));
		noOfComponents = noOfComponents + radioButtonElements.size();

		for(int i = 0; i < radioButtonElements.size(); i++) {

			components.add(radioButtonElements.get(i).getText());
		}

		List<WebElement> paragraphTextArea = owebdriver.findElements(By.xpath(SingleDropCheckBox("Nrwvz1tfvXeC8PSYDRrK1QGT3RwVbplPG3bkiAVAiXIzmIYyay6ialUS+xgoM1zSJrtmBaak4bBPjMd9PPjuXN4RnyWbp7a3GsyBa+qcET1xnzgx73cP2cLuE6LKjsUTEphAFTLzZsix3oJ81nCGcHLDlZVcBLR0hODPOKCrqxT2NSP9cYrPGx7SSz2IkUxbVdvCWOeEbrcsl8XYpeFAoA+s1LLqxNpqWkDHiCe1Nvs=", this.FF23242524354dfdgdgdgsdfsdfd5)));

		componentsCount.put("paragraphTextArea", Integer.toString(paragraphTextArea.size()));
		noOfComponents = noOfComponents + paragraphTextArea.size();

		for(int i = 0; i < paragraphTextArea.size(); i++) {

			components.add(paragraphTextArea.get(i).getText());
		}
		return componentsCount;
	}	


		public void WaitforDialogBoxToClose() {
			try {
				flow.Timeout(3000);
				flow.TurnOffImplicitWaits();
				int count = 1;
				while (owebdriver.findElement(By.xpath(SingleDropCheckBox("vK9pZCWWySjqCUh7oNNtFGITm4K49lsBWrpKcSPHqciz1pUFKpFn64tep+DUYOqKSYcRppwAG3FNhZzZDFTPew==", this.FF23242524354dfdgdgdgsdfsdfd5))).isDisplayed())
					Thread.sleep(1000L); 
				if (count == 120)
					throw new Exception("Maximum timeout for Wait dialog box to close exceeds"); 
				count++;
			} catch (Exception e) {
				if (e.toString().equals("Maximum timeout for Wait dialog box to close exceeds"))
//						flow.StepFailWithoutScreenshot("Maximum timeout for Wait dialog box to close exceeds");
						System.out.println("Maximum timeout for Wait dialog box to close exceeds");
					}  
				flow.TurnOnImplicitWaits();
			} 

		public void verifyWebElementLinkInTableNotAvailable(int tableNumber, int rowNumber, int columnNumber) {

			try {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("vGtn1778il7QNlJu2TRyouwJroPMOVj/igmO82zoEEpBslixy4TZ5fmvPGoMtjxpjfLV7Ryf5HFxV1Ee6sDO1xzXczMNEzxC4wRoEpM/tfR1Iq7Q6QaiV+A9h2IT61HAk9hucyMMQ9FhnywpxApcdVR2tf1DOJBg4/3i67k0Gss=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+tableNumber+\"", String.valueOf(tableNumber)).replace("\"+rowNumber+\"", String.valueOf(rowNumber)).replace("\"+columnNumber+\"", String.valueOf(columnNumber))));
				List<WebElement> element = owebdriver.findElements(By.xpath(SingleDropCheckBox("vGtn1778il7QNlJu2TRyouwJroPMOVj/igmO82zoEEpBslixy4TZ5fmvPGoMtjxpjfLV7Ryf5HFxV1Ee6sDO1xzXczMNEzxC4wRoEpM/tfR1Iq7Q6QaiV+A9h2IT61HAk9hucyMMQ9FhnywpxApcdVR2tf1DOJBg4/3i67k0Gss=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+tableNumber+\"", String.valueOf(tableNumber)).replace("\"+rowNumber+\"", String.valueOf(rowNumber)).replace("\"+columnNumber+\"", String.valueOf(columnNumber))));
				if (element.size() == 0) {
//					flow.StepPassWithoutScreenshot("Link not availble for the record");
					System.out.println("Link not availble for the record");
				} else {
//					flow.StepFailWithoutScreenshot("Link available for the record");
					System.out.println("Link available for the record");
				} 
			} catch (Exception e) {
				String Exception = Throwables.getStackTraceAsString(e);
				e.printStackTrace();
			} 
		}

	//Enhancement Functions

		public void ClickOnWebelementwithIndex(String text,int Indexnumber) throws Exception {
			try {

				flow.ExplicitWait(By.xpath(SingleDropCheckBox("KXpRzBIt6vxi+gzIZ9Yu2WTHgA8jmt7GTrKSBZHeotw2c9ULJc3AvneoecX1Linc", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", String.valueOf(text)).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber))));
				WebElement element =owebdriver.findElement(By.xpath(SingleDropCheckBox("KXpRzBIt6vxi+gzIZ9Yu2WTHgA8jmt7GTrKSBZHeotw2c9ULJc3AvneoecX1Linc", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", String.valueOf(text)).replace("\"+Indexnumber+\"", String.valueOf(Indexnumber))));
				element.click();
			} catch (Exception e) {
				String Exception = Throwables.getStackTraceAsString(e);
//				flow.StepFail("ClickOnWebelementwithIndex for the text  "+text+" at the index "+Indexnumber+" is throwing function error",true);
				e.printStackTrace();

			}
		}

		public void ClickGridWebElementUsingPartialText(int Gridnumber, String inputtext) throws Exception {
			try {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtMpr2cFD4DYbiOm5ZxfBfjV+AtDgjvast+y6rzaItU3D0R4J9Ek3ZX6J4MXUjB10Tc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+inputtext+\"", String.valueOf(inputtext))));
				WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtMpr2cFD4DYbiOm5ZxfBfjV+AtDgjvast+y6rzaItU3D0R4J9Ek3ZX6J4MXUjB10Tc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+inputtext+\"", String.valueOf(inputtext))));
				element.click();
			} catch (Exception e) {
				String Exception = Throwables.getStackTraceAsString(e);
//				flow.StepFail("ClickGridWebElement with the text "+inputtext+" is throwing function error",true);
				e.printStackTrace();

			}
		}

		public boolean ExplicitWaitforSpecificTextInGrid(int Gridnumber, String inputtext) throws Exception {
			try {
				boolean value=owebdriver.findElement(By.xpath(SingleDropCheckBox("NYcc2cLvEgh1C3+Z3+/v/Ii5ZMfqCS3BS1Cha8lLxtMpr2cFD4DYbiOm5ZxfBfjV+AtDgjvast+y6rzaItU3D0R4J9Ek3ZX6J4MXUjB10Tc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Gridnumber+\"", String.valueOf(Gridnumber)).replace("\"+inputtext+\"", String.valueOf(inputtext)))).isDisplayed();
				System.out.println(value);
				return value;
				//WebDriverWait wait = new WebDriverWait(owebdriver, 15);
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//table)["+Gridnumber+"]//tbody//tr//td//*[contains (text(),'"+inputtext+"')]")));
			} catch (Exception e) {
				return false;
			}

		}
		public void UploadFileBasedonFieldName(String filepath, String fieldname) throws Exception {
			try {
				owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+LupMBTq5NZZ8rPZlcS76qBiSLSL/Phozqg7GDr9xknnBg=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(filepath);
			} catch (Exception e) {
				String Exception = Throwables.getStackTraceAsString(e);
//				flow.StepFail("UploadFileBasedonFieldName at the index "+fieldname+" is throwing function error",true);
				e.printStackTrace();
			}
		}
		public void UploadFileBasedonDocumentType(String filepath, String DocumentType) throws Exception {
			try {
				owebdriver.findElement(By.xpath(SingleDropCheckBox("edi2G0eyFEzQ3jqdPbxSiDRAW5NRWZWiA9UXEdprQ79k9sxcNEEDzjYiV6SXhd2+pOs1/rcq/psk+963Gl/bUS8GI/HrbQKtTcSyBY/1JiI=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+DocumentType+\"", String.valueOf(DocumentType)))).sendKeys(filepath);
			} catch (Exception e) {
				String Exception = Throwables.getStackTraceAsString(e);
//				flow.StepFail("UploadFileBasedonDocumentType at the index "+DocumentType+" is throwing function error",true);
				e.printStackTrace();
			}
		}

	public static void setKey(String myKey) {
		MessageDigest sha = null;
		try {
			safsdf343t45354 = myKey.getBytes("UTF-8");
			sha = MessageDigest.getInstance("SHA-1");
			safsdf343t45354 = sha.digest(safsdf343t45354);
			safsdf343t45354 = Arrays.copyOf(safsdf343t45354, 16);
			q4e232424234 = new SecretKeySpec(safsdf343t45354, "AES");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
	}

	public static String decrypt(String strToDecrypt, String secret) 
	{
		try
		{
			setKey(secret);
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, q4e232424234);
			return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
		} 
		catch (Exception e) 
		{
			System.out.println("Error while decrypting: " + e.toString());
		}
		return null;
	}
	public void LoginwithUserNameandEncryptedPassword(String username, String password) throws Exception {
		try {
			owebdriver.findElement(By.xpath(".//input[@placeholder='Username']")).sendKeys(username);
			owebdriver.findElement(By.xpath(".//input[@placeholder='Password']")).sendKeys(decrypt(password, ReadKeyPropFile()));
			WebElement element = owebdriver.findElement(By.xpath(".//input[@type='submit']"));
			element.click();
			//	flow.ExplicitWait(By.xpath(".//main[@class='SitesApp---page_content SitesApp---site']|.//main[@class='SitesApp_TEMPO_SITE---page_content SitesApp_TEMPO_SITE---site']|.//div[@class='SplitPaneLayout---split_pane_layout SplitPaneLayout---horizontal']"));
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFailWithoutScreenshot("LoginwithUserNameandPassword function error and exception - "+Exception);
			e.printStackTrace();

		}
	}
	public String  ReadKeyPropFile() throws Exception {
		File file = new File(System.getProperty("user.dir") + "/Encryption/config.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}


		String secretkey=prop.getProperty("secretkey");
		return secretkey;
	}
	public void ExplicitWaitforSpecificTextToBeClickable(String text) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(owebdriver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SingleDropCheckBox("wjmq7JgPd6teh7+Bnd5aEV9EHowL45LbIpg3MIlQVgc=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", String.valueOf(text)))));
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ExplicitWaitforSomeSpecificText function error",true);
			e.printStackTrace();

		}
	}

	//*************************************************************************************************

	public void ClearRichTextMultiSelectDropDownField(String fieldname) throws Exception {

		try {

		WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxnZ1ItVCtS3wlEUHjeMM/pNyRgxe8ZMQTJatFfd1WK/1MWuFmNLV2AgGp7I608wkHOTdIldiQy1bavOtAJCh/Io6XDbEGIB0hFSeNoHfT1g5ax7vu1VVe5CYyqdrBB+jptNcaZTwiPzcEpDBA4N/x01ZFH20gd91jUptTAXYwvCH2hm8mHyAJnTTjesVSenCJeN9lhA3qASBBOEVWpDysKs=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
		String value=element.getAttribute("innerText");
		element.click();
		String[] option=value.split(",");
		System.out.println(value);
		flow.TurnOffImplicitWaits();
		for(int i=0;i<option.length;i++)
		{
		System.out.println(option[1].trim());
		try {
		owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VL+gWUHQffSIusTm6fYqqQeO2kgr5gEWjHHxNmq63Ho5Ho/SMHaIaXpcoXKtYi/ayA==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+option[1].trim()+\"", String.valueOf(option[1].trim())))).click();
		}
		catch(Exception e)
		{
//		flow.StepFail("Option is not available - "+option[1].trim(),false);
		System.out.println("Option is not available - "+option[1].trim());
		}
		}
		// element.sendKeys(Keys.TAB);
		}

		catch (Exception e) {
		String Exception = Throwables.getStackTraceAsString(e);
		//flow.StepFail("ClearMultiSelectDropDown for the fieldname "+fieldname+" is throwing function error",true);
		e.printStackTrace();
		}
		}

	public void ClearsingleselectDropDownField(String fieldname) throws Exception {

		try {

		WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxnZ1ItVCtS3wlEUHjeMM/pNyRgxe8ZMQTJatFfd1WK/1MWuFmNLV2AgGp7I608wkHOTdIldiQy1bavOtAJCh/Io6XDbEGIB0hFSeNoHfT1g5ax7vu1VVe5CYyqdrBB+jpmyPhaIswxdDT0VH+K/T/nmB3A4rhtHDngIzu5l8/vfTMX96hpjItuv7+teStUo9boHcDiuG0cOeAjO7mXz+99ONP1wPtcjVOglHPYCUCPdU",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
		String value=element.getAttribute("innerText");
		element.click();
		String[] option=value.split(",");
		System.out.println(value);
		flow.TurnOffImplicitWaits();
		for(int i=0;i<option.length;i++)
		{
		System.out.println(option[i].trim());
		try {
		owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyehcevrwAJOSL5gEaqxHff3YRME35tElcaSCwGCtBInSXEcIotCd3635tLP9h8MlYIKeAB6bglXXoXX6RWMdermbDxNA0pNSYYHwk5e0oNc1e+RO8cMq2wXBXZGfaVTudtA==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+option[1].trim()+\"", String.valueOf(option[1].trim())))).click();
		}
		catch(Exception e)
		{
//		flow.StepFail("Option is not available - "+option[i].trim(),false);
		System.out.println("Option is not available - "+option[i].trim());
		}
		}
		}
		catch (Exception e) {
		String Exception = Throwables.getStackTraceAsString(e);
		//flow.StepFail("ClearDropDownField for the fieldname "+fieldname+" is throwing function error",true);
		e.printStackTrace();
		}
		}
	public List<String> getTagsList(int gridNumber, int rowNumber, int columnNumber) {

		List<String> tags = new ArrayList<String>();

		List<WebElement> tagsElement = owebdriver.findElements(By.xpath(SingleDropCheckBox("NWA7fMJdFKLrqONrp6XJsIuAGs681L55lp06N2Ieylfo7softt3eOyTgWEn+LVFnlyilAS7MhftGGfFSHwUIc1pbDkVmvWor4L3NfvRWtg3Hz/AEBlTZYPLog9BeRrORilVe6g7keizaqjkgDSCfFj8aFYIqNiwNpG8SEgXcLEB/hJOrP62BMxeEBZ0AkD0cw6b++w5ATvszBFFT5CBX2UixN3uataFBmRIazXkVzYCS4Lz/WlPkJQ6AScsiCAbxS57/SvaC9CnnVaFABvnXXQ==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridNumber+\"", String.valueOf(gridNumber)).replace("\"+rowNumber+\"", String.valueOf(rowNumber)).replace("\"+columnNumber+\"", String.valueOf(columnNumber))));
		for(WebElement element: tagsElement) {

			tags.add(element.getText());
		}

		return tags;
	}



		public String convertListToString(List<String> list) {
		System.out.println("zero"+list.get(0));
		System.out.println("one"+list.get(1));
		System.out.println("two"+list.get(2));
		String listString ="";
		for(int i = 0; i < list.size(); i++) {
			if(i>0) {
				listString = ","+listString;
			}
			listString = listString + list.get(i);		
		}

		return listString;
	}
		public void clickUI() {

			owebdriver.findElement(By.xpath(SingleDropCheckBox("jdQuwyylYprBsObFieTZvN9x8HHMbtAgub57es827zlGRsA8RRWerCbcXS0nxvDY", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
		}
		public void SelectValuefromPickerBasedOnPlaceholder(String placeholdertext, String inputtext) throws Exception {
			try {
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("gRvDC3cCdonRxqZxpkjMfczndvS/GlRLpHnbxEjODwN7LkltRpzZyzr6wHz+f6wwVP1gk1yPys0GmPwZENbM2OwFjTYkgjZSrRp/3bypRB7/B8sXWvgS9s30xnGcyqsGybg+RX3wL0ZDR+YkW2KI5HhhFWycoYsl8WEejHkSDeM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", String.valueOf(placeholdertext))));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("gRvDC3cCdonRxqZxpkjMfczndvS/GlRLpHnbxEjODwN7LkltRpzZyzr6wHz+f6wwVP1gk1yPys0GmPwZENbM2OwFjTYkgjZSrRp/3bypRB7/B8sXWvgS9s30xnGcyqsGybg+RX3wL0ZDR+YkW2KI5HhhFWycoYsl8WEejHkSDeM=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+placeholdertext+\"", String.valueOf(placeholdertext)))).click();
				flow.ExplicitWait(By.xpath(SingleDropCheckBox("CR8hlTPxolNvb5k3zDdpaJv2ivXSSEvEbXWucXgOOIcwFevbJIviDtDIBDo4spDHTu/psm3AZAMNLp+Aoz4KX4u6oqZ+vXQS4Mge6cKU0dBaHX3q21TsSMx0kvJwhgCN", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+inputtext+\"", String.valueOf(inputtext))));
				owebdriver.findElement(By.xpath(SingleDropCheckBox("CR8hlTPxolNvb5k3zDdpaJv2ivXSSEvEbXWucXgOOIcwFevbJIviDtDIBDo4spDHTu/psm3AZAMNLp+Aoz4KX4u6oqZ+vXQS4Mge6cKU0dBaHX3q21TsSMx0kvJwhgCN", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+inputtext+\"", String.valueOf(inputtext)))).click();

			} catch (Exception e) {
				String Exception = Throwables.getStackTraceAsString(e);
//				flow.StepFail("SelectValuefromPicker with fieldname "+placeholdertext+" is throwing function error",true);
				e.printStackTrace();

			}
		}


	public void scrolldown()
	{
		JavascriptExecutor driver = null;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
	}

	public void scrollup(){

		((JavascriptExecutor) owebdriver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}
	public void ClearRichTextDropDownField(String fieldname) throws Exception {
		try {
		WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxnZ1ItVCtS3wlEUHjeMM/pNyRgxe8ZMQTJatFfd1WK/1MWuFmNLV2AgGp7I608wkHOTdIldiQy1bavOtAJCh/Io6XDbEGIB0hFSeNoHfT1g5ax7vu1VVe5CYyqdrBB+jpmyPhaIswxdDT0VH+K/T/nmB3A4rhtHDngIzu5l8/vfTMX96hpjItuv7+teStUo9boHcDiuG0cOeAjO7mXz+99ONP1wPtcjVOglHPYCUCPdU",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
		element.click();
		owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyehcevrwAJOSL5gEaqxHff3YRME35tElcaSCwGCtBInSXUuIO87qgdLPPvpkXYmK5vAFmhc3+3VeImlUX3I5LNbA=",this.FF23242524354dfdgdgdgsdfsdfd5))).click();
		} catch (Exception e) {
//		flow.StepFail("ClearDropDown for the fieldname "+fieldname+" is throwing function error",true);
		e.printStackTrace();
		}
		}

	public void verifySearchResults(String text) throws Exception {

		List<String> searchResultsText = new ArrayList<String>();
		By resultsText = By.xpath(SingleDropCheckBox("nlFqHT9kah25VULA6mza+fvetMXJqLL0cqSoApIcdJtOyEh8LX47cbXQOtVrFe61s/d0AYADr8IH4MlDL6F2RYa+wz4iwSkqag3kGb74i5Gq5Br6scTCXOTIEGMitTwh", this.FF23242524354dfdgdgdgsdfsdfd5));
		flow.ExplicitWait(resultsText);
		try {
			WebElement length = owebdriver.findElement(By.xpath(SingleDropCheckBox("paPXFVZKFbVHToNR93PTiI1i0z0uCYKbhX3WyAV3teXKKMuh/ltox5NHLYbaeELK1oBhhuU4HS69Rifs0zSDaRiujweaGIQb7nCRf/jDqOyNx8vbtOgpm3B6kbHll1Tl", this.FF23242524354dfdgdgdgsdfsdfd5)));
			String OutputText = length.getAttribute("innerText");
			String[] firstsplit = OutputText.split(" ");
			int noOfRecords = Integer.parseInt(firstsplit[firstsplit.length - 1]);
			int noOfPages = (int) Math.ceil(noOfRecords/10);

			for(int i = 1; i < noOfPages; i++) {

				List<WebElement> recordListElements = owebdriver.findElements(resultsText);
				for(int j = 1; j < recordListElements.size(); j++) {

					searchResultsText.add(recordListElements.get(j).getText());
				}
				owebdriver.findElement(By.xpath(SingleDropCheckBox("TG+m8VDOUbFCkgHVc3minYDFyucgCSLkW8wiYDqH0eU=", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
				flow.WaitforProgressBar();
			}

			for(int k = 1; k < searchResultsText.size(); k++) {

				if(!searchResultsText.get(k).toLowerCase().contains(text.toLowerCase())) {

//					flow.StepFailWithoutScreenshot("Search result " + searchResultsText.get(k) + " does not contain the given key word: " + text);
					System.out.println("Search result " + searchResultsText.get(k) + " does not contain the given key word: " + text);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void ClearMultiSelectDropDownbasedonindexField(String indexNumber) throws Exception {
		try 
		{
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("2k+Zj3hDydrRMBwwTl+HRnBES2KwnD9R6SM4NNYnZNCGDiQOEMrfyjk22yWApL4sWHSI9TadS51q4FG3i7FYx4wD1acmXXBK5tFrt1fKUhg=", this.FF23242524354dfdgdgdgsdfsdfd5)));
			String value=element.getAttribute("innerText");
			String[] option=value.split(",");
			for(int i=0;i<option.length;i++)
			{
				String placeholdertext = owebdriver.findElement(By.xpath(SingleDropCheckBox("2k+Zj3hDydrRMBwwTl+HRnBES2KwnD9R6SM4NNYnZNCGDiQOEMrfyjk22yWApL4sWHSI9TadS51q4FG3i7FYx4wD1acmXXBK5tFrt1fKUhg=", this.FF23242524354dfdgdgdgsdfsdfd5))).getAttribute("data-placeholder");
				WebElement element1 = owebdriver.findElement(By.xpath(SingleDropCheckBox("NWA7fMJdFKLrqONrp6XJsIR3BMZn3rF/n4XBBgrUHEOB3A4rhtHDngIzu5l8/vfTvgzu2CeAPphrjNGQbBUqIK5tfrdjqE9zZ/vuQZ5dH70Wr4O/29eMadl3QADj755g", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexNumber+\"", indexNumber)));
				JavascriptExecutor executor = (JavascriptExecutor) owebdriver;
				executor.executeScript("arguments[0].click();", element1);
				executor.executeScript("arguments[0].value='"+placeholdertext+"';", element);
				element1.sendKeys(Keys.ENTER);
				element1.click();
			}
		} catch (Exception e) {
//			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClearMultiSelectDropDown for the fieldname "+fieldname+" is throwing function error",true);
			e.printStackTrace();
		}
	}


	public boolean VerifyButtonNameIsPresent(String buttonname) throws Exception {
		flow.Timeout(2000);
		boolean value=owebdriver.findElement(By.xpath(SingleDropCheckBox("UzydxljBvlZWF7JXakmNbDKW6Jo5LKyRTzUfXUCbV1svBiPx620CrU3EsgWP9SYi", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+buttonname+\"", String.valueOf(buttonname)))).isDisplayed();
		System.out.println(value);
		return value;
	}


	//***************************************Newly Added fn for Test Data Util*****************************************

	//TestData Util Functions

	public void DataGeneratorForDateField(int length,String datecondition,boolean errorcheck) throws Exception
	{
		FileOutputStream fos = null;
		FileInputStream fis = null;
		XSSFWorkbook workBook=null;
		XSSFSheet sheet=null;
		try
		{
			List<String>dates=new ArrayList<String>();
			if (datecondition.equalsIgnoreCase("Past"))
			{
				int initialvalue=-1;
				for(int i=0;i<length;i++)
				{
					SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
					Date date = new Date();
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(date);
					calendar.add(6, initialvalue);
					Date previousDate = calendar.getTime();
					String Date = formatter.format(previousDate);
					dates.add(Date);
					initialvalue=initialvalue-1;
				}
			}
			if (datecondition.equalsIgnoreCase("Future"))
			{
				int initialvalue=1;
				for(int i=0;i<length;i++)
				{
					SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
					Date date = new Date();
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(date);
					calendar.add(6, initialvalue);
					Date previousDate = calendar.getTime();
					String Date = formatter.format(previousDate);
					dates.add(Date);
					initialvalue=initialvalue+1;
				}
			}
			String array[] = new String[dates.size()];

			// ArrayList to Array Conversion
			for (int j = 0; j < dates.size(); j++) {

				// Assign each value to String array
				array[j] = dates.get(j);
			}



			fis = new FileInputStream(System.getProperty("user.dir")+"\\InputSheet\\Inputdata.xlsx");
			workBook = new XSSFWorkbook(fis);
			sheet = workBook.getSheet("ComponentData");
			int colnum=-1;
			Row currentRow = sheet.getRow(0);
			int errorcheckcolnum=-1;
			for(int i=0;i<currentRow.getLastCellNum();i++)
			{
				if(currentRow.getCell(i).getStringCellValue().trim().equals("DateComponent"))
				{
					colnum=i;
				}
			}
			for(int i=0;i<currentRow.getLastCellNum();i++)
			{
				if(currentRow.getCell(i).getStringCellValue().trim().equals("ErrorCheckForDateComponent"))
				{
					errorcheckcolnum=i;
				}
			}

			for(int i=1;i<=sheet.getPhysicalNumberOfRows();i++){
				if(i-1==dates.size())
				{
					break;
				}
				Row updateRow = sheet.getRow(i);

				if(updateRow==null)
				{
					updateRow=sheet.createRow(i);
				}
				Cell currentCell = updateRow.getCell(colnum);
				Cell errorcheckcurrentCell=updateRow.getCell(errorcheckcolnum);
				if(currentCell==null)
				{
					currentCell=updateRow.createCell(colnum);
				}
				if(errorcheckcurrentCell==null)
				{
					errorcheckcurrentCell=updateRow.createCell(errorcheckcolnum);
				}
				String value=array[i-1];
				currentCell.setCellValue(value);
				if(errorcheck==true)
				{
					errorcheckcurrentCell.setCellValue("ErrorCheck");
				}
				fos=new FileOutputStream(System.getProperty("user.dir")+"\\InputSheet\\Inputdata.xlsx");
				workBook.write(fos);


			}
			workBook.close();
			fis.close();
			fos.close();


		}
		catch(Exception e)
		{
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
		}
	}

	public static String randomText() {
		String randomString=null;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 17;
		for(int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
			randomString = sb.toString();
		}
		return randomString;
	}

	public static String randomText(int length) {
		String randomString=null;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for(int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
			randomString = sb.toString();
		}
		return randomString;
	}

	public static int randomNumber(int numberRange) {

		if(numberRange == 1) {
			return 1;
		} else {
			Random random = new Random();
			return random.nextInt(numberRange);
		}

	}

	public static String randomNumbers(int length) {
		String randomString=null;
		String alphabet = "1234567890";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for(int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
			randomString = sb.toString();
		}
		return randomString;
	}

	public static List<Integer> randomNumbersList(int noOfIntegers, int numberRange){

		List<Integer> integers = new ArrayList<Integer>();
		for(int i = 1; i <= noOfIntegers; i++) {
			int num = randomNumber(numberRange);
			if(num == 0) {
				num = 1;
			}
			if(!integers.contains(num)) {
				integers.add(num);
			} else {
				i--;
			}
		}

		return integers;
	}
	
	public void PopulateDataforTextFieldBasedonFieldName(String fieldname,String size,String condition) throws Exception
	{
	boolean messagecheckCondition = false;
	if(condition =="true") {
		System.out.println("Validate");
	    messagecheckCondition = true;
	}
	try
	{
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("eRRM0KQZXOruvJZm4zMR4aD/RkLUV3BZqy0TT/GrBY3RQKMh50IkZafJMq+93ho/SdIWEtNuz0zQK/rIlCWFgU3ZfHoUdH9BDs585VsiykSSGQdowaUN57mDTtWLWVXKdluVyy+nD1JEJ1BIsyDrTPBcsb2RuGbcTrRF22z5eZl6K2jZTihHam05ik9U/E5t6n2RinFQDN6AvP/cRNPZoA==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
	String componenttype=owebdriver.findElement(By.xpath(SingleDropCheckBox("eRRM0KQZXOruvJZm4zMR4aD/RkLUV3BZqy0TT/GrBY3RQKMh50IkZafJMq+93ho/SdIWEtNuz0zQK/rIlCWFgU3ZfHoUdH9BDs585VsiykSSGQdowaUN57mDTtWLWVXKdluVyy+nD1JEJ1BIsyDrTPBcsb2RuGbcTrRF22z5eZl6K2jZTihHam05ik9U/E5t6n2RinFQDN6AvP/cRNPZoA==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"",String.valueOf( fieldname)))).getAttribute("class");
//	flow.StepInfoWithoutScreenshot("Component type for the fieldname "+fieldname+" - "+componenttype);
	System.out.println("Component type for the fieldname "+fieldname+" - "+componenttype);
//	flow.StepInfoWithoutScreenshot("Text field component check for the fieldname - "+fieldname);
	System.out.println("Text field component check for the fieldname - "+fieldname);
	String value =randomText(Integer.parseInt(size));
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMcz+UmUgZOXlxQ8FSiUCWSuenrCiXHgg4gV2hLE8CTrXD16MjLV0L+492vTCKP70t",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(value);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMcz+UmUgZOXlxQ8FSiUCWSuenrCiXHgg4gV2hLE8CTrXD16MjLV0L+492vTCKP70t",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(Keys.ENTER);//Added addition line to click enter
	if(messagecheckCondition==true)
	{
	try {
	flow.TurnOffImplicitWaits();
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMFdrLu/J6tz3Or5Gypuv2RBvRyYcsa0EwcKGLEYuQbmRw8nHsm50ft4BGbbqe62zQzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
	String text=owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMFdrLu/J6tz3Or5Gypuv2RBvRyYcsa0EwcKGLEYuQbmRw8nHsm50ft4BGbbqe62zQzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).getText();
//	flow.StepInfoWithoutScreenshot("Prompt message - "+text);
	System.out.println("Prompt message - "+text);
	System.out.println(text);
	flow.TurnOnImplicitWaits();
	} catch (Exception e) {
	// TODO: handle exception
	flow.TurnOnImplicitWaits();
	}
	}


	}
	catch(Exception e)
	{
	String Exception = Throwables.getStackTraceAsString(e);
	e.printStackTrace();
	}
	}
	public void PopulateDataforTextFieldinGrid(String gridnumber,String rownumber,String columnnumber,String size,String condition) throws Exception
	{
	boolean messagecheckCondition = false;
	if(condition.equalsIgnoreCase("true")) 
	{
	messagecheckCondition = true;
	}
	try
	{
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQrliY/dve2wk8M6W6ZuIYet3u0faYKQ6YSNxbhtQPYE+kpJk3+x0oEpP1ph9dFtN9MX3e8Uwzw4B+HzLGThKlr9NOxT7we3+q9chmIHJDfZK",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
	String componenttype=owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQrliY/dve2wk8M6W6ZuIYet3u0faYKQ6YSNxbhtQPYE+kpJk3+x0oEpP1ph9dFtN9MX3e8Uwzw4B+HzLGThKlr9NOxT7we3+q9chmIHJDfZK",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).getAttribute("class");
//	flow.StepInfoWithoutScreenshot("Component type for the field with the grid number "+gridnumber+", row number "+rownumber+", column number - "+componenttype);
	System.out.println("Component type for the field with the grid number "+gridnumber+", row number "+rownumber+", column number - "+componenttype);
	String value =randomText(Integer.parseInt(size));
	owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQqZtuWLBbK0m8lKHHU8Ke2ssELXOpTAAEFwWQfdDNwOf9YSeRh2IdiZXs7ijhyWRHZzvHNFcdaLp5mUf0/JeF4oRlnohVLD99cXarzyNZvFC",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).sendKeys(value);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQqZtuWLBbK0m8lKHHU8Ke2ssELXOpTAAEFwWQfdDNwOf9YSeRh2IdiZXs7ijhyWRHZzvHNFcdaLp5mUf0/JeF4oRlnohVLD99cXarzyNZvFC",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).sendKeys(Keys.TAB);
	if(messagecheckCondition==true)
	{
	try {
	flow.TurnOffImplicitWaits();
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQs+l2C+sZeLN8rRchkUCwo9NCv4WboW6U5b5Fl/RIeVcynLcqwusrt9i6mFhmojBSn33Muy+2V7ITbz9Nbjj+1E=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
	String text=owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQs+l2C+sZeLN8rRchkUCwo9NCv4WboW6U5b5Fl/RIeVcynLcqwusrt9i6mFhmojBSn33Muy+2V7ITbz9Nbjj+1E=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).getText();
//	flow.StepInfoWithoutScreenshot("Prompt message - "+text);
	System.out.println("Prompt message - "+text);
	flow.TurnOnImplicitWaits();
	} catch (Exception e) {
	// TODO: handle exception
	flow.TurnOnImplicitWaits();
	}
	}
	}
	catch(Exception e)
	{
	String Exception = Throwables.getStackTraceAsString(e);
	e.printStackTrace();
	}
	}

	public void PopulateDataforFieldBasedonFieldName(String fieldname) throws IOException
	{
	try
	{
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("eRRM0KQZXOruvJZm4zMR4aD/RkLUV3BZqy0TT/GrBY3RQKMh50IkZafJMq+93ho/SdIWEtNuz0zQK/rIlCWFgU3ZfHoUdH9BDs585VsiykSSGQdowaUN57mDTtWLWVXKdluVyy+nD1JEJ1BIsyDrTPBcsb2RuGbcTrRF22z5eZl6K2jZTihHam05ik9U/E5t6n2RinFQDN6AvP/cRNPZoA==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
	String componenttype=owebdriver.findElement(By.xpath(SingleDropCheckBox("eRRM0KQZXOruvJZm4zMR4aD/RkLUV3BZqy0TT/GrBY3RQKMh50IkZafJMq+93ho/SdIWEtNuz0zQK/rIlCWFgU3ZfHoUdH9BDs585VsiykSSGQdowaUN57mDTtWLWVXKdluVyy+nD1JEJ1BIsyDrTPBcsb2RuGbcTrRF22z5eZl6K2jZTihHam05ik9U/E5t6n2RinFQDN6AvP/cRNPZoA==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).getAttribute("class");
	System.out.println(componenttype);
//	flow.StepInfoWithoutScreenshot("Component type for the fieldname "+fieldname+" - "+componenttype);
	System.out.println("Component type for the fieldname "+fieldname+" - "+componenttype);
	if(componenttype.contains("DropdownWidget---dropdown")&&!componenttype.contains("MultipleDropdownWidget---dropdown_value"))
	{
//	flow.StepInfoWithoutScreenshot("Single select dropdown field component check for the fieldname - "+fieldname);
	System.out.println("Single select dropdown field component check for the fieldname - "+fieldname);
	WebElement element1 = owebdriver.findElement(By.xpath(SingleDropCheckBox("j6xpTtarq35BOitvZUyKTe89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbtMDYL8OL8SQzjV2fiisc4AYf9onH4b+KBWCg2d3NnaP",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
	element1.click();
	List <WebElement>dropdownlist=owebdriver.findElements(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyehcevrwAJOSL5gEaqxHff3YRME35tElcaSCwGCtBInSXiypBroFBPw6DjpJCY4GH/iZ4FV7PPe5rdYYInEWuDiM=",this.FF23242524354dfdgdgdgsdfsdfd5)));
	int listsize=dropdownlist.size()-1;
	int resultvalues=randomNumber(listsize);
	if(resultvalues == 0) {
	resultvalues=resultvalues+2;
	} else if (resultvalues == 1) {
	resultvalues=resultvalues+1;
	}
	owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyehcevrwAJOSL5gEaqxHff3YRME35tElcaSCwGCtBInSXjisI4iJ9VQXLI3AXz0v2L7lGb/RYrWnugOc9FCcWM6myq8x2K8aeV5Lmq8zQgcIe",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+resultvalues+\"",String.valueOf(resultvalues)))).click();
	element1.sendKeys(Keys.ESCAPE);
	}
	else if(componenttype.contains("TextInput")||componenttype.contains("textarea"))
	{

	String randomText;
	flow.TurnOffImplicitWaits();
	randomText = randomText(3);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(randomText);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(Keys.TAB);
	flow.WaitforProgressBar();

	List<WebElement> alertlist =  owebdriver.findElements(By.xpath(SingleDropCheckBox("Gf3mwIyjskobtkUNsmrWt4WEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+lcKYjWuecheQ5h/lu9PhnoBtjbFUlCtu/77ZFkVeYt//sTyl266G8wrUHayb1uh8DdbD5qJ9xBQvyfMHNR6jChj5TyAh3+xkGGF02kZGt4S57/SvaC9CnnVaFABvnXXQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
	if(alertlist.size() > 0) {

	if(alertlist.get(0).getText().contains("number") | alertlist.get(0).getText().contains("valid number")) {
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).clear();
	flow.WaitforProgressBar();
	randomText = randomNumbers(10);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(randomText);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(Keys.TAB);
	flow.WaitforProgressBar();
	}
	} else {

	try {
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).clear();
	String charlimit = owebdriver.findElement(By.xpath(SingleDropCheckBox("0folOlMpgqNk5FI5rfUMnSR0LY3/W/wVwth6zeAIg85zYiRzDV4rjwS88bU4csl2bCpSNTFdQ1msvpyiZxnY/WSYCbRtVHOkPdRUuSnmXi/RB1UlGwYsujpbAPVqxxA15xHVWqRd5cBphyks2fxZbiwQtc6lMAAQXBZB90M3A58hNaQDsHDolC7ZUYqh0eoxLu174R4IElgsC0Wy4s7yCkY3e7T3gFqzRP9vt5NdTtWvtGqg0U2tQR0/rIRq8Zi8Z8noX9/n1da92Us9RZvYTA==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).getText();
	charlimit = charlimit.replaceAll("[^\\d]", "");
	randomText = randomText(Integer.parseInt(charlimit)+1);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(randomText);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(Keys.TAB);
	flow.WaitforProgressBar();
	String textboxAlert = owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRd2TDWjQYTkaMrEK0ju7UPuuK3keKfCbBSndzi2/QxcULtg5OucKIR9C2eMOGCvXSAWAauUpzhWkaep29pDGrMscHf8tBnThWmI2AyAjLbh1",this.FF23242524354dfdgdgdgsdfsdfd5))).getText();
	if(textboxAlert != null) {
//	flow.StepInfoWithoutScreenshot("Alert populated successfully and the alert is " +  textboxAlert);
	System.out.println("Alert populated successfully and the alert is " +  textboxAlert);
	}
	} catch (Exception e) {
	}
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).clear();
	randomText = randomText(12);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(randomText);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMtcwKnsSypOS4Z2Py9Se4TI8rqFdJ0E6ynKT6iGpX55FxWClx+GLKzyNq4YoLOIGyIBHrP+JarUZTfcFymU093OwnqJ6B5rtpuewRgzoo0P/nJLzbbSAkYRX3HFAcbVGKuv/z0SC21+ok3Ei7hOzbIikgUf7aFp1/+Wg6PISViXkBdHhOfSIIoJ3NP8IkSfxXYT01HUiDoQfudmR1ehmCjyaasWQoAI7LeOVk4W13Gkt3ZWyzPsPfJg8EU9paTf0hzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(Keys.TAB);
	flow.WaitforProgressBar();
	flow.TurnOnImplicitWaits();
	}

	}
	else if(componenttype.contains("PickerWidget"))
	{

//	flow.StepInfoWithoutScreenshot("Picker field component check for the fieldname - "+fieldname);
	System.out.println("Picker field component check for the fieldname - "+fieldname);
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+LuSEA5CMfNH82zAazk8bm1cQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
	try
	{
	owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+LuSEA5CMfNH82zAazk8bm1cQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys("a");
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAwtA6HBj1O1qDjOz4x36MgA==",this.FF23242524354dfdgdgdgsdfsdfd5)));
	List <WebElement>dropdownlist=owebdriver.findElements(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAqp31qP08ARrZ/PYTMKU5WJKSZN/sdKBKT9aYfXRbTfTexLPnU7rF3F5hWPHxMVaQh0CG2rdhgmhbK4iFQCiKQfkTvHDKtsFwV2Rn2lU7nbQ=",this.FF23242524354dfdgdgdgsdfsdfd5)));
	int listsize=dropdownlist.size();
	int resultvalues=randomNumber(listsize);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("DV6UpgrY543MCt/hBW+UC5Pks5Al5aHfn3AAbIcI/gDiPQEkL8mHeCmMWg0EZgXxgflkeYLHD+wgd/MXZJ+C+jEhdbvEoj+mV2oKm8ktYLQQEl0MDQYMUuoFnDd4HTTFfRUiJDpmkXLdjjNvPBMM2B04rvTDxsP7Na5p/rx/4v02RZpebsdqdqgaN3+zrA3i",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).click();
	}
	catch(Exception e)
	{
	flow.TurnOnImplicitWaits();
	}
	}
	else if(componenttype.contains("MultipleDropdownWidget---dropdown_value"))
	{
//	flow.StepInfoWithoutScreenshot("Multi select dropdown field component check for the fieldname - "+fieldname);
	System.out.println("Multi select dropdown field component check for the fieldname - "+fieldname);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbjEhdbvEoj+mV2oKm8ktYLRZFH20gd91jUptTAXYwvCHSf6y7QCa4GZfATgauQVwxDRnGP0zvg0oCPnQZi9P2N0=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).click();

	List<WebElement>list=owebdriver.findElements(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VPjueW0QknbUftr2taCN0v0=",this.FF23242524354dfdgdgdgsdfsdfd5)));
	int count=list.size();
	List<Integer> optionNumbers = randomNumbersList(2, count);
	for(int i=0;i<optionNumbers.size();i++)
	{
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VJFIJFUZvM8ddS7y1g0ZMu0j/OEAZ3A6c0Z84Nbjc4fEsqvMdivGnleS5qvM0IHCHg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+optionNumbers.get(i)+\"", String.valueOf(optionNumbers.get(i)))));
	owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VJFIJFUZvM8ddS7y1g0ZMu0j/OEAZ3A6c0Z84Nbjc4fEsqvMdivGnleS5qvM0IHCHg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+optionNumbers.get(i)+\"", String.valueOf(optionNumbers.get(i))))).click();

	}
	owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbjEhdbvEoj+mV2oKm8ktYLRZFH20gd91jUptTAXYwvCHSf6y7QCa4GZfATgauQVwxDRnGP0zvg0oCPnQZi9P2N0=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(Keys.ESCAPE);
	}

	else if(componenttype.contains("RadioSelect"))
	{
//	flow.StepInfoWithoutScreenshot("Radio button field component check for the fieldname - "+fieldname);
	System.out.println("Radio button field component check for the fieldname - "+fieldname);
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbjEhdbvEoj+mV2oKm8ktYLQhDoAa6ehcmghGlexhfC+ezCI6goZSBehQN+LdpUg2PQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
	;
	List<WebElement>list=owebdriver.findElements(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbjEhdbvEoj+mV2oKm8ktYLQhDoAa6ehcmghGlexhfC+ezCI6goZSBehQN+LdpUg2PQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
	int count=list.size();
	int resultvalues=randomNumber(count);
	if(resultvalues == 0) {
	resultvalues = 1;
	}
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMnqwQvZ9pHSmcq/kE1khdzOTbD/U9KD3JRmFZuQDKtfUPZ11RDWImHOmPZFzmXHUEyYlSzHPKzlFnpjOqdA0E812TNFlnKSMZDBK8Qfspw0E=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)).replace("\"+resultvalues+\"", String.valueOf(resultvalues)))).click();

	}
	else if(componenttype.contains("CheckboxGroup---choice_wrapper") || componenttype.contains("CheckboxGroup---choice_pair"))
	{
//	flow.StepInfoWithoutScreenshot("Check box field component check for the fieldname - "+fieldname);
	System.out.println("Check box field component check for the fieldname - "+fieldname);
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbjEhdbvEoj+mV2oKm8ktYLTid9l1OQxJpofsD3FVv3hY4FSfEQkqeJhbh0P9jkSHpQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
	List<WebElement>list=owebdriver.findElements(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa6+8FxMHvRjxA3Tz29FIMkSdGgip7IuMxk5Plen9ERRbjEhdbvEoj+mV2oKm8ktYLTid9l1OQxJpofsD3FVv3hY4FSfEQkqeJhbh0P9jkSHpQ==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
	int count=list.size();
	int resultvalues=randomNumber(count);
	if(resultvalues == 0) {
	resultvalues = 1;
	}
	owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMnqwQvZ9pHSmcq/kE1khdzOTbD/U9KD3JRmFZuQDKtfXWjZmpTzWdtteEEhqNF6JQ7nqKgR9fGqoiMvkFrPLPOJg0EQQqp4hwdenBsuSNdzo=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)).replace("\"+resultvalues+\"", String.valueOf(resultvalues)))).click();
	}
	}
	catch(Exception e)
	{
	String Exception = Throwables.getStackTraceAsString(e);
	e.printStackTrace();
	}
	}


	public void PopulateDataforGrid(int gridnumber,int rownumber,int columnnumber) throws IOException
	{
	try
	{
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQrliY/dve2wk8M6W6ZuIYet3u0faYKQ6YSNxbhtQPYE+kpJk3+x0oEpP1ph9dFtN9MX3e8Uwzw4B+HzLGThKlr9NOxT7we3+q9chmIHJDfZK",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
	String componenttype=owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQrliY/dve2wk8M6W6ZuIYet3u0faYKQ6YSNxbhtQPYE+kpJk3+x0oEpP1ph9dFtN9MX3e8Uwzw4B+HzLGThKlr9NOxT7we3+q9chmIHJDfZK",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).getAttribute("class");
//	flow.StepInfoWithoutScreenshot("Component type for the field with the grid number "+gridnumber+", row number "+rownumber+", column number - "+componenttype);
   System.out.println("Component type for the field with the grid number "+gridnumber+", row number "+rownumber+", column number - "+componenttype);
	if(componenttype.contains("DropdownWidget---dropdown")&&!componenttype.contains("MultipleDropdownWidget---dropdown_value"))
	{
	WebElement element1 = owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQm9Kvx38Wo3T+OUecCcGJxjHTa2vrtAhHhXPZOezTh2K", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
	element1.click();
	List <WebElement>dropdownlist=owebdriver.findElements(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyehcevrwAJOSL5gEaqxHff3YRME35tElcaSCwGCtBInSXiypBroFBPw6DjpJCY4GH/iZ4FV7PPe5rdYYInEWuDiM=",this.FF23242524354dfdgdgdgsdfsdfd5)));
	int listsize=dropdownlist.size()-1;
	int resultvalues=randomNumber(listsize);
	if(resultvalues == 0) {
	resultvalues=resultvalues+2;
	} else if (resultvalues == 1) {
	resultvalues=resultvalues+1;
	}
	owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyehcevrwAJOSL5gEaqxHff3YRME35tElcaSCwGCtBInSXjisI4iJ9VQXLI3AXz0v2L7lGb/RYrWnugOc9FCcWM6myq8x2K8aeV5Lmq8zQgcIe",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+resultvalues+\"", String.valueOf(resultvalues)))).click();
	element1.sendKeys(Keys.ESCAPE);

	}
	else if(componenttype.contains("TextInput")||componenttype.contains("textarea"))
	{
	String randomText = randomText(12);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("fJS6KEo8DKSisD+SUrYpIH6rIpnTa1Eq2ToaWMCjRv6b7K/Y/WQC/4T7Smy63+achumrDnhJue33RcH5Izw7VN/vaGnGwQAWTNYVDo+PggwmpW4MtI5Cq4SotSJP3VsCalMFNWUcg3keEuA2110nzg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).sendKeys(randomText);
	}
	else if(componenttype.contains("DatePickerWidget"))
	{
	WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQtGDQzm1u/0FFMeRENlH0IZqiAX0Iawbgpih8CgTcX9sLOebm1GHgQmdBgOoiwo/OxX8/bihGmvmz5F+mC1mz94=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));

	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(6, -1);
	Date previousDate = calendar.getTime();
	String Date = formatter.format(previousDate);
	element.sendKeys(Date);
	element.sendKeys(Keys.TAB);
	}
	else if(componenttype.contains("MultipleFileUploadWidget"))
	{
	File path = new File(System.getProperty("user.dir")+"//Test.docx");
	boolean condition=path.exists();
	if(condition==false)
	{
	XWPFDocument document = new XWPFDocument();
	FileOutputStream out = new FileOutputStream("Test.docx");
	XWPFParagraph paragraph = document.createParagraph();
	XWPFRun run = paragraph.createRun();
	run.setText("Test Document");
	document.write(out);
	out.close();
	}
	String filepath=System.getProperty("user.dir")+"//Test.docx";
	owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQo/HARiko966YQfcSEGf7zk=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).sendKeys(filepath);
	}
	else if(componenttype.contains("PickerWidget"))
	{

	flow.ExplicitWait(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQjE+8r0qnoOmWx7t6IqFzWU=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
	try
	{
	owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQjE+8r0qnoOmWx7t6IqFzWU=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).sendKeys("a");
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAwtA6HBj1O1qDjOz4x36MgA==",this.FF23242524354dfdgdgdgsdfsdfd5)));
	List <WebElement>dropdownlist=owebdriver.findElements(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAqp31qP08ARrZ/PYTMKU5WJKSZN/sdKBKT9aYfXRbTfTexLPnU7rF3F5hWPHxMVaQh0CG2rdhgmhbK4iFQCiKQfkTvHDKtsFwV2Rn2lU7nbQ=",this.FF23242524354dfdgdgdgsdfsdfd5)));
	int listsize=dropdownlist.size();
	int resultvalues=randomNumber(listsize);
	owebdriver.findElement(By.xpath(SingleDropCheckBox("DV6UpgrY543MCt/hBW+UC5Pks5Al5aHfn3AAbIcI/gDiPQEkL8mHeCmMWg0EZgXxgflkeYLHD+wgd/MXZJ+C+jEhdbvEoj+mV2oKm8ktYLQQEl0MDQYMUuoFnDd4HTTFfRUiJDpmkXLdjjNvPBMM2B04rvTDxsP7Na5p/rx/4v02RZpebsdqdqgaN3+zrA3i",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+resultvalues+\"", String.valueOf(resultvalues)))).click();
	}
	catch(Exception e)
	{
	flow.TurnOnImplicitWaits();
	}
	}
	else if(componenttype.contains("MultipleDropdownWidget---dropdown_value"))
	{
	owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQs+l2C+sZeLN8rRchkUCwo80aF9vIAQP7RgWyPLLewaFPygP1Nx7R/CwX8HW2vL+O8f2rp5l2Fiht9KfuSeIVHM=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).click();
	List<WebElement>list=owebdriver.findElements(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VPjueW0QknbUftr2taCN0v0=",this.FF23242524354dfdgdgdgsdfsdfd5)));
	int count=list.size();
	List<Integer> optionNumbers = randomNumbersList(2, count);
	for(int i=0;i<optionNumbers.size();i++)
	{
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VJFIJFUZvM8ddS7y1g0ZMu0j/OEAZ3A6c0Z84Nbjc4fEsqvMdivGnleS5qvM0IHCHg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+optionNumbers.get(i)+\"", String.valueOf(optionNumbers.get(i)))));
	owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6CyeljRgeGLxkHPYiDiizLZXocNKj6cXM9RFCrQvfL0WBv7uTl2qNLXuhks1uIgHvd/VJFIJFUZvM8ddS7y1g0ZMu0j/OEAZ3A6c0Z84Nbjc4fEsqvMdivGnleS5qvM0IHCHg==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+optionNumbers.get(i)+\"", String.valueOf(optionNumbers.get(i))))).click();

	}
	owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQnQoiWsM5OkSy3vnhJikIE0=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).sendKeys(Keys.ESCAPE);
	}

	else if(componenttype.contains("RadioSelect"))
	{
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQs+l2C+sZeLN8rRchkUCwo/Zv3Oj9Z7GIaVx4bOVZ+PtfaV9YKPXMxSodepmLy0sdw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
	List<WebElement>list=owebdriver.findElements(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQs+l2C+sZeLN8rRchkUCwo/Zv3Oj9Z7GIaVx4bOVZ+PtfaV9YKPXMxSodepmLy0sdw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
	int count=list.size();
	int resultvalues=randomNumber(count);
	if(resultvalues == 0) {
	resultvalues = 1;
	}
	owebdriver.findElement(By.xpath(SingleDropCheckBox("fJS6KEo8DKSisD+SUrYpIH6rIpnTa1Eq2ToaWMCjRv6b7K/Y/WQC/4T7Smy63+achumrDnhJue33RcH5Izw7VNoHg0x8iXFhb1b1GBVbLiD1UM2SwhZnskbW4bl7axD8z9XLD87UiPKWu/xLvg+bTfdaPmkcMrXN9IYT9iPKXCENeT0GoaaBtHIgl02Hn9Fz",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+resultvalues+\"", String.valueOf(resultvalues)))).click();

	}
	else if(componenttype.contains("CheckboxGroup---choice_pair") || componenttype.contains("CheckboxGroup---choice_wrapper"))
	{
	System.out.println("Checkbox");
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQs+l2C+sZeLN8rRchkUCwo/F4mTwx9ZBxx7oGDduxOGT6SeOR1XDhbP4VAG5Akwuq3u4So3wIRrhQsO1XlhGcfM=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
	List<WebElement>list=owebdriver.findElements(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQs+l2C+sZeLN8rRchkUCwo/F4mTwx9ZBxx7oGDduxOGT6SeOR1XDhbP4VAG5Akwuq3u4So3wIRrhQsO1XlhGcfM=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
	int count=list.size();
	int resultvalues=randomNumber(count);
	if(resultvalues == 0) {
	resultvalues = 1;
	}
	owebdriver.findElement(By.xpath(SingleDropCheckBox("fJS6KEo8DKSisD+SUrYpIH6rIpnTa1Eq2ToaWMCjRv6b7K/Y/WQC/4T7Smy63+achumrDnhJue33RcH5Izw7VNoHg0x8iXFhb1b1GBVbLiCAaTtcyoZeKefMcFUot7am0GDWXnRFFUBszI/B2ub4Prl2PGNrBZotiC943WToXUk2RZpebsdqdqgaN3+zrA3i",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)).replace("\"+resultvalues+\"", String.valueOf(resultvalues)))).click();
	}
	}
	catch(Exception e)
	{
	String Exception = Throwables.getStackTraceAsString(e);
	e.printStackTrace();
	}
	}


	public void PopulateDataforDateFieldonGrid(String gridnumber,String rownumber,String columnnumber,String datecondition) throws IOException
	{
	try
	{
	WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQtGDQzm1u/0FFMeRENlH0IZqiAX0Iawbgpih8CgTcX9sLOebm1GHgQmdBgOoiwo/OxX8/bihGmvmz5F+mC1mz94=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
	if(datecondition.equalsIgnoreCase("past"))
	{
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(6, -1);
	Date previousDate = calendar.getTime();
	String Date = formatter.format(previousDate);
	element.sendKeys(Date);
	element.sendKeys(Keys.TAB);
	}
	if(datecondition.equalsIgnoreCase("future"))
	{
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(6, +1);
	Date previousDate = calendar.getTime();
	String Date = formatter.format(previousDate);
	element.sendKeys(Date);
	element.sendKeys(Keys.TAB);
	}
	if(datecondition.equalsIgnoreCase("present"))
	{
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(6, 0);
	Date previousDate = calendar.getTime();
	String Date = formatter.format(previousDate);
	element.sendKeys(Date);
	element.sendKeys(Keys.TAB);
	}
	}
	catch(Exception e)
	{
	String Exception = Throwables.getStackTraceAsString(e);
	e.printStackTrace();
	}
	}

	public void PopulateDataforDateFieldBasedonFieldname(String fieldname,String datecondition) throws IOException
	{
	try
	{
	flow.ExplicitWait(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8prwtMJz4BdSGJiMQnucRfBik=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
	WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("8YGO16BzF+DiEMcp0vdtxoWEyI6Zec0OJyP+G0zQ/uD/OTRCz87Wkmz85biXm0q1vGNa3Zi+nBv/OQFjr2vjM+89h1oQa4ikDBJqi3oeRa7AgpGsGGKV4HI215izI+Luw0/wal2FXjzTCHdIevnJCfvzALWfdLhwqbMQF2fEhfgAVeLAh0Awt51XQ/tIYLK4WzcFYKLt+4hsPCJ2MM5Dl45ZmM3Fkm70ae6QxUChHI0jL23wQwd0yGdIwxjUrZyzGzujmOr46nX26HYQUJ8prwtMJz4BdSGJiMQnucRfBik=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
	if(datecondition.equalsIgnoreCase("past"))
	{
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(6, -1);
	Date previousDate = calendar.getTime();
	String Date = formatter.format(previousDate);
	element.sendKeys(Date);
	element.sendKeys(Keys.TAB);
	}
	if(datecondition.equalsIgnoreCase("future"))
	{
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(6, +1);
	Date previousDate = calendar.getTime();
	String Date = formatter.format(previousDate);
	element.sendKeys(Date);
	element.sendKeys(Keys.TAB);
	}
	if(datecondition.equalsIgnoreCase("present"))
	{
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(6, 0);
	Date previousDate = calendar.getTime();
	String Date = formatter.format(previousDate);
	element.sendKeys(Date);
	element.sendKeys(Keys.TAB);
	}
	}
	catch(Exception e)
	{
	String Exception = Throwables.getStackTraceAsString(e);
	e.printStackTrace();
	}
	}


	public void PopulateDataforUploadfieldonGrid(String gridnumber,String rownumber,String columnnumber,String filetype) throws IOException
	{try
	{
		// flow.ExplicitWait(By.xpath("(.//table)["+gridnumber+"]//tr["+rownumber+"]//td["+columnnumber+"]//input"));
		String filepath=new String();
		if(filetype.equalsIgnoreCase("png"))
		{
		File path = new File(System.getProperty("user.dir")+"//Testpng.png");
		boolean condition=path.exists();
		if(condition==false)
		{
		BufferedImage img = new BufferedImage(100, 100,
		BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = img.createGraphics();
		g2d.setColor(Color.YELLOW);
		g2d.drawLine(0, 0, 50, 50);

		g2d.setColor(Color.BLACK);
		g2d.drawLine(50, 50, 0, 100);

		g2d.setColor(Color.RED);
		g2d.drawLine(50, 50, 100, 0);

		g2d.setColor(Color.GREEN);
		g2d.drawLine(50, 50, 100, 100);

		ImageIO.write(img, "PNG", new File("Testpng.png"));
		}
		filepath=System.getProperty("user.dir")+"//Testpng.png";
		}
		else if(filetype.equalsIgnoreCase("jpeg"))
		{
		File path = new File(System.getProperty("user.dir")+"//Testjpeg.jpeg");
		boolean condition=path.exists();
		if(condition==false)
		{
		BufferedImage img = new BufferedImage(100, 100,
		BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = img.createGraphics();
		g2d.setColor(Color.YELLOW);
		g2d.drawLine(0, 0, 50, 50);

		g2d.setColor(Color.BLACK);
		g2d.drawLine(50, 50, 0, 100);

		g2d.setColor(Color.RED);
		g2d.drawLine(50, 50, 100, 0);

		g2d.setColor(Color.GREEN);
		g2d.drawLine(50, 50, 100, 100);
		ImageIO.write(img, "JPEG", new File("Testjpeg.jpeg"));
		}
		filepath=System.getProperty("user.dir")+"//Testjpeg.jpeg";
		}
		else if(filetype.equalsIgnoreCase("docx"))
		{
		File path = new File(System.getProperty("user.dir")+"//Testdocx.docx");
		boolean condition=path.exists();
		if(condition==false)
		{
		XWPFDocument document = new XWPFDocument();
		FileOutputStream out = new FileOutputStream("Testdocx.docx");
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		run.setText("Test Document");
		document.write(out);
		out.close();
		}
		filepath=System.getProperty("user.dir")+"//Testdocx.docx";
		}
		else if(filetype.equalsIgnoreCase("pdf"))
		{
		File path = new File(System.getProperty("user.dir")+"//Testpdf.pdf");
		boolean condition=path.exists();
		if(condition==false)
		{
		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		document.addPage(page);

		PDPageContentStream contentStream = new PDPageContentStream(document, page);

		contentStream.setFont(PDType1Font.COURIER, 12);
		contentStream.beginText();
		contentStream.showText("Test File");
		contentStream.endText();
		contentStream.close();

		document.save("Testpdf.pdf");
		document.close();
		}
		filepath=System.getProperty("user.dir")+"//Testpdf.pdf";
		}

		owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQo/HARiko966YQfcSEGf7zk=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).sendKeys(filepath);
		}
		catch(Exception e)
		{
		String Exception = Throwables.getStackTraceAsString(e);
		e.printStackTrace();
		}
	}
	public void PopulateDataforUploadfieldBasedonFieldname(String fieldname,String filetype) throws IOException
	{
		try
		{
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("eRRM0KQZXOruvJZm4zMR4aD/RkLUV3BZqy0TT/GrBY3RQKMh50IkZafJMq+93ho/SdIWEtNuz0zQK/rIlCWFgU3ZfHoUdH9BDs585VsiykT1FHbhGyLOmx+SlehGuSkX", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname))));
			String filepath=new String();
			if(filetype.equalsIgnoreCase("png"))
			{
				File path = new File(System.getProperty("user.dir"));
				BufferedImage img = new BufferedImage(100, 100,
						BufferedImage.TYPE_INT_ARGB);
				Graphics2D g2d = img.createGraphics();
				g2d.setColor(Color.YELLOW);
				g2d.drawLine(0, 0, 50, 50);

				g2d.setColor(Color.BLACK);
				g2d.drawLine(50, 50, 0, 100);

				g2d.setColor(Color.RED);
				g2d.drawLine(50, 50, 100, 0);

				g2d.setColor(Color.GREEN);
				g2d.drawLine(50, 50, 100, 100);

				ImageIO.write(img, "PNG", new File(path, "Testpng.png"));
				filepath=path+"\\Testpng.png";
			}
			else if(filetype.equalsIgnoreCase("jpeg"))
			{
				File path = new File(System.getProperty("user.dir"));
				BufferedImage img = new BufferedImage(100, 100,
						BufferedImage.TYPE_INT_ARGB);
				Graphics2D g2d = img.createGraphics();
				g2d.setColor(Color.YELLOW);
				g2d.drawLine(0, 0, 50, 50);

				g2d.setColor(Color.BLACK);
				g2d.drawLine(50, 50, 0, 100);

				g2d.setColor(Color.RED);
				g2d.drawLine(50, 50, 100, 0);

				g2d.setColor(Color.GREEN);
				g2d.drawLine(50, 50, 100, 100);

				ImageIO.write(img, "JPEG", new File(path, "Testjpeg.jpeg"));
				filepath=path+"\\Testjpeg.jpeg";
			}
			else if(filetype.equalsIgnoreCase("docx"))
			{
				File path = new File(System.getProperty("user.dir"));

				XWPFDocument document = new XWPFDocument();
				FileOutputStream out = new FileOutputStream("Testdocx.docx");
				XWPFParagraph paragraph = document.createParagraph();
				XWPFRun run = paragraph.createRun();
				run.setText("Test Document");
				document.write(out);
				out.close();
				filepath=path+"\\Testdocx.docx";
			}
			else if(filetype.equalsIgnoreCase("pdf"))
			{
				File path = new File(System.getProperty("user.dir"));
				PDDocument document = new PDDocument();
				PDPage page = new PDPage();
				document.addPage(page);

				PDPageContentStream contentStream = new PDPageContentStream(document, page);

				contentStream.setFont(PDType1Font.COURIER, 12);
				contentStream.beginText();
				contentStream.showText("Test File");
				contentStream.endText();
				contentStream.close();

				document.save("Testpdf.pdf");
				document.close();
				filepath = System.getProperty("user.dir")+"/Testpdf.pdf";

			}

			owebdriver.findElement(By.xpath(SingleDropCheckBox("eRRM0KQZXOruvJZm4zMR4aD/RkLUV3BZqy0TT/GrBY3RQKMh50IkZafJMq+93ho/SdIWEtNuz0zQK/rIlCWFgU3ZfHoUdH9BDs585VsiykQv0pnHN9HCDeP8Vrr87mTHdixcU8o0dHUUj1jgApGQOg==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", String.valueOf(fieldname)))).sendKeys(filepath);
		}
		catch(Exception e)
		{
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
		}
	}

	public void PopulateDataforUploadfieldBasedonIndex(String index,String filetype) throws IOException
	{
		try
		{
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("0l9H58XBcOk3qWHBnF8H6YXkIo6P/FNwb4c2BMSFEmg=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+index+\"", String.valueOf(index))));
			String filepath=new String();
			if(filetype.equalsIgnoreCase("png"))
			{
				File path = new File(System.getProperty("user.dir"));
				BufferedImage img = new BufferedImage(100, 100,
						BufferedImage.TYPE_INT_ARGB);
				Graphics2D g2d = img.createGraphics();
				g2d.setColor(Color.YELLOW);
				g2d.drawLine(0, 0, 50, 50);

				g2d.setColor(Color.BLACK);
				g2d.drawLine(50, 50, 0, 100);

				g2d.setColor(Color.RED);
				g2d.drawLine(50, 50, 100, 0);

				g2d.setColor(Color.GREEN);
				g2d.drawLine(50, 50, 100, 100);

				ImageIO.write(img, "PNG", new File(path, "Testpng.png"));
				filepath=path+"\\Testpng.png";
			}
			else if(filetype.equalsIgnoreCase("jpeg"))
			{
				File path = new File(System.getProperty("user.dir"));
				BufferedImage img = new BufferedImage(100, 100,
						BufferedImage.TYPE_INT_ARGB);
				Graphics2D g2d = img.createGraphics();
				g2d.setColor(Color.YELLOW);
				g2d.drawLine(0, 0, 50, 50);

				g2d.setColor(Color.BLACK);
				g2d.drawLine(50, 50, 0, 100);

				g2d.setColor(Color.RED);
				g2d.drawLine(50, 50, 100, 0);

				g2d.setColor(Color.GREEN);
				g2d.drawLine(50, 50, 100, 100);

				ImageIO.write(img, "JPEG", new File(path, "Testjpeg.jpeg"));
				filepath=path+"\\Testjpeg.jpeg";
			}
			else if(filetype.equalsIgnoreCase("docx"))
			{
				File path = new File(System.getProperty("user.dir"));

				XWPFDocument document = new XWPFDocument();
				FileOutputStream out = new FileOutputStream("Testdocx.docx");
				XWPFParagraph paragraph = document.createParagraph();
				XWPFRun run = paragraph.createRun();
				run.setText("Test Document");
				document.write(out);
				out.close();
				filepath=path+"\\Testdocx.docx";
			}
			else if(filetype.equalsIgnoreCase("pdf"))
			{
				File path = new File(System.getProperty("user.dir"));
				PDDocument document = new PDDocument();
				PDPage page = new PDPage();
				document.addPage(page);

				PDPageContentStream contentStream = new PDPageContentStream(document, page);

				contentStream.setFont(PDType1Font.COURIER, 12);
				contentStream.beginText();
				contentStream.showText("Test File");
				contentStream.endText();
				contentStream.close();

				document.save("Testpdf.pdf");
				document.close();
				filepath = System.getProperty("user.dir")+"/Testpdf.pdf";

			}

			owebdriver.findElement(By.xpath(SingleDropCheckBox("0l9H58XBcOk3qWHBnF8H6YXkIo6P/FNwb4c2BMSFEmg=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+index+\"", String.valueOf(index)))).sendKeys(filepath);
		}
		catch(Exception e)
		{
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
		}
	}

	public void PopulateDataforIntegerFieldBasedonFieldname(String fieldname,String size,String condition) throws IOException
	{
		boolean messagecheckCondition = false;
		if(condition == "true") {
		messagecheckCondition = true;
		}
		try
		{
		flow.ExplicitWait(By.xpath(SingleDropCheckBox("eRRM0KQZXOruvJZm4zMR4aD/RkLUV3BZqy0TT/GrBY3RQKMh50IkZafJMq+93ho/SdIWEtNuz0zQK/rIlCWFgU3ZfHoUdH9BDs585VsiykSSGQdowaUN57mDTtWLWVXKdluVyy+nD1JEJ1BIsyDrTPBcsb2RuGbcTrRF22z5eZl6K2jZTihHam05ik9U/E5t6n2RinFQDN6AvP/cRNPZoA==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
		String componenttype=owebdriver.findElement(By.xpath(SingleDropCheckBox("eRRM0KQZXOruvJZm4zMR4aD/RkLUV3BZqy0TT/GrBY3RQKMh50IkZafJMq+93ho/SdIWEtNuz0zQK/rIlCWFgU3ZfHoUdH9BDs585VsiykSSGQdowaUN57mDTtWLWVXKdluVyy+nD1JEJ1BIsyDrTPBcsb2RuGbcTrRF22z5eZl6K2jZTihHam05ik9U/E5t6n2RinFQDN6AvP/cRNPZoA==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).getAttribute("class");
//		flow.StepInfoWithoutScreenshot("Component type for the fieldname "+fieldname+" - "+componenttype);
		System.out.println("Component type for the fieldname "+fieldname+" - "+componenttype);
//		flow.StepInfoWithoutScreenshot("Text field component check for the fieldname - "+fieldname);
		System.out.println("Text field component check for the fieldname - "+fieldname);
		String value=randomNumbers(Integer.parseInt(size));
		owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nM+wz6R2NWL1hM4wKArzrujkSIFZ27zH7cLPAeYpfjy1QAZIxwXm4KsRaL0So5Fhy5vtLQKrUrpauEfjRwovmOCBGf/1c3KYHnXG7Pxwl4sX0=",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).sendKeys(value);
		if(messagecheckCondition==true)
		{
		try {
		flow.TurnOffImplicitWaits();
		flow.ExplicitWait(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMFdrLu/J6tz3Or5Gypuv2RBvRyYcsa0EwcKGLEYuQbmRw8nHsm50ft4BGbbqe62zQzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname)));
		String text=owebdriver.findElement(By.xpath(SingleDropCheckBox("bqPpJgcoGmMifec4IERWFqv6VYI+OjAjH3UgKt0JMa/k+LbZimOzWMXsnaeKzO91qClcuHODxPvpmOEMeSFyRStHLJr8qoK0LHnFqk3NFVAzW8qbn63SEhEaZjYrm0nMFdrLu/J6tz3Or5Gypuv2RBvRyYcsa0EwcKGLEYuQbmRw8nHsm50ft4BGbbqe62zQzeWKtNqtc9gZIQ+zmD9Buw==",this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+fieldname+\"", fieldname))).getText();
//		flow.StepInfoWithoutScreenshot("Prompt message - "+text);
		System.out.println("Prompt message - "+text);
		flow.TurnOnImplicitWaits();
		} catch (Exception e) {
		// TODO: handle exception
		flow.TurnOnImplicitWaits();
		}
		}
		}
		catch(Exception e)
		{
		String Exception = Throwables.getStackTraceAsString(e);
		e.printStackTrace();
		}
	}

	public void PopulateDataforIntegerFieldonGrid(String gridnumber,String rownumber,String columnnumber,String size) throws IOException
	{
		try
		{
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQqZtuWLBbK0m8lKHHU8Ke2ssELXOpTAAEFwWQfdDNwOf9YSeRh2IdiZXs7ijhyWRHZzvHNFcdaLp5mUf0/JeF4oRlnohVLD99cXarzyNZvFC", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber))));
			String value=randomNumbers(Integer.parseInt(size));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQqZtuWLBbK0m8lKHHU8Ke2ssELXOpTAAEFwWQfdDNwOf9YSeRh2IdiZXs7ijhyWRHZzvHNFcdaLp5mUf0/JeF4oRlnohVLD99cXarzyNZvFC", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).sendKeys(value);
			owebdriver.findElement(By.xpath(SingleDropCheckBox("fbkY/dy6jdtwpNnB/AMF/hfPtYs0h3yIF2xDfBEbZELWXVxDVC9vNGMbxjAstJnmVbzP6LkQGy3aaSL90NZmQqZtuWLBbK0m8lKHHU8Ke2ssELXOpTAAEFwWQfdDNwOf9YSeRh2IdiZXs7ijhyWRHZzvHNFcdaLp5mUf0/JeF4oRlnohVLD99cXarzyNZvFC", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+gridnumber+\"", String.valueOf(gridnumber)).replace("\"+rownumber+\"", String.valueOf(rownumber)).replace("\"+columnnumber+\"", String.valueOf(columnnumber)))).sendKeys(Keys.ENTER);
		}
		catch(Exception e)
		{
			String Exception = Throwables.getStackTraceAsString(e);
			e.printStackTrace();
		}
	}

	//Functions added for PlanSA

	public void SelectValuefromPickerCustom(String pickerFieldName, String text) throws Exception {

		flow.ExplicitWait(By.xpath(SingleDropCheckBox("U+J9tBYyNigXMg/DJ4h5GxEqZpnAjel2euqMRtf5sNtmn4E5W/2ye7ctCyfliX9Ke0rb6EU5hMvoufiPZoCS1Itw21jjBQHVEwMa9c2w822PZ8WpgEz7AFRb/vteU9O6", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+pickerFieldName+\"", String.valueOf(pickerFieldName))));
		owebdriver.findElement(By.xpath(SingleDropCheckBox("U+J9tBYyNigXMg/DJ4h5GxEqZpnAjel2euqMRtf5sNtmn4E5W/2ye7ctCyfliX9Ke0rb6EU5hMvoufiPZoCS1Itw21jjBQHVEwMa9c2w823oM7hU/vU6E7N8lAXEMfee8pfBRKT2ONXH1XliB9+2puwnqJ6B5rtpuewRgzoo0P8G/GQOTDIkXcUhayg9LZ1htYFG6McryVtQx4L+nybj7DssoshqU8eonVvKTCbMpvkkdC2N/1v8FcLYes3gCIPOc2Ikcw1eK48EvPG1OHLJdlV2lTW15iM4+SJTItt+NU4WINFcY+o/rHOzxdYekWk9", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+pickerFieldName+\"", String.valueOf(pickerFieldName)))).sendKeys(text);

		flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24Y5RBIV3xH1z5qi9O3uIzBs=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", String.valueOf(text))));
		owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAX93yz/+hlZrIukp139Q24Y5RBIV3xH1z5qi9O3uIzBs=", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+text+\"", String.valueOf(text)))).click();

	}

	public void VerifyGridFieldValueinBoxLayoutCustom(int boxnumber, String fieldname, String inputvalue) throws Exception {
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aGLnhHTatv1+2fI7dnxugEr9g5Ehg7joTusGbemplg//", this.FF23242524354dfdgdgdgsdfsdfd5)));
			String element = owebdriver.findElement(By.xpath(SingleDropCheckBox("JyfaTByQDV408rF7v247aGLnhHTatv1+2fI7dnxugEr9g5Ehg7joTusGbemplg//", this.FF23242524354dfdgdgdgsdfsdfd5))).getAttribute("innerText");
			if (inputvalue.equals(element.trim())) {
//				flow.StepPassWithoutScreenshot("Box layout step " + fieldname + " match & it's step detail - " + inputvalue);
				System.out.println("Box layout step " + fieldname + " match & it's step detail - " + inputvalue);
			} else {
//				flow.StepFailWithoutScreenshot("Box layout step " + fieldname + " mismatch & it's step detail -  " + inputvalue);
				System.out.println("Box layout step " + fieldname + " mismatch & it's step detail -  " + inputvalue);
			} 
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("VerifyGridFieldValueinBoxLayout for the fieldname " + fieldname + " is throwing function error", true);
			e.printStackTrace();
		} 
	}

public void populateTextOnInputFieldOnFrame(int indexNumber, String text) throws IOException {
		
		try {
			flow.ExplicitWait(By.xpath(SingleDropCheckBox("zlwzkzs7cHyxgg4oMp0dkQBVq6U9pQextSr5M6MqOVwT/DIIdP20m5wVY9XaVtdo+RO8cMq2wXBXZGfaVTudtA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexNumber+\"", String.valueOf(indexNumber))));
			owebdriver.findElement(By.xpath(SingleDropCheckBox("zlwzkzs7cHyxgg4oMp0dkQBVq6U9pQextSr5M6MqOVwT/DIIdP20m5wVY9XaVtdo+RO8cMq2wXBXZGfaVTudtA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexNumber+\"", String.valueOf(indexNumber)))).clear();
			owebdriver.findElement(By.xpath(SingleDropCheckBox("zlwzkzs7cHyxgg4oMp0dkQBVq6U9pQextSr5M6MqOVwT/DIIdP20m5wVY9XaVtdo+RO8cMq2wXBXZGfaVTudtA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+indexNumber+\"", String.valueOf(indexNumber)))).sendKeys(text);
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("Unable to pass text for the field", true);
			e.printStackTrace();
		}
	}

	public void switchToFrameUsingIndex(int indexNumber) {

		owebdriver.switchTo().frame(indexNumber);
	}

	public void CustomClickButtonBasedonName(String Fieldnameastext) throws Exception {
		try {
			
			WebElement element = owebdriver.findElement(By.xpath(SingleDropCheckBox("ot5WpvZBCmCKsuq+u9LHfENbSaEhYGFrQ7qgls7gpb1Hmg0ZzugpA3ul91Hqnojb+RO8cMq2wXBXZGfaVTudtA==", this.FF23242524354dfdgdgdgsdfsdfd5).replace("\"+Fieldnameastext+\"", String.valueOf(Fieldnameastext))));
			element.click();
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("ClickButton for the button "+Fieldnameastext+" is throwing function error",true);
			e.printStackTrace();

		}
	}


	public void SelectValuefromPicker(String Text) throws Exception {
		try {
			String valuetext[]=Text.split(",");
		
			for(int i=0;i<valuetext.length;i++)
			{
				for(int j=0;j<valuetext[i].length();j++)
				{
					String character=Character.toString(valuetext[i].charAt(j));
					System.out.print(character);
					owebdriver.findElement(By.xpath(SingleDropCheckBox("eRRM0KQZXOruvJZm4zMR4T7h5gzcEaRzRz0NUZYyT9KDkoKlwodfGgoM+U2HWjPT2xUtf3AphHTLluSf3+I7Tg==", this.FF23242524354dfdgdgdgsdfsdfd5))).sendKeys(character);
				}
					//flow.WaitforProgressBar();
					////System.out.println("waited for bar");
					//owebdriver.findElement(By.xpath(".//div//*[@class='PickerWidget---picker_value']//input")).sendKeys(Keys.ENTER);
					flow.ExplicitWait(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAZkS+Y4JQ8YRg2Fza1fQazw==", this.FF23242524354dfdgdgdgsdfsdfd5)));
					owebdriver.findElement(By.xpath(SingleDropCheckBox("PbI0xcAkc0mQ0He9h6Cyeg+ghM9eIAdCWnegMPm7X2I+CcYnKsJZQMXon9TSTHuAZkS+Y4JQ8YRg2Fza1fQazw==", this.FF23242524354dfdgdgdgsdfsdfd5))).click();
					System.out.println("opt clicked");
			}	
			
		} catch (Exception e) {
			String Exception = Throwables.getStackTraceAsString(e);
//			flow.StepFail("SelectValuefromPicker with fieldname  is throwing function error",true);
			e.printStackTrace();

		}
	}


	public boolean verifyExpectedTextInGrid(int tableNum, int rowNumber, int columnNum, String expectedString) throws Exception {

		return flow.RetrieveTextPresentinGrid(tableNum, rowNumber, columnNum).equalsIgnoreCase(expectedString);
	}

	public WebElement expandRootElement(WebElement element) {
		WebElement ele = (WebElement) ((JavascriptExecutor)owebdriver).executeScript("return arguments[0].shadowRoot", element);
		return ele;
	}

public void frameGetText() {
		
		WebElement shadowRoot1 = expandRootElement(owebdriver.findElement(By.xpath(SingleDropCheckBox("gs20ce8sW1q3d1e6YTzrS11snENfLEB5MdVgiXU8fxPZll3WyIRtxzU1RzygVCCZ", this.FF23242524354dfdgdgdgsdfsdfd5))));
		System.out.println(shadowRoot1.getText());
	}
}