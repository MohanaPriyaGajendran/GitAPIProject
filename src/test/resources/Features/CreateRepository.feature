@create @regression
Feature: CreateRepository
  In order to collaborate with the project team and track the work
  As a user
  I want to create a remote repository

  Background:
    Given I am an authenticated github user

#Create Repository
  @valid
  Scenario Outline: Create a valid remote repository
    When I send the request to create a repository with name as "<repo_name>" and with the description "<repo_desc>"
    Then the response code should be <expected_response_code>
    And the response should contain the repository name "<repo_name>"
    And the response time should be less than <expected_response_time> milliseconds
    Examples:
      | repo_name          | repo_desc                | expected_response_code | expected_response_time |
      | selenium-gitrepo   | Contains Selenium Code   | 200                    | 5000                   |
      | playwright-gitrepo | Contains Playwright Code | 200                    | 5000                   |

  @invalid @smoke
  Scenario: Create a invalid remote repository
    When I send the request to create a repository with name as "selenium-gitrepo" and with the description "Contains Selenium Code"
    Then the response code should be 404
    And the response time should be less than 5000 milliseconds

