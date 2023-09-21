### 3.3.4 Processo 4 – Retençao do pagamento.

Retenção do Pagamento - Este processo é utilizado para garantir maior segurança no aplicativo, retendo o pagamento e não repassando para o vendedor até que a troca de titularidade seja efetuada.  Prevenindo assim, casos de golpe ou outras falhas de segurança.

![Exemplo de um Modelo BPMN do PROCESSO 4](images/processo4.png "Modelo BPMN do Processo 4.")


**Mensagem Suporte**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Mensagem Suporte         | Caixa de Texto   | 240 caractéres |                |

| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| Suporte        | Inicio do processo de mensagem |                   |
| Enviar      | Fim do processo de mensagem |                   |

**Visualizar Verificaçao**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Visualizar comprovante       | Imagem  | Imagem|           |

| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| Histórico de Ingressos           | Página de ingressos vendidos/comprados             | default           |
| Ver mais     | Detalhes sobre a transaçao          | default           |





