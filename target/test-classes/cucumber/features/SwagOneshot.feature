Feature: Login and buy products

  @smoke_test
  Scenario Outline: Login and buy single product
    Given I login to SwagLabs account as "account01_user"
    Then  I am in default Page in SwagLabs
    When  I add "<product>" into my cart
    When  I click on cart icon
    When  I click on checkout button
    When  I set following information
    When  I click on Finish button to end this transaction
    Examples:
      | product             |
      | Sauce Labs Backpack |
