Feature: a user want to see the reward that obtained and claimed is appearing in the Freebies Vault Section history
  As a user with a username
  I want to call the RestService using '/igc/betspin/rewards/history' with the username
  So the RestService returns a Json with an array of unique tokens claimed by that user and will be in chronological order

  Scenario: the backend service returns to Freebies Vault content
    Given a username with any reward
    When the username is sent through the RestService
    Then the RestService returns a Json with an array of unique tokens
    And the array of tokens should be ordered chronologically

  Scenario: a unique token has been claimed more than once
    Given a reward token claimed "2" times more
    When the response of the RestService is obtained
    Then the array of unique tokens contains a list of sub-arrays
    And the sub-array should be ordered chronologically

  Scenario: a token claimed more than once should display some information
    Given a sub-array of a reward claimed more than once
    When the sub-array is listed
    Then the following info should be present
      | game-slung   |
      | date claimed |
      | info         |
      | reason       |
      | expiry date  |
