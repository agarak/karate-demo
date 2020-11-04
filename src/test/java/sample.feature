Feature: sample

  Scenario: Testing valid GET endpoint
    Given url 'https://google.com'
    When method GET
    Then status 200