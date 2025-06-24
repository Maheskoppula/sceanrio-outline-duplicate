
Feature: I am automating HRM Application

Background: Common re_useable steps 
Given user launch browser
Then user enter URL  as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario  Outline: TC_002 Nationalities Record-creating skills record
And user enter UserName as  "Admin"   and password as "admin123" and clicks login as button
Then user go to Nationalities page
Then user enters  Nationalities name as <NationalitiesNAME> and click on save button
Then click on login button
Then close the browser

Examples:

|NAME | 
|"mahesh123"|
|"hari12"|


