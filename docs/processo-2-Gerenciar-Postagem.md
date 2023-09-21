### 3.3.2 Processo 2 – Gerenciar Postagem.

Gerenciar Ponstagem - Contribui para o usuário, que deseja efetuar a compra ou venda de algum ingresso, conseguir encontrá-lo e vendê-lo mais rapidamente.


![Exemplo de um Modelo BPMN do PROCESSO 2](images/processo2.png "Modelo BPMN do Processo 2.")


#### Detalhamento das atividades

Descreva aqui cada uma das propriedades das atividades do processo 2. 
Devem estar relacionadas com o modelo de processo apresentado anteriormente.

Os tipos de dados a serem utilizados são:

* **Área de texto** - campo texto de múltiplas linhas
* **Caixa de texto** - campo texto de uma linha
* **Número** - campo numérico
* **Data** - campo do tipo data (dd-mm-aaaa)
* **Hora** - campo do tipo hora (hh:mm:ss)
* **Data e Hora** - campo do tipo data e hora (dd-mm-aaaa, hh:mm:ss)
* **Imagem** - campo - contendo uma imagem
* **Seleção única** - campo com várias opções de valores que são mutuamente exclusivos (tradicional radio button ou combobox)
* **Seleção múltipla** - campo com várias opções que podem ser selecionadas mutuamente (tradicional checkbox ou listbox)
* **Arquivo** - campo de upload de documento
* **Link** - campo que armazena uma URL
* **Tabela** - campo formado por uma matriz de valores

**Postagem**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| Descrição       |  Caixa de Texto  |---             | (informe a descição)|
| Preço           |  Número          | ---            |    default        |
|                 |                  |                |                   |
|                 |                  |                |                   |

| **Comandos**         |  **Destino**                   | **Tipo** |
| Finalizar cadastro   | Finalizar o processo de cadastro de ingresso  |  (Botão) |
| cadastrar            | Iníciar o processo de cadastro de ingresso  |  (Botão) |


**Busca de ingresso**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| Busca ingresso  |  Caixa de Texto  |                | (insira o nome do ingresso)|
| Tabela          |  Campo com todos os ingressos disponivéis |---             | Default            |

| **Comandos**         |  **Destino**                   | **Tipo**          |
| Buscar               | Realiza a busca do ingresso    | (Botão)           |
| Realizar pagamento   | Inicia o processo de pagamento do ingresso |  (Botão)        |
