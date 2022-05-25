Feature: User Login and Logout

Scenario: Single select dropdown
Given I set up browser CHROME
Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
Given I login with UserName vta_user1 and PassWord vta
Given I Wait for progressbar
Given I Click on WebElement Links, Buttons and Icon Fields
Given I verify MouseHovertext for icon based on index 1 matches text Click here to view the report
#Given I verify if tooltip text of field Current Organization / Project Name matches text Please choose your current organization/project name
#Given I populate SingleSelect Dropdown field Countries with value India
#Given I press enter key for field based on fieldname Countries
#Given I check if webelement located by "xpathvariable" is present in UI
#Given I populate SingleSelect dropdown field false based on index 2 with value Male
#Given I provide timeout of 3000 to wait
#Given I populate SingleSelect dropdown field based on instructiontext Please select your current role in Vuram with value Director
#Given I provide timeout of 3000 to wait
#Given I populate SingleSelect dropdown field based on tooltiptext Please choose your current organization/project name with value CODE
#Given I provide timeout of 3000 to wait
#Given I populate Singleselect Dropdown field in grid 1 column 1 row 1 with value India
#Given I validate field named Single Select DropDown Grid present in the grid insie box layout based on index 1 with value India
#Given I populate SingleSelect dropdown field based on customized fieldname Organization Names with value CODE
#Given I provide timeout of 3000 to wait
#Given I populate SingleSelect dropdown field based on placeholdertext Select a customer with value Abbey Color
#Given I clear Multiselect dropdown field based on fieldname Status
#Given I provide timeout of 3000 to wait
#Given I populate MultiSelect dropdown field based on placeholdertext Select status with value Invoiced,Do Not Invoice
#Given I populate MultiSelect Dropdown field Known Languages with value English,Hindi
#Given I provide timeout of 3000 to wait
#Given I clear Multiselect dropdown field based on index 1
#Given I provide timeout of 3000 to wait

#Scenario: Multip select dropdown
#Given I set up browser CHROME
#Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
#Given I login with UserName vta_user1 and PassWord vta
#Given I Wait for progressbar
#Given I populate MultiSelect Dropdown field Known Languages with value English,Hindi
#Given I populate MultiSelect dropdown field Known Languages based on index 2 with value Kannada,Tamil
#Given I provide timeout of 3000 to wait
#Given I populate MultiSelect Dropdown based on instructiontext Please select Projects you Worked Before with value CODE,SOUL
#Given I populate MultiSelect Dropdown based on tooltiptext Please select your options with value Cycling
#Given I provide timeout of 3000 to wait
#Given I populate MultiSelect Dropdown based on customized fieldname Multiple Drop Down With Search Display with value Kannada,Tamil
#Given I populate Multiselect Dropdown field in grid 2 column 1 row 1 with value Trichy	,Chennai
#Given I provide timeout of 3000 to wait

#Scenario: picker 
#Given I set up browser CHROME
#Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
#Given I login with UserName vta_user1 and PassWord vta
#Given I Wait for progressbar
#Given I Click on WebElement Picker Fields
#Given I Wait for progressbar
#Given I populate picker filed Selection 1 with value A2
#Given I populate picker field based on instructiontext Please select your group with value ABC
#Given I provide timeout of 3000 to wait
#Given I clear picker field based on fieldname Select your Group
#Given I populate picker field Select your Group based on index 1 with value AB23
#Given I provide timeout of 3000 to wait
#Given I populate picker field based on placeholdertext Start type the single group name you belongs to with value ABQ Admin Users
#Given I provide timeout of 3000 to wait
#Given I populate picker field based on tooltiptext Please select your group with value ABQ PB Users
#Given I provide timeout of 3000 to wait
#Given I populate picker field based on customized fieldname Selection 2 with value Chat Group
#Given I populate picker field in grid 1 column 1 row 1 with value Chat Group
#Given I provide timeout of 3000 to wait

