package stepDefinition;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Reusable.VATT;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class SAIL extends VATT{
	private WebDriver driver;
	
//* Method used to initiate driver*/
	@Given("^I set up browser (.*)$")
	public void inti_browser(String Browser) throws Exception
	{
		flow.StartDriver(Browser);
	}
	
///* Method used for Opening URL without Excel*/
	@Given("^I set Appian url to (.*)$")
	public void open_Browser_and_Enter(String URL) throws Exception {
		System.out.println(URL);
	   try {
		flow.OpenURL(URL);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
} 	
	
/* Method used for enter UserName and PassWord to Login*/
	@Given("^I login with UserName (.*) and PassWord (.*)$")
	public void user_enters_UserName_and_PassWord(String UserName, String PassWord) throws Throwable {
		flow.LoginwithUserNameandPassword(UserName, PassWord);
		System.out.println(UserName);
		System.out.println(PassWord);
	}
	
/* Method used for User Logout*/
	@Given("^I Logout")
	public void User_Logout() throws Exception
	{
		flow.Logout();
	}
	
/* Method Used for clicking WebElemet based on element name*/
	@Given("^I Click on WebElement (.*)$")
	public void User_Click_on_ElementName(String ElementName) throws Exception
	{
		flow.ClickWebElement(ElementName);
	}
	
/* Method Used for clicking Export to excel link*/
	@Given("^I Click on Export to excel link")
	public void User_Click_on_Exporttoexcellink() throws Exception
	{
		flow.ExportToExcelClick();
	}
	
/*Method used to Click on Box or Section Layout based on layout name*/
	@Given("^I Click on BoxSectionLayout (.*)$")
	public void User_Click_on_BoxSectionLayout(String LayoutName) throws Exception
	{
	   flow.ClickSectionorBoxLayout(LayoutName);	
	}
	
/*Method used to click on button based on button name*/
	@Given("^I Click on Button named (.*)$")
	public void User_Click_on_Button(String ButtonName) throws Exception
	{
		flow.ClickButtonBasedonName(ButtonName);
	
	}

/*Method used to click on button based on index*/
	@Given("^I Click on Button based on index (.*)$")
	public void User_Click_on_Button_basedonindex(int Indexnumber) throws Exception
	{
		flow.ClickButtonBasedonIndex(Indexnumber);
	
	}
	
/*Method used to select option from SingleSelect dropdown based on field name*/
	@Given("^I populate SingleSelect Dropdown field (.*) with value (.*)$")
	public void User_Click_on_SingleSelect_Dropdown_named_and_select_option(String FieldName, String OptionName) throws Exception
	{
		flow.SingleSelectDropDown(OptionName, FieldName);
		System.out.println(OptionName);
		System.out.println(FieldName);
	}
	
/*Method used to select option from SingleSelect dropdown based on index*/	
/* Note:Put field name as false if there is no field name*/
	@Given("^I populate SingleSelect dropdown field (.*) based on index (.*) with value (.*)$")
	public void User_Click_on_SingleSelect_Dropdown_based_on_index(String fieldname, int indexnumber, String inputtext) throws Exception
	{
		flow.SingleSelectDropDownBasedonIndex(inputtext, fieldname, indexnumber);
	}
	
/*Method used to select option from SingleSelect dropdown based on placeholder text*/	
	@Given("^I populate SingleSelect dropdown field based on placeholdertext (.*) with value (.*)$")
	public void User_Click_on_SingleSelect_Dropdown_based_on_placeholder(String placeholdertext, String inputtext) throws Exception
	{
		flow.SingleSelectDropDownBasedonPlaceholderText(placeholdertext, inputtext);
	}
	
/*Method used to select option from SingleSelect dropdown based on Instruction text*/		
	@Given("^I populate SingleSelect dropdown field based on instructiontext (.*) with value (.*)$")
	public void User_Click_on_SingleSelect_Dropdown_based_on_instruction(String InstructionText, String inputtext) throws Exception
	{
		flow.SingleSelectDropDownBasedonInstructionText(InstructionText, inputtext);
	}
/*Method used to select option from SingleSelect dropdown based on Tooltip text*/	
	@Given("^I populate SingleSelect dropdown field based on tooltiptext (.*) with value (.*)$")
	public void User_Click_on_SingleSelect_Dropdown_based_on_Tooltip(String TooltipText, String inputtext) throws Exception
	{
		flow.SingleSelectDropDownBasedonToolTipText(TooltipText, inputtext);
	}
	
/*Method used to select option from SingleSelect dropdown based on customized fieldname*/	
	@Given("^I populate SingleSelect dropdown field based on customized fieldname (.*) with value (.*)$")
	public void User_Click_on_SingleSelect_Dropdown_based_on_customized_fieldname(String fieldname, String inputtext) throws Exception
	{
		flow.SingleSelectDropDownforCustomizedFieldname(inputtext, fieldname);
	}
	
/*Method used for selecting options from MultiSelect dropdown
 Note:To select multiple options, add value in comma seperated form and donot add any space after comma in feature file*/
	@Given("^I populate MultiSelect Dropdown field (.*) with value (.*)$")
	public void User_Click_on_MultiSelect_Dropdown_named_select_options(String FieldName, String OptionName) throws Exception
	{
		flow.MultiSelectDropDown(FieldName, OptionName);
	}
	
/*Method used for selecting options from MultiSelect dropdown based on customized date field
Note:To select multiple options, add value in comma seperated form and donot add any space after comma in feature file*/
	@Given("^I populate MultiSelect Dropdown for customized date fields named (.*) with value (.*)$")
	public void User_Click_on_MultiSelect_Dropdown_customizeddatefield_named_select_options(String FieldName, String OptionName) throws Exception
	{
		flow.MultiSelectDropDownForCustomizedDates(FieldName, OptionName);
	}
	
/*Method used for selecting options from MultiSelect dropdown based on index
Note:To select multiple options, add value in comma seperated form and donot add any space after comma in feature file
Note:Put filedname as false, if there is no fieldname*/
	@Given("^I populate MultiSelect dropdown field (.*) based on index (.*) with value (.*)$")
	public void User_Click_on_MultiSelect_Dropdown_basedonindex(String fieldname,int indexnumber, String text) throws Exception
	{
		flow.MultiSelectDropDownBasedonIndex(fieldname, text, indexnumber);
	}
	
/*Method used for selecting options from MultiSelect dropdown based on placeholder text
Note:To select multiple options, add value in comma seperated form and donot add any space after comma in feature file*/
	@Given("^I populate MultiSelect dropdown field based on placeholdertext (.*) with value (.*)$")
	public void User_Click_on_MultiSelect_Dropdown_basedonplaceholder(String placeholdertext, String text) throws Exception
	{
		flow.MultiSelectDropDownBasedonPlaceHolderText(placeholdertext, text);
	}

/*Method used for selecting options from MultiSelect dropdown based on instruction text
Note:To select multiple options, add value in comma seperated form and donot add any space after comma in feature file*/
	@Given("^I populate MultiSelect Dropdown based on instructiontext (.*) with value (.*)$")
	public void User_Click_on_MultiSelect_Dropdown_basedoninstruction(String InstructionText, String text) throws Exception
	{
		flow.MultiSelectDropDownBasedonInstructionText(InstructionText, text);
	}
	
/*Method used for selecting options from MultiSelect dropdown based on customized fieldname
Note:To select multiple options, add value in comma seperated form and donot add any space after comma in feature file*/
	@Given("^I populate MultiSelect Dropdown based on customized fieldname (.*) with value (.*)$")
	public void User_Click_on_MultiSelect_Dropdown_basedoncustomizedfieldname(String fieldname, String text) throws Exception
	{
		flow.MultiSelectDropDownforCustomizedFieldname(fieldname, text);
	}
	
/*Method used for selecting options from MultiSelect dropdown based on customized fieldname
Note:To select multiple options, add value in comma seperated form and donot add any space after comma in feature file*/
		@Given("^I populate MultiSelect Dropdown based on tooltiptext (.*) with value (.*)$")
		public void User_Click_on_MultiSelect_Dropdown_basedonTooltip(String TooltipText, String text) throws Exception
		{
			flow.MultiSelectDropDownBasedonToolTipText(TooltipText, text);
		}
		
/*Method used for selecting options from Picker*/
	@Given("^I populate picker filed (.*) with value (.*)$")
	public void User_enters_value_in_the_picker_named_and_select_options(String FieldName, String OptionName) throws Exception
	{
		flow.SelectValuefromPicker(OptionName, FieldName);
	}
	
/*Method used for selecting options from Picker based on index
 Note:Put filedname as false if there is no fieldname*/
	@Given("^I populate picker field (.*) based on index (.*) with value (.*)$")
	public void User_enters_value_in_the_picker_basedonindex(String fieldname,int indexnumber,String Text) throws Exception
	{
		flow.SelectValuefromPickerBasedonIndex(Text, fieldname, indexnumber);
	}
	
/*Method used for selecting options from Picker based on placeholder text*/
	@Given("^I populate picker field based on placeholdertext (.*) with value (.*)$")
	public void User_enters_value_in_the_picker_basedonplaceholder(String PlaceholderText, String Text) throws Exception
	{
		flow.SelectValuefromPickerBasedonPlaceholderText(PlaceholderText, Text);
	}
	
/*Method used for selecting options from Picker based on instruction text*/	
	@Given("^I populate picker field based on instructiontext (.*) with value (.*)$")
	public void User_enters_value_in_the_picker_basedoninstruction(String InstructionText, String Text) throws Exception
	{
		flow.SelectValuefromPickerBasedonInstructionText(InstructionText, Text);
	}
	
/*Method used for selecting options from Picker based on tooltip text*/	
	@Given("^I populate picker field based on tooltiptext (.*) with value (.*)$")
	public void User_enters_value_in_the_picker_basedontooltip(String Tooltiptext, String Text) throws Exception
	{
		flow.SelectValuefromPickerBasedonToolTipText(Tooltiptext, Text);
	}
	
/*Method used for selecting options from Picker based on customized fieldname*/	
	@Given("^I populate picker field based on customized fieldname (.*) with value (.*)$")
	public void User_enters_value_in_the_picker_basedoncustomizedfieldname(String fieldname, String Text) throws Exception
	{
		flow.SelectValuefromPickerforCustomizedFieldname(Text, fieldname);
	}
	
/*Method used for selecting options from Picker in grid*/	
	@Given("^I populate picker field in grid (.*) column (.*) row (.*) with value (.*)$")
	public void User_selectvaluefrompickeringrid(int gridnumber, int columnnumber, int rownumber, String Text) throws Exception
	{
		flow.SelectValuefromPickeronGrid(Text, gridnumber, rownumber, columnnumber);
	}
	
/*Method used to click an element in the grid based on its index*/	
	@Given("^I click element in grid (.*) column (.*) row (.*)$")
	public void User_clickelementingrid(int Gridnumber, int columnnumber, int rownumber) throws Exception
	{
		flow.ClickGridWebElementUsingIndex(Gridnumber, rownumber, columnnumber);
	}
	
/*Method used to click an element in the grid based on its text*/	
	@Given("^I click element in grid (.*) based on text (.*)$")
	public void User_clickelementingridbasedontext(int Gridnumber, String inputtext) throws Exception
	{
		flow.ClickGridWebElementUsingText(Gridnumber, inputtext);
	}
	
/*Method used for selecting required radio option based on fieldname*/
	@Given("^I click on radio option (.*) of the field (.*)$")
	public void User_clicks_on_required_radio_button_of_the_field(String OptionName, String FieldName) throws Exception
	{
		flow.SelectRadioButtonBasedonFieldName(FieldName, OptionName);
	}
	
/*Method used for selecting required radio option based on fieldname index*/
	@Given("^I click on Radio option (.*) of the field (.*) based on index (.*)$")
	public void User_clicks_on_required_radio_button_basedonfieldnameindex(String option,String fieldname,int indexnumber) throws Exception
	{
		flow.SelectRadioButtonBasedonFieldNameIndex(fieldname, option, indexnumber);
	}
	
/*Method used for selecting required radio option based on index index*/
		@Given("^I click on radio option based on index (.*)$")
		public void User_clicks_on_required_radio_button_basedonindex(int indexnumber) throws Exception
		{
			flow.SelectRadioButtonBasedonIndex(indexnumber);
		}
	
/*Method used for selecting required radio option based on customized fieldname*/
		@Given("^I click on radio option (.*) based on customized fieldname (.*)$")
		public void User_clicks_on_required_radio_button_basedoncustomizedfieldname(String option, String fieldname) throws Exception
		{
			flow.SelectRadioButtonBasedonCustomizedFieldName(fieldname, option);
		}
	
/*Method used for selecting required checkbox*/
	@Given("^I click on checkbox option (.*) of the field (.*)$")	
	public void User_selects_required_Checkbox_of_the_field(String OptionName, String FieldName) throws Exception
	{
		flow.SelectCheckBoxBasedonFieldName(FieldName, OptionName);
	}
	
/*Method used for selecting required checkbox based on index*/
	@Given("^I click on Checkbox option (.*) of the field (.*) based on index (.*)$")	
	public void User_selects_required_Checkbox_basedonfieldnameindex(String option,String fieldname, int indexnumber) throws Exception
	{
		flow.SelectCheckBoxBasedonFieldNameIndex(fieldname, option, indexnumber);
	}
	
/*Method used for selecting required checkbox based on index*/
	@Given("^I click on Checkbox option based on index (.*)$")	
	public void User_selects_required_Checkbox_basedonindex(int indexnumber) throws Exception
	{
		flow.SelectCheckboxBasedonIndex(indexnumber);
	}
	
/*Method used for selecting required checkbox based on text*/
	@Given("^I click on Checkbox option based on text (.*)$")	
	public void User_selects_required_Checkbox_basedontext(String Text) throws Exception
	{
		flow.SelectCheckboxBasedonText(Text);
	}
	
/*Method used for selecting required checkbox based on customized fieldname*/
	@Given("^I click on Checkbox option (.*) based on customized fieldname (.*)$")	
	public void User_selects_required_Checkbox_basedonindex(String option,String fieldname) throws Exception
	{
		flow.SelectCheckBoxBasedonCustomizedFieldName(fieldname, option);
	}
	
/*Method used for selecting required checkbox in grid*/
	@Given("^I click on Checkbox option in grid (.*) column (.*) row (.*)$")	
	public void User_selects_required_Checkbox_ingrid(int Gridnumber, int Columnnumber, int Rownumber) throws Exception
	{
		flow.SelectCheckBoxonGrid(Gridnumber, Rownumber, Columnnumber);
	}
	
/*Method used to verify text present in grid*/
	@Given("^I verify grid text (.*) present in grid (.*)$")	
	public void User_verifytextingrid(String text, int Gridumber) throws Exception
	{
		flow.VerifyTextPresentinGrid(Gridumber, text);
	}
	
/*Method used to click on refresh filter link*/
	@Given("^I click on refresh filter link$")	
	public void User_clickrefreshfilter() throws Exception
	{
		flow.RefreshFilterClick();
	}
	
/*Method used to click on clear filter link*/
	@Given("^I click on clear filter link$")	
	public void User_clickclearfilter() throws Exception
	{
		flow.ClickClearFilter();
	}
	
/*Method used to retrieve a text in grid*/
	@Given("^I retrieve text present in grid (.*) column (.*) row (.*)$")	
	public void User_retrievetextingrid(int Gridumber,int rownumber, int columnnumber) throws Exception
	{
		flow.RetrieveTextPresentinGrid(Gridumber, rownumber, columnnumber);
	}
	
/*Method used to verify partial text in grid*/
	@Given("^I verify partial text (.*) in grid (.*)$")	
	public void User_partialtextingrid(String text,int Gridnumber) throws Exception
	{
		flow.VerifyPartialTextPresentinGrid(Gridnumber, text);
	}
	
/*Method used to verify the column name of the grid*/
	@Given("^I verify Column Name (.*) of the grid (.*)$")	
	public void User_verifycolumnnameofgrid(String Columntext,int Gridnumber) throws Exception
	{
		flow.VerifyGridColumnName(Gridnumber, Columntext);
	}
	
/*Method used to verify the partial column name of the grid*/
	@Given("^I verify Partial column name (.*) of the grid (.*)$")	
	public void User_verifypartialcolumnnameofgrid(String Columntext,int Gridnumber) throws Exception
	{
		flow.VerifyGridPartialColumnName(Gridnumber, Columntext);
	}
	
/*Method used to return the number of rows in the current page of the grid*/
	@Given("^I extract number of rows in the current page of the grid (.*)$")	
	public void User_returnnumberofrowsofcurrentpageingrid(int Gridnumber) throws Exception
	{
		flow.CalculateNumberofRowswithoutPagination(Gridnumber);
	}
	
/*Method used to return the number of rows for the entire grid*/
	@Given("^I extract number of rows for the entire grid (.*)$")	
	public void User_returnnumberofrowsofentirengrid(int Gridnumber) throws Exception
	{
		flow.CalculateNumberofRowswithPagination(Gridnumber);
	}
	
/*Method used to enter a text in the input text field inside the grid*/
	@Given("^I populate textfield in grid (.*) row (.*) column (.*) with value (.*)$")	
	public void User_entertextintextfieldingrid(int gridnumber, int rownumber, int columnnumber,String inputtext) throws Exception
	{
		flow.SetWebTextforGrid(inputtext, gridnumber, rownumber, columnnumber);
	}
	
/*Method used to enter a date in the date field which is present inside the grid*/
	@Given("^I populate datefield in grid (.*) row (.*) column (.*) with value (.*)$")	
	public void User_enterdateinaefieldingrid(int gridnumber, int rownumber, int columnnumber,String inputtext) throws Exception
	{
		flow.SetDateforDateFieldinGrid(inputtext, gridnumber, rownumber, columnnumber);
	}
	
/*Method used to verify text present in grid*/
	@Given("^I verify text (.*) present in grid (.*) row (.*) column (.*)$")	
	public void User_verifytextpresentingrid(String inputtext, int gridnumber, int rownumber, int columnnumber) throws Exception
	{
		flow.VerifyGridText(gridnumber, rownumber, columnnumber, inputtext);
	}
	
/*Method used to retrieve a entire row values from the grid*/
	@Given("^I retrive entire row values of row (.*) from the grid (.*)$")	
	public void User_retriverowvaluefromgrid(int rownumber, int Gridnumber) throws Exception
	{
		flow.RetrieveSpecificGridRowList(Gridnumber, rownumber);
	}
	
/*Method used to retrieve a entire column values from the grid*/
	@Given("^I retrive entire column values of column (.*) from the grid (.*)$")	
	public void User_retrivecolumnvaluefromgrid(int columnnumber, int Gridnumber) throws Exception
	{
		flow.RetrieveSpecificGridColumnList(Gridnumber, columnnumber);
	}
	
/*Method used to check pagination of any grid*/
	@Given("^I verify pagination of grid (.*)$")	
	public void User_verifypaginationofgrid(int indexnumber) throws Exception
	{
		flow.CheckPaginationofGrid(indexnumber);
	}
	
/*Method used to check sorting of the grid columns*/
	@Given("^I verify sorting of all the columns in the grid (.*)$")	
	public void User_verifysortingofgrid(int indexnumber) throws Exception
	{
		flow.CheckSorting(indexnumber);
	}
	
/*Method used to check sorting of the grid columns based on colmun number*/
	@Given("^I verify sorting of column based on index (.*) in the grid (.*)$")	
	public void User_verifysortingofgridbasedoncolumnnumber(int columnnumber, int gridnumber) throws Exception
	{
		flow.SortGridColumnBasedonColumnNumber(gridnumber, columnnumber);
	}
	
/*Method used to check sorting of the grid columns based on colmun name*/
	@Given("^I verify sorting of column based on name (.*) in the grid (.*)$")	
	public void User_verifysortingofgridbasedoncolumnname(String Columnname, int gridnumber) throws Exception
	{
		flow.SortGridColumnBasedonColumnName(gridnumber, Columnname);
	}
	
/*Method used to clear a text in the text field on the grid*/
	@Given("^I clear text field in grid (.*) row (.*) column (.*)$")	
	public void User_cleartextfieldingrid(int gridnumber, int rownumber, int columnnumber) throws Exception
	{
		flow.ClearFieldonGrid(gridnumber, rownumber, columnnumber);
	}
	
/*Method used to clear a single select dropdown field on the grid*/
	@Given("^I clear single select dropdown field in grid (.*) row (.*) column (.*)$")	
	public void User_clearsingleselectdropdownfieldingrid(int gridnumber, int rownumber, int columnnumber) throws Exception
	{
		flow.ClearDropDownFieldonGrid(gridnumber, rownumber, columnnumber);
	}
	
/*Method used to clear a Multi select dropdown field on the grid*/
	@Given("^I clear multi select dropdown field in grid (.*) row (.*) column (.*)$")	
	public void User_clearmultiselectdropdownfieldingrid(int gridnumber, int rownumber, int columnnumber) throws Exception
	{
		flow.ClearMultiSelectDropDownFieldonGrid(gridnumber, rownumber, columnnumber);
	}
	
/*Method used to clear a picker field on the grid*/
	@Given("^I clear picker field in grid (.*) row (.*) column (.*)$")	
	public void User_clearpickerfieldingrid(int gridnumber, int rownumber, int columnnumber) throws Exception
	{
		flow.ClearPickerFieldonGrid(gridnumber, rownumber, columnnumber);
	}
	
/*Method used to upload the multiple files in document upload field on grid from the excel where the file paths are stored*/
	@Given("^I populate Multiple upload field in grid (.*) row (.*) column (.*) with documents maintained in sheet(.*) under column (.*) located at (.*)$")	
	public void User_multipleuploadfieldingrid(int Gridnumber, int Rownumber, int Columnnumber, String sheetname, String columnname,String Excelfilepath) throws Exception
	{
		flow.MultipleUploadinGrid(Excelfilepath, sheetname, columnname, Gridnumber, Rownumber, Columnnumber);
	}
	
/*Method used to upload the multiple files in document upload field from the excel where the file paths are stored*/
	@Given("^I populate multiple upload field named (.*) with documents maintained in sheet (.*) under column (.*) located at (.*)$")	
	public void User_multipleuploadfieldbasedonfeidlname(String fieldname, String sheetname, String columnname,String Excelfilepath) throws Exception
	{
		flow.MultipleUpload(Excelfilepath, sheetname, columnname, fieldname);
	}
	
/*Method used to upload the multiple files in document upload field on grid using input values*/
	@Given("^I populate multiple upload field in grid (.*) row (.*) column (.*) with (.*)$")	
	public void User_multipleuploadfieldingridusinginputvalues(int Gridnumber, int Rownumber, int Columnnumber,String files) throws Exception
	{
		flow.MultipleUploadUsingInputValuesinGrid(files, Gridnumber, Rownumber, Columnnumber);
	}
	
/*Method used to select the check box in the column header (select all/deselect all check box)*/
	@Given("^I select column header checkbox of column (.*) in grid (.*)$")	
	public void User_selectcolumnheadercheckbox(int columnnumber,int Gridnumber) throws Exception
	{
		flow.SelectColumnHeaderCheckboxonGrid(Gridnumber, columnnumber);
	}
	
/*Method used to retrieve a particular column value based on reference ID available under Records*/
	@Given("^I retrieve value in column (.*) for refernce ID (.*) from reference ID column (.*) in grid (.*)$")	
	public void User_retrivevalueincolumn(int columnnumber,String ID,int referenceIDcolnum,int Gridnumber) throws Exception
	{
		flow.RetrieveSpecificColumnValueElementBasedonReferenceID(ID, referenceIDcolnum, Gridnumber, columnnumber);
	}
	
/*Method used for initiating the browser to run the automation scripts*/
	@Given("^I setup with (.*) browser$")	
	public void User_initiatedriver(String Browser) throws Exception
	{
		flow.StartDriver(Browser);
	}
	
/*Method used to enter values in text or paragraph field*/
	@Given("^I populate text or paragraph field named (.*) with value (.*)$")
	public void User_enter_value_in_text_or_paragraph_field(String FieldName, String Value) throws Exception
	{
		flow.SetWebText(Value, FieldName);
	}
	
/*Method used to enter values in text or paragraph field based on index
 Note:Put fieldname as false, if there is no fieldname*/
	@Given("^I populate Text or Paragraph field named (.*) based on index (.*) with value (.*)$")
	public void User_enter_value_in_text_or_paragraph_basedonindex(String fieldname,int indexnumber, String inputtext) throws Exception
	{
		flow.SetWebTextBasedonIndex(indexnumber, fieldname, inputtext);
	}
	
/*Method used to enter values in text or paragraph field based on partial field name*/
	@Given("^I populate text or paragraph field based on partial field named (.*) with value (.*)$")
	public void User_enter_value_in_text_or_paragraph_basedonpartialfieldname(String partialfieldname,String inputtext) throws Exception
	{
		flow.SetWebTextBasedonPartialFieldName(inputtext, partialfieldname);
	}
	
/*Method used to enter values in text or paragraph field based on customized fieldname*/
	@Given("^I populate text or paragraph field of customized name (.*) with value (.*)$")
	public void User_enter_value_in_text_or_paragraph_basedoncustomizedfieldname(String fieldname,String inputtext) throws Exception
	{
		flow.SetWebTextforCustomizedFieldname(inputtext, fieldname);
	}
	
/*Method used to enter values in text or paragraph field based on PlaceholderText*/
	@Given("^I populate text or paragraph field based on placeholdertext (.*) with value (.*)$")
	public void User_enter_value_in_text_or_paragraph_basedonPlaceholderText(String placeholdertext,String inputtext) throws Exception
	{
		flow.PopulateTextFieldBasedonPlaceholderText(placeholdertext, inputtext);
	}
	
/*Method used to enter values in text or paragraph field based on Instructiontext*/
	@Given("^I populate text or paragraph field based on instructiontext (.*) with value (.*)$")
	public void User_enter_value_in_text_or_paragraph_basedoninstructionText(String InstructionText,String inputtext) throws Exception
	{
		flow.PopulateTextFieldBasedonInstructionText(InstructionText, inputtext);
	}
	
/*Method used to enter values in text or paragraph field based on TooltipText*/
	@Given("^I populate text or paragraph field based on tooltiptext (.*) with value (.*)$")
	public void User_enter_value_in_text_or_paragraph_basedontooltiptext(String TooltipText,String inputtext) throws Exception
	{
		flow.PopulateTextFieldBasedonTooltipText(TooltipText, inputtext);
	}	
	
/*Method used to enter values in date field based on instructiontext*/
	@Given("^I set date for date field based on instructiontext (.*) with value (.*)$")
	public void User_set_date_basedoninstructiontext(String InstructionText,String inputdate) throws Exception
	{
		flow.PopulateDateFieldBasedonInstructionText(InstructionText, inputdate);
	}
	
/*Method used to enter values in date field based on tooltiptext*/
	@Given("^I set date for date field based on tooltiptext (.*) with value (.*)$")
	public void User_set_date_basedontooltiptext(String TooltipText,String inputdate) throws Exception
	{
		flow.PopulateDateFieldBasedonTooltipText(TooltipText, inputdate);
	}
	
/*Method used to enter values in date field based on placeholdertext*/
	@Given("^I set date for date field based on placeholdertext (.*) with value (.*)$")
	public void User_set_date_basedonplaceholdertext(String placeholdertext,String inputdate) throws Exception
	{
		flow.PopulateDateFieldBasedonPlaceholderText(placeholdertext, inputdate);
	}
	
/*Method used to set date for date field based on fieldname*/
	@Given("^I set date for date field based on fieldname (.*) with value (.*)$")
	public void User_set_date_basedonfieldname(String fieldname,String inputtext) throws Exception
	{
		flow.SetDateforDateField(fieldname, inputtext);
	}
	
/*Method used to set date for date field based on customized fieldname*/
	@Given("^I set date for date field based on customized fieldname (.*) with value (.*)$")
	public void User_set_date_basedoncustomizedfieldname(String fieldname,String inputtext) throws Exception
	{
		flow.SetDateforDateFieldforCustomizedFieldname(fieldname, inputtext);
	}
	
	
/*Method used to set date and time for date field based on fieldname*/
	@Given("^I set date and time for field based on fieldname (.*) with date (.*) and time (.*)$")
	public void User_set_dateandtime_basedonfieldname(String fieldname, String Date, String Time) throws Exception
	{
		flow.PopulateDateTime(fieldname, Date, Time);
	}
	
/*Method used to upload file in the first upload field in UI*/
	@Given("^I populate first upload field with value (.*)$")
	public void User_uploads_file_in_the_upload_field(String FilePath) throws Exception
	{
		flow.UploadFile(FilePath);
	}

/*Method used to upload file in the upload field based on index*/
	@Given("^I populate upload field based on index (.*) with value (.*)$")
	public void User_uploads_file_basedonindex( int index,String filepath) throws Exception
	{
		flow.UploadFileBasedonIndex(filepath, index);
	}
/*Method used to upload multiple files in the upload field based on field name*/
	@Given("^I populate mulitple upload field (.*) with value (.*)$")
	public void User_uploads_mulitple_files_in_the_upload_field(String FieldName, String FilePaths) throws Throwable
	{
	   flow.MultipleUploadUsingInputValues(FilePaths, FieldName);	
	   
	}
	
/*Method used to  upload field based on field name*/
	@Given("^I populate upload field named (.*) with value (.*)$")
	public void User_uploads_filebasedonfieldname(String fieldname, String filepath) throws Throwable
	{
		flow.UploadFileBasedonFieldName(filepath, fieldname);
	   
	}
	
/*Method used to click image based on index*/
	@Given("^I click on image based on index (.*)$")
	public void User_clicks_on_image_basedonindex(int indexnumber) throws Exception
	{
		flow.ClickImageBasedonIndex(indexnumber);
	}

/*Method used to click SVG icon of a field*/
	@Given("^I click on SVG icon based on index (.*)$")
	public void User_clicks_on_SVG_icon_basedonindex(int indexnumber) throws Exception
	{
		flow.ClickSVGIconBasedonIndex(indexnumber);
	}
	
/*Method used to click SVG icon of a field*/
	@Given("^I click on SVG icon based on fieldname (.*)$")
	public void User_clicks_on_SVG_icon_basedonfieldname(String FieldName) throws Exception
	{
		flow.ClickSVGIconBasedonFieldname(FieldName);
	}
	
/*Method used to click webelement using javascript based on elementname*/
	@Given("^I click on webelement using javascript based on elementname (.*)$")
	public void User_clicks_on_webelement_byjavascript(String fieldnameastext) throws Exception
	{
		flow.ClickElementbyJavascript(fieldnameastext);
	}
	
/*Method used to click cardlayout based on index*/
	@Given("^I click on cardlayout based on index (.*)$")
	public void User_clicks_on_cardlayout_basedonindex(int indexnumber) throws Exception
	{
		flow.ClickCardLayoutBasedonIndex(indexnumber);
	}
	
/*Method used to click link based on partial link name with index*/
	@Given("^I click on link based on partial link name (.*) along with index (.*)$")
	public void User_clicks_on_link_based_on_partial_link_namebasedonindex(String linknameastext, int Indexnumber) throws Exception
	{
		flow.ClickPartialLinkBasedonNamewithIndex(linknameastext, Indexnumber);
	}
	
/*Method used to click link based on partial link name*/
	@Given("^I click on link based on Partial link name (.*)$")
	public void User_clicks_on_link_based_on_partial_link_name(String PartialLinkName) throws Exception
	{
		flow.ClickPartialLinkBasedonName(PartialLinkName);
	}
	
/*Method used to click on link based on link name*/
	@Given("^I click on link based on link name (.*)$")
	public void User_clicks_on_link_based_on_link_name(String LinkName) throws Exception
	{
		flow.ClickLinkBasedonName(LinkName);
	}
	
/*Method used to click on link based on index*/
	@Given("^I click on link based on index (.*)$")
	public void User_clicks_on_link_based_on_index(int Indexnumber) throws Exception
	{
		flow.ClickLinkBasedonIndex(Indexnumber);
	}
	
/*Method used to click on Boldlink based on index*/
	@Given("^I click on Boldlink based on index (.*)$")
	public void User_clicks_on_boldlink_based_on_index(int Indexnumber) throws Exception
	{
		flow.ClickBoldLinkBasedonIndex(Indexnumber);
	}
	
/*Method used to Populate Values For Any Field Based on Partial FieldName
 *Component Names can be TextBox,SingleSelectDropDown,MultiSelectDropDown,PickerField,DateField,Checkbox,RadioButton,UploadField*/
	@Given("^I populate field type (.*) named (.*) with value (.*)$")
	public void populate_Values_for_field_based_on_partialfieldname(String Componentname, String Partialfieldname, String inputtext) throws Exception
	{
		flow.PopulateValuesForAnyFieldBasedonPartialFieldName(Componentname, Partialfieldname, inputtext);
	}
	
/*Method used to get current date and time with seconds*/
	@Given("^I get current date and time with seconds")
	public void User_get_dateandtimeseconds() throws Exception
	{
		flow.GetDateandTimewithSeconds();
	}
	
/*Method used to get current date and time*/
	@Given("^I get current date and time")
	public void User_get_dateandtime() throws Exception
	{
		flow.GetDateandTime();
	}
	
/*Method used to get current date*/
	@Given("^I get current date")
	public void User_get_currentdate() throws Exception
	{
		flow.GetCurrentDate();
	}
	
/*Method used to get past date*/
	@Given("^I get past date")
	public void User_get_pastdate() throws Exception
	{
		flow.GetPastDate();
	}
	
/*Method used to get future date*/
	@Given("^I get future date")
	public void User_get_futiredate() throws Exception
	{
		flow.GetFutureDate();
	}

/*Method used to get future date of input date*/
	@Given("^I get future date based on input date (.*)$")
	public void User_get_futuredate_basedoninput(int value) throws Exception
	{
		flow.GetFutureDateBasedonInputValue(value);
	}
	
/*Method used to get past date of input date*/
	@Given("^I get past date based on input date (.*)$")
	public void User_get_pastdate_basedoninput(int value) throws Exception
	{
		flow.GetPastDateBasedonInputValue(value);
	}
		
/*Method used to get businessday*/
	@Given("^I get businessday")
	public void User_get_businessday() throws Exception
	{
		flow.GetBusinessDay();
	}
		
/*Method used to get latest file from download directory*/
	@Given("^I get latest file from download directory")
	public void User_get_filefromdownloaddirectory() throws Exception
	{
		flow.GetLatestFilefromDownloadDirectory();
	}
	
/*Method used to get file from specified directory*/
	@Given("^I get file from directory (.*)$")
	public void User_get_filefromspecifieddirectory(String directory) throws Exception
	{
		flow.GetLatestFilefromDirectory(directory);
	}
	
/*Method used to compare expected and actual values*/
	@Given("^I compare actual value(.*) against expected value(.*) and print passmessage (.*) if passed, else print failmessage as (.*)$")
	public void User_compare_value(String Actual, String Expected, String passmessage, String failmessage) throws Exception
	{
		flow.Assertion(Actual, Expected, passmessage, failmessage);
	}
		
	
/*Method used to retrive elements from feild using xpath*/
	@Given("^I retrive web elements from field (.*)$")
	public void User_retrives_web_elements_from_field(By FieldXpathVariable) throws Exception
	{
		flow.RetrieveWebElementList(FieldXpathVariable);
	}
	
/*Method used to verify MouseHover text for button*/
	@Given("^I verify mouseHover text for button (.*) matches text (.*)$")
	public void User_verify_mosehovertext_ofbutton(String Buttonname, String inputtext) throws Exception
	{
		flow.VerifyMouseHoverTextfromButton(Buttonname, inputtext);
	}
	
/*Method used to verify text present in UI*/
	@Given("^I verify text (.*) is present in UI$")
	public void User_verify_textpresentinUI(String text) throws Exception
	{
		flow.VerifyTextPresentinUI(text);
	}
	
/*Method used to verify text not present in UI*/
	@Given("^I verify text (.*) is not present in UI$")
	public void User_verify_textnotpresentinUI(String text) throws Exception
	{
		flow.VerifyTextNotPresentinUI(text);
	}
	
/*Method used to verify partialtext present in UI*/
	@Given("^I verify partialtext (.*) is present in UI$")
	public void User_verify_partialtextpresentinUI(String text) throws Exception
	{
		flow.VerifyPartialTextPresentinUI(text);
	}
	
/*Method used to verify value in any field in UI*/
	@Given("^I verify value if field (.*) has value (.*)$")
	public void User_verify_fieldvalue(String fieldname, String inputvalue) throws Exception
	{
		flow.VerifyUIFieldElements(fieldname, inputvalue);
	}
	
/*Method used to verify MouseHovertext from ICON based on Index*/
	@Given("^I verify MouseHovertext for icon based on index (.*) matches text (.*)$")
	public void User_verify_MouseHovertextoficon(int Index, String inputvalue) throws Exception
	{
		flow.VerifyMouseHoverValuefromICONBasedonIndex(Index, inputvalue);
	}
	
/*Method used to verify tooltip text of field*/
	@Given("^I verify if tooltip text of field (.*) matches text (.*)$")
	public void User_verify_tooltiptext(String fieldLabelName, String inputvalue) throws Exception
	{
		flow.ValidateToolTipText(fieldLabelName, inputvalue);
	}
	
/*Method used to verify value in button name*/
	@Given("^I verify text (.*) matches button name$")
	public void User_verify_buttonname(String text) throws Exception
	{
		flow.VerifyButtonName(text);
	}
	
/*Method used to clear field*/
	@Given("^I clear field (.*)$")
	public void User_clear_field(String fieldname) throws Exception
	{
		flow.ClearField(fieldname);
	}
	
/*Method used to clear dropdown feild*/
	@Given("^I clear dropdown field (.*)$")
	public void User_clear_dropdownfield(String fieldname) throws Exception
	{
		flow.ClearDropDownField(fieldname);
	}
	
/*Method used to clear picker feild based on fieldname*/
	@Given("^I clear picker field based on fieldname (.*)$")
	public void User_clear_pickerfield_basedonfieldname(String fieldname) throws Exception
	{
		flow.ClearPickerField(fieldname);
	}
	
/*Method used to clear picker feild based on index*/
	@Given("^I clear picker field based on index (.*)$")
	public void User_clear_pickerfield_basedonindex(int indexNumber) throws Exception
	{
		flow.ClearPickerFieldBasedOnIndex(indexNumber);
	}
	
/*Method used to clear Multiselect dropdown feild based on index*/
	@Given("^I clear Multiselect dropdown field based on index (.*)$")
	public void User_clear_Multiselectdropdownfield_basedonindex(String indexNumber) throws Exception
	{
		flow.ClearMultiSelectDropDownbasedonindexField(indexNumber);
	}
	
/*Method used to clear Multiselect dropdown feild based on fieldname*/
	@Given("^I clear Multiselect dropdown field based on fieldname (.*)$")
	public void User_clear_Multiselectdropdownfield_basedonfieldname(String fieldname) throws Exception
	{
		flow.ClearMultiSelectDropDownField(fieldname);
	}
	
/*Method used to check if textfield filter is cleared on clicking clear filter link*/
	@Given("^I check if textfield filter (.*) is cleared on clicking clear filter link$")
	public void User_check_textfieldfilter(String fieldname) throws Exception
	{
		flow.ClearFilterCheckforTextField(fieldname);
	}
	
/*Method used to wait explicitly for visiblity of element*/
	@Given("^I wait for the visibility of element located by xpath (.*)$")
	public void User_gives_explicitwait(String ElementXpathVariable) throws Exception
	{
		flow.ExplicitWait(By.xpath(ElementXpathVariable));
//		flow.ExplicitWait(By.xpath(xpathExpression));
	}
	
/*Method used to wait explicitly for specific text*/
	@Given("^I wait for the visibility of text (.*)$")
	public void User_gives_explicitwaitbytext(String text) throws Exception
	{
		flow.ExplicitWaitforSpecificText(text);
	}
	
/*Method used to wait explicitly for specific partial text*/
	@Given("^I wait for the visibility of partial text (.*)$")
	public void User_gives_explicitwaitbypartialtext(String text) throws Exception
	{
		flow.ExplicitWaitforPartialText(text);
	}
	
/*Method used to press Enter key for any field based on fieldname*/
	@Given("^I press enter key for field based on fieldname (.*)$")
	public void User_pressEnterKey(String fieldname) throws Exception
	{
		flow.EnterKey(fieldname);
	}
	
/*Method used to retrieve span webelements*/
	@Given("^I retrieve span webelement using variable (.*)$")
	public void User_retrievewebelement(By variable) throws Exception
	{
		flow.RetrieveSpanWebElement(variable);
	}
	
/*Method used to retrieve span webelements*/
	@Given("^I retrieve span webelements using variable (.*)$")
	public void User_retrievewebelements(By variable) throws Exception
	{
		flow.RetrieveSpanWebElementList(variable);
	}
	
	
	
/*Method used to check webelement in UI*/
	@Given("^I check if webelement located by (.*) is present in UI$")
	public void User_checkwebelement(By variable) throws Exception
	{
		flow.CheckWebElement(By.xpath(String.valueOf(variable)));
	}
/*Method used to Verify PlaceholderText from the Field*/
	@Given("^I Verify PlaceholderText of the field (.*) matches text (.*)$")
	public void User_verify_PlaceholderTextoffield(String fieldname, String placeholdervalue) throws Exception
	{
		flow.VerifyPlaceholderTextfromtheField(fieldname, placeholdervalue);
	}
	
/*Method used to Verify PlaceholderText from the SingleSelect DropDown Field*/
	@Given("^I Verify PlaceholderText of the SingleSelect DropDown field (.*) matches text (.*)$")
	public void User_verify_PlaceholderTextofSingleSelectDropDownField(String fieldname, String placeholdervalue) throws Exception
	{
		flow.VerifyPlaceholderTextfromtheSingleSelectDropDownField(fieldname, placeholdervalue);
	}
	
/*Method used to Verify instructiontext below the Field*/
	@Given("^I Verify instructiontext below the field (.*) matches text (.*)$")
	public void User_verify_InstructionbelowtheField(String fieldname, String inputtext) throws Exception
	{
		flow.VerifyInstructionbelowtheField(fieldname, inputtext);
    }
	
/*Method used to Verify From and To date filters */
	@Given("^I Verify date filters for grid (.*) at column (.*) by applying From date filter named (.*) with value (.*) and To date filter named (.*) with value (.*)$")
	public void User_verify_Datefilters(String Gridnumber, String Columnnumber, String FirstFiltername, String FromDate,String SecondFiltername, String ToDate) throws Exception
	{
		System.out.println(Columnnumber);
		flow.DateFilterValidation(Gridnumber, Columnnumber, FirstFiltername, SecondFiltername, FromDate, ToDate);
    }
	
/*Method used to validate the single filter data with the grid
 * Note:By default it will take the first column name and its value for filter condition. This method will work only when the first column name will be in the filter condition - (Note: Filter needs to be a text or picker field and also first column name and filter name should be same)*/
	@Given("^I validate single filter data in the grid")
	public void User_validate_single_filter_data_with_thegrid() throws Exception
	{
	  flow.SingleFilterValidation();
	}
	
/*Method to validate single filter data in the grid based on column and filter name*/
	@Given("^I validate single filter data based on column named (.*) by applying filter named (.*)$")
	public void User_validate_filterwithcolumnandfiltername(String ColumnName, String Filtername) throws Exception
	{
	  flow.SingleFilterValidationWithColumnandFilterName(ColumnName, Filtername);
	}
	
/*Method used to validate the double filter data with the grid
* Note: By default it will take the first and second column's name and its value's for filter condition. This method will work only when the first and second column name's will be in the filter condition - (Note: First filter needs to be a text or picker field and second filter can be any fields and also first and second column name's and filter name's should be same)*/
		@Given("^I validate double filter data in the grid")
		public void User_validate_double_filter_data_with_thegrid() throws Exception
		{
		  flow.DoubleFilterValidation();
		}
	
/*Method to validate double filter data in the grid based on column and filter name*/
		@Given("^I validate double filter data for two columns based on column1 named (.*) and column2 named(.*) by applying filter1 named (.*) and filter2 named (.*)$")
		public void User_validate_dooublefilterwithcolumnandfiltername(String FirstColumnname, String SecondColumnname, String FirstFiltername, String SecondFiltername) throws Exception
		{
		  flow.DoubleFilterValidationWithColumnandFilterName(FirstColumnname, SecondColumnname, FirstFiltername, SecondFiltername);
		}
		
/*Method used to Cancel the task/flow*/
		@Given("^I click on cancel button to cancel task/flow")
		public void User_cancel_task_flow() throws Exception
		{
		 flow.CancelFlow();
		}
		
/*Method used to check an alert/validation message for the comment box by clicking the reject button without entering comments*/
		@Given("^I click on reject button without any comment in comment box to validate if alert/validation message matches text (.*)$")
		public void User_validate_rejectalertmessage(String message) throws Exception
		{
		 flow.RejectFlowCheck(message);
		}
		
/*Method to validate textfields without input*/
	@Given("^I validate textfield (.*) without any input$")
	public void User_validate_textfeildwithoutinput(String fieldname) throws Exception
	{
	  flow.ValidateTextFieldWithoutInputs(fieldname);
	}
	
/*Method used to check for an alert message when the user uploads an invalid document*/
	@Given("^I validate alert message by uploading document (.*) in upload document field based on index (.*)$")
	public void User_validate_documentuploaded(String filepath, int index) throws Exception
	{
	    flow.InvalidDocumentValidation(filepath, index);
	}
	
/*Method used to verify the field value present in the grid inside the box layout*/
	@Given("^I validate field named (.*) present in the grid insie box layout based on index (.*) with value (.*)$")
	public void User_validate_fieldinboxlayout(String fieldname,int boxnumber,String inputvalue) throws Exception
	{
	   flow.VerifyGridFieldValueinBoxLayout(boxnumber, fieldname, inputvalue);
	}
	
/*Method used to verify if the status of the milestone step is completed
 * Note:inputvalue should be Completed Step always*/
	@Given("^I validate if milestone step named (.*) matches status (.*)$")
	public void User_validate_milestone(String stepname,String inputvalue) throws Exception
	{
	  flow.VerifyMilestoneSteps(stepname, inputvalue);
	}
	
/*Method used to validate the removal and upload document functionality (Finally it will upload the last document specified in the excel. To validate this scenario atleast 2 documents have to be specified)*/
	@Given("^I validate the removal and upload document functionality for upload field based on index (.*) with documents maintained in file (.*) under sheet named (.*) at comlun (.*)$")
	public void User_validate_removalandupladdocument(int index,String Excelfilepath, String sheetname, String columnname) throws Exception
	{
	  flow.UploadDocumentFieldCheck(Excelfilepath, sheetname, columnname, index);
	}
	
/*Method to validate textfields with input*/
	@Given("^I validate textfield (.*) with input (.*)$")
	public void User_validate_textfeildwithinput(String fieldname,String inputtext) throws Exception
	{
	  flow.ValidateTextFieldWithInputs(fieldname, inputtext);
	}
	
/*Method to validate error message of datefields with based on fieldname*/
	@Given("^I verify error message of datefield based on fieldname (.*) with input (.*)$")
	public void User_verify_errormessageofdatefield(String Fieldname,String Date) throws Exception
	{
	  flow.VerifyDatefieldErrorValidation(Date, Fieldname);
	 
	}
	
/*Method to validate error message of datefields with based on index*/
	@Given("^I verify error message of datefield based on index (.*) with input (.*)$")
	public void User_verify_errormessageofdatefieldbasedonindex(int Indexnumber,String Date) throws Exception
	{
	  flow.VerifyDatefieldErrorValidationBasedonIndex(Date,Indexnumber);
	}
	
/*Method to validate error message of textfields with input*/
	@Given("^I verify error message of textfield (.*) with input (.*) matches text (.*)$")
	public void User_verify_errormessageoffeildwithinput(String fieldname,String inputtext, String Errormessage) throws Exception
	{
	  flow.ValidateErrorMessageforTextFieldWithInputs(fieldname, inputtext, Errormessage);
	}
		
/*Method to retrieve webelements*/
	@Given("^I retrieve webelement by (.*)$")
	public void User_retrieve_webelement(By variable) throws Exception
	{

	  flow.RetrieveWebElement(variable);
	}
	
/*Method used to extract all the data's from pie chart based on index*/
	@Given("^I extract all the details from pie chart based on index (.*)$")
	public void User_extractdatafrompiechart(int indexnumber) throws Exception
	{

	  flow.ExtractDatafromPieChart(indexnumber);
	}
	
/*Method used to extract all the data's from line chart based on index*/
	@Given("^I extract all the details from line chart based on index (.*)$")
	public void User_extractdatafromlinechart(int indexnumber) throws Exception
	{

		flow.ExtractDatafromLineChart(indexnumber);
	  
	}
	
/*Method used to return site tabs list based on the logged in user*/
	@Given("^I verify all site tabs list based on the logged in user$")
	public void User_verify_sitetabsofuser() throws Exception
	{
		flow.SecurityVisibilityCheck();
	  
	}
	
/*Method used to verify visibility condition for basic user*/
	@Given("^I verify visibility condition for logged in user$")
	public void User_verify_visibilityconditionforuser() throws Exception
	{
		flow.VisibilityCheckforBasicUser();
	  
	}
	
/*Method used to check the task security by using reference ID in sites*/
	@Given("^I verify task security in sites for logged in user under tab (.*) in grid (.*) for reference ID (.*) based on preset condition (.*)$")
	public void User_verify_tasksecuritybasedonID(String Sitestab, int Gridnumber, String referenceID, String presentcondition) throws Exception
	{

	  flow.TaskSecurityCheckbyReferenceIDinSites(Sitestab, Gridnumber, referenceID, presentcondition);
	}
	
/*Method used to check the task security by using task name in sites.*/
	@Given("^I verify task security in sites for logged in user under tab (.*) in grid (.*) for task name (.*) based on preset condition (.*)$")
	public void User_verify_tasksecuritybasedontaskid(String Sitestab, int Gridnumber, String Taskname, String presentcondition) throws Exception
	{

	  flow.TaskSecurityCheckbyTaskNameinSites(Sitestab, Gridnumber, Taskname, presentcondition);
	}
	
/*Method used to check the task security by using reference ID in tempo*/
	@Given("^I verify task security in tempo for logged in user under tab (.*) for reference ID (.*) based on preset condition (.*)$")
	public void User_verify_tasksecuritybasedontaskidintempo(String Tempotab, String referenceID, String presentcondition) throws Exception
	{

	  flow.TaskSecurityCheckbyReferenceIDinTempo(Tempotab, referenceID, presentcondition);
	}
	
/*Method used to check the task security by using task name in tempo*/
	@Given("^I verify task security in tempo for logged in user under tab (.*) for task name (.*) based on preset condition (.*)$")
	public void User_verify_tasksecuritybasedontasknameintempo(String Tempotab, String Taskname, String presentcondition) throws Exception
	{

	  flow.TaskSecurityCheckbyTaskNameinTempo(Tempotab, Taskname, presentcondition);
	}
	
/*Method used to check the security of the Records/Actions/Reports by using its name in sites*/
	@Given("^I verify task security of Records/Actions/Reports in sites under tab (.*) of name (.*) based on present condition(.*)$")
	public void User_verify_securityforRecordsActionReportinSites(String tabname, String name, String presentcondition) throws Exception
	{

	  flow.SecurityCheckforRecordsorActionsorReportsByNameinSites(tabname, name, presentcondition);
	}
	
/*Method used to check the security of the Records/Actions/Reports by using its name in Tempo*/
	@Given("^I verify task security of Records/Actions/Reports in Tempo under tab (.*) of name (.*) based on present condition(.*)$")
	public void User_verify_securityforRecordsActionReportinTempo(String tabname, String name, String presentcondition) throws Exception
	{

	  flow.SecurityCheckforRecordsorActionsorReportsByNameinTempo(tabname, name, presentcondition);
	}
	
/*Method used to perform bulk security testing in sites*/
	@Given("^I perform bulk security test for logged in user in sites under tab (.*) in grid of index (.*)$")
	public void User_perform_bulksecuritytestinsites(String SecurityTab, int Gridnumber) throws Exception
	{

	  flow.BulkSecurityTestingforSitesTasks(SecurityTab, Gridnumber);
	}
	
/*Method used to perform bulk security testing in Tempo*/
	@Given("^I perform bulk security test for logged in user in Tempo under tab (.*)$")
	public void User_perform_bulksecuritytestintempo(String SecurityTab) throws Exception
	{

	  flow.BulkSecurityTestingforTempoTasks(SecurityTab);
	}
	
/*Method used to create post in news tab*/
	@Given("^I send post (.*) in news tab$")
	public void User_createpost(String postcontent) throws Exception
	{

	  flow.CreatePostinNewsTab(postcontent);
	}
	

/*Method used to send message in news tab*/
	@Given("^I send message (.*) to recipients (.*) in news tab$")
	public void User_sendmessage(String messagecontent,String messagerecipients) throws Exception
	{

	  flow.CreateMessageinNewsTab(messagecontent, messagerecipients);
	}
	
/*Method used to post kudos about user*/
	@Given("^I send kudos (.*) to (.*)$")
	public void User_postkudosmess(String postcontent,String kudosrecepient) throws Exception
	{

	  flow.GiveKudosinNewsTab(postcontent, kudosrecepient);
	}
	
/*Method used to verify a news in news tab*/
	@Given("^I verify news feed containing text (.*) is present$")
	public void User_verifynewstext(String newstext) throws Exception
	{

	  flow.VerifyNewsinNewsTab(newstext);
	}
	
/*Method to add comment for news containing specific text*/
	@Given("^I add comment (.*) to post containing (.*)$")
	public void User_addcommenttonews(String comments,String news) throws Exception
	{

	  flow.AddCommentfortheNews(news, comments);
	}
	
	
/*Method used to delete a news in news tab*/
	@Given("^I delete news post (.*)$")
	public void User_Deletenews(String news) throws Exception
	{

	  flow.DeleteNews(news);
	}
	
/*Method used to select value from single select dropdown in grid*/
	@Given("^I populate Singleselect Dropdown field in grid (.*) column (.*) row (.*) with value (.*)$")
	public void User_selectvaluefromdropdowningrid(int gridnumber, int columnnumber, int rownumber,String inputtext) throws Exception
	{
        flow.SingleSelectDropDownforGrid(inputtext, gridnumber, rownumber, columnnumber);
	}
		
/*Method used to select value from multi select dropdown in grid*/
	@Given("^I populate Multiselect Dropdown field in grid (.*) column (.*) row (.*) with value (.*)$")
	public void User_selectvaluefrommultiselectdropdowningrid(int gridnumber, int columnnumber, int rownumber, String text) throws Exception
	{
        flow.MultiSelectDropDownforGrid(text, gridnumber, rownumber, columnnumber);
	}
	
/*Method used to extract the information such as person who posted the news,file names and file types attached with the news in news tab*/
	@Given("^I extract the information of the news matching content (.*)$")
	public void User_extractinforofnews(String News) throws Exception
	{

	  flow.ExtractInformationfromNewsinNewsTab(News);
	}
	
/*Method used to send task in news tab*/
	@Given("^I send task (.*) to assignee (.*) in news tab$")
	public void User_sendtask(String Taskcontent,String taskassignee) throws Exception
	{

	  flow.CreateTaskinNewsTab(Taskcontent, taskassignee);
	}
	
/*Method to turn on implicit wait*/
	@Given("^I wait for for relative period of time")
	public void User_turns_on_implicit_wait() throws ClassNotFoundException
	{

	  flow.TurnOnImplicitWaits();	
	}
	
/*Method to turn on implicit wait*/
	@Given("^I turn off implicit wait")
	public void User_turns_off_implicit_wait() throws ClassNotFoundException
	{

	  flow.TurnOffImplicitWaits();	
	}
	
/*Method to provide timeout to wait for relative period of time*/
	@Given("^I provide timeout of (.*) to wait$")
	public void User_providetimeoout(long timeout) throws ClassNotFoundException
	{

	  flow.Timeout(timeout);	
	}
	
	
/*Method to refresh screen*/
	@Given("^I refresh screen")
	public void User_refresh() throws Exception
	{
	  flow.Refresh();	
	}
	
/*Method to quit browser*/
	@Given("^I quit browser")
	public void User_quit_browser() throws Exception
	{
	  flow.QuitDriver();	
	}
	
/*Method to close current window*/
	@Given("^I close current window")
	public void User_closecurrentwindow() throws Exception
	{
	  flow.CloseCurrentWindow();	
	}
	
/*Method used to switch to recent child window*/
	@Given("^I switch to recent child window")
	public void User_switchtorecentchildwindow() throws Exception
	{
	  flow.SwitchtoRecentChildWindow();	
	}
	
/*Method used to switch to parent window*/
	@Given("^I switch to parent window")
	public void User_switchtorecentparentwindow() throws Exception
	{
	  flow.SwitchtoParentWindow();
	}
	
/*Method used to populate data for fields based on field name*/
	@Given("^I populate data for field based on field name (.*)$")
	public void User_populatedatabasedonfieldname(String fieldname) throws Exception
	{
	  flow.PopulateDataforFieldBasedonFieldName(fieldname);
	}
	
/*Method used to populate data for Integer fields in grid*/
	@Given("^I populate data for Integer field in grid (.*) row (.*) column (.*) with size (.*)$")
	public void User_populatedataforintegerfieldingrid(String gridnumber,String rownumber, String columnnumber, String size) throws Exception
	{
	  flow.PopulateDataforIntegerFieldonGrid(gridnumber, rownumber, columnnumber, size);
	}
	
/*Method used to populate data for Integer fields in grid*/
	@Given("^I populate data for integer field in grid (.*) row (.*) column (.*)$")
	public void User_populatedataforgrid(int gridnumber,int rownumber, int columnnumber) throws Exception
	{
	  flow.PopulateDataforGrid(gridnumber, rownumber, columnnumber);
	}
	
/*Method used to populate data for Integer field based on field name*/
	@Given("^I populate data for Integer field based on field name (.*) with size (.*) and validation message check condition (.*)$")
	public void User_populatedataforintegerfieldbasedonfieldname(String fieldname,String size, String condition) throws Exception
	{
	  flow.PopulateDataforIntegerFieldBasedonFieldname(fieldname, size, condition);
	}
	
/*Method used to validate Single filter based on component type, filter name and column number matching filtername*/
	@Given("^I validate Single filter based on component type (.*), filter name (.*) and column number (.*) header matching filter name$")
	public void User_validatefilterbasedonfilternameandcolumnnum(String FirstFilterComponentType,String filtername, int Columnnumber) throws Exception
	{
	  flow.SingleFilterValidationWithColumnNumberandFilterName(FirstFilterComponentType, Columnnumber, filtername);
	}
	
/*Method used to validate Double filters based on component types, filter names and column numbers matching filternames*/
	@Given("^I validate Double filter based on first component type (.*), first filter name (.*) first column number (.*) header matching first filter name and second component type (.*), second filter name (.*) second column number (.*) header matching second filter name$")
	public void User_validatedoublefilterbasedonfilternameandcolumnnum(String FirstFilterComponentType,String filtername,int Columnnumber,String SecondFilterComponentType,String Secondfiltername,int SecondColumnnumber) throws Exception
	{
	  flow.DoubleFilterValidationWithColumnNumberandFilterName(FirstFilterComponentType, Columnnumber, filtername, SecondFilterComponentType, SecondColumnnumber, Secondfiltername);
	}
	
/*Method used to populate data for text field based on field name*/
	@Given("^I populate data for text field based on field name (.*) with size (.*) and validation message check condition (.*)$")
	public void User_populatedatafortextfieldbasedonfieldname(String fieldname,String size,String condition) throws Exception
	{
	  flow.PopulateDataforTextFieldBasedonFieldName(fieldname, size, condition);
	}
	
/*Method used to populate data for text fields in grid*/
	@Given("^I populate data for text field in grid (.*) row (.*) column (.*) with size (.*) and validation message check condition (.*)$")
	public void User_populatedatafortextfieldgrid(String gridnumber,String rownumber, String columnnumber, String size, String condition) throws Exception
	{
	  flow.PopulateDataforTextFieldinGrid(gridnumber, rownumber, columnnumber, size, condition);
	}
	
/*Method used to populate data for date fields in grid*/
	@Given("^I populate data for date field in grid (.*) row (.*) column (.*) with date condition (.*)$")
	public void User_populatedatafordatefieldgrid(String gridnumber,String rownumber, String columnnumber, String datecondition) throws Exception
	{
	  flow.PopulateDataforDateFieldonGrid(gridnumber, rownumber, columnnumber, datecondition);
	}
	
/*Method used to populate data for date fields based on field name*/
	@Given("^I populate data for date field based on field name (.*) with date condition (.*)$")
	public void User_populatedatafordatefieldbasedonfieldname(String fieldname,String datecondition) throws Exception
	{
	  flow.PopulateDataforDateFieldBasedonFieldname(fieldname, datecondition);
	}
	
	
/*Method used to populate data for upload field in grid*/
	@Given("^I populate data for upload field in grid (.*) row (.*) column (.*) with file type (.*)$")
	public void User_populatedataforuploadfieldingrid(String gridnumber,String rownumber, String columnnumber, String filetype) throws Exception
	{
	  flow.PopulateDataforUploadfieldonGrid(gridnumber, rownumber, columnnumber, filetype);
	}
	
/*Method used to populate data for upload field based on field name*/
	@Given("^I populate data for upload field based on field name (.*) with file type (.*)$")
	public void User_populatedataforuploadfieldbasedonfieldname(String fieldname,String filetype) throws Exception
	{
	  flow.PopulateDataforUploadfieldBasedonFieldname(fieldname, filetype);
	}
	
/*Method used to populate data for upload field based on index*/
	@Given("^I populate data for upload field based on index (.*) with file type (.*)$")
	public void User_populatedataforuploadfieldbasedonindex(String index,String filetype) throws Exception
	{
	  flow.PopulateDataforUploadfieldBasedonIndex(index, filetype);
	}
	
/*Method used to check whether the given date is valid or not*/
	@Given("^I check whether the given date (.*) is valid or not$")
	public void user_checkdate(String dateToValidate) throws Exception
	{
		flow.CheckforValidDate(dateToValidate);
	}
	
/*Method to wait for progressbar to complete*/
	@Given("^I Wait for progressbar")
	public void wait_for_progressbar()
	{
		flow.WaitforProgressBar();
	}
	
}
