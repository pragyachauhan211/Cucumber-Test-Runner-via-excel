@browserstack
Feature: basic launch browser

  # @basic
  @test
  Scenario: To check if error message is showing
  Given To check if error message is showing and for that,
    Given hit the url
    Given maximize it
    When enter username
    And and enter password
    Then error should come
    Then close the browser
    