#Scenario: Text and Para fields
#Given I set up browser CHROME
#Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
#Given I login with UserName vta_user1 and PassWord vta
#Given I Wait for progressbar
#Given I Click on WebElement Text, Paragraph and Date Fields
#Given I Wait for progressbar
#Given I populate text or paragraph field named Name with value Test
#Given I populate Text or Paragraph field named false based on index 2 with value Test2
#Given I populate text or paragraph field based on partial field named value with value Test3
#Given I populate text or paragraph field of customized name Paragraph Field with Validation with value CustomTest
#Given I populate text or paragraph field based on placeholdertext --Please enter the value-- with value Dummy Text
#Given I populate text or paragraph field based on tooltiptext You can enter your address here with value Dummy Text2
#Given I populate text or paragraph field based on instructiontext Enter your mobile number with value Dummy Text3
#Given I populate data for text field in grid 1 row 1 column 1 with size 1000 and validation message check condition true
#Given I provide timeout of 3000 to wait
#Given I populate textfield in grid 1 row 1 column 1 with value Dummy
#Given I populate data for text field based on field name Validate Error Message for TextField With Inputs with size 1000 and validation message check condition true


#Scenario: Radio button and CB
#Given I set up browser CHROME
#Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
#Given I login with UserName vta_user1 and PassWord vta
#Given I Wait for progressbar
#Given I Click on WebElement Check Boxes and Radio Buttons
#Given I click on radio option Trichy	 of the field Office Location
#Given I click on Radio option Chennai of the field Office Locations based on index 1
#Given I provide timeout of 3000 to wait
#Given I click on radio option based on index 7
#Given I provide timeout of 3000 to wait
#Given I click on radio option Chennai based on customized fieldname Office Locations in India
#Given I click on checkbox option Yes of the field Have you experienced before joining to Vuram
#Given I click on Checkbox option Yes of the field Have you experienced before joining to Vuram Company ? based on index 1
#Given I provide timeout of 3000 to wait
#Given I click on Checkbox option based on index 3
#Given I click on Checkbox option Yes based on customized fieldname Have you experienced before joining to Vuram Company India ?
#Given I provide timeout of 3000 to wait
#Given I click on Checkbox option based on index 3
#Given I click on Checkbox option based on text Yes
#Given I click on radio option based on index 4
#Given I provide timeout of 3000 to wait
#Given I click on Checkbox option in grid 1 column 1 row 1

#Scenario: Date Fields
#Given I set up browser CHROME
#Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
#Given I login with UserName vta_user1 and PassWord vta
#Given I Wait for progressbar
#Given I Click on WebElement Text, Paragraph and Date Fields
#Given I set date for date field based on fieldname Date with value 05/10/2022
#Given I set date for date field based on instructiontext Please choose your Date of Joining with value 05/10/2022
#Given I provide timeout of 3000 to wait
#Given I set date for date field based on tooltiptext Please follow the given Date format with value 05/10/2022
#Given I provide timeout of 3000 to wait
#Given I set date and time for field based on fieldname Appoinment Date  with date 05/10/2022 and time 6:00 PM
#Given I set date for date field based on customized fieldname Date Of Birth with value 05/10/2022
#Given I provide timeout of 3000 to wait

