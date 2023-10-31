### 3.3.1 Processo 1 – Elaboraçao do cadastro e login.

Elaboração do cadastro e login - facilita o controle de usuários e contribui para o sistema de rating e denúncias funcionarem efetivamente.


![Exemplo de um Modelo BPMN do PROCESSO 1](images/processo1.png "Modelo BPMN do Processo 1.")


**Acessar Tela Inicial**




| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| Login           | Página de Login  |    (Default)               |
| Criar Conta           | Página de Cadastro |          (Default)        |



**Preencher dados do Cadastro**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Nome       | Caixa de Texto   | somente caracteres alfabéticos |   (null)             |
| email         | Caixa de Texto   | formato de e-mail |         (null)       |
| senha           | Caixa de Texto   | mínimo de 8 caracteres |     (null)      |
| confirmar senha           | Caixa de Texto   | mínimo de 8 caracteres |     (null)      |
| CPF             | Caixa de Texto   | 11 caracteres numéricos         |  (null)         |
| Data de nascimento | Data        | Data Válida         |     (null)      |
| Identidade       | Imagem        | Imagem        |     (null)      |
| Chave PIX          | Caixa de Texto   |   caracteres     |     (null)      |

| **Comandos**         |  **Destino**                   | **Tipo**          |
| ---                  | ---                            | ---               |
| Concluir Cadastro    | Login                          |      (Default)    |


**Realizar Login**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| email         | Caixa de Texto   | formato de e-mail |      (null)      |
| senha           | Caixa de Texto   | mínimo de 8 caracteres |   (null)  |


| **Comandos**         |  **Destino**                   | **Tipo**          |
| ---                  | ---                            | ---               |
| Concluir Login       | Página Inicial                 |     (Default)     |

