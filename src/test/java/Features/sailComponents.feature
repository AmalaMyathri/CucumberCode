Feature: SAIL Components

#To initiate driver
Scenario: User initiate driver
Given I set up browser "FIREFOX/EDGE/CHROME"

#To Login
Scenario: User Login
Given I set Appian url to "URL"

#To Logout
Scenario: User Logout
Given I Logout

#To click on any WebElement
Scenario: User Clicks on WebElement based on element name
Given I Click on WebElement "ElementName"

#To click on Export to excel linkt
Scenario: User click on Export to excel link
Given I Click on Export to excel link

#To click on any box section layout
Scenario: User Clicks on Section or Box Layout based on layout name
Given I Click on BoxSectionLayout "SectionLayout"

#To click on any button
Scenario: User Clicks on Button based on button name
Given I Click on Button named "ButtonName"

#To click on any button based on index
Scenario: User Clicks on Button based on index
Given I Click on Button based on index "index"

#To select value from SingleSelect Dropdown based on fieldname
Scenario: User selects required option from SingleSelect DropDown based on field name
Given I populate SingleSelect Dropdown field "FieldName" with value "Option"

#To select value from SingleSelect Dropdown based on index
#Put fieldname as false if there is no field name
Scenario: User selects required option from SingleSelect DropDown based on index
Given I populate SingleSelect dropdown field "FieldName" based on index "Index" with value "Option"

#To select value from SingleSelect Dropdown based on placeholdertext
Scenario: User selects required option from SingleSelect DropDown based on placeholdertext
Given I populate SingleSelect dropdown field based on placeholdertext "placeholdertext" with value "Option"

#To select value from SingleSelect Dropdown based on instructiontext
Scenario: User selects required option from SingleSelect DropDown based on instructiontext
Given I populate SingleSelect dropdown field based on instructiontext "instructiontext" with value "Option"

#To select value from SingleSelect Dropdown based on tooltiptext
Scenario: User selects required option from SingleSelect DropDown based on tooltip
Given I populate SingleSelect dropdown field based on tooltiptext "tooltip" with value "Option"

#To select value from SingleSelect Dropdown based on customized fieldname
Scenario: User selects required option from SingleSelect DropDown based on customized fieldname
Given I populate SingleSelect dropdown field based on customized fieldname "FieldName" with value "Option"

#To select value from single select dropdown in grid
Scenario: User select value from single select dropdown in grid
Given I populate Singleselect Dropdown field in grid "gridNum" column "column" row "row" with value "Option"

#To select value(s) from Multiselect dropdown based on feild name
Scenario: User selects required options from MultiSelect DropDown based on field name
Given I populate MultiSelect Dropdown field "FieldName" with value "OptionName1,OptionName2"

#To select value(s) from Multiselect dropdown based on customized date fieldname
Scenario: User selects required options from MultiSelect DropDown based on customized date feildname
Given I populate MultiSelect Dropdown for customized date fields named "FieldName" with value"OptionName1,OptionName2"

#To select value(s) from Multiselect dropdown based on index
#Put fieldname as false if there is no field name 
Scenario: User selects required options from MultiSelect DropDown based on field name
Given I populate MultiSelect dropdown field "FieldName" based on index "index" with value "OptionName1,OptionName2"

#To select value(s) from Multiselect dropdown based on placeholdertext
Scenario: User selects required options from MultiSelect DropDown based on placeholdertext
Given I populate MultiSelect dropdown field based on placeholdertext "placeholdertext" with value "OptionName1,OptionName2"

#To select value(s) from Multiselect dropdown based on instructiontext
Scenario: User selects required options from MultiSelect DropDown based on instructiontext
Given I populate MultiSelect Dropdown based on instructiontext "instructiontext" with value "OptionName1,OptionName2"

#To select value(s) from Multiselect dropdown based on tooltiptext
Scenario: User selects required options from MultiSelect DropDown based on tooltiptext
Given I populate MultiSelect Dropdown based on tooltiptext "tooltiptext" with value "OptionName1,OptionName2"

