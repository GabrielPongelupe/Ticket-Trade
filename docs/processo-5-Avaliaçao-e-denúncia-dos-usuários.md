### 3.3.5 Processo 5 – Avaliaçao e denúncia dos usuários.

Avaliação e denúncia dos usuários - Este processo é usado para melhorar a segurança e confiabilidade do Ticket Trade com um sistema de denúncias para reportar e punir usuários mal intencionados do aplicativo.


![Exemplo de um Modelo BPMN do PROCESSO 5](images/processo5.png "Modelo BPMN do Processo 5.")


#### Detalhamento das atividades

Descreva aqui cada uma das propriedades das atividades do processo 5. 
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
