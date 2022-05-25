package Reusable;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;  
public class Excel {
	public static final String currentDir = System.getProperty("user.dir");
	public static String testDataExcelPath = null;
	 public static FileInputStream fis = null;
	 public static FileOutputStream fos = null;
	 public static XSSFWorkbook workBook=null;
	 public static HSSFWorkbook HSSFworkBook=null;
	 public static XSSFSheet sheet=null;
	 public static HSSFSheet HSSFSheet=null;
	 public static  FormulaEvaluator formulaEvaluator=null;
	 public static String filepath=null;
	 public static String sheetname=null;
	 public Excel()
	 {
		 
	 }
	public Excel(String Filepath,String Sheetname) throws IOException
	{
		filepath=Filepath;
		sheetname=Sheetname.trim();
//		System.out.println(filepath);
//		System.out.println(sheetname);
		if(filepath.contains(".xlsx"))
		{
			fis = new FileInputStream(filepath);
	        // Create an excel workbook from the file system
	         workBook = new XSSFWorkbook(fis);
	         sheet = workBook.getSheet(sheetname);
	         formulaEvaluator = workBook.getCreationHelper().createFormulaEvaluator();
		}
		else
		{
			fis = new FileInputStream(filepath);
	        // Create an excel workbook from the file system
			HSSFworkBook = new HSSFWorkbook(fis);
			HSSFSheet = HSSFworkBook.getSheet(sheetname);
	         formulaEvaluator = HSSFworkBook.getCreationHelper().createFormulaEvaluator();
		}
	}
	
