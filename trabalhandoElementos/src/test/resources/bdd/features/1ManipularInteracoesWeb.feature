Feature: Praticar Interacoes Web

@pratica
Scenario Outline: Praticar Interacoes
  Given estou na pagina inicial do site "<url>"
  When clico no menu 'Draggable'
  And na pagina 'Draggable' em 'Default functionality' arrastar e soltar a div "<x>" "<y>"
  And na pagina 'Draggable' em 'Draggable And Sortable' arrastar e soltar classificando a li "<pos>" 
  And clico no menu 'Droppable'
  And na pagina 'Droppable' em 'Default functionality' arrastar e soltar a div sobre outra
  And na pagina 'Droppable' em 'Shopping cart demo' arrastar e soltar a li sobre a div
  And clico no menu 'Resizable'
  And na pagina 'Resizable' em 'Default functionality' redimensionar div "<x>" "<y>"
  And clico no menu 'Selectable'
  And na pagina 'Selectable' em 'Display as grid' selecionar todos os numeros
  And na pagina 'Selectable' em 'Serialize' selecionar itens especificos "<numItens>" #separar por virgulas#
  And clico no menu 'Sortable'
  Then na pagina 'Sortable' em 'Display as grid' inverter a ordem dos elementos 
   
Examples:
   | url                   |  x  |  y  | pos | numItens |
   | http://demoqa.com/    | 200 | 100 |  5  | 1,3,5,6  |


