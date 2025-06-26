Feature: TutorialPointStudentForm

  Scenario: Student form - gender radiobutton check
    Given Uzivatel je na stranke tutorialspoint student form
    When Uzivatel zada svoje meno "Honza"
    And Uzivatel zada svoj email "email@email.com"
    And Uzivatel klikne na pohlavie "male"
    Then Radiobutton Male je zaciarknute
    When Uzivatel klikne na pohlavie "female"
    Then Radiobutton Male je odskrtnuty
