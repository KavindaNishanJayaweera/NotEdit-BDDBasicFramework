
Feature: Login

@Regression
 Scenario: 1 Login to the application
 Given Base URL
 When Enter user name "abc"
 And Enter password "abc123@"
 And Click OK button
 Then Verify the dashboard page title
    