#
#Scenario: generic function
#Given I set up browser CHROME
#Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
#Given I login with UserName vta_user1 and PassWord vta
#Given I Wait for progressbar
#Given I populate field type SingleSelectDropDown named Countries with value India
#Given I populate field type MultiSelectDropDown named Known Languages with value English,Hindi
#Given I provide timeout of 3000 to wait
#Given I Click on WebElement Picker Fields
#Given I provide timeout of 3000 to wait
#Given I populate field type PickerField named Selection 1 with value A2
#Given I populate field type PickerField named Selection 6 with value A2,AB23
#Given I provide timeout of 3000 to wait
#Given I Click on WebElement Text, Paragraph and Date Fields
#Given I provide timeout of 3000 to wait
#Given I populate field type TextBox named Name with value Test
#Given I provide timeout of 3000 to wait
#Given I populate field type DateField named Date with value 05/10/2022
#Given I populate field type TextBox named Paragraph Field with Validation with value Test
#Given I provide timeout of 3000 to wait
#Given I Click on WebElement File Upload Fields
#Given I provide timeout of 3000 to wait
#Given I populate field type UploadField named Upload Address Proof with value C:\\Users\\amalamarym\\Desktop\\signature-Dummy.png
#Given I provide timeout of 3000 to wait
#Given I Click on WebElement Check Boxes and Radio Buttons
#Given I provide timeout of 3000 to wait
#Given I populate field type Checkbox named Have you experienced before joining to Vuram with value Yes
#Given I provide timeout of 3000 to wait
#Given I populate field type RadioButton named Office Location with value Chennai		
#Given I populate data for field based field name Gender
#Given I provide timeout of 3000 to wait
#Given I populate data for field based on field name Known Languages Based On Index
#Given I provide timeout of 3000 to wait
#Given I Click on WebElement Picker Fields
#Given I populate data for field based on field name Select your Group
#Given I provide timeout of 3000 to wait
#Given I populate data for field based on field name Multiple Picker Based on Index
#Given I Click on WebElement Text, Paragraph and Date Fields
#Given I populate data for field based field name Name
#Given I provide timeout of 3000 to wait
#Given I populate data for field based on field name Date Of Joining
#Given I populate data for field based on field name Paragraph Field with Validation
#Given I Click on WebElement File Upload Fields
#Given I populate data for field based on field name Upload Address Proof
#Given I provide timeout of 3000 to wait
#Given I populate data for field based on field name Upload Marks Cards
#Given I Click on WebElement Check Boxes and Radio Buttons
#Given I populate data for field based on field name Have you experienced before joining to Vuram
#Given I provide timeout of 3000 to wait
#Given I populate data for field based on field name Office Locations

#Scenario: Upload field
#Given I set up browser CHROME
#Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
#Given I login with UserName vta_user1 and PassWord vta
#Given I Wait for progressbar
#Given I Click on WebElement File Upload Fields
#Given I validate the removal and upload document functionality for upload field based on index 5 with documents maintained in file C:\\Users\\amalamarym\\Desktop\\Book1.xlsx under sheet named Sheet1 at comlun Document Path
#Given I populate first upload field with value C:\\Users\\amalamarym\\Desktop\\signature-Dummy.png
#Given I populate upload field based on index 2 with value C:\\Users\\amalamarym\\Desktop\\signature-Dummy.png
#Given I populate upload field named Upload your Photo with value C:\\Users\\amalamarym\\Desktop\\signature-Dummy.png
#Given I provide timeout of 3000 to wait
#Given I populate mulitple upload field Upload Marks Cards with value C:\\Users\\amalamarym\\Desktop\\signature-Dummy.png,C:\\Users\\amalamarym\\Desktop\\dummy pdf.pdf
#Given I provide timeout of 3000 to wait
#Given I populate multiple upload field named Upload Semester Marks Cards with documents maintained in sheet Sheet1 under column Document Path located at C:\\Users\\amalamarym\\Desktop\\Book1.xlsx
#Given I provide timeout of 3000 to wait
#Given I populate Multiple upload field in grid 1 row 1 column 1 with documents maintained in sheet Sheet1 under column Document Path located at C:\\Users\\amalamarym\\Desktop\\Book1.xlsx
#Given I populate multiple upload field in grid 1 row 1 column 1 with C:\\Users\\amalamarym\\Desktop\\signature-Dummy.png,C:\\Users\\amalamarym\\Desktop\\dummy pdf.pdf
#Given I provide timeout of 3000 to wait
#Given I populate data for upload field based on index 1 with file type png
#Given I populate data for upload field based on index 2 with file type jpeg
#Given I populate data for upload field based on index 3 with file type docx
#Given I populate data for upload field in grid 1 row 1 column 1 with file type pdf
#Given I populate data for upload field based on field name Invalid Document Validation Field with file type png

