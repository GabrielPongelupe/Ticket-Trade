### 3.3.5 Processo 5 – Avaliaçao e denúncia dos usuários.

Avaliação e denúncia dos usuários - Este processo é usado para melhorar a segurança e confiabilidade do Ticket Trade com um sistema de denúncias para reportar e punir usuários mal intencionados do aplicativo.


![Exemplo de um Modelo BPMN do PROCESSO 5](images/processo5.png "Modelo BPMN do Processo 5.")


**Rating**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Rating          | Seleção única  | 1 a 5 estrelas |       0         |


| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| Avaliar              | Inicio do processo de avaliaçao            | default           |
| Estrela         | Selecionar número de estrelas  |                 |
| Enviar       | Fim do processo de avaliaçao |                   |


**Denúncia**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Denuncia          | Caixa de Texto   | maximo de 240 caracteres | campo em branco          |

| **Comandos**         |  **Destino**                   | **Tipo**          |
| ---                  | ---                            | ---               |
| Denunciar       | Inicio do processo de denúncia |                   |
| Concluir       | Fim do processo de denúncia  |                   |