#To select value(s) from Multiselect dropdown based on customized fieldname
Scenario: User selects required options from MultiSelect DropDown based on customized fieldname
Given I populate MultiSelect Dropdown based on customized fieldname "Fieldname" with value "OptionName1,OptionName2"

#To select value(s) from Multiselect dropdown in grid
Scenario: User selects required options from MultiSelect DropDown in grid
Given I populate Multiselect Dropdown field in grid "gridNum" column "column" row "row" with value "OptionName1,OptionName2"

#To select value(s) from picker based on fieldname
Scenario: User selects required options from Picker based on field name
Given I populate picker filed "FieldName" with value "OptionName1,OptionName2"

#To select value(s) from picker based on index
#Put fieldname as false if there is no field name 
Scenario: User selects required options from Picker based on index
Given I populate picker field "FieldName" based on index "index" with value "OptionName1,OptionName2"

#To select value(s) from picker based on placeholdertext
Scenario: User selects required options from Picker based on placeholdertext
Given I populate picker field based on placeholdertext "placeholdertext" with value "OptionName1,OptionName2"

#To select value(s) from picker based on tooltiptext
Scenario: User selects required options from Picker based on tooltiptext
Given I populate picker field based on tooltiptext "tooltiptext" with value "OptionName1,OptionName2"

#To select value(s) from picker based on instrcutiontext
Scenario: User selects required options from Picker based on instructiontext
Given I populate picker field based on instructiontext "instructiontext" with value "OptionName1,OptionName2"

#To select value(s) from picker based on customized fieldname
Scenario: User selects required options from Picker based on customized fieldname
Given I populate picker field based on customized fieldname "FieldName" with value "OptionName1,OptionName2"

#To select value(s) from picker in grid
Scenario: User selects required options from Picker in grid
Given I populate picker field in grid "gridNum" column "ColumnNum" row "RowNum" with value "OptionName1,OptionName2"

#To click element in grid based on index
Scenario: User click element in grid
Given I click element in grid "gridNum" column "ColumnNum" row "RowNum"

#To click element in grid based on text
Scenario: User click element in grid
Given I click element in grid "gridNum" based on text "Text"

#To click on radio option based on field name
Scenario: User clicks on required radiobutton based on field name and option
Given I click on radio option "Option" of the field "FieldName"

#To click on radio option based on fieldname index
#Note:Put FieldName as false if no fieldname
Scenario: User clicks on required radiobutton based on fieldname index
Given I click on Radio option "Option" of the field "FieldName" based on index "index"

#To click on radio option based on index
Scenario: User clicks on required radiobutton based on index
Given I click on radio option based on index "index"

#To click on radio option based on customized fieldname
Scenario: User clicks on required radiobutton based on customized fieldame
Given I click on radio option "Option" based on customized fieldname "FieldName"

#To click on Checkbox option based on fieldname
Scenario: User clicks on required Checkbox based on field name and option
Given I click on checkbox option "Option" of the field "FieldName"

#To click on Checkbox option based on fieldname index
Scenario: User clicks on required Checkbox based on fieldname index
Given I click on Checkbox option "Option" of the field "FieldName" based on index "index"

#To click on Checkbox option based on index
Scenario: User clicks on required Checkbox based on index
Given I click on Checkbox option based on index "index"

#To click on Checkbox option based on text
Scenario: User clicks on required Checkbox based on text
Given I click on Checkbox option based on text "text"

#To click on Checkbox option based on customized fieldname
Scenario: User clicks on required Checkbox based on customized fieldname
Given I click on Checkbox option "Option" based on customized fieldname "FieldName"

#To click on Checkbox option in grid
Scenario: User clicks on required Checkbox in grid
Given I click on Checkbox option in grid "gridnum" column "Rownum" row "ColumnNum"

#To add value in text or paragraph field based on field name
Scenario: User enter value in text or paragraph field based on field name
Given I populate text or paragraph field named "FieldName" with value "value"

#To add value in text or paragraph field based on index
#Note:Put FieldName as false if no field name
Scenario: User enter value in text or paragraph field based on index
Given I populate Text or Paragraph field named "FieldName" based on index "index" with value "value"

