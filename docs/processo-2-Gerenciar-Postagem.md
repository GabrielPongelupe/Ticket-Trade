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
| Cidade      |  Caixa de Texto  |    Caracteres        |Cidade|
| Data      |  Data  |     Data atual ou futura       |  dd/mm/aaaa|
 



**Tabela de ingressos**

| **Campo**       | **Tipo**                                  | **Restrições**         | **Valor default**          |
| ---             | ---                                        | ---                    | ---               |
| Nome Evento |  Caixa de Texto                           |         Caracteres              | Nome do Evento|
| Cidade      |  Caixa de Texto  |    Caracteres        |  Cidade do Evento|
| Data      |  Data  |     Data atual ou futura       | data do Evento|
| Preço           |  Número          | Números positivos         |    Valor do Ingresso |
| Evento        |  Imagem          | Imagem         |    Imagem do Ingresso |   


| **Comandos**         |  **Destino**                               | **Tipo**        |
| ---                  | ---                            | ---               |
| Buscar               | Realiza a busca do ingresso                | (Botão)         |
| Ver mais         | Acessar o ingresso escolhido          | (Botão)         |



**Pagina do ingresso escolhido**

| **Campo**       | **Tipo**                                  | **Restrições**         | **Valor default**          |
| ---             | ---                                        | ---                    | ---               |
| Nome do Evento |  Caixa de Texto                           |         Caracteres              | Nome do Evento|
| Cidade      |  Caixa de Texto  |    Caracteres        | Cidade do Evento|
| Data      |  Data  |     Data atual ou futura       | Data do Evento|
 | Preço           |  Número          | Números positivos         |    Valor do Engresso |
 | Imagem         |  Imagem          | Imagem         |    Imagem do Ingresso |
| Descrição       |  Caixa de Texto  | 240 caractéres           | Descrição do Evento|

| **Comandos**         |  **Destino**                               | **Tipo**        |
| ---                  | ---                            | ---               |
| Voltar   | Tela de busca do ingresso  |  (Botão)        |
| Realizar pagamento   | Processo de pagamento do ingresso |  (Botão)        |

