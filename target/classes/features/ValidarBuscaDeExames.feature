#language: pt 

@BuscaDeExames
Funcionalidade: Busca de exames
Eu como paciente gostaria de efetuar busca por exames
Para que eu possa valida se determinado exame esta disponivel

Contexto: Realizar busca por exame
Dado que eu esteja acessando o portal de medicina diagnotica 'Sergio Franco'
E clique na opcao do menu 'exames'
E clique no submenu 'Busca de exames'

Esquema do Cenario: Busca por exame existente
E digito um "<exame>" valido 
E clico na lupa para pesquisar
Entao valido a lista de exames apresentados
Exemplos:
|exame         |
|cardiovascular|

Esquema do Cenario: Busca por exame inexistente
E digito um "<exame>" invalido
E clico na lupa para pesquisar
Entao valido se o resultado da pesquisa esta vazia
Exemplos:
|exame      |
|inexistente|