#To add value in text or paragraph field based on partial field name
Scenario: User enter value in text or paragraph field based on partial field name
Given I populate text or paragraph field based on partial field named "FieldName" with value "value"

#To add value in text or paragraph field based on customized field name
Scenario: User enter value in text or paragraph field based on customized field name
Given I populate text or paragraph field of customized name "FieldName" with value "value"

#To add value in text or paragraph field based on placeholdertext
Scenario: User enter value in text or paragraph field based on placeholdertext
Given I populate text or paragraph field based on placeholdertext "placeholdertext" with value "value"

#To populate first upload field in UI
Scenario: User upload file in the first upload field present in the UI
Given I populate first upload field with value "value"

#To add value in text or paragraph field based on instructiontext
Scenario: User enter value in text or paragraph field based on instructiontext
Given I populate text or paragraph field based on instructiontext "instructiontext" with value "value"

#To add value in text or paragraph field based on tooltiptext
Scenario: User enter value in text or paragraph field based on tooltiptext
Given I populate text or paragraph field based on tooltiptext "tooltiptext" with value "value"

#To populate first upload field based on index
Scenario: User upload file in the upload field based on index
Given I populate upload field based on index "index" with value "value"

#To populate multiple upload field based fieldname
Scenario: User uploads multiple files in upload field based on field name
Given I populate mulitple upload field "FieldName" with value "value1,value2"

#To upload the multiple files in document upload field from the excel where the file paths are stored
Scenario: User upload the multiple files in document upload field from the excel where the file paths are stored
Given I populate multiple upload field named "FieldName" with documents maintained in sheet "sheetName" under column "ColumnName" located at "path"

#To populate upload field based on fieldname
Scenario: User upload file in the upload field based on fieldname
Given I populate upload field named "FieldName" with value "value"

#To click on image based on index
Scenario: User clicks on image based on index
Given I click on image based on index "Index"

#To click on SVG icon of field baed on index
Scenario: User clicks on SVG icon based on index
Given I click on SVG icon based on index "index"

#To click on SVG icon of field based on fieldname
Scenario: User clicks on SVG icon based on field name
Given I click on SVG icon based on fieldname "FieldName"

#To click on webelement using javascript based on elementname
Scenario: User clicks on webelement using javascript based on elementname
Given I click on webelement using javascript based on elementname "ElementName"

#To click on cardlayout based on index
Scenario: User clicks on cardlayout based on index
Given I click on cardlayout based on index "index"

#To click on link based on partial link name along with index index
Scenario: User clicks on link based on partial link name along with index index
Given I click on link based on partial link name "LinkName" along with index "index"

#To click on link based on partial link name
Scenario: User clicks on link based on partial link name
Given I click on link based on Partial link name "PartialLinkName"

#To click on link based on link name
Scenario: User clicks on link based on link name
Given I click on link based on link name "LinkName"

#To click on link based on index
Scenario: User clicks on link based on index
Given I click on link based on index "index"

#To click on boldlink based on index
Scenario: User clicks on boldlink based on index
Given I click on Boldlink based on index "index"

#To populate value for any field based on partial field name
#FieldType can be TextBox,SingleSelectDropDown,MultiSelectDropDown,PickerField,DateField,Checkbox,RadioButton,UploadField
Scenario: User populate value in any field based on partial field name
Given I populate field type "FieldType" named "FieldName" with value "Vlaues(s)"

#To get current date and time with seconds
Scenario: User get current date and time with seconds
Given I get current date and time with seconds

#To get current date and time
Scenario: User get current date
Given I get current date and time

#To get current date
Scenario: User get current date
Given I get current date

#To get past date
Scenario: User get past date
Given I get past date

#To get future date
Scenario: User get future date
Given I get future date

#To get businessday
Scenario: User get businessday
Given I get businessday

#To get future date based on input date
Scenario: User get future date based on input date
Given I get future date based on input date "Inputdate"

#To get past date based on input date
Scenario: User get past date based on input date
Given I get past date based on input date "Inputdate"

#To set date in date feild based on instructiontext
Scenario: User set date for date feild based on instructiontext
Given I set date for date field based on instructiontext "Instructiontext" with value "Vlaue"

