Feature: Shopping

  Background: Assess a wallet
    Given there is a person
    When I want to assess a wallet to this person
    Then the person should have a new wallet

  Scenario Outline: Track budget
    Given the person has "200" in his wallet
    When he wants to make a shopping with <price> and <name>
    Then he should have a new <budget> in wallet

    Examples:
      | price | name   | budget |
      | 60    | ticket | 140    |
      | 30    | bag    | 170    |

#      | name   | price | budget |
#      | ticket | 60    | 140    |
#      | bag    | 30    | 170    |

  Scenario: Check shopping list size
    Given person has not bought any products yet
    When he buys two products
    Then the shopping list should be updated