#Scenario: Verify
#Given I set up browser CHROME
#Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
#Given I login with UserName vta_user1 and PassWord vta
#Given I Wait for progressbar
#Given I Click on WebElement Text, Paragraph and Date Fields
#Given I verify error message of textfield Validate Error Message for TextField With Inputs with input ytyutyutytywteywtewetiuqeyqweqwueiuqwyeuiqwyeiquyeiqwyeiuqwyeqiyequyeqoyeytyutyutytywteywtewetiuqeyqweqwueiuqwyeuiqwyeiquyeiqwyeiuqwyeqiyequyeqoyeytyutyutytywteywtewetiuqeyqweqwueiuqwyeuiqwyeiquyeiqwyeiuqwyeqiyequyeqoyeytyutyutytywteywtewetiuqeyqweqwueiuqwyeuiqwyeiquyeiqwyeiuqwyeqiyequyeqoye matches text The text cannot be longer than 250 characters. 292 characters received.
#Given I provide timeout of 3000 to wait
#Given I Click on BoxSectionLayout Date Fields
#Given I Verify PlaceholderText of the SingleSelect DropDown field Countries matches text --- Select a Value ---
#Given I Click on WebElement Text, Paragraph and Date Fields
#Given I Verify PlaceholderText of the field Enter value matches text --Please enter the value--
#Given I provide timeout of 3000 to wait
#Given I Verify instructiontext below the field Enter your Mobile Number matches text Enter your mobile number
#Given I Click on WebElement Links, Buttons and Icon Fields
#Given I verify mouseHover text for button Next matches text Click here to go to next page

#Scenario: Link
#Given I set up browser CHROME
#Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
#Given I login with UserName vta_user1 and PassWord vta
#Given I Wait for progressbar
#Given I wait for the visibility of element located by xpath //*[contains(text(),'Single Drop Down')]
#Given I verify if tooltip text of field Current Organization / Project Name matches text Please choose your current organization/project name
#Given I Click on WebElement Links, Buttons and Icon Fields
#Given I click on link based on link name Add
#Given I Wait for progressbar
#Given I click on link based on partial link name Add along with index 2
#Given I Wait for progressbar
#Given I click on link based on Partial link name P21021
#Given I Wait for progressbar
#Given I click on link based on index 4
#Given I Wait for progressbar
#Given I click on Boldlink based on index 1
#Given I verify text Accept matches button name

Scenario: Image and icons
Given I set up browser CHROME
Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
Given I login with UserName vta_user1 and PassWord vta
Given I Wait for progressbar
#Given I verify task security in sites for logged in user under tab My Tasks in grid 1 for task name ABC123 based on preset condition No
Given I Click on WebElement Links, Buttons and Icon Fields
#Given I click on SVG icon based on fieldname Team Leave/WFH
#Given I Wait for progressbar
#Given I click on SVG icon based on index 2
#Given I Wait for progressbar
#Given I verify MouseHovertext for icon based on index 17 matches text Click here to view the users table
#Given I Wait for progressbar
#Given I click on image based on index 1

#Scenario: Explicit wait
#Given I set up browser CHROME
#Given I set Appian url to https://appiandev.vuram.com/suite/sites/vta-site
#Given I login with UserName vta_user1 and PassWord vta
#Given I Wait for progressbar
#Given I Click on WebElement Links, Buttons and Icon Fields
#Given I Logout

#Scenario: Filter
#Given I set up browser CHROME
#Given I set Appian url to https://lexisnexisdev.appiancloud.com/suite/sites/scs/page/reports
#Given I login with UserName troy.schnider and PassWord password2$
#Given I verify all site tabs list based on the logged in user
#Given I validate single filter data in the grid
#Given I Click on WebElement FINANCE REPORT
#Given I Wait for progressbar
#Given I validate double filter data in the grid
#Given I Verify date filters for grid 1 at column 10 by applying From date filter named Due Date From with value 01/01/2020 and To date filter named Due Date To with value 31/12/2022
#Given I validate single filter data based on column named Product by applying filter named Product
#Given I populate SingleSelect Dropdown field Contract Template Type with value Practical Guidance
#Given I provide timeout of 3000 to wait
#Given I populate SingleSelect Dropdown field Contract Template with value Agreement-PG-Flat Fee-Repurposing Forms Royalty Content
#Given I provide timeout of 3000 to wait
#Given I verify error message of datefield based on fieldname Date with input 09/05/2022
#Given I provide timeout of 3000 to wait
#Given I verify error message of datefield based on index 3 with input 02/05/2022
#Given I validate textfield Details of Contract without any input
#Given I click on clear filter link
#Given I click element in grid 1 column 1 row 1
#Given I provide timeout of 3000 to wait
#Given I populate data for Integer field in grid 2 row 1 column 2 with size 3
#Given I Click on WebElement Complete QC
#Given I populate data for Integer field based on field name Total Errors with size 3 and validation message check condition true
#Given I select column header checkbox of column 1 in grid 1
#Given I populate datefield in grid 1 row 1 column 3 with value 16/05/2022
#Given I click element in grid 1 column 2 row 1
#Given I click element in grid 1 based on text SCS2011014
#Given I click on cardlayout based on index 4
#Given I provide timeout of 3000 to wait
#Given I Click on WebElement Show More Filters
#Given I provide timeout of 3000 to wait
#Given I validate single filter data based on column named Group by applying filter named Group
#Given I populate data for date field in grid 1 row 1 column 4 with date condition future
#Given I switch to recent child window
#Given I Click on WebElement Task Assignment
#Given I Wait for progressbar
#Given I switch to parent window
#Given I close current window
#Given I Logout
#Given I quit browser