#To get latest file from download directory
Scenario: User get latest file from download directory
Given I get latest file from download directory

#To compare actual and expected value
Scenario: User compare actual and expected vlaue
Given I compare actual value "ActualText" against expected value "ExpectedText" and print passmessage "PassMess" if passed, else print failmessage as "FailMess"

#To get latest file from specified directory
Scenario: User get latest file from specified directory
Given I get file from directory "Directory"

#To set date in date feild based on tooltiptext
Scenario: User set date for date feild based on tooltiptext
Given I set date for date field based on tooltiptext "tooltiptext" with value "Vlaue"

#To set date in date feild based on placeholdertext
Scenario: User set date for date feild based on placeholdertext
Given I set date for date field based on placeholdertext "tooltiptext" with value "Vlaue"

#To set date for date feild based on fieldname
Scenario: User set date for date feild based on fieldname
Given I set date for date field based on fieldname "FieldName" with value "Vlaue"

#To set date for date feild based on customized fieldname
Scenario: User set date for date feild based on customized fieldname
Given I set date for date field based on customized fieldname "FieldName" with value "Vlaue"

#To set date and time for feild based on fieldname
Scenario: User set date and time feild based on fieldname
Given I set date and time for field based on fieldname "FieldName" with date "Date" and time "Time"

#To verify mousehover text of button
Scenario: User verify mousehover text of a button
Given I verify mouseHover text for button "ButtonName" matches text "Texttoverify"

#To verify text present in UI
Scenario: User verify text present in UI
Given I verify text "Texttoverify" is present in UI

#To verify text not present in UI
Scenario: User verify text not present in UI
Given I verify text "Texttoverify" is not present in UI

#To verify partialtext present in UI
Scenario: User verify partialtext present in UI
Given I verify partialtext "Texttoverify" is present in UI

#To verify value in any field
Scenario: User verify value in any field
Given I verify value if field "FieldName" has value "Texttobeverified"

#To verify MouseHovertext for ICON based on Index
Scenario: User verify MouseHovertext from ICON based on Index
Given I verify MouseHovertext for icon based on index "index" matches text "Texttoverify"

#To verify tooltip text of field
Scenario: User verify tooltip text of field
Given I verify if tooltip text of field "FieldName" matches text "Texttobeverified"

#To verify button name
Scenario: User verify buttonname
Given I verify text "Buttonnametoverify" matches button name

#To verify text present in grid
Scenario: User verify text present in grid
Given I verify grid text "Text" present in grid "gridNum"

#To verify partial text in grid
Scenario: User verify partial text in grid
Given I verify partial text "Text" in grid "gridNum"

#To verify column name of grid
Scenario: User verify column name of grid
Given I verify Column Name "ColumnName" of the grid "gridNum"

#To verify partial column name of grid
Scenario: User verify partial column name of grid
Given I verify Partial column name "ColumnName" of the grid "gridNum"

#To click on refresh filter link
Scenario: User click on refresh filter link
Given I click on refresh filter link

#To click on clear filter link
Scenario: User click on clear filter link
Given I click on clear filter link

#To return the number of rows in the current page of the grid
Scenario: User return the number of rows in the current page of the grid
Given I extract number of rows in the current page of the grid "gridNum"

#To return the number of rows for the entire grid
Scenario: User return the number of rows for the entire grid
Given I extract number of rows for the entire grid "gridNum"

#To enter a text in the input text field inside the grid
Scenario: User enter a text in the input text field inside the grid
Given I populate textfield in grid "gridNum" row "RowNum" column "ColumnNum" with value "Value"

#To enter a date in the date field which is present inside the grid
Scenario: User enter a date in the date field which is present inside the grid
Given I populate datefield in grid "gridNum" row "RowNum" column "ColumnNum" with value "Value"

#To verify text present in grid
Scenario: User verify text present in grid
Given I verify text "Text" present in grid "gridNum" row "RowNum" column "ColumnNum"

#To retrieve a text in grid
Scenario: User retrieve a text in grid
Given I retrieve text present in grid "gridNum" column "ColumnNum" row "RowNum"