	public static List<HashMap<String, String>> getcelldata() throws Exception
	{
		List<HashMap<String, String>> mydata = new ArrayList<HashMap<String, String>>();
		if(filepath.contains(".xlsx"))
		{
		Row HeaderRow = sheet.getRow(0);
		System.out.println(HeaderRow);
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
		    Row currentRow = sheet.getRow(i);
		    if(currentRow==null)
		    {
		    	
		    }
		    else
		    {
		    HashMap<String, String> currentHash = new HashMap<String, String>();
		    for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
		        Cell currentCell = currentRow.getCell(j);
		        	
		       switch(formulaEvaluator.evaluateInCell(currentCell).getCellTypeEnum())
	            {
	            		case STRING:
		        			if(currentCell.getStringCellValue()==null)
				        	{
				        		
				        	}
		        			else{
		        		currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
		        			}
		        		
		        		break;
		        		case NUMERIC:
		        			if(currentCell.getNumericCellValue()==0)
				        	{
				        		
				        	}
		        			if(DateUtil.isCellDateFormatted(currentCell))
		        			   {
		        				Date javaDate= DateUtil.getJavaDate((double) currentCell.getNumericCellValue());
		        				SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		        				String formattedDate = formatter.format(javaDate);
		        				currentHash.put(HeaderRow.getCell(j).getStringCellValue(), formattedDate);
		        			   }
		        			else
		        			{
		        				String text=ReplaceZeroLogic(Double.toString(currentCell.getNumericCellValue()));
		        				currentHash.put(HeaderRow.getCell(j).getStringCellValue(), text);
		        			}
		        			break;
			case BLANK:
//				currentHash.put(HeaderRow.getCell(j).getStringCellValue(), "null");
				break;
			case BOOLEAN:
				break;
			case ERROR:
				break;
			case FORMULA:
				break;
			case _NONE:
				break;
			default:
				break;
		        			}
		        			
		        		}
		    mydata.add(currentHash);
	}
		}
		fis.close();
		workBook.close();
		}
		else
		{
			Row HeaderRow = HSSFSheet.getRow(0);
			for (int i = 1; i < HSSFSheet.getPhysicalNumberOfRows(); i++) {
			    Row currentRow = HSSFSheet.getRow(i);
			    if(currentRow==null)
			    {
			    	
			    }
			    else
			    {
			    HashMap<String, String> currentHash = new HashMap<String, String>();
			    for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
			        Cell currentCell = currentRow.getCell(j);
			        	
			       switch(formulaEvaluator.evaluateInCell(currentCell).getCellTypeEnum())
		            {
		            		case STRING:
			        			if(currentCell.getStringCellValue()==null)
					        	{
					        		
					        	}
			        			else{
			        		currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
			        			}
			        		
			        		break;
			        		case NUMERIC:
			        			if(currentCell.getNumericCellValue()==0)
					        	{
					        		
					        	}
			        			if(HeaderRow.getCell(j).getStringCellValue().equalsIgnoreCase("date"))
			        			{
			        				Date javaDate= DateUtil.getJavaDate((double) currentCell.getNumericCellValue());
			        		        String date=new SimpleDateFormat("MM/dd/yyyy").format(javaDate);
			        				currentHash.put(HeaderRow.getCell(j).getStringCellValue(),date );
			        			}
			        			else{
			        				String text=ReplaceZeroLogic(Double.toString(currentCell.getNumericCellValue()));
			        			currentHash.put(HeaderRow.getCell(j).getStringCellValue(), text);
			        			}
			        			break;
				case BLANK:
					currentHash.put(HeaderRow.getCell(j).getStringCellValue(), "null");
					break;
				case BOOLEAN:
					break;
				case ERROR:
					break;
				case FORMULA:
					break;
				case _NONE:
					break;
				default:
					break;
			        			}
			        			
			        		}
			    mydata.add(currentHash);
			    }
		}
			fis.close();
			HSSFworkBook.close();
		}
		return mydata;
	}
	public static List<HashMap<String, String>> getcelldataforDB() throws Exception
	{
		List<HashMap<String, String>> mydata = new ArrayList<HashMap<String, String>>();
		if(filepath.contains(".xlsx"))
		{
		Row HeaderRow = sheet.getRow(0);
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
		    Row currentRow = sheet.getRow(i);
		    if(currentRow==null)
		    {
		    	
		    }
		    else
		    {
		    HashMap<String, String> currentHash = new HashMap<String, String>();
		    for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
		        Cell currentCell = currentRow.getCell(j);
		        	
		       switch(formulaEvaluator.evaluateInCell(currentCell).getCellTypeEnum())
	            {
	            		case STRING:
		        			if(currentCell.getStringCellValue()==null)
				        	{
				        		
				        	}
		        			else{
		        		currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue().replaceAll("\\r|\\n", ""));
		        			}
		        		
		        		break;
		        		case NUMERIC:
		        			if(currentCell.getNumericCellValue()==0)
				        	{
				        		
				        	}
		        			if(DateUtil.isCellDateFormatted(currentCell))
		        			   {
		        				
		        				Date javaDate= DateUtil.getJavaDate((double) currentCell.getNumericCellValue());
		        				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        				String formattedDate = formatter.format(javaDate);
		        				if(formattedDate.contains("1899"))
		        				{
		        					 formatter = new SimpleDateFormat("HH:mm:ss");
			        				 formattedDate = formatter.format(javaDate);
		        				}
		        				
		        				currentHash.put(HeaderRow.getCell(j).getStringCellValue(), formattedDate);
		        			   }
		        			else
		        			{
		        				String text=ReplaceZeroLogic(Double.toString(currentCell.getNumericCellValue()));
		        				currentHash.put(HeaderRow.getCell(j).getStringCellValue(), text);
		        			}
		        			break;
			case BLANK:
				currentHash.put(HeaderRow.getCell(j).getStringCellValue(), "null");
				break;
			case BOOLEAN:
				break;
			case ERROR:
				break;
			case FORMULA:
				break;
			case _NONE:
				break;
			default:
				break;
		        			}
		        			
		        		}
		    mydata.add(currentHash);
	}
		}
		fis.close();
		workBook.close();
		}
		return mydata;
	}
	public static List<HashMap<String, String>> getcelldatafromCSV(String file,String[] columnname)throws Exception
	{
		List<HashMap<String, String>> mydata = new ArrayList<HashMap<String, String>>();
		 BufferedReader reader = Files.newBufferedReader(Paths.get(file));
		 String COLUMN=new String();
		 String COLUMNNAME=new String();
		 for(String text:columnname)
		 {
			 COLUMN=COLUMN+"\""+text+"\""+",";
		 }

		 COLUMNNAME= StringUtils.substring(COLUMN, 0, COLUMN.length() - 1);
	     CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader(COLUMNNAME).withIgnoreHeaderCase().withTrim());
	     for (CSVRecord csvRecord: csvParser) {
	    	 HashMap<String, String> currentHash = new HashMap<String, String>();
	    	 for(int i=0;i<columnname.length;i++)
	    	 {
	    		 String text=ReplaceZeroLogic(csvRecord.get(i));
	    		 currentHash.put(columnname[i], text.replaceAll("\\r|\\n", ""));
	    	 }
	    	 mydata.add(currentHash);
	     }
	     return mydata;
	}
	public static void setcelldatainmastersheet()throws Exception
	{
		List<HashMap<String, String>> mydata = new ArrayList<HashMap<String, String>>();
		FileInputStream FIS=new FileInputStream(Dynamicxmlcreation.Directorypath+"//InputSheet//Inputdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(FIS);
		XSSFSheet inputdatasheet=workbook.getSheet("Inputdata");
		XSSFSheet resultlogdatasheet=workbook.getSheet("Resultlog");
		FileOutputStream FOS=new FileOutputStream(Dynamicxmlcreation.Directorypath+"//InputSheet//Inputdata.xlsx");
		Row HeaderRow = resultlogdatasheet.getRow(0);
		for (int i = 1; i < resultlogdatasheet.getPhysicalNumberOfRows(); i++) {
		    Row currentRow = resultlogdatasheet.getRow(i);
		    if(currentRow==null)
		    {
		    	
		    }
		    else
		    {
		    HashMap<String, String> currentHash = new HashMap<String, String>();
		    for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
		        Cell currentCell = currentRow.getCell(j);
		        	
		       switch(formulaEvaluator.evaluateInCell(currentCell).getCellTypeEnum())
	            {
	            		case STRING:
		        			if(currentCell.getStringCellValue()==null)
				        	{
				        		
				        	}
		        			else{
		        		currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
		        			}
		        		
		        		break;
		        		case NUMERIC:
		        			if(currentCell.getNumericCellValue()==0)
				        	{
				        		
				        	}
		        			if(DateUtil.isCellDateFormatted(currentCell))
		        			   {
		        				Date javaDate= DateUtil.getJavaDate((double) currentCell.getNumericCellValue());
		        				SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		        				String formattedDate = formatter.format(javaDate);
		        				currentHash.put(HeaderRow.getCell(j).getStringCellValue(), formattedDate);
		        			   }
		        			else
		        			{
		        				String text=ReplaceZeroLogic(Double.toString(currentCell.getNumericCellValue()));
		        				currentHash.put(HeaderRow.getCell(j).getStringCellValue(), text);
		        			}
		        			break;
			case BLANK:
				currentHash.put(HeaderRow.getCell(j).getStringCellValue(), "null");
				break;
			case BOOLEAN:
				break;
			case ERROR:
				break;
			case FORMULA:
				break;
			case _NONE:
				break;
			default:
				break;
		        			}
		        			
		        		}
		    mydata.add(currentHash);
	}
		}
		int colnum=-1;
		 Row currentRow = inputdatasheet.getRow(0);
		 for(int i=0;i<currentRow.getLastCellNum();i++)
		 {
			 if(currentRow.getCell(i).getStringCellValue().trim().equals("Execution_flag"))
			 {
				 colnum=i;
			 }
		 }
		 for (HashMap<String, String> mtestcase : mydata) {
			 for(int i=1;i<=inputdatasheet.getLastRowNum();i++){
				 Row updateRow = inputdatasheet.getRow(i);
				 if(updateRow.getCell(0).getStringCellValue().trim().equals(mtestcase.get("TCID"))&&mtestcase.get("Result").equals("Pass")){
					 if(updateRow==null)
						 updateRow=sheet.createRow(i);
					 Cell currentCell = updateRow.getCell(colnum);
					 
					 if(currentCell==null)
						 currentCell=updateRow.createCell(colnum);
					 currentCell.setCellValue("");
					 workbook.write(FOS);
				 }
				 if(updateRow.getCell(0).getStringCellValue().trim().equals(mtestcase.get("TCID"))&&mtestcase.get("Result").equals("Fail")){
				 {
					 if(updateRow==null)
						 updateRow=sheet.createRow(i);
					 Cell currentCell = updateRow.getCell(colnum);
					 
					 if(currentCell==null)
						 currentCell=updateRow.createCell(colnum);
					 currentCell.setCellValue("Y");
					 workbook.write(FOS);
				 }
			}
		 }
		
		FIS.close();
		workbook.close();
		 }
		
	}
	public static void setcelldata(String result,String TCID,String columnname) throws IOException
	{
		FileInputStream	fis = new FileInputStream(filepath);
		
        // Create an excel workbook from the file system
		if(filepath.contains(".xlsx"))
		{
         workBook = new XSSFWorkbook(fis);
		 sheet = workBook.getSheet(sheetname);
		int colnum=-1;
		 Row currentRow = sheet.getRow(0);
		 
		 for(int i=0;i<currentRow.getLastCellNum();i++)
		 {
			 if(currentRow.getCell(i).getStringCellValue().trim().equals(columnname))
			 {
				 colnum=i;
			 }
		 }
		 
	
		 for(int i=1;i<=sheet.getLastRowNum();i++){
			 Row updateRow = sheet.getRow(i);
			 if(updateRow.getCell(0).getStringCellValue().trim().equals(TCID)){
				 if(updateRow==null)
					 updateRow=sheet.createRow(i);
				 Cell currentCell = updateRow.getCell(colnum);
				 
				 if(currentCell==null)
					 currentCell=updateRow.createCell(colnum);
				 currentCell.setCellValue(result);
				 fos=new FileOutputStream(filepath);
				 workBook.write(fos);
				 workBook.close();
				 fis.close();
				 fos.close();
				 
			 }
		}
		
	
	}
	
	else
	{
		workBook = new XSSFWorkbook(fis);
		HSSFSheet = HSSFworkBook.getSheet(sheetname);
		int colnum=-1;
		 Row currentRow = sheet.getRow(0);
		 
		 for(int i=0;i<currentRow.getLastCellNum();i++)
		 {
			 if(currentRow.getCell(i).getStringCellValue().trim().equals(columnname))
			 {
				 colnum=i;
			 }
		 }
		 
	
		 for(int i=1;i<=HSSFSheet.getLastRowNum();i++){
			 Row updateRow = HSSFSheet.getRow(i);
			 if(updateRow.getCell(0).getStringCellValue().trim().equals(TCID)){
				 if(updateRow==null)
					 updateRow=sheet.createRow(i);
				 Cell currentCell = updateRow.getCell(colnum);
				 
				 if(currentCell==null)
					 currentCell=updateRow.createCell(colnum);
				 currentCell.setCellValue(result);
				 fos=new FileOutputStream(filepath);
				 HSSFworkBook.write(fos);
				 HSSFworkBook.close();
				 fis.close();
				 fos.close();
			 }
		}
	}
	}
	public static String ReplaceZeroLogic(String text)
	{
		String Output[]=text.split("\\.0");
		String Result=new String();
		if(Output.length>1)
		{
			Result=text;
		}
		else
		{
			Result=text.replace(".0", "");
		}
		return Result;
	 }
	}

