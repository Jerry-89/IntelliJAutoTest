Feature: TutorialPointStudentForm // toto treba napisat vzdy - toto je CUCUMBER file

  Scenario: Student form - gender radiobutton check // overi zakliknutie spravneho gender
    Given Uzivatel je na stranke tutorialspoint student form
    When Uzivatel zada svoje meno "Honza"  //Name
    And Uzivatel zada svoj email "email@email.com" //Email
    And Uzivatel klikne na pohlavie male
    Then Radiobutton Male je zaciarknute
    When Uzivatel klikne na pohlavie female
    Then Radiobutton Male je odskrtnuty
