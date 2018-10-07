Feature: First Rest Assured test POST

  @Smoke
  Scenario: Test my POST request test1
    Given user hits the post request with "Tom" name

  #  Then user validate followind data
  #    | param      | Value   |
  #    | id         | notNull |
  #    | statusCode |     200 |
  @Regression
  Scenario: Test my POST request test2
    Given user hits the post request with "Tom" name

  #  Then user validate followind data
  #    | param      | Value   |
  #    | id         | notNull |
  #    | statusCode |     200 |
  @Regression
  Scenario: Test my POST request test3
    Given user hits the post request with "Tom" name
    #  Then user validate followind data
  #    | param      | Value   |
  #    | id         | notNull |
  #    | statusCode |     200 |
