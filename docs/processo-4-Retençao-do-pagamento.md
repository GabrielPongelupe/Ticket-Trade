### 3.3.4 Processo 4 – Retençao do pagamento.

Retenção do Pagamento - Este processo é utilizado para garantir maior segurança no aplicativo, retendo o pagamento e não repassando para o vendedor até que a troca de titularidade seja efetuada.  Prevenindo assim, casos de golpe ou outras falhas de segurança.

![Exemplo de um Modelo BPMN do PROCESSO 4](images/processo4.png "Modelo BPMN do Processo 4.")


#### Detalhamento das atividades

Descreva aqui cada uma das propriedades das atividades do processo 4. 
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





