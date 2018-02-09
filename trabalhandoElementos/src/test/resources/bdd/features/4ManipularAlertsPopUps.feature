Feature: Praticar Manipulacao de Alerts e PopUps

@pratica4
Scenario Outline: Manipular Alerts e PopUps
  Given estou na pagina inicial do site "<url>"
  When clico no 'menu superior' "<menu>"
  And  clico no 'menu superior' "<subMenu>"
  And clico no botao 'Simple Alert'
  And clico no botao do 'Alerta' Simples 
  And clico no botao 'Confirm PopUp' 
  And clico no botao do 'Alerta' com opcoes "<opcaoBtn>"
  And clico no botao 'Prompt PopUp'
  And preencho o 'campo do Alerta' "<conteudo>" 
  Then clico no botao do 'Alerta' com opcoes "<opcaoBtn>"

 

  
Examples:
 | url                    | menu       | subMenu                                  | opcaoBtn | conteudo            |
 | http://toolsqa.com/    | DEMO SITES | Handling Alerts using Selenium WebDriver | OK       | Conteudo do alerta  |