Feature: Ingresar al sitio web https://demoqa.com/automation-practice-form y diligenciar los campos
  de texto
  @regresion

  @caso1
  Scenario: ingreso al sitio web y diligencio los campos de texto
    Given yo ingreso al sitio web
    When  yo Diligencio los campos de texto
    |name        |lastName|email              |gender |mobile            |birth |subjects   | hobbies    |current  |state   |city     |
    |Jairo       |Henao   |jh@mailinator.com  |Male   |1234567891        |      |masculino  | Sports     |calle 12 |Hanyana |Karnal   |
    Then  yo verifico que se registren los datos correctamente"Thanks for submitting the form"
