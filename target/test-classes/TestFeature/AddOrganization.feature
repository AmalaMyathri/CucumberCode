Feature: Add New Organziation

Scenario: Add Organization
Given Open Browser and Enter URL from given sheetname "<sheetname>", rownumber <rownumber> and columnname "<columnname1>"
Given User enters details from given sheetname "<sheetname>" and rownumber <rownumber> with UserName from "<columnname2>" and PassWord from "<columnnam3>"
Given Wait for progressbar
Given User enter value "<columnname5>" in text or paragraph field named "<columnname4>" from sheetname "<sheetname>" and rownumber <rownumber>
Given User Click on SingleSelect Dropdown named "<columnname6>" and select option "<columnname7>" from sheetname "<sheetname>" and rownumber <rownumber>
#Given User enters value in the picker named "<columnname8>" and select option(s) "<columnname9>" from sheetname "<sheetname>" and rownumber <rownumber>
#Given User enter value "<columnname11>" in text or paragraph field named "<columnname10>" from sheetname "<sheetname>" and rownumber <rownumber>
#Given User enters value in the picker named "<columnname11>" and select option(s) "<columnname12>" from sheetname "<sheetname>" and rownumber <rownumber>
#Given User uploads file "<columnname13>" in the upload field from sheetname "<sheetname>" and rownumber <rownumber>
Given User Click on SingleSelect Dropdown named "<columnname8>" and select option "<columnname9>" from sheetname "<sheetname>" and rownumber <rownumber>
#Given User set date for date field named "<columnname16>" with value "<columnname17>" from sheetname "<sheetname>" and rownumber <rownumber>
#Given User enter value "<columnname19>" in text or paragraph field named "<columnname18>" from sheetname "<sheetname>" and rownumber <rownumber>
Given User Click on Button named "<columnname10>" from sheetname "<sheetname>" and rownumber <rownumber>
Given User Click on Button named "<columnname11>" from sheetname "<sheetname>" and rownumber <rownumber>
Examples:
| sheetname | rownumber | columnname1 | columnname2 | columnname3 | columnname4 | columnname5 | columnname6 | columnname7 | columnname8 | columnname9 | columnname10 | columnname11 |
| TestData | 0 | URL | UserName | PassWord | OrgName | OrgName_Value | IndustryType | IndustryType_Value | OrgType | OrgType_Value | S_Button | Conf |