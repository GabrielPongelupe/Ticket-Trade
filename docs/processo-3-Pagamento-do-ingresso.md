### 3.3.3 Processo 3 – Pagamento-do-ingresso

Pagamento do Ingresso - Este processo agiliza a compra e venda de ingressos, permitindo um ambiente confiável para o comprador através de uma intermediação feita pelo sistema.

![Exemplo de um Modelo BPMN do PROCESSO 3](images/processo3.png "Modelo BPMN do Processo 3.")



**Escolher forma de pagamento**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Pix        | Imagem   | Imagem de pix |      ---     |
| Boleto         | Imagem  | Imagem de boleto |    ---     |



| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| Pix | Pagamento por pix  | default |
| Boleto      |   Pagamento por boleto  |  default |




**Pagamento por Pix**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| QrCode        | Imagem   | QRcode de pix |     ---      |
| Codigo PIX         | Caixa de Texto   | Numeros, Caracteres especiais e Texto |     ---      |



| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| Voltar | Escolher forma de pagamento  | (Default) |






**Pagamento por Boleto**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Código de barras     | Imagem   | Código de barras |     ---      |



| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| Voltar | Escolher forma de pagamento  | (Default) |






**Realizar a Verificação do pagamento**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Verificação do Pagamento             | Texto              | ---            | Verificação do Pagamento              |
| Mensagem de Erro     | Caixa de Texto   | 240 caracteres |  Erro na verificação de pagamento          |


| **Comandos**         |  **Destino**                   | **Tipo**          |
| ---                  | ---                            | ---               |
| Valido              | Iniciar pagamento            | default           |
| Não Valido       | Tela de Envio de mensagem ao usuário |      default             |
