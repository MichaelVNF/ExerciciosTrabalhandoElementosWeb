Feature: Praticar Manipulacao de Frames

@pratica3
Scenario Outline: Manipular Frames
  Given estou na pagina inicial do site "<url>"
  When clico no menu 'Frames and Windows'
  And na pagina 'Frames and Windows' em 'Open Seprate New Window' clico no link 'Open Seprate New Window'
  And verifico se a nova janela foi aberta e seu conteudo carregado
  And na pagina 'Frames and Windows' em 'Frameset' clico no link 'Open Frameset Window'
  And verifico se a pagina contem os frames
  
Examples:
 | url                   |
 | http://demoqa.com/    |