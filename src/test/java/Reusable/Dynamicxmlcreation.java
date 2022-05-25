package Reusable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Dynamicxmlcreation {
	public static Dynamicxmlcreation omxl = new Dynamicxmlcreation();

	public List<HashMap<String, String>> mydata = new ArrayList<>();

	public List<XmlSuite> mySuites = null;

	public List<XmlTest> myTests = new ArrayList<>();

	public List<String> key = new ArrayList<>();

	public List<String> value = new ArrayList<>();

	public static String screenshotfolderpath;

	public static String reportfolderpath;

	public static String resultlogpath;

	public static String resultlogname;

	public static String Directorypath;

	public static String JiraIntegration;

	public static String JiraID;

	public static String JiraassigneeaccountID;

	public static String Jiraapitoken;

	public static String Jiraprojectkey;

	public static String JiraDomainURL;

	public static String EmailIntegration;

	public static String Subject;

	public static String BodyMessage;

	public static String fromaddress;

	public static String toaddress;

	public static String ccaddress;

	public static String apppasword;

	public static String Platform;

	public static String suitename;

	SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss aa");

	Date date = new Date();

	public void runTestNGTest(String filepath, String inputsheetname, String resultlogsheetname, String xmlfilename, String Suitename, String screenshotfolderpath, String reportfolderpath, String Directorypath, String JiraIntegration, String JiraID, String Jiraapitoken, String JiraDomainURL, String JiraassigneeaccountID, String Jiraprojectkey, String EmailIntegration, String Subject, String BodyMessage, String fromaddress, String toaddress, String ccaddress, String apppasword, String Platform) throws IOException {
		try {
			Dynamicxmlcreation.screenshotfolderpath = screenshotfolderpath;
			Dynamicxmlcreation.reportfolderpath = reportfolderpath;
			resultlogpath = filepath;
			resultlogname = resultlogsheetname;
			Dynamicxmlcreation.Directorypath = Directorypath;
			Dynamicxmlcreation.JiraIntegration = JiraIntegration;
			Dynamicxmlcreation.JiraID = JiraID;
			Dynamicxmlcreation.Jiraapitoken = Jiraapitoken;
			Dynamicxmlcreation.JiraDomainURL = JiraDomainURL;
			Dynamicxmlcreation.JiraassigneeaccountID = JiraassigneeaccountID;
			Dynamicxmlcreation.Jiraprojectkey = Jiraprojectkey;
			Dynamicxmlcreation.EmailIntegration = EmailIntegration;
			Dynamicxmlcreation.Subject = Subject;
			Dynamicxmlcreation.BodyMessage = BodyMessage;
			Dynamicxmlcreation.fromaddress = fromaddress;
			Dynamicxmlcreation.toaddress = toaddress;
			Dynamicxmlcreation.ccaddress = ccaddress;
			Dynamicxmlcreation.apppasword = apppasword;
			Dynamicxmlcreation.Platform = Platform;
			String time = this.formatter.format(this.date).replaceAll(":", "-").replaceAll(" ", "_");
			Dynamicxmlcreation.suitename = Suitename + "_" + time + "";
			Excel inputsheet = new Excel(filepath, inputsheetname);
			this.mydata = Excel.getcelldata();
			TestNG myTestNG = new TestNG();
			XmlSuite mySuite = new XmlSuite();
			mySuite.setName(Suitename);
			for (HashMap<String, String> mtestcase : this.mydata) {
				if (mtestcase.get("Execution_flag") != null)
					if (((String)mtestcase.get("Execution_flag")).trim().equalsIgnoreCase("Y")) {
						for (Map.Entry<String, String> entry : mtestcase.entrySet()) {
							String Key = entry.getKey();
							String Value = entry.getValue();
							this.key.add(Key);
							this.value.add(Value);
						} 
						String[] paramskey = new String[this.key.size()];
						String[] paramsvalue = new String[this.key.size()];
						for (int j = 0; j < this.key.size(); j++) {
							paramskey[j] = this.key.get(j);
							paramsvalue[j] = this.value.get(j);
						} 
						HashMap<String, String> testcase = new HashMap<>();
						for (int l = 0; l < this.key.size(); l++) {
							if (!paramskey[l].equalsIgnoreCase("Classname") && 
									!paramskey[l].equalsIgnoreCase("Execution_flag") && 
									!paramskey[l].equalsIgnoreCase("Result"))
								testcase.put(paramskey[l], paramsvalue[l].replaceAll("\"", "")); 
						} 
						testcase.put("Suitename", String.valueOf(Suitename) + "_" + time);
						XmlTest myTest = new XmlTest(mySuite);
						myTest.setGroupByInstances(true);
						myTest.setPreserveOrder(true);
						myTest.setName(mtestcase.get("TCID"));
						myTest.setParameters(testcase);
						List<XmlClass> myClasses = new ArrayList<>();
						String[] name = ((String)mtestcase.get("Classname")).trim().split("\n");
						for (int k = 0; k < name.length; k++)
							myClasses.add(new XmlClass(name[k])); 
						myTest.setXmlClasses(myClasses);
						this.myTests.add(myTest);

					}  
			}

			mySuite.setTests(this.myTests);
			this.mySuites = new ArrayList<>();
			this.mySuites.add(mySuite);
			myTestNG.setXmlSuites(this.mySuites);
			mySuite.setFileName(xmlfilename);
			for (XmlSuite suite : this.mySuites)
				createXmlFile(suite, xmlfilename); 
			System.out.println("File created successfully.");

			myTestNG.run();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void createXmlFile(XmlSuite mSuite, String Filename) {
		try {
			FileWriter writer = new FileWriter(new File(Filename));
			writer.write(mSuite.toXml());
			writer.flush();
			writer.close();
			System.out.println((new File(Filename)).getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
