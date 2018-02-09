Feature: Praticar Widgets Web

@pratica2
Scenario Outline: Praticar Widgets
  Given estou na pagina inicial do site "<url>"
  When clico no menu 'Accordion'
  And na pagina 'Accordion' em 'Default functionality' clico em cada 'Section'
  And clico no menu 'Autocomplete'
  And na pagina 'Autocomplete' em 'Multiple Values' seleciono palavras da cx autocomplete "<palavras>" #SEPARAR POR VIRGULA, Ñ ADD ESPAÇO#
  And clico no menu 'Data Picker'
  And na pagina 'Data Picker' em 'Default functionality' seleciono a data correta "<dia>" "<mes>" "<ano>"
  And clico no menu 'Menu'
  And na pagina 'Menu' em 'Menu With Sub Menu' sobreponho o cursor aos menus e submenus
  And clico no menu 'Slider'
  Then na pagina 'Slider' em 'Range Slider' desloco o slider "<deslocaX>"
  
  
Examples:
 | url                   | palavras | dia | mes | ano | deslocaX |
 | http://demoqa.com/    | Ba,Ja,C  | 20  |  2  | 2019|    8     |