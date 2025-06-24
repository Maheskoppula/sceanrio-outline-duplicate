Feature: I am automating HRM Application


Background: Common re_usable steps

Given user launch browser
Then user enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario Outline: tc_01 _addingSkils Record-creating skils record

And user enter username as "Admin" and password as "admin123" and clicks login as button
Then user go to skils page
Then user enters skils name as <SKILLNAME> and description as <SKILLDESCRIPTION> and click on save button
Then click on login button
Then close the browser

Examples:

|SKILLNAME | SKILLDESCRIPTION|
|"Java255" |"JavaDescription"|
|"Java276" |"JavaDescription"|
|"Java259" |"JavaDescription"|