#To retrieve a entire row values from the grid
Scenario: User retrieve a entire row values from the grid
Given I retrive entire row values of row "RowNum" from the grid "gridNum"

#To verify check pagination of any grid
Scenario: User check pagination of any grid
Given I verify pagination of grid "gridNum"

#To verify sorting of the grid columns
Scenario: User verify sorting of the grid columns
Given I verify sorting of all the columns in the grid "gridNum"

#To verify sorting of the grid column based on Column Number
Scenario: User verify sorting of the grid column based on column number
Given I verify sorting of column based on index "Index" in the grid "gridNum"

#To clear a text in the text field on the grid
Scenario: User clear a text in the text field on the grid
Given I clear text field in grid "gridNum" row "RowNum" column "ColumnNum"

#To clear a text in the single select dropdown field on the grid
Scenario: User clear a text in the single select dropdown field on the grid
Given I clear single select dropdown field in grid "gridNum" row "RowNum" column "ColumnNum"

#To clear a text in the Multi select dropdown field on the grid
Scenario: User clear a text in the multi select dropdown field on the grid
Given I clear multi select dropdown field in grid "gridNum" row "RowNum" column "ColumnNum"

#To clear a picker field on the grid
Scenario: User clear a picker field on the grid
Given I clear picker field in grid "gridNum" row "RowNum" column "ColumnNum"

#To upload the multiple files in document upload field on grid from the excel where the file paths are stored
Scenario: User upload the multiple files in document upload field on grid from the excel where the file paths are stored
Given I populate Multiple upload field in grid "gridNum" row "RowNum" column "ColumnNum" with documents maintained in sheet "sheetname" under column "columnnum" located at "path"

#To upload the multiple files in document upload field on grid using input values
Scenario: User upload the multiple files in document upload field on grid using input values
Given I populate multiple upload field in grid "gridNum" row "RowNum" column "ColumnNum" with "Value"

#To retrieve a particular column value based on reference ID available under Records
Scenario: User retrieve a particular column value based on reference ID available under Records
Given I retrieve value in column "ColumnNum" for refernce ID "RefID" from reference ID column "RefIDColNum" in grid "gridNum"

#To verify sorting of the grid column based on Column Name
Scenario: User verify sorting of the grid column based on column name
Given I verify sorting of column based on name "Name" in the grid "gridNum"

#To retrieve a entire column values from the grid
Scenario: User retrieve a entire column values from the grid
Given I retrive entire column values of column "ColumnNum" from the grid "gridNum"

#To setup browser
Scenario: User setup browser
Given I setup with "BrowserName" browser

#To clear field
Scenario: User clear field
Given I clear field "FieldName"

#To clear dropdown field
Scenario: User clear dropdown dropdown field
Given I clear dropdown field "FieldName"

#To clear Multiselect dropdown field based on index
Scenario: User clear Multiselect dropdown dropdown field based on index
Given I clear Multiselect dropdown field based on index "index"

#To clear Multiselect dropdown field based on fieldname
Scenario: User clear Multiselect dropdown dropdown field based on fieldname
Given I clear Multiselect dropdown field based on fieldname "FieldName"

#To clear pickerfield based on fieldname
Scenario: User clear pickerfield based on fieldname
Given I clear picker field based on fieldname "FieldName"

#To check if textfield filter is cleared on clicking clear filter link
Scenario: User check if textfield filter is cleared on clicking clear filter link
Given I check if textfield filter "FieldName" is cleared on clicking clear filter link

#To verify placeholdertext of field
Scenario: User verify placeholdertext of field
Given I Verify PlaceholderText of the field "FieldName" matches text "Inputtext"

#To verify placeholdertext of SingleSelect DropDown Field
Scenario: User verify placeholdertext of SingleSelectDropDown Field
Given I Verify PlaceholderText of the SingleSelect DropDown field "FieldName" matches text "Inputtext"

#To verify instructiontext below the Field
Scenario: User verify instructiontext below the Field
Given I Verify instructiontext below the field "FieldName" matches text "Inputtext"

#To validate textfield without any input
Scenario: User validate textfield without any input
Given I validate textfield "FieldName" without any input "Inputtext"