#Scenario: Verify grid function
#Given I set up browser CHROME
#Given I set Appian url to https://lexisnexisdev.appiancloud.com/suite/sites/scs/page/home
#Given I login with UserName troy.schnider and PassWord password2$
#Given I Wait for progressbar
#Given I verify task security in sites for logged in user under tab My Tasks in grid 1 for reference ID SCS1222222 based on preset condition Yes
#Given I populate SingleSelect Dropdown field Content type with value Cases
#Given I populate data for field based field name  Skip notification to PSL on this Cases


#Scenario: Vuram solutions
#Given I set up browser CHROME
#Given I perform bulk security test for logged in user in Tempo under tab Tasks
#Given I set Appian url to https://lexisnexisdev.appiancloud.com/suite/sites/scs/record/lYBEnGy9KWnHFRQIrVe788n1wp1zYsUO_rgtZ5DxkRtQ8uu8eHodVQkaRSjDqDPfWiIDyC_DytsfbPFdb7VBVTIeikbWHGvOl2aXvvDnTkhqzJP1T9CzA/view/summary
#Given I login with UserName troy.schnider and PassWord password2$
#Given I Wait for progressbar
#Given I verify task security of Records/Actions/Reports in sites under tab Related Actions of name Manage Phase based on present condition No
#Given I verify visibility condition for logged in user
#Given I click on reject button without any comment in comment box to validate if alert/validation message matches text Comment is required
#Given I validate double filter data in the grid
#Given I validate single filter data based on column named SOW Name by applying filter named SOW Name
#Given I check if textfield filter SOW Name is cleared on clicking clear filter link
#Given I verify error message of datefield based on index 1 with input 05/15/2022
#Given I check if webelement located by //*[text()='Organization Name'] is present in UI
#Given I validate textfield Organization Name with input 0/100 character(s) has been entered0/100 character(s) has been entered0/100 character(s) has been entered0/100 character(s) has been entered
#Given I click on clear filter link
#Given I Click on WebElement Submit a Request
#Given I Wait for progressbar
#Given I populate data for field based field name On behalf of ..

#Scenario: Tempo
#Given I set up browser CHROME
#Given I set Appian url to https://vuramsolutionsdev.appiancloud.com/suite/tempo/news
#Given I click on link based on link name  Appian
#Given I login with UserName sureshc@vuram.com and PassWord test1234
#Given I Wait for progressbar
#Given I verify task security of Records/Actions/Reports in Tempo under tab Records of name 123 based on present condition Yes
#Given I verify task security of Records/Actions/Reports in Tempo under tab Reports of name 456 based on present condition Yes
#Given I verify task security of Records/Actions/Reports in Tempo under tab Actions of name 789 based on present condition Yes
#Given I send post Cucumber Post Content in news tab
#Given I provide timeout of 3000 to wait
#Given I send message Cucumber Message123 to recipients Election Admin,ad @vuram.com in news tab
#Given I provide timeout of 3000 to wait
#Given I send task Cucumber TaskContent to assignee Election Admin in news tab
#Given I provide timeout of 3000 to wait
#Given I send kudos Cucumber Kudoscontent to ad @vuram.com
#Given I extract the information of the news matching content Test kudos for news feed-FOR TEST PURPOSE
#Given I verify news feed containing text Test Post for news feed-FOR TEST PURPOSE is present
#Given I add comment TestComment to post containing Test Cucumber
#Given I delete news post Test Cucumber123