Feature: User Login and Logout

Scenario: User Login to AOB
Given I set Appian url to https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp
Given I login with UserName sureshc@vuram.com and PassWord test1234
Given User quit browser

#Scenario: User Login to SL
#Given Open Browser and Enter "https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp"
#Given User enters UserName "sureshc@vuram.com" and PassWord "test1234"
#Given User turns on implicit wait
#Given User clicks on link based on partial link name "   Organizations "
#Given User turns on implicit wait
#Given User enter value "Test" in text or paragraph field named "Organization Name"
#Given User quit browser