#To validate textfield with input
Scenario: User validate textfield with input
Given I validate textfield "FieldName" with input 

#To verify error message of textfield with input value
Scenario: User verify error message of textfield with input value
Given I verify error message of textfield "FieldName" with input "Inputtext" matches text "ErrorMessage"

#To verify error message of datefield based on fieldname
Scenario: User verify error message of datefield based on fieldname
Given I verify error message of datefield based on fieldname "FieldName" with input "date"

#To verify error message of datefield based on index
Scenario: User verify error message of datefield based on index
Given I verify error message of datefield based on index "Index" with input "date"

#To verify From and To date filters
Scenario: User verify From and To date filters
Given I Verify date filters for grid "Grid" at column "Columnnum" by applying From date filter named "FromDatefieldName" with value "ToDatefieldName" and To date filter named "FromDate" with value "ToDate"

#To validate the single filter data with the grid
Scenario: User validate single filter data in the grid
Given I validate single filter data in the grid

#To validate the single filter data based on column and filter name
Scenario: User validate single filter data based on column and filter name
Given I validate single filter data based on column named "ColumnName" by applying filter named "FilterName"

#To validate the double filter data with the grid
Scenario :User validate double filter data in the grid
Given I validate double filter data in the grid

#To validate the double filter data based on columns and filters name
Scenario: User validate double filter data based on columns and filters name
Given I validate double filter data for two columns based on column1 named "ColumnName1" and column2 named "ColunmnName2" by applying filter1 named "FilterName1" and filter2 named "FilterName2"

#To verify the field value present in the grid inside the box layout
Scenario: User verify the field value present in the grid inside the box layout
Given I validate field named "FieldName" present in the grid insie box layout based on index "Index" with value "value"

#To verify if the status of the milestone step is completed
#Note:inputvalue should be Completed Step always
Scenario: User verify if the status of the milestone step is completed
Given I validate if milestone step named "StepName" matches status "Status(Completed)"

#To check for an alert message when the user uploads an invalid document
Scenario: User check for an alert message when the user uploads an invalid document
Given I validate alert message by uploading document "DocPath" in upload document field based on index "Index"

#To validate the removal and upload document functionality (Finally it will upload the last document specified in the excel. To validate this scenario atleast 2 documents have to be specified)
Scenario: User validate the removal and upload document functionality
Given I validate the removal and upload document functionality for upload field based on index "Index" with documents maintained in file "FileLocation" under sheet named "SheetName" at comlun "ColumnName"

#To retrive webelement 
Scenario: User retrive webelement
Given I retrieve webelement by "xpath"

#To retrive web elements list from field
Scenario: User retrive WebElement list using field xpath
Given I retrive web elements from field "FieldXpathVariable"

#To extract all the data's from pie chart based on index 
Scenario: User extract all the details from pie chart based on index
Given I extract all the details from pie chart based on index "Index"

#To extract all the data's from line chart based on index 
Scenario: User extract all the details from line chart based on index
Given I extract all the details from line chart based on index "Index"

#To wait explicitly for visiblity of element
Scenario: User gives explicitly for visiblity of element
Given I wait for the visibility of element located by xpath "ElementXpathVariable"

#To wait explicitly for visiblity of text
Scenario: User gives explicitly for visiblity of text
Given I wait for the visibility of text "text"

#To wait explicitly for visiblity of partialtext
Scenario: User gives explicitly for visiblity of partialtext
Given I wait for the visibility of partial text"Partialtext"

#To press Enter key for any field based on fieldname
Scenario: User press Enter key for any field based on fieldname
Given I press enter key for field based on fieldname "FieldName"

#To retrive webelements using xpath variable
Scenario: User retrive webelements using xpath variable
Given I retrieve span webelements using variable "xpathvariable"

#To check webelement in UI
Scenario: User check webelement in UI
Given I check if webelement located by "xpathvariable" is present in UI

#To return site tabs list based on the logged in user
Scenario: User verify site tabs list based on the logged in user
Given I verify all site tabs list based on the logged in user

#To verify visibility condition for basic user
Scenario: User verify visibility condition for basic user
Given I verify visibility condition for logged in user

