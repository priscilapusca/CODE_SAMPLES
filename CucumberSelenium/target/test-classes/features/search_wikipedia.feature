Feature: search Wikipedia

  Background:
    Given open wikipedia

  Scenario Outline:
    Given enter search term '<searchTerm>'
    When do search
    Then multiple results are shown for '<result>'

    Examples:
      | searchTerm | result                    |
      | mercury    | Mercury usually refers to |
      | max        | Max or MAX may refer to   |

  Scenario:
    Given user clicks on Talk link
    When enters a question
    Then multiple results are shown