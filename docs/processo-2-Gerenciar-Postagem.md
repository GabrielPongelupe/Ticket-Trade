### 3.3.2 Processo 2 – Gerenciar Postagem.

Gerenciar Ponstagem - Contribui para o usuário, que deseja efetuar a compra ou venda de algum ingresso, conseguir encontrá-lo e vendê-lo mais rapidamente.


![Exemplo de um Modelo BPMN do PROCESSO 2](images/processo2.png "Modelo BPMN do Processo 2.")


**Realizar o cadastro da descriçao, preço do ingresso e postá-lo**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Nome do Evento       |  Caixa de Texto  | Caracteres           | Nome do Evento|
| Cidade      |  Caixa de Texto  |   Caracteres         | Cidade|
| Data      |  Data  |     Data atual ou futura       | dd/mm/aaaa|
| Preço           |  Número          | Números positivos         |    Valor |
| Descrição       |  Caixa de Texto  | 240 caractéres           | Descrição (Limite 240 Caracteres)|


| **Comandos**         |  **Destino**                                  | **Tipo**   |
| ---                  | ---                            | ---               |
| Cadastrar  Ingresso          | Página inicial    |  (Botão)   |
| Escolher Arquivo     | Biblioteca do usuário  |  (Botão)   |




**Buscar o ingresso**

| **Campo**       | **Tipo**                                  | **Restrições**         | **Valor default**          |
| ---             | ---                                        | ---                    | ---               |
| Nome do Evento |  Caixa de Texto                           |         Caracteres              | Nome do Evento|
| Cidade      |  Caixa de Texto  |    Caracteres        | Cidade|
| Data      |  Data  |     Data atual ou futura       | dd/mm/aaaa|
| Tabela          |  Campo com todos os ingressos disponivéis |        Texto e Imagens                | null                   |      


| **Comandos**         |  **Destino**                               | **Tipo**        |
| ---                  | ---                            | ---               |
| Buscar               | Realiza a busca do ingresso                | (Botão)         |
| Ver mais         | Acessar o ingresso escolhido          | (Botão)         |



**Acessar a pagina do ingresso escolhido**

| **Comandos**         |  **Destino**                               | **Tipo**        |
| ---                  | ---                            | ---               |
| Voltar   | Tela de busca do ingresso  |  (Botão)        |
| Realizar pagamento   | Processo de pagamento do ingresso |  (Botão)        |