#To check the task security in sites by using reference ID
#Note:Enter Yes in case if the user wants to verify the presence of the task, Enter No in case if the user wants to verify the absence of the task
Scenario: User check the task security by using reference ID in sites
Given I verify task security in sites for logged in user under tab "TabName" in grid "GridNum" for reference ID "ID" based on preset condition "Yes/No"

#To check the task security in sites by using task name
#Note:Enter Yes in case if the user wants to verify the presence of the task, Enter No in case if the user wants to verify the absence of the task
Scenario: User check the task security by using task name in sites
Given I verify task security in sites for logged in user under tab "TabName" in grid "GridNum" for task name "TaskName" based on preset condition "Yes/No"

#To check the task security in tempo by using reference ID
#Note:Enter Yes in case if the user wants to verify the presence of the task, Enter No in case if the user wants to verify the absence of the task
Scenario: User check the task security by using refernce ID in tempo
Given I verify task security in tempo for logged in user under tab "TabName" for reference ID "ID" based on preset condition "Yes/No"

#To check the task security in tempo by using task name
#Note:Enter Yes in case if the user wants to verify the presence of the task, Enter No in case if the user wants to verify the absence of the task
Scenario: User check the task security by using task name in tempo
Given I verify task security in tempo for logged in user under tab "TabName" for task name "Task Name" based on preset condition "Yes/No"

#To check the security of the Records/Actions/Reports by using its name in sites
#Note:Enter Yes in case if the user wants to verify the presence of the Records/Actions/Reports, Enter No in case if the user wants to verify the absence of the Records/Actions/Reports
Scenario: User check the security of the Records/Actions/Reports by using its name in sites
Given I verify task security of Records/Actions/Reports in sites under tab "TabName" of name "Records/Actions/Reports" based on present condition "Yes/No"

#To check the security of the Records/Actions/Reports by using its name in Tempo
#Note:Enter Yes in case if the user wants to verify the presence of the Records/Actions/Reports, Enter No in case if the user wants to verify the absence of the Records/Actions/Reports
Scenario: User check the security of the Records/Actions/Reports by using its name in Tempo
Given I verify task security of Records/Actions/Reports in Tempo under tab "TabName" of name "Records/Actions/Reports" based on present condition "Yes/No"

#To perform bulk security testing in sites
Scenario: User perform bulk security testing in sites
Given I perform bulk security test for logged in user in sites under tab "TabName" in grid of index "Index"

#To perform bulk security testing in sites
Scenario: User perform bulk security testing in Tempo
Given I perform bulk security test for logged in user in Tempo under tab "TabName"

#To create post in news tab
Scenario: User create post in news tab
Given I send post "Post Content" in news tab

#To send message in news tab
Scenario: User send message in news tab
Given I send message "Message" to recipients "Recipients" in news tab

#To send task in news tab
Scenario: User send task in news tab
Given I send task "TaskContent" to assignee "TaskAssignee" in news tab

#To post kudos message about a user
Scenario: User post kudos message about a user
Given I send kudos "Kudoscontent" to "Recipients"

#To verify a news in news tab
Scenario: User verify a news in news tab
Given I verify news feed containing text "NewsText" is present

#To delete a news in news tab
Scenario: User delete a news in news tab
Given I delete news post "NewsText"

#To add comment for news containing specific text
Scenario: User add comment for news containing specific text
Given I add comment "Comment" to post containing "NewsText"

#To extract the information such as person who posted the news,file names and file types attached with the news in news tab
Scenario: User extract the information such as person who posted the news,file names and file types attached with the news in news tab
Given I extract the information of the news matching content "News content"

#To provide implicit wait
Scenario: User gives implicit wait
Given I wait for for relative period of time

#To turn off implicit wait
Scenario: User turn off implicit wait
Given I turn off implicit wait

#To provide timeout
#Note: 1000=1 second
Scenario: User provide timeout
Given I provide timeout of "seconds" to wait

#To refresh screen
Scenario: User refresh screen
Given I refresh screen

#To cancel task/flow
Scenario: User cancel task/flow
Given I click on cancel button to cancel task/flow

#To  check an alert/validation message for the comment box by clicking the reject button without entering comments
Scenario: User check an alert/validation message for the comment box by clicking the reject button without entering comments
Given I click on reject button without any comment in comment box to validate if alert/validation message matches text "message"

#To quit browser
Scenario: User quit browser
Given I quit browser

#To close current window
Scenario: User close current window
Given I close current window

#To switch to recent child window
Scenario: User switch to recent child window
Given I switch to recent child window

#To switch to parent window
Scenario: User switch to parent window
Given I switch to parent window

#To populate data for fields based on field name
Scenario: User populate data for fields based on field name
Given I populate data for field based on field name "FieldName"

#To populate data for grid fields
Scenario: User populate data for grid fields
Given I populate data for field in grid "gridNum" row "RowNum" column "Column Num"

#To populate data for Integer fields in grid
Scenario: User populate data for Integer fields in grid
Given I populate data for Integer field in grid "gridNum" row "RowNum" column "Column Nul" with size "Size"

#To populate data for Integer field based on field name
#Note:Put condition as true, if validation message to be verified, else put false
Scenario: User populate data for Integer field based on field name
Given I populate data for Integer field based on field name "FieldName" with size "Size" and validation message check condition "true/false"

#To validate Single filter based on component type, filter name and column number matching filtername
#Note:Function works only if column header matches filter name specified
Scenario: User validate Single filter based on component type, filter name and column number matching filtername
Given I validate Single filter based on component type "ComponentType", filter name "FilterName" and column number "ColumnNum" header matching filter name

#To validate Double filters based on component types, filter names and column numbers matching filternames
#Note:Function works only if column header matches filter name specified
Scenario: User validate Double filters based on component types, filter names and column numbers matching filternames
Given I validate Double filter based on first component type "FirstComponentType", first filter name "FirstFilterName" first column number "FirstColumnNum" header matching first filter name and second component type "SecondComponentType", second filter name "SecondFilterName" second column number "SecondColumnNum" header matching second filter name

#To populate data for text field based on field name
#Note:Put condition as true, if validation message to be verified, else put false
Scenario: User populate data for text field based on field name
Given I populate data for text field based on field name "FieldName" with size "Size" and validation message check condition "true/false"

#To populate data for text fields in grid
#Note:Put condition as true, if validation message to be verified, else put false
Scenario: User populate data for text fields in grid
Given I populate data for text field in grid "gridNum" row "RowNum" column "Column Nul" with size "Size" and validation message check condition "true/false"

#To populate data for date fields in grid
#Note:Put date condition as present, past, future based on requirement
Scenario: User populate data for date fields in grid
Given I populate data for date field in grid "gridNum" row "RowNum" column "Column Nul" with date condition "present/past/future"

#To populate data for date fields based on fieldname
#Note:Put date condition as present, past, future based on requirement
Scenario: User populate data for date fields based on field name
Given I populate data for date field based on field name "FieldName" with date condition "present/past/future"

#To populate data for upload field in grid
#Note:Put filetype as png,jpeg,docx,pdf based on requirement
Scenario: User populate data for upload field in grid
Given I populate data for upload field in grid "gridNum" row "RowNum" column "Column Nul" with file type "png/jpeg/docx/pdf"

#To populate data for upload field based on field name
#Note:Put filetype as png,jpeg,docx,pdf based on requirement
Scenario: User populate data for upload field based on field name
Given I populate data for upload field based on field name "FieldName" with file type "png/jpeg/docx/pdf"

#To populate data for upload field based on index
#Note:Put filetype as png,jpeg,docx,pdf based on requirement
Scenario: User populate data for upload field based on index
Given I populate data for upload field based on index "index" with file type "png/jpeg/docx/pdf"

#To check whether the given date is valid or not
Scenario: User check whether the given date is valid or not
Given I check whether the given date "Date" is valid or not

#To select the check box in the column header (select all/deselect all check box)
Scenario: User select the check box in the column header (select all/deselect all check box)
Given I select column header checkbox of column "ColumnNum" in grid "grid num"

#To Wait for progressbar
Scenario: Wait for progressbar
Given I Wait for progressbar