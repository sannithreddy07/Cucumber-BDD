@TC001VerifyTitle
Feature: HRMS

  Background: user login logout
    Given Open Application
    Then Close Application

  Scenario: Verify Title
    When Verify Title

  @TC002Loginlogout
  Scenario: LoginLogout
    When Login into application
    When Logout from application
