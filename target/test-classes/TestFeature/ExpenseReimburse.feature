Feature: User Submit Expense Reimbursment form

Scenario: User Submit ER request
Given I set Appian url to $$$URL$$$
Given I login with UserName $$$UserName$$$ and PassWord $$$PassWord$$$
Given I click on link based on partial link name "Expense" along with index "1"
Given I Wait for progressbar
Given I click on link based on link name "Submit Expense Reimbursement"
Given I Wait for progressbar
Given I populate text or paragraph field named "Request Name" with value "Dummy User1"
Given I populate SingleSelect Dropdown field "Expense Category" based on "3" with value "CSR Expenses"
Given I populate SingleSelect Dropdown field "false" based on "3" with value "INR"
Given I click on Checkbox option based on index "2"
Given I set date for date field based on fieldname "Date" with value "05/04/2022"
Given I populate SingleSelect Dropdown field "Expense Type" with value "Food"
Given I populate SingleSelect Dropdown field "Payment Mode" with value "Cash in Advance"
Given I populate SingleSelect Dropdown field "Expense Currency" with value "INR"
Given I verify value if field "Conversion Rate" has value "1"
Given I populate text or paragraph field named "Expense Amount" with value "1000"
Given I populate text or paragraph field based on placeholdertext "Give some details about this Expense" with value "New Expense"
Given I click on link based on partial link name "new Attachment"
#Given I Wait for progressbar
Given I populate MultiSelect Dropdown field "Expense Item" with value "1 - Food - 5/4/2022 - 1000"
Given I populate data for upload field based on field name "Upload Receipt" with file type "pdf"
Given I Wait for progressbar
Given I populate text or paragraph field named "Attachment Notes" with value "Test Doc"
Given I populate text or paragraph field named "Comments" with value "Test request"
Given I Click on Button "Review"
Given I Wait for progressbar
Given I verify text "Review  Expense Reimbursement Details" is present in UI
Given I Click on Button based on index "4"
Given I Click on Button "Yes"
Given I Wait for progressbar
Given I verify text "EXP220504006" present in grid "1" row "1" column "1"