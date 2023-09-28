### 3.3.1 Processo 6 – Validaçao do ingresso.

Validação do ingresso - Este processo melhora o sistema de proteção do software, fazendo com que o pagamento só seja repassado após a garantia de integridade do ingresso, através da troca do titular. Portanto, não permite que o vendedor ou comprador aproveitem de maneira problemática do sistema.


![Exemplo de um Modelo BPMN do PROCESSO 1](images/processo6.png "Modelo BPMN do Processo 1.")

**Verificar envio e validaçao**
| **Comandos**         |  **Destino**                   | **Tipo**     |
| ---             | ---              | ---            | 
| Validado         |Histórico de compra e venda  | (default)    |
| Nao  validado       | Tela de mensagem   | (default)       |


**Enviar mensagem ao sistema**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Mensagem       | Caixa de Texto   | 240 caracteres|    (null)              |


| **Comandos**         |  **Destino**                   | **Tipo**          |
| ---                  | ---                            | ---               |
| Enviar   |   Verificar envio e validaçao        |(Botão)              |
