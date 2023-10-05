### 3.3.2 Processo 2 – Gerenciar Postagem.

Gerenciar Ponstagem - Contribui para o usuário, que deseja efetuar a compra ou venda de algum ingresso, conseguir encontrá-lo e vendê-lo mais rapidamente.


![Exemplo de um Modelo BPMN do PROCESSO 2](images/processo2.png "Modelo BPMN do Processo 2.")


**Realizar o cadastro da descriçao, preço do ingresso e postá-lo**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Descrição       |  Caixa de Texto  | 240 caractéres           | (informe a descição)|
| Preço           |  Número          | Números positivos         |    (informe o preço) |
| Imagem do evento    |  Imagem  |     Imagem       |    null      |

| **Comandos**         |  **Destino**                                  | **Tipo**   |
| ---                  | ---                            | ---               |
| Cadastrar  Ingresso          | Iníciar o processo de cadastro de ingresso    |  (Botão)   |
| Escolher imagem     | Biblioteca do usuário  |  (Botão)   |
| Concluído  | Finalizar o processo de cadastro de ingresso  |  (Botão)   |



**Buscar o ingresso**

| **Campo**       | **Tipo**                                  | **Restrições**         | **Valor default**          |
| ---             | ---                                        | ---                    | ---               |
| Busca ingresso  |  Caixa de Texto                           |      Número, Texto e Data                 | (insira o nome do ingresso)|
| Tabela          |  Campo com todos os ingressos disponivéis |        Texto e Imagens                | null                   |      
| Filtrar         |  Seleção múltipla  |        Seleçao                | null                    |


| **Comandos**         |  **Destino**                               | **Tipo**        |
| ---                  | ---                            | ---               |
| Buscar               | Realiza a busca do ingresso                | (Botão)         |
| Filtrar           | Realizar a filtragem              | (Botão)         |
| Ver mais         | Acessar o ingresso escolhido          | (Botão)         |



**Acessar a pagina do ingresso escolhido**

| **Comandos**         |  **Destino**                               | **Tipo**        |
| ---                  | ---                            | ---               |
| Voltar   | Tela de busca do ingresso  |  (Botão)        |
| Realizar pagamento   | Processo de pagamento do ingresso |  (Botão)        |

