Feature: Open Pages

  Scenario: Open Login Page
    Given I open Main Page
    When I click on Sign In button
    Then Open page with title 'Login - My Store'

  Scenario Outline: Open Category Pages
    Given I open Main Page
    When I click on '<button>' button
    Then Open page with title '<title>'
    Examples:
    | button   | title                |
    | Women    | Women - My Store     |
    | Dresses  | Dresses - My Store   |
    | T-shirts | T-shirts - My Store  |