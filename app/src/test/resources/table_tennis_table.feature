Feature: Table Tennis Table

  Scenario: Initialize a table tennis table
    Given the table tennis table is not initialized
    When I initialize the table tennis table
    Then the table tennis table should be ready for use