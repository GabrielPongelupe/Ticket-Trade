### 3.3.2 Processo 2 – Gerenciar Postagem.

Gerenciar Ponstagem - Contribui para o usuário, que deseja efetuar a compra ou venda de algum ingresso, conseguir encontrá-lo e vendê-lo mais rapidamente.


![Exemplo de um Modelo BPMN do PROCESSO 2](images/processo2.png "Modelo BPMN do Processo 2.")


**Postagem**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Descrição       |  Caixa de Texto  | 240 caractéres           | (informe a descição)|
| Preço           |  Número          | Números positivos         |    default        |
| Evenntto    |  Imagem  |     Imagem       | (informe a descição)|

| **Comandos**         |  **Destino**                                  | **Tipo**   |
| ---                  | ---                            | ---               |
| Concluído  | Finalizar o processo de cadastro de ingresso  |  (Botão)   |
| Cadastrar  Ingresso          | Iníciar o processo de cadastro de ingresso    |  (Botão)   |
| Escolher arquivo           | Biblioteca do usuário  |  (Botão)   |



**Busca de ingresso**

| **Campo**       | **Tipo**                                  | **Restrições**         | **Valor default**          |
| ---             | ---                                        | ---                    | ---               |
| Busca ingresso  |  Caixa de Texto                           |      Número, Texto e Data                 | (insira o nome do ingresso)|
| Tabela          |  Campo com todos os ingressos disponivéis |        Texto e Imagens                | Default                    |
| Filtrar         |  Seleção múltipla  |        Seleçao                | Default                    |


| **Comandos**         |  **Destino**                               | **Tipo**        |
| ---                  | ---                            | ---               |
| Buscar               | Realiza a busca do ingresso                | (Botão)         |
| Realizar pagamento   | Inicia o processo de pagamento do ingresso |  (Botão)        |
| Filtrar           | Realizar a filtragem              | (Botão)         |
| Ver mais         | Entrar no ingresso escolhido          | (Botão)         |

