Feature: a user want to see the reward that obtained and claimed is appearing in the Freebies Vault Section history
  As a user
  I want to see my reward history (the ones I have obtained and claimed) in the Freebies Vault Section
  So the last 8 rewards should appears with each correspondent thumbnail

  Scenario: a user access to Freebies Vault
    Given a registered user with any reward
    When user clicks in Freebies Vault section
    Then history rewards appears
    And every reward has a characteristic thumbnail

  Scenario: a user obtain a reward and claim it
    Given a user with a reward token
    And reward token is valid
    When claim the reward
    Then reward is added to the Freebies Vault history

  Scenario: a user obtain a reward and claim it
    Given the Freebies Vault Section history of a user
    And the user has more than 8 rewards claimed
    When opens the history section
    Then the last 8 rewards should appears
    And every reward has a characteristic thumbnail

