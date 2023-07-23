@regression

Feature: Find Jobs
  As user I want to find job search in cv library site

  @smoke
  Scenario Outline: Verify job search result

    Given I am on HomePage
    When I accept cookies
    And Enter job Title "<jtitle>"
    And Enter Location "<loc>"
    And Select Distance "<dis>"
    And Click on More Search Option
    And Enter Minimum Salary "<minSal>"
    And Enter Maximum Salary "<maxSal>"
    And Select Salary Type "<salType>"
    And Select Job Type "<jobType>"
    And Click on Find job Button
    Then User should see error Message "<errorMessage>"

    Examples:
      | jtitle              | loc            | dis      | minSal | maxSal | salType   | jobType        | errorMessage                                      |
      | Tester              | Harrow         | 5 miles  | 30000  | 50000  | Per annum | Permanent      | Permanent Tester jobs in Harrow                   |
      | Engineer            | UK             | 5 miles  | 50000  | 75000  | Per month | Contract       | Contract Engineer jobs                            |
      | Design Manager      | London         | 10 miles | 50000  | 100000 | Per annum | Temporary      | Temporary Design Manager jobs in London           |
      | Warehouse Operative | London         | 15 miles | 10000  | 20000  | Per day   | Apprenticeship | Apprenticeship Warehouse Operative jobs in London |
      | Shop Manager        | Milton Keynes  | 20 miles | 10000  | 15000  | Per week  | Part Time      | Part Time Shop Manager jobs in Milton Keynes      |
      | Manager             | Central London | 25 miles | 25000  | 35000  | Per month | Part Time      | Part Time Manager jobs in Central London          |