Feature: User Login

Background: Set up scenario names


Scenario Outline: User Login to Excom
Given Open Browser and Enter https://lexisnexisdev.appiancloud.com/suite/sites/scs/page/invoice
Given User enters details from given Sheetname sheetname and Rownumber rownumber with UserName from columnname1 and PassWord from columnname2
Given User turns on implicit wait
Given User Click on SingleSelect Dropdown named Customer and select option Pfizer
Given User quit browser


Scenario Outline: User Login to CA <columnname4>
Given Open Browser and Enter URL from given sheetname "<sheetname>", rownumber <rownumber> and columnname "<columnname3>"
Given User enters details from given sheetname "<sheetname>" and rownumber <rownumber> with UserName from "<columnname1>" and PassWord from "<columnname2>"
Given User turns on implicit wait
Given User uploads multiple files C:\Users\amalamarym\Downloads\dummy pdf (4).pdf,C:\Users\amalamarym\Downloads\sample (6).doc in the upload field Documents Upload
Given User quit browser
Examples:
| sheetname | rownumber | columnname1 | columnname2 | columnname3 |columnname4|
| TestData | 1 | UserName | PassWord | URL |Application1|
| TestData | 2 | UserName | PassWord | URL |Application2|